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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:25
 * @astdecl TimeConstraint : ASTNode ::= ClockConstraint [ResetPredicate];
 * @production TimeConstraint : {@link ASTNode} ::= <span class="component">{@link ClockConstraint}</span> <span class="component">[{@link ResetPredicate}]</span>;

 */
public class TimeConstraint extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public TimeConstraint() {
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
    children = new ASTNode[2];
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ClockConstraint", "ResetPredicate"},
    type = {"ClockConstraint", "Opt<ResetPredicate>"},
    kind = {"Child", "Opt"}
  )
  public TimeConstraint(ClockConstraint p0, Opt<ResetPredicate> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public TimeConstraint clone() throws CloneNotSupportedException {
    TimeConstraint node = (TimeConstraint) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public TimeConstraint copy() {
    try {
      TimeConstraint node = (TimeConstraint) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public TimeConstraint fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public TimeConstraint treeCopyNoTransform() {
    TimeConstraint tree = (TimeConstraint) copy();
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
   * @declaredat ASTNode:96
   */
  public TimeConstraint treeCopy() {
    TimeConstraint tree = (TimeConstraint) copy();
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
   * @declaredat ASTNode:110
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
   * Replaces the optional node for the ResetPredicate child. This is the <code>Opt</code>
   * node containing the child ResetPredicate, not the actual child!
   * @param opt The new node to be used as the optional node for the ResetPredicate child.
   * @apilevel low-level
   */
  public void setResetPredicateOpt(Opt<ResetPredicate> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) ResetPredicate child.
   * @param node The new node to be used as the ResetPredicate child.
   * @apilevel high-level
   */
  public void setResetPredicate(ResetPredicate node) {
    getResetPredicateOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ResetPredicate child exists.
   * @return {@code true} if the optional ResetPredicate child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasResetPredicate() {
    return getResetPredicateOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ResetPredicate child.
   * @return The ResetPredicate child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ResetPredicate getResetPredicate() {
    return (ResetPredicate) getResetPredicateOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ResetPredicate child. This is the <code>Opt</code> node containing the child ResetPredicate, not the actual child!
   * @return The optional node for child the ResetPredicate child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ResetPredicate")
  public Opt<ResetPredicate> getResetPredicateOpt() {
    return (Opt<ResetPredicate>) getChild(1);
  }
  /**
   * Retrieves the optional node for child ResetPredicate. This is the <code>Opt</code> node containing the child ResetPredicate, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ResetPredicate.
   * @apilevel low-level
   */
  public Opt<ResetPredicate> getResetPredicateOptNoTransform() {
    return (Opt<ResetPredicate>) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:73
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:73")
  public String toString() {
    {
          String ret ="[";
          ClockConstraint cc = getClockConstraint();
          ret = ret + cc.toString();
    
          ResetPredicate rp = getResetPredicate();
          if(rp != null){
            ret = ret + ", ";
            ret = ret + rp.toString();
          }
    
          ret = ret + "]";
    
          return ret;
        }
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:91
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:91")
  public boolean equals(TimeConstraint tc) {
    {
          boolean ccEqual = true;
          boolean rpEqual = true;
          if(getClockConstraint() != null)
            ccEqual = getClockConstraint().toString().equals(tc.getClockConstraint().toString());
          if(getResetPredicate() != null)
            rpEqual = getResetPredicate().equals(tc.getResetPredicate());
            
          return ccEqual && rpEqual;
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
