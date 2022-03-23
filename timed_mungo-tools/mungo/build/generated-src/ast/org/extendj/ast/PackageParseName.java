/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
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
 * @ast node
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/TypestateTypes.ast:7
 * @astdecl PackageParseName : ParseName ::= <Package:String> <ID:String>;
 * @production PackageParseName : {@link ParseName} ::= <span class="component">&lt;Package:String&gt;</span> <span class="component">&lt;ID:String&gt;</span>;

 */
public class PackageParseName extends ParseName implements Cloneable {
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:270
   */
  protected void Rewrite(TypestateStream stream) {
		stream.print(getPackage() + "." + getID());
	}
  /**
   * @declaredat ASTNode:1
   */
  public PackageParseName() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Package", "ID"},
    type = {"String", "String"},
    kind = {"Token", "Token"}
  )
  public PackageParseName(String p0, String p1) {
    setPackage(p0);
    setID(p1);
  }
  /**
   * @declaredat ASTNode:21
   */
  public PackageParseName(beaver.Symbol p0, beaver.Symbol p1) {
    setPackage(p0);
    setID(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    getTypeNoQualified_reset();
    getName_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public PackageParseName clone() throws CloneNotSupportedException {
    PackageParseName node = (PackageParseName) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public PackageParseName copy() {
    try {
      PackageParseName node = (PackageParseName) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:70
   */
  @Deprecated
  public PackageParseName fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public PackageParseName treeCopyNoTransform() {
    PackageParseName tree = (PackageParseName) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:100
   */
  public PackageParseName treeCopy() {
    PackageParseName tree = (PackageParseName) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:114
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Package == ((PackageParseName) node).tokenString_Package) && (tokenString_ID == ((PackageParseName) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme Package.
   * @param value The new value for the lexeme Package.
   * @apilevel high-level
   */
  public void setPackage(String value) {
    tokenString_Package = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Package;
  /**
   */
  public int Packagestart;
  /**
   */
  public int Packageend;
  /**
   * JastAdd-internal setter for lexeme Package using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Package
   * @apilevel internal
   */
  public void setPackage(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Package.
   * @return The value for the lexeme Package.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Package")
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /** @apilevel internal */
  private void getTypeNoQualified_reset() {
    getTypeNoQualified_computed = null;
    getTypeNoQualified_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getTypeNoQualified_computed = null;

  /** @apilevel internal */
  protected TypeDecl getTypeNoQualified_value;

  /**
   * @attribute syn
   * @aspect Type
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Type.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Type.jrag:37")
  public TypeDecl getTypeNoQualified() {
    ASTState state = state();
    if (getTypeNoQualified_computed == ASTState.NON_CYCLE || getTypeNoQualified_computed == state().cycle()) {
      return getTypeNoQualified_value;
    }
    getTypeNoQualified_value = lookupType(getPackage(), getID());
    if (state().inCircle()) {
      getTypeNoQualified_computed = state().cycle();
    
    } else {
      getTypeNoQualified_computed = ASTState.NON_CYCLE;
    
    }
    return getTypeNoQualified_value;
  }
  /** @apilevel internal */
  private void getName_reset() {
    getName_computed = null;
    getName_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getName_computed = null;

  /** @apilevel internal */
  protected String getName_value;

  /**
   * @attribute syn
   * @aspect RewriteAccess
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/RewriteAccess.jrag:25
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RewriteAccess", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/RewriteAccess.jrag:24")
  public String getName() {
    ASTState state = state();
    if (getName_computed == ASTState.NON_CYCLE || getName_computed == state().cycle()) {
      return getName_value;
    }
    getName_value = getPackage() + "." + getID();
    if (state().inCircle()) {
      getName_computed = state().cycle();
    
    } else {
      getName_computed = ASTState.NON_CYCLE;
    
    }
    return getName_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
