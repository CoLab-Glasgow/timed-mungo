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
 * @aspect Errors
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Errors.jadd:21
 */
public abstract class TypestateError extends java.lang.Object {
  
		private final String msg;

  
		private String file;

  
		private final int start;

  
		private final int end;

  
		private final String errorType;

  

		protected TypestateError(String msg, String file, int start, int end, String errorType) {
			this.msg = msg;
			this.file = file;
			this.start = start;
			this.end = end;
			this.errorType = errorType;
		}

  


		public void setFileName(String file) {
			if(file != null)
				this.file = file;
		}

  


		public String toString() {
			return	file + ": " + ASTNode.getLine(start) + "-" + ASTNode.getColumn(start) + ": " + errorType +
				"\n\t\t" + msg;
		}

  


		protected void print() {
			print(System.err);
		}

  

		protected void print(PrintStream err) {
			err.println();
			err.print(toString());
			err.println();
		}


}
