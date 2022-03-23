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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:669
 */
public class SwitchNode extends GraphNode {
  
		public SwitchNode(ASTNode ss) {
			super(null, null, null, ss);
		}

  

		public SwitchNode() {
			this(null);
		}

  

		public String toString() {
			return "<" + nextToString() + ">";
		}

  

		protected boolean isState() {
			return false;
		}

  

		protected String toState(Map<GraphNode, Integer> stateMap) {
			String s = "<";
			for(int i = 0; i < next.size(); i++) {
				if(i != 0)
					s += ", ";
				s += next.get(i).toState(stateMap);
			}
			s += ">";
			return s;
		}

  

		protected boolean includes(GraphNode n, TupleSet ts, HashMap<String, Double> clocks) {
			// Don't try to equate to a delay node
			if(n instanceof DelayNode){
				return super.includes(n,ts, clocks);
			}

			if(n instanceof SwitchNode)
				return super.includes(n, ts, clocks);
			return false;
		}


}
