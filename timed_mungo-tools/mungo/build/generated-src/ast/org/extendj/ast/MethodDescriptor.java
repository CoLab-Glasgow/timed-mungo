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
 * @aspect BytecodeDescriptor
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/BytecodeDescriptor.jrag:127
 */
 class MethodDescriptor extends java.lang.Object {
  
    private AbstractClassfileParser p;

  
    private String parameterDescriptors;

  
    private String typeDescriptor;

  

    public MethodDescriptor(AbstractClassfileParser parser, String name) throws IOException {
      p = parser;
      int descriptor_index = p.u2();
      String descriptor = ((CONSTANT_Utf8_Info) p.constantPool[descriptor_index]).string();
      if (AbstractClassfileParser.VERBOSE) {
        p.println("  Method: " + name + ", " + descriptor);
      }
      int pos = descriptor.indexOf(')');
      parameterDescriptors = descriptor.substring(1, pos);
      typeDescriptor = descriptor.substring(pos + 1, descriptor.length());
    }

  

    public List parameterList() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterList();
    }

  

    public List parameterListSkipFirst() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterListSkipFirst();
    }

  

    public Access type() {
      TypeDescriptor d = new TypeDescriptor(p, typeDescriptor);
      return d.type();
    }


}
