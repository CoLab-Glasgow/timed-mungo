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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:23
 * @astdecl TTypeArgs : TTypeList ::= TType*;
 * @production TTypeArgs : {@link TTypeList} ::= <span class="component">{@link TType}*</span>;

 */
public class TTypeArgs extends TTypeList implements Cloneable {
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:835
   */
  protected void Rewrite(TypestateStream stream) {
		stream.print("(");
		for (int i = 0; i < getNumTType(); i++) {
			if(i != 0)
				stream.print(", ");
			getTType(i).Rewrite(stream);

		}
		stream.print(")");
	}
  /**
   * @declaredat ASTNode:1
   */
  public TTypeArgs() {
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
    name = {"TType"},
    type = {"List<TType>"},
    kind = {"List"}
  )
  public TTypeArgs(List<TType> p0) {
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
  public TTypeArgs clone() throws CloneNotSupportedException {
    TTypeArgs node = (TTypeArgs) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public TTypeArgs copy() {
    try {
      TTypeArgs node = (TTypeArgs) clone();
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
  public TTypeArgs fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public TTypeArgs treeCopyNoTransform() {
    TTypeArgs tree = (TTypeArgs) copy();
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
  public TTypeArgs treeCopy() {
    TTypeArgs tree = (TTypeArgs) copy();
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
   * Replaces the TType list.
   * @param list The new list node to be used as the TType list.
   * @apilevel high-level
   */
  public void setTTypeList(List<TType> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the TType list.
   * @return Number of children in the TType list.
   * @apilevel high-level
   */
  public int getNumTType() {
    return getTTypeList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TType list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the TType list.
   * @apilevel low-level
   */
  public int getNumTTypeNoTransform() {
    return getTTypeListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TType list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TType list.
   * @apilevel high-level
   */
  public TType getTType(int i) {
    return (TType) getTTypeList().getChild(i);
  }
  /**
   * Check whether the TType list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTType() {
    return getTTypeList().getNumChild() != 0;
  }
  /**
   * Append an element to the TType list.
   * @param node The element to append to the TType list.
   * @apilevel high-level
   */
  public void addTType(TType node) {
    List<TType> list = (parent == null) ? getTTypeListNoTransform() : getTTypeList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTTypeNoTransform(TType node) {
    List<TType> list = getTTypeListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TType list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTType(TType node, int i) {
    List<TType> list = getTTypeList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TType list.
   * @return The node representing the TType list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="TType")
  public List<TType> getTTypeList() {
    List<TType> list = (List<TType>) getChild(0);
    return list;
  }
  /**
   * Retrieves the TType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TType list.
   * @apilevel low-level
   */
  public List<TType> getTTypeListNoTransform() {
    return (List<TType>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the TType list without
   * triggering rewrites.
   */
  public TType getTTypeNoTransform(int i) {
    return (TType) getTTypeListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the TType list.
   * @return The node representing the TType list.
   * @apilevel high-level
   */
  public List<TType> getTTypes() {
    return getTTypeList();
  }
  /**
   * Retrieves the TType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TType list.
   * @apilevel low-level
   */
  public List<TType> getTTypesNoTransform() {
    return getTTypeListNoTransform();
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
