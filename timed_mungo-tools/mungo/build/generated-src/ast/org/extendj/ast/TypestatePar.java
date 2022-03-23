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
 * @aspect TypestateTypingEnvironment
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateTypingEnvironment.jrag:136
 */
 class TypestatePar extends TypestateVar {
  
		private LoopNode parameterNode;

  

		TypestatePar() {
			super();
		}

  

		protected void resetConnectionGraph(BodyDecl bd) {
			current = new EndNode();
			parameterNode = new LoopNode();
		}

  

		protected void connectGraph(BodyDecl bd) {
			parameterNode.addNext(current);
		}

  

		protected GraphNode getConnectionGraph(BodyDecl bd) {
			return parameterNode;
		}


}
