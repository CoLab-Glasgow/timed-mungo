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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Errors.jadd:135
 */
public class ParserFailException extends Exception {
  
		private Collection<TypestateError> errors;

  
		public ParserFailException(Collection<TypestateError> errors) {
			this.errors = errors;
		}

  
		public Collection<TypestateError> getErrors() {
			return errors;
		}


}
