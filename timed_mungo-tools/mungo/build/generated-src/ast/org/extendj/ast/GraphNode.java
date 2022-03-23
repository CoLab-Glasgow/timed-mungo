package org.extendj.ast;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.*;
import org.jastadd.util.*;
import org.jastadd.util.PrettyPrintable;
import org.jastadd.util.PrettyPrinter;
import java.util.zip.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Set;
import beaver.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.lang.StringBuffer;
/**
 * @ast class
 * @aspect GraphNode
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:25
 */
abstract class GraphNode extends java.lang.Object {
  
		private Access type;

  
		private String id;

  
		private TypeDecl[] parameters;

  
		private ASTNode expr;

  
		protected TimeConstraint tc;

  
		protected ArrayList<GraphNode> next;

  

		protected GraphNode(Access type, String id, TypeDecl[] parameters, ASTNode expr, TimeConstraint tc) {
			this.type = type;
			this.id = id;
			this.parameters = parameters;
			this.expr = expr;
			this.tc = tc;
			signature = null;
			next = new ArrayList<GraphNode>();
		}

  

		protected GraphNode(Access type, String id, TypeDecl[] parameters, ASTNode expr) {
			this(type, id, parameters, expr, null);
		}

  

		private String signature;

  

		public String toString() {
			if (signature != null)
				return signature;

			if(id == null)
				return signature = "";

			if(parameters == null)
				return signature = id;

			String tcString;
			if(tc != null){
				tcString = tc.toString();
			} else {
				tcString = "";
			}

			signature = tcString +" "+ type.toString() + " " + id + "(";
			for(int i = 0; i < parameters.length; i++) {
				if(i != 0)
					signature += ", ";
				signature += parameters[i].getID();
			}
			return signature += ")";
		}

  

		protected HashMap<String, Double> resetClocks(ResetPredicate rp, HashMap<String, Double> clocks){
			HashMap<String,Double> newClocks = new HashMap<>();
			newClocks.putAll(clocks);
			for(ClockId cid : rp.getClockIdList()){
				String clock = cid.getID();
				newClocks.put(clock, 0.0);
			}
			return newClocks;
		}

  

		protected Access getType() {
			return type;
		}

  

		protected String getId() {
			return id;
		}

  

		protected TypeDecl[] getParameters() {
			return parameters;
		}

  

		protected ASTNode getExpr() {
			return expr;
		}

  

		public GraphNode addNext(GraphNode n) {
			if(n != null)
				next.add(n);
			return this;
		}

  

		protected boolean hasNext() {
			return next.size() != 0;
		}

  

		// public void addClockSet(Set<String> clocks){
			// 
		// }

		// public void addClockSet(Map<String, Double> previousClocks){
// 			If we follow the theory that I made, then maybe every new includes call should
// 			Have the clockSet (which is v) updated?
		// }

		/**********************************************************/
		/*                Equivalence relations                   */
		/**********************************************************/

		/*
		 * Create a structure to store tuples (doubles) of GraphNode elements
		 * Tuples construct a closure of GraphNode to co-inductively check that two nodes were
		 * revisited at the same time by the "includes" algorithm.
		 */

		protected class TupleSet {
			private class TupleEntry {
				private GraphNode n1, n2;
				private HashMap<String, Double> clocks;
				TupleEntry(GraphNode n1, GraphNode n2, HashMap<String, Double> clocks) {
					this.n1 = n1;
					this.n2 = n2;
					this.clocks = clocks;
				}

				public int hashCode() {
					if(clocks != null){
						return n1.hashCode() ^ n2.hashCode() ^ clocks.hashCode();
					} else {
						return n1.hashCode() ^ n2.hashCode();
					}
				}

				public boolean equals(Object o) {
					if(o instanceof TupleEntry) {
						TupleEntry te = (TupleEntry) o;
						if(clocks != null){
							return n1.equals(te.n1) && n2.equals(te.n2) && clocks.equals(te.clocks);
						} else {
							return n1.equals(te.n1) && n2.equals(te.n2);
						}
					}
					return false;
				}
			}

			Set<TupleEntry> relation;

			protected TupleSet() {
				relation = new HashSet<TupleEntry>();
			}

			protected boolean has(GraphNode firstNode, GraphNode secondNode, HashMap<String, Double> clocks) {
				return relation.contains(new TupleEntry(firstNode, secondNode, clocks));
			}

			protected boolean insert(GraphNode firstNode, GraphNode secondNode, HashMap<String, Double> clocks) {
				return relation.add(new TupleEntry(firstNode, secondNode, clocks));
			}

			protected boolean remove(GraphNode firstNode, GraphNode secondNode, HashMap<String, Double> clocks) {
				return relation.remove(new TupleEntry(firstNode, secondNode, clocks));
			}
		}

  


		private static GraphNode errorNode;

  
		private static GraphNode expectedNode;

  
		// Used to convery time errors
		protected static ClockConstraint errorClockConstraint;

   
		protected static HashMap<String, Double> errorClocks;

  
		protected static GraphNode timeErrorNode;

  
		protected static GraphNode timeExpectedNode;

  

		public GraphNode getErrorNode() {
			return errorNode;
		}

  

		public GraphNode getExpectedNode() {
			return expectedNode;
		}

  

		public ClockConstraint getErrorClockConstraint() {
			return errorClockConstraint;
		}

  

		public HashMap<String, Double> getErrorClocks() {
			return errorClocks;
		}

  

		public GraphNode getTimeErrorNode(){
			return timeErrorNode;
		}

  

		public GraphNode getTimeExpectedNode(){
			return timeExpectedNode;
		}

  

		/*
			Algorithm:

			1.	G_1 <= G_2			if	emptyset |- G_1 <= G_2	(Start)
			2.	R |- EndNode <= EndNode						(End)
			3.	R |- G_1 <= G_2			if	(G_1, G_2) in R		(Terminate)
			4.	R |- {G_1} <= {G_2}		if	i) {G_1} not empty and
									ii) for all G_1 in {G_1}, exists G_2 in G_2 such that
									R union {({G_1}, {G_2})} |- G_1 <= G_2	(Set)
		*/

		//TODO Test a case for Set Rule precondition i)
		protected boolean includes(GraphNode n, TupleSet ts, HashMap<String, Double> clocks) {
			//Terminate Rule and End Rule
			if(ts.has(this, n, clocks) || (!hasNext() && !n.hasNext()))
				return true;

				
			if(n instanceof DelayNode && clocks != null){
				// TODO This might be multiple?
				// System.out.println(n.next.size());
				double time = Double.parseDouble(n.getExpr().toString());
				// System.out.println(clocks);
				HashMap<String, Double> newClocks = new HashMap<>();
				newClocks.putAll(clocks);
				for(String clockName: newClocks.keySet()){
					newClocks.put(clockName, newClocks.get(clockName) + time);
				}
				// System.out.println(newClocks);
				return includes(n.next.get(0), ts, newClocks);
			}
				
			ts.insert(this, n, clocks);
					
			//Set Rule
			//Set rule: precondition i)
			if(!n.hasNext()){
				return false;
			}

			//Set rule: precondition ii)
			for(GraphNode n1 : n.next) {
				boolean b = false;
				for(GraphNode n2 : next)
					if((b = n2.includes(n1, ts, clocks)) == true)
						break;
					
				if(b == false) {
					if(errorNode == null) {
						errorNode = n;
						expectedNode = this;
					}
					ts.remove(this, n, clocks);
					return false;
				}
			}
			return true;
		}

  

		public boolean includes(GraphNode n, HashMap<String, Double> clocks) {
			//Start Rule
			errorNode = null;
			expectedNode = null;
			return includes(n, new TupleSet(), clocks);
		}

  

		//TODO rewrite this (maybe it is a bit of over-engineering)
		//TODO if next is switch node it returns an empty string.
		public String nextToString() {
			if(next.isEmpty())
				return "";
			StringBuilder s = new StringBuilder();
			s.append(next.get(0).toString());
			for(int i = 1; i < next.size(); i++){
				s.append(", ");
				s.append(next.get(i).toString());
			}
			return s.toString();
		}

  

		/**************************************************************/
		/*                     Normalise Graph                        */
		/**************************************************************/

		protected boolean isNodeVisited(Set<GraphNode> visited) {
			if(visited.contains(this))
				return true;
			visited.add(this);
			return false;
		}

  

		protected void removeVisited(Set<GraphNode> visited) {
			visited.remove(this);
		}

  

		// Polymorphic on LoopNode
		protected boolean __hasLoopNode(Set<GraphNode> visited) {
			if(isNodeVisited(visited))
				return false;
			for(GraphNode n: next)
				if(n.__hasLoopNode(visited))
					return true;
			return false;
		}

  

		private boolean hasLoopNode() {
			Set<GraphNode> visited = new HashSet<GraphNode>();
			for(GraphNode n: next)
				if(n.__hasLoopNode(visited))
					return true;
			return false;
		}

  

		// Polymorphic on LoopNode
		protected ArrayList<GraphNode> nextArrayList() {
			ArrayList<GraphNode> a = new ArrayList<GraphNode>();
			a.add(this);
			return a;
		}

  

		// Polymorphic on LoopNode
		protected ArrayList<GraphNode> computeNextArrayList(int i, Set<GraphNode> visited) {
			return next.get(i).normalise(visited);
		}

  

		/*
		 * Remove LoopNodes from its graph
		 */
		protected ArrayList<GraphNode> normalise(Set<GraphNode> visited) {
			if(isNodeVisited(visited))
				return nextArrayList();
			ArrayList<GraphNode> tmpNext = new ArrayList<GraphNode>();
			for(int i = 0; i < next.size(); i++)
				for(GraphNode n : computeNextArrayList(i, visited))
					if(!tmpNext.contains(n))
						tmpNext.add(n);
			next = tmpNext;

			return nextArrayList();
		}

  

		public GraphNode normalise() {
			Set<GraphNode> visited = new HashSet<GraphNode>();
			ArrayList<GraphNode> alist = new ArrayList<GraphNode>();
			for(GraphNode n: next){
				if(!this.equals(n))
					alist.addAll(n.normalise(visited));
			}
			next = alist;
			return hasLoopNode() ? normalise() : this;
		}

  

		/***********************************************************/
		/*               Count EndNodes/Ignore LoopNodes           */
		/***********************************************************/

		//polymorphic on LoopNode, EndNode
		protected int onlyEndNodes(Set<GraphNode> visited) {
			return -1;
		}

  

		protected int onlyEndNodes() {
			return onlyEndNodes(new HashSet<GraphNode>());
		}

  

		protected boolean isPlugged() {
			return isPlugged(new HashSet<GraphNode>());
		}

  

		//polymorphic on PlugNode
		protected boolean isPlugged(Set<GraphNode> visited) {
			if(visited.contains(this))
				return false;

			visited.add(this);

			for(GraphNode n: next)
				if(n.isPlugged(visited) == true)
					return true;

			return false;
		}

  

		protected boolean isReturnPlugged() {
			return isReturnPlugged(new HashSet<GraphNode>());
		}

  

		//polymorphic on ReturnedPlug
		protected boolean isReturnPlugged(Set<GraphNode> visited) {
			if(visited.contains(this))
				return false;

			visited.add(this);

			for(GraphNode n: next)
				if(n.isReturnPlugged(visited) == true)
					return true;
			return false;
		}

  

		protected boolean isReturned() {
			return isReturned(new HashSet<GraphNode>());
		}

  

		//polymorphic on ReturnNode
		protected boolean isReturned(Set<GraphNode> visited) {
			if(visited.contains(this))
				return false;

			visited.add(this);

			for(GraphNode n: next)
				if(n.isReturned(visited) == true)
					return true;
			return false;
		}

  

		/***********************************************************/
		/*               Clone Graphs			           */
		/***********************************************************/

/*
		abstract protected GraphNode cloneNode();

		protected GraphNode cloneGraph(GraphNode end) {
			return cloneGraph(end, new HashMap<GraphNode, GraphNode>());
		}

		//Polymorphic on LoopNode
		protected GraphNode cloneGraph(GraphNode end, Map<GraphNode, GraphNode> visited) {
			if(visited.get(this) != null)
				return visited.get(this);

			GraphNode r = cloneNode();
			visited.put(this, r);

			for(GraphNode n: next)
				r.addNext(n.cloneGraph(end, visited));

			return r;
		}

		protected GraphNode clonePlugGraph() {
			return plugGraph(new HashMap<GraphNode, GraphNode>(), true);
		}

		protected GraphNode plugGraph() {
			return plugGraph(new HashMap<GraphNode, GraphNode>(), false);
		}

		//Polymorphic on PlugNode
		protected GraphNode plugGraph(Map<GraphNode, GraphNode> visited, boolean clone) {
			if(visited.get(this) != null)
				return visited.get(this);

			GraphNode r = cloneNode();
			visited.put(this, r);

			for(GraphNode n: next)
				r.addNext(n.plugGraph(visited, clone));

			return r;
		}
*/
		/***********************************************************/
		/*                 Print Protocol                          */
		/***********************************************************/

		private static int count;

  

		protected int getState(Map<GraphNode, Integer> stateMap) {
			Integer state = null;
			if((state = stateMap.get(this)) == null)
				stateMap.put(this, state = new Integer(count++));
			return state;
		}

  

		//polymorphic on SwitchNode and EndNode
		//TODO I dont like here
		protected boolean isState() {
			if(next.size() == 1)
				if((next.get(0) instanceof SwitchNode) || (next.get(0) instanceof EndNode))
					return false;
			return true;
		}

  

		//polymorphic on SwitchNode and EndNode
		protected String toState(Map<GraphNode, Integer> stateMap) {
			return toString() + ": " + (isState() ? "State_" + getState(stateMap) : next.get(0).toState(stateMap));
		}

  

		private TypestateStream printState(Set<GraphNode> visited, Map<GraphNode, Integer> stateMap, TypestateStream stream) {
			if(isNodeVisited(visited))
				return stream;

			if(isState()) {
				stream.println("State_" + getState(stateMap) + " = {");
				stream.pushIndent();
				for(int i = 0; i < next.size(); i++) {
					if(i != 0)
						stream.print(", ");
					stream.print(next.get(i).toState(stateMap));
				}
				stream.popIndent();
				stream.println("");
				stream.println("}");
			}

			for(GraphNode n: next)
				n.printState(visited, stateMap, stream);

			return stream;
		}

  

		protected void printState(PrintStream out) {
			out.println(stringState());
		}

  

		protected String stringState() {
			count = 1;
			TypestateStream stream = printState(new HashSet<GraphNode>(), new HashMap<GraphNode, Integer>(), new TypestateStream());
			return stream.toString();
		}

  

		/***********************************************************/
		/*                For Debug                                */
		/***********************************************************/

		private void printPaths(String s, Set<GraphNode> visited) {
			if((next.size() == 0) || isNodeVisited(visited)) {
				System.out.println(s + toString());
				return;
			}

			for(int i = 0; i < next.size(); i++)
				next.get(i).printPaths(s + toString(), visited);

			removeVisited(visited);
		}

  

		public void printPaths() {
			Set<GraphNode> s = new HashSet<GraphNode>();
			printPaths("", s);
		}


}
