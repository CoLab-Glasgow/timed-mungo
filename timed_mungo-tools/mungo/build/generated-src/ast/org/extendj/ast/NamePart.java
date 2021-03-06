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
 * A part of a paritally classified parse name.
 * @ast class
 * @aspect QualifiedNames
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:247
 */
 class NamePart extends java.lang.Object {
  
    public static final NamePart EMPTY = new NamePart() {
      @Override
      public boolean isPackageQualifier() {
        return true;
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        return !context.lookupType(typeName.toString()).isEmpty();
      }

      @Override
      public String toString() {
        return "";
      }
    };

  

    protected NamePart pred = EMPTY;

  
    protected String name;

  
    protected int start;

  
    protected int end;

  

    protected NamePart() {
    }

  

    public NamePart(Symbol sym) {
      name = (String) sym.value;
      start = sym.getStart();
      end = sym.getEnd();
    }

  

    public TypeDecl lookupType(Expr context) {
      return null;
    }

  

    public boolean hasType(Expr context, NamePart typeName) {
      return false;
    }

  

    public Access buildAccess() {
      throw new Error("Can not build access from unclassified name part.");
    }

  

    /**
     * @return {@code true} if this name part can precede a package name.
     */
    public boolean isPackageQualifier() {
      return false;
    }

  

    @Override
    public String toString() {
      return name;
    }

  

    static class Package extends NamePart {
      public Package(NamePart qualifier, NamePart pkgName) {
        if (qualifier instanceof Package) {
          name = qualifier.toString() + "." + pkgName.toString();
          start = qualifier.start;
          end = pkgName.end;
        } else {
          name = pkgName.toString();
          start = pkgName.start;
          end = pkgName.end;
        }
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl type = context.lookupType(name, typeName.toString());
        if (!type.isUnknown()) {
          TypeDecl hostType = context.hostType();
          if (hostType != null && type.accessibleFrom(hostType)) {
            return true;
          } else if (hostType == null && type.accessibleFromPackage(context.hostPackage())) {
            return true;
          }
        }
        return false;
      }

      @Override
      public boolean isPackageQualifier() {
        return true;
      }

      @Override
      public Access buildAccess() {
        return new PackageAccess(name, start, end);
      }
    }

  

    static class Type extends NamePart {
      protected final String pkg;

      public Type(NamePart qualifier, NamePart typeName) {
        if (qualifier instanceof Package) {
          pkg = qualifier.toString();
          name = typeName.toString();
          start = qualifier.start;
          end = typeName.end;
        } else {
          pred = qualifier;
          pkg = "";
          name = typeName.toString();
          start = typeName.start;
          end = typeName.end;
        }
      }

      @Override
      public TypeDecl lookupType(Expr context) {
        if (pkg.isEmpty()) {
          TypeDecl hostType = pred.lookupType(context);
          SimpleSet<TypeDecl> type;
          if (hostType == null) {
            type = context.lookupType(name);
          } else {
            type = context.keepAccessibleTypes(hostType.memberTypes(name));
          }
          return type.isSingleton() ? type.singletonValue() : null;
        } else {
          return context.lookupType(pkg, name);
        }
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl hostType = lookupType(context);
        return hostType != null
            && !context.keepAccessibleTypes(hostType.memberTypes(typeName.toString())).isEmpty();
      }

      @Override
      public Access buildAccess() {
        TypeAccess access = new TypeAccess(name, start, end);
        if (!pkg.isEmpty()) {
          access.setPackage(pkg);
        }
        return access;
      }

      @Override
      public String toString() {
        return pkg.isEmpty() ? name : pkg + "." + name;
      }
    }

  

    static class VarName extends NamePart {
      public VarName(NamePart qualifier, NamePart varName) {
        pred = qualifier;
        name = varName.toString();
        start = varName.start;
        end = varName.end;
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl hostType = lookupType(context);
        return hostType != null
            && !context.keepAccessibleTypes(hostType.memberTypes(typeName.toString())).isEmpty();
      }

      @Override
      public TypeDecl lookupType(Expr context) {
        if (pred == NamePart.EMPTY) {
          SimpleSet<Variable> var = context.lookupVariable(name.toString());
          if (var.isSingleton()) {
            return var.singletonValue().type();
          }
        } else {
          TypeDecl hostType = pred.lookupType(context);
          if (hostType != null) {
            SimpleSet<Variable> var = context.keepAccessibleFields(
                hostType.memberFields(name.toString()));
            if (var.isSingleton()) {
              return var.singletonValue().type();
            }
          }
        }
        return null;
      }

      @Override
      public Access buildAccess() {
        return new VarAccess(name, start, end);
      }
    }


}
