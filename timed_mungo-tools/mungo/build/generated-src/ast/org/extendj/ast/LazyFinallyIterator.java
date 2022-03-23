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
 * @aspect BranchTarget
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/BranchTarget.jrag:48
 */
 class LazyFinallyIterator extends java.lang.Object implements Iterator<FinallyHost> {
  
    private final Stmt branch;

  
    private FinallyHost enclosing;

  

    LazyFinallyIterator(Stmt root) {
      branch = root;
      enclosing = branch.enclosingFinally(branch);
    }

  

    @Override
    public boolean hasNext() {
      return enclosing != null;
    }

  

    @Override
    public FinallyHost next() {
      FinallyHost b = enclosing;
      enclosing = enclosing.enclosingFinally(branch);
      return b;
    }

  

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }


}
