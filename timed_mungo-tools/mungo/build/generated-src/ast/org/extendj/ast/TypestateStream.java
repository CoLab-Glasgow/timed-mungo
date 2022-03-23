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
 * @aspect Rewrite
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:16
 */
public class TypestateStream extends java.lang.Object {
  
		private String path;

  
		private PrintStream printStream;

  
		private StringBuffer sb;

  
		private PrintStream out;

  

		// Indent counts the number of indentations
		private int indent;

  
		private String indentString;

  
		private boolean changeLine;

  

		// The next three methods are used for controlling indentation
		public void pushIndent() {
			indent++;
			createIndentString();
		}

  
		public void popIndent() {
			indent--;
			createIndentString();
		}

  

		private void createIndentString() {
			indentString = "";
			for(int i = 0; i < indent; i++)
				indentString = indentString + "\t";
		}

  

		public TypestateStream() {
			path = null;
			out = null;
			sb = new StringBuffer();
			indent = 0;
			changeLine = true;
			createIndentString();
		}

  

		public TypestateStream(String path) throws FileNotFoundException {
			this();
			printStream = new PrintStream(path);
			this.path = new String(path);
		}

  

		public TypestateStream(String path, PrintStream out) throws FileNotFoundException {
			this(path);
			this.out = out;
		}

  

		public TypestateStream(PrintStream out) {
			this();
			this.out = out;
		}

  

		public void println() {
			if (printStream != null)
				printStream.println();
			if(out != null)
				out.println();
			sb.append("\n");
			changeLine = true;
		}

  

		public void println(String s) {
			String is = (changeLine == true) ? indentString : "";
			if (printStream != null)
				printStream.println(is + s);
			if(out != null)
				out.println(is + s);
			sb.append(is + s + "\n");
			changeLine = true;
		}

  

		public void print(String s) {
			String is = (changeLine == true) ? indentString : "";
			if (printStream != null)
				printStream.print(is + s);
			if(out != null)
				out.print(is + s);
			sb.append(is + s);
			changeLine = false;
		}

  

		public void reset() {
			sb = new StringBuffer();
			path = null;
			out = null;
		}

  

		public void close() {
			if (printStream != null)
				printStream.close();
		}

  

		public String toString() {
			return sb.toString();
		}


}
