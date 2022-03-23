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
/*******************************************************************************
 * @ast class
 * @aspect GraphNode
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GraphNode.jrag:582
 */
public class MethodNode extends GraphNode {
  

		public MethodNode(Access type, String id, TypeDecl[] parameters, ASTNode methodAccess, TimeConstraint tc) {
			super(type, id, parameters, methodAccess, tc);
		}

  

		public MethodNode(Access type, String id, TypeDecl[] parameters, ASTNode methodAccess) {
			this(type, id, parameters, methodAccess, null);
		}

  

		public MethodNode(Access type, String id, TypeDecl[] parameters) {
			this(type, id, parameters, null, null);
		}

  

		private boolean equalNode(GraphNode n, HashMap<String, Double> clocks) {
			if(!(n instanceof MethodNode)){
				return false;
			}

			if(!n.getId().equals(getId()) || n.getParameters().length != getParameters().length){
				return false;
			}

			for(int i = 0; i < n.getParameters().length; i++) {
				TypeDecl t = n.getParameters()[i];
				if(!t.equals(getParameters()[i]) && !(getParameters()[i] instanceof UnknownType))
					return false;
			}

			if(tc != null){
				// Used for I <: S
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
				} else {
					// When performing a subclass check (S <: S')
					// Theory may be updated to perform a more sophisted subtype check but for now it just checks if they are equal
					if(n.tc != null){
						return tc.equals(n.tc);
					} else {
						return false;
					}
				}
			} else {
				// If the superclass doesn't have a timeconstraint, neither should it's subclass
				return n.tc == null;
			}
			// return true;
		}

  

		protected boolean includes(GraphNode n, TupleSet ts, HashMap<String, Double> clocks) {
			// Don't try to equate to a delay node
			if(n instanceof DelayNode){
				return super.includes(n,ts, clocks);
			}

			HashMap<String, Double> newClocks = clocks;
			boolean isEqual = equalNode(n, clocks);
			if (clocks != null){
				if(tc != null){
					if(tc.getResetPredicate() != null){
						newClocks = resetClocks(tc.getResetPredicate(), clocks);
					}
				}
			}
			return isEqual ? super.includes(n, ts, newClocks) : false;
		}


}
