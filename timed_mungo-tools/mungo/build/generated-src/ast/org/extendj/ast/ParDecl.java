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
 * @aspect LookupTSVariable
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:103
 */
 class ParDecl extends NameDecl {
  
		private ParameterDeclaration pd;

  
		public ParDecl(ParameterDeclaration pd) {
			this.pd = pd;
		}

  
		public Declarator getVariableDecl() { return null; }

  
		public Modifiers getModifiers() { return pd.getModifiers(); }

  
		public Access getTypeAccess() { return pd.getTypeAccess(); }

  
		public List<Dims> getDimss() {return null;}

  
		public String getID() { return pd.getID(); }

  
		public TypestateVar getTypestateVar() {return pd.typestate;}


}
