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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:29
 * @astdecl ResetPredicate : ASTNode ::= ClockId*;
 * @production ResetPredicate : {@link ASTNode} ::= <span class="component">{@link ClockId}*</span>;

 */
public class ResetPredicate extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ResetPredicate() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ClockId"},
    type = {"List<ClockId>"},
    kind = {"List"}
  )
  public ResetPredicate(List<ClockId> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public ResetPredicate clone() throws CloneNotSupportedException {
    ResetPredicate node = (ResetPredicate) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public ResetPredicate copy() {
    try {
      ResetPredicate node = (ResetPredicate) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public ResetPredicate fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public ResetPredicate treeCopyNoTransform() {
    ResetPredicate tree = (ResetPredicate) copy();
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
   * @declaredat ASTNode:95
   */
  public ResetPredicate treeCopy() {
    ResetPredicate tree = (ResetPredicate) copy();
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
   * @declaredat ASTNode:109
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the ClockId list.
   * @param list The new list node to be used as the ClockId list.
   * @apilevel high-level
   */
  public void setClockIdList(List<ClockId> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ClockId list.
   * @return Number of children in the ClockId list.
   * @apilevel high-level
   */
  public int getNumClockId() {
    return getClockIdList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ClockId list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ClockId list.
   * @apilevel low-level
   */
  public int getNumClockIdNoTransform() {
    return getClockIdListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ClockId list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ClockId list.
   * @apilevel high-level
   */
  public ClockId getClockId(int i) {
    return (ClockId) getClockIdList().getChild(i);
  }
  /**
   * Check whether the ClockId list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasClockId() {
    return getClockIdList().getNumChild() != 0;
  }
  /**
   * Append an element to the ClockId list.
   * @param node The element to append to the ClockId list.
   * @apilevel high-level
   */
  public void addClockId(ClockId node) {
    List<ClockId> list = (parent == null) ? getClockIdListNoTransform() : getClockIdList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addClockIdNoTransform(ClockId node) {
    List<ClockId> list = getClockIdListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ClockId list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setClockId(ClockId node, int i) {
    List<ClockId> list = getClockIdList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ClockId list.
   * @return The node representing the ClockId list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ClockId")
  public List<ClockId> getClockIdList() {
    List<ClockId> list = (List<ClockId>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ClockId list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClockId list.
   * @apilevel low-level
   */
  public List<ClockId> getClockIdListNoTransform() {
    return (List<ClockId>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ClockId list without
   * triggering rewrites.
   */
  public ClockId getClockIdNoTransform(int i) {
    return (ClockId) getClockIdListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ClockId list.
   * @return The node representing the ClockId list.
   * @apilevel high-level
   */
  public List<ClockId> getClockIds() {
    return getClockIdList();
  }
  /**
   * Retrieves the ClockId list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClockId list.
   * @apilevel low-level
   */
  public List<ClockId> getClockIdsNoTransform() {
    return getClockIdListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:20
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:20")
  public String toString() {
    {
          String ret ="";
          ret += "{";
          int i;
          for(i =0; i < getNumClockId()-1; i++){
            ret += getClockId(i).getID().toString();
            ret +=", ";
          }
          ret += getClockId(i).getID().toString();
          ret+="}";
          return ret;
        }
  }
  /**
   * @attribute syn
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:102
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:102")
  public boolean equals(ResetPredicate rp) {
    {
          return toString().equals(rp.toString());
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
