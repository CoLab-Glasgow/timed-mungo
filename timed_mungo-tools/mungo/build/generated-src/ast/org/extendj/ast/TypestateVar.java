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
/******************************************************************************
 * @ast class
 * @aspect TypestateTypingEnvironment
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateTypingEnvironment.jrag:7
 */
 class TypestateVar extends java.lang.Object {
  
		GraphNode current;

  
		Map<ASTNode, GraphNode> end;

  
		Map<ASTNode, GraphNode> start;

  

		private ArrayList<GraphNode> startGraph;

  
		private ArrayList<Expr> startExpr;

  
		private ArrayList<GraphNode> errorGraph;

  
		private ArrayList<ASTNode> errorExpr;

  

		//TODO better implementation for this.
		public static boolean addTypestate = false;

  

		TypestateVar() {
			current = new EndNode();
			end = new HashMap<ASTNode, GraphNode>();
			start = new HashMap<ASTNode, GraphNode>();
			startGraph = new ArrayList<GraphNode>();
			startExpr = new ArrayList<Expr>();

			errorGraph = new ArrayList<GraphNode>();
			errorExpr = new ArrayList<ASTNode>();
		}

  

		protected void resetCurrent() {
			current = new EndNode();
		}

  

		private void addErrorGraph(ASTNode e) {
			errorGraph.add(current);
			errorExpr.add(e);
			resetCurrent();
		}

  

		protected void addTypestate(Expr e) {
			if(current.isReturned()) {
//				bd.returnGraph.add(current);
//				bd.returnExpr.add(e);
//				bd.returnTypestate.add(this);
			}
			//TODO better implementation here
			else if(addTypestate == false && !current.isPlugged()){
			}
//			else if(current.isPlugged()) {
//				bd.pluggedGraph.add(current);
//				bd.pluggedExpr.add(e);
//				bd.pluggedTypestate.add(this);
//			}
			else {
				startGraph.add(current);
				startExpr.add(e);
			}
			resetCurrent();
		}

  

		protected void checkError(ASTNode e) {
			if(current!= null && current.onlyEndNodes() == -1)
				addErrorGraph(e);
		}

  

		protected void connectGraph(BodyDecl bd) {
		}

  


		protected void resetConnectionGraph(BodyDecl bd) {
		}

  

		protected GraphNode getConnectionGraph(BodyDecl bd) {
			return null;
		}

  

		protected GraphNode getPlugGraph(BodyDecl bd) {
			return null;
		}

  

		protected void reportErrors(String errorMessage) {
			for(int i = errorGraph.size() - 1; i >= 0; i--)
				errorExpr.get(i).addSemanticError(errorMessage);
		}

  

		public String classInstanceExprtoString(ClassInstanceExpr e){
				String str = "new ";
				str += e.getAccess();
				str += "(";

				for(Expr expr : e.getArgList()){
					str += expr.toString();
					str += ", ";
				}
				str = str.trim();
				if(str.contains(","))
					str = str.substring(0, str.lastIndexOf(","));
				str += ")";
				return str.toString();
		}

  

		protected void checkTypestate(GraphNode t, String errorMessage, HashMap<String, Double> clocks){
			// t is the declared typestate
			for(int i = startGraph.size() - 1; i >= 0; i--) {
				GraphNode n = startGraph.get(i);
				n.normalise();
				if(!t.includes(n, clocks) || t.getErrorClockConstraint()!=null) {
					CompilationUnit u  = (CompilationUnit) startExpr.get(i).getCompilationUnitAncestor();
					String filePath = (u).pathName();
					String errorMsg;
					ClockConstraint errorClockConstraint = t.getErrorClockConstraint();
					HashMap<String, Double> errorClocks = t.getErrorClocks();

					if(errorClockConstraint != null) {
						errorMsg = "Object created at " + filePath + ": " + ASTNode.getLine(startExpr.get(i).getStart());
						errorMsg += ". Time constraint error found for " + t.getTimeExpectedNode().nextToString()+ ". Found " + errorClockConstraint.toString() + ", but had clocks of: " + errorClocks.toString() + ".";
						t.getTimeErrorNode().getExpr().addSemanticError(errorMsg);
					} 

					if(t.getErrorNode() != null) {
						errorMsg = "Object created at " + filePath + ": " + ASTNode.getLine(startExpr.get(i).getStart());
						errorMsg += ". Typestate mismatch. Found: " + t.getErrorNode().nextToString() + ". Expected: " + t.getExpectedNode().nextToString() + ".";
						t.getErrorNode().getExpr().addSemanticError(errorMsg);
					}

				}

				if(startExpr.get(i).getCompilationUnitAncestor().program().options().hasOption("-pi"))
					//TODO have a proper format for the n.stringState() string
					startExpr.get(i).addInfo(n.stringState());
			}
		}


}
