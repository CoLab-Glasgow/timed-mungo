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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:31
 * @astdecl BoolCond : ClockConstraint ::= BooleanLiteral;
 * @production BoolCond : {@link ClockConstraint} ::= <span class="component">{@link BooleanLiteral}</span>;

 */
public class BoolCond extends ClockConstraint implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public BoolCond() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"BooleanLiteral"},
    type = {"BooleanLiteral"},
    kind = {"Child"}
  )
  public BoolCond(BooleanLiteral p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public BoolCond clone() throws CloneNotSupportedException {
    BoolCond node = (BoolCond) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public BoolCond copy() {
    try {
      BoolCond node = (BoolCond) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public BoolCond fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public BoolCond treeCopyNoTransform() {
    BoolCond tree = (BoolCond) copy();
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
   * @declaredat ASTNode:94
   */
  public BoolCond treeCopy() {
    BoolCond tree = (BoolCond) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the BooleanLiteral child.
   * @param node The new node to replace the BooleanLiteral child.
   * @apilevel high-level
   */
  public void setBooleanLiteral(BooleanLiteral node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the BooleanLiteral child.
   * @return The current node used as the BooleanLiteral child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="BooleanLiteral")
  public BooleanLiteral getBooleanLiteral() {
    return (BooleanLiteral) getChild(0);
  }
  /**
   * Retrieves the BooleanLiteral child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the BooleanLiteral child.
   * @apilevel low-level
   */
  public BooleanLiteral getBooleanLiteralNoTransform() {
    return (BooleanLiteral) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:53
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:53")
  public String toString() {
    {
          return getBooleanLiteral().toString();
        }
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:110
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:110")
  public boolean ConstraintHolds(HashMap<String, Double> clocks) {
    {
          return Boolean.parseBoolean(getBooleanLiteral().toString());
        }
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
