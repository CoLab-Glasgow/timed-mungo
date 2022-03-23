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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:713
 */
public class SwitchCase extends GraphNode {
  
		public SwitchCase(String id, ASTNode c, TimeConstraint tc) {
			super(null, id, null, c, tc);
		}

  

		public SwitchCase(String id) {
			this(id, null, null);
		}

  

		public String toString(){
			String ret = "";
			if(tc != null){
				ret = ret + tc.toString() + " ";
			}
			ret = ret + getId();
			return ret;
		}

  

		protected boolean includes(GraphNode n, TupleSet ts, HashMap<String, Double> clocks) {
			// Don't try to equate to a delay node
			if(n instanceof DelayNode){
				return super.includes(n,ts, clocks);
			}

			if (!((n instanceof SwitchCase) && getId().equals(n.getId())))
				return false;

			HashMap<String, Double> newClocks = clocks;

			if(tc != null){
				if(clocks != null){

					ClockConstraint cc = tc.getClockConstraint();
					ResetPredicate rp = tc.getResetPredicate();
					boolean constraintHolds = cc.ConstraintHolds(clocks);
					if(!constraintHolds){
						errorClockConstraint = cc;
						errorClocks = clocks;
						timeErrorNode = n;
						timeExpectedNode = this;
						return true;
					} 
					
					if(tc.getResetPredicate() != null){
						newClocks = resetClocks(tc.getResetPredicate(), clocks);
					}
				} else {
					// Supertype check here
					if(n.tc != null){
						return tc.equals(n.tc);
					} else {
						return false;
					}
				}
			} else {
				if(n.tc != null)
					return false;
			}

			return super.includes(n, ts, newClocks);
		}


}
