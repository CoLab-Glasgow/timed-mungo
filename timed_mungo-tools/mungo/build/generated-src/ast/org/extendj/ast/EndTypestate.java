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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:11
 * @astdecl EndTypestate : Typestate;
 * @production EndTypestate : {@link Typestate};

 */
public class EndTypestate extends Typestate implements Cloneable {
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:780
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		stream.print("end");
	}
  /**
   * @declaredat ASTNode:1
   */
  public EndTypestate() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    createTypestate_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public EndTypestate clone() throws CloneNotSupportedException {
    EndTypestate node = (EndTypestate) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public EndTypestate copy() {
    try {
      EndTypestate node = (EndTypestate) clone();
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
   * @declaredat ASTNode:56
   */
  @Deprecated
  public EndTypestate fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:66
   */
  public EndTypestate treeCopyNoTransform() {
    EndTypestate tree = (EndTypestate) copy();
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
   * @declaredat ASTNode:86
   */
  public EndTypestate treeCopy() {
    EndTypestate tree = (EndTypestate) copy();
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
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /** @apilevel internal */
  private void createTypestate_reset() {
    createTypestate_computed = null;
    createTypestate_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle createTypestate_computed = null;

  /** @apilevel internal */
  protected GraphNode createTypestate_value;

  /**
   * @attribute syn
   * @aspect CreateTypestate
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:24
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:14")
  public GraphNode createTypestate() {
    ASTState state = state();
    if (createTypestate_computed == ASTState.NON_CYCLE || createTypestate_computed == state().cycle()) {
      return createTypestate_value;
    }
    createTypestate_value = new EndNode();
    if (state().inCircle()) {
      createTypestate_computed = state().cycle();
    
    } else {
      createTypestate_computed = ASTState.NON_CYCLE;
    
    }
    return createTypestate_value;
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
