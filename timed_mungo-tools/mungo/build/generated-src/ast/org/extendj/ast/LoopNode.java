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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:785
 */
public class LoopNode extends GraphNode {
  
		public LoopNode() {
			super(null, null, null, null);
		}

  

		public String toString() {
			return "Loop Node;";
		}

  

		protected boolean __hasLoopNode(Set<GraphNode> visited) {
			return true;
		}

  

		protected ArrayList<GraphNode> nextArrayList() {
			return next;
		}

  

		protected ArrayList<GraphNode> computeNextArrayList(int i, Set<GraphNode> visited) {
			return (!this.equals(next.get(i))) ? super.computeNextArrayList(i, visited) : new ArrayList<GraphNode>();
		}

  

//		protected GraphNode cloneNode() {
//			return new LoopNode();
//		}

/*		protected GraphNode cloneGraph(GraphNode end, Map<GraphNode, GraphNode> visited) {
			//This means that the graph ends in a LoopNode -> the graph is still incomplete
			if(next.size() == 0)
				return cloneNode().addNext(end);
			return super.cloneGraph(end, visited);
		}
*/
		protected int onlyEndNodes(Set<GraphNode> visited) {
			if(isNodeVisited(visited))
				return 0;

			int sum = 0;
			int result;
			for(GraphNode n: next) {
				result = n.onlyEndNodes(visited);
				if(result == -1)
					return -1;
				sum += result;
			}
			return sum;
		}


}
