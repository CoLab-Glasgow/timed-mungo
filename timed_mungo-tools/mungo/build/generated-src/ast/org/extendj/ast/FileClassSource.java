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
 * @aspect PathPart
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/PathPart.jadd:159
 */
public class FileClassSource extends ClassSource {
  
    private final String filePath;

  

    public FileClassSource(PathPart sourcePath, String path) {
      super(sourcePath);
      this.filePath = path;
    }

  

    @Override
    public long lastModified() {
      // last modification time computed only if needed
      File file = new File(filePath);
      return file.lastModified();
    }

  

    @Override
    public InputStream openInputStream() throws IOException {
      File file = new File(filePath);
      return new FileInputStream(file);
    }

  

    @Override
    public String pathName() {
      return filePath;
    }


}
