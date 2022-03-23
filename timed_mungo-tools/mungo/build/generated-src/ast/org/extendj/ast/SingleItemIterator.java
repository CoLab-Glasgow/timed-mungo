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
 * An iterator that iterates over one single item.
 * 
 * <p>This is used to iterate singleton sets.
 * @ast class
 * @aspect DataStructures
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/DataStructures.jrag:253
 */
public class SingleItemIterator<T> extends java.lang.Object implements Iterator<T> {
  
    private boolean done = false;

  
    private final T item;

  

    public SingleItemIterator(T item) {
      this.item = item;
    }

  

    @Override
    public boolean hasNext() {
      return !done;
    }

  

    @Override
    public T next() {
      done = true;
      return item;
    }

  

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }


}
