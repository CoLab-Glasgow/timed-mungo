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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:953
 */
public class DelayNode extends GraphNode {
  
		public DelayNode(ASTNode val) {
			super(null, null, null, val);
		}

  

		private boolean equalNode(GraphNode n) {
			System.out.println("Equals in a delay node");
			if(!(n instanceof DelayNode))
				return false;

			if(getExpr().toString() != n.getExpr().toString())
				return false;

			return true;
		}

  

		public String toString() {
			String delay = "<~"+getExpr().toString()+"~>";
			return delay;
		}

  

		protected boolean includes(GraphNode n, TupleSet ts, HashMap<String, Double> clocks) {
			return equalNode(n) ? super.includes(n, ts, clocks) : false;
		}


}
