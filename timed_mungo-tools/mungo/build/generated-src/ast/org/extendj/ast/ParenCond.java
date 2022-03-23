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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:40
 * @astdecl ParenCond : ClockConstraint ::= ClockConstraint;
 * @production ParenCond : {@link ClockConstraint} ::= <span class="component">{@link ClockConstraint}</span>;

 */
public class ParenCond extends ClockConstraint implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ParenCond() {
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
    name = {"ClockConstraint"},
    type = {"ClockConstraint"},
    kind = {"Child"}
  )
  public ParenCond(ClockConstraint p0) {
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
  public ParenCond clone() throws CloneNotSupportedException {
    ParenCond node = (ParenCond) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public ParenCond copy() {
    try {
      ParenCond node = (ParenCond) clone();
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
  public ParenCond fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public ParenCond treeCopyNoTransform() {
    ParenCond tree = (ParenCond) copy();
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
  public ParenCond treeCopy() {
    ParenCond tree = (ParenCond) copy();
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
   * Replaces the ClockConstraint child.
   * @param node The new node to replace the ClockConstraint child.
   * @apilevel high-level
   */
  public void setClockConstraint(ClockConstraint node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ClockConstraint child.
   * @return The current node used as the ClockConstraint child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ClockConstraint")
  public ClockConstraint getClockConstraint() {
    return (ClockConstraint) getChild(0);
  }
  /**
   * Retrieves the ClockConstraint child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ClockConstraint child.
   * @apilevel low-level
   */
  public ClockConstraint getClockConstraintNoTransform() {
    return (ClockConstraint) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:69
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:69")
  public String toString() {
    {
          return "("+getClockConstraint().toString()+")";
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
          return getClockConstraint().ConstraintHolds(clocks);
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
