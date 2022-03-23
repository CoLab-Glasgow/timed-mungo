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
 * A file specified explicitly on the commandline as a source file.
 * Must point to a .java file.
 * @ast class
 * @aspect PathPart
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/PathPart.jadd:590
 */
public class SourceFilePath extends PathPart {
  
    private final String filePath;

  

    public SourceFilePath(String path) {
      super(true);
      this.filePath = path;
    }

  

    @Override
    public String getPath() {
      return filePath;
    }

  

    /**
     * <b>Use the parsed CompilationUnit to find the package name of the file!</b>
     */
    @Override
    public boolean hasPackage(String name) {
      return false;
    }

  

    @Override
    public ClassSource findSource(String name) {
      if (filePath.equals(name)) {
        File file = new File(filePath);
        if (file.isFile() && file.canRead()) {
          return new FileClassSource(this, filePath);
        }
      }
      return ClassSource.NONE;
    }

  

    @Override
    public String toString() {
      return filePath;
    }


}
