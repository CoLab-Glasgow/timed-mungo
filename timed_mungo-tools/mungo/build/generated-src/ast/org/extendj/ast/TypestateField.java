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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateTypingEnvironment.jrag:157
 */
 class TypestateField extends TypestateVar {
  
		private Map<BodyDecl, GraphNode> connectGraph;

  
		private Map<BodyDecl, GraphNode> plugGraph;

  

		TypestateField() {
			super();

			connectGraph = new HashMap<BodyDecl, GraphNode>();
			plugGraph = new HashMap<BodyDecl, GraphNode>();
			current = new EndNode();
		}

  
		protected void resetConnectionGraph(BodyDecl bd) {
			connectGraph.remove(bd);
			connectGraph.put(bd, new LoopNode());
			plugGraph.remove(bd);
			current = new LoopNode().addNext(current);
			plugGraph.put(bd, current);
		}

  

		protected void connectGraph(BodyDecl bd) {
			connectGraph.get(bd).addNext(current);
		}

  

		protected GraphNode getConnectionGraph(BodyDecl bd) {
			return connectGraph.get(bd);
		}

  

		protected GraphNode getPlugGraph(BodyDecl bd) {
			return plugGraph.get(bd);
		}


}
