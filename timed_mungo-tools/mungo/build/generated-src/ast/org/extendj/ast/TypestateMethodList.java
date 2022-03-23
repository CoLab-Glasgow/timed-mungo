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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:10
 * @astdecl TypestateMethodList : Typestate ::= TypestateMethod*;
 * @production TypestateMethodList : {@link Typestate} ::= <span class="component">{@link TypestateMethod}*</span>;

 */
public class TypestateMethodList extends Typestate implements Cloneable {
  /**
   * @aspect typestateSemanticCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateSemanticCheck.jrag:73
   */
  protected void semanticCheck() {
		for(int i = 0; i < getNumTypestateMethod(); i++) {
			TypestateMethod tm1 = getTypestateMethod(i);
			for(int j = i + 1; j < getNumTypestateMethod(); j++) {
				TypestateMethod tm2 = getTypestateMethod(j);
				if(tm1.signature().equals(tm2.signature()))
					addSemanticError("Duplicate method signature in the prefix of a set Sta: " + tm1.signature() + ".");
			}
		}
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:760
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		if(hasNewLine) {
			stream.println();
			stream.println("{");
		}
		else
			stream.print("{");
		for (int i = 0; i < getNumTypestateMethod(); i++) {
			if(i != 0)
				if(hasNewLine)
					stream.println(", ");
				else
					stream.print(", ");
			getTypestateMethod(i).Rewrite(stream, hasNewLine);
		}
		if(hasNewLine)
			stream.println();
		stream.print("}");
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateMethodList() {
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
    name = {"TypestateMethod"},
    type = {"List<TypestateMethod>"},
    kind = {"List"}
  )
  public TypestateMethodList(List<TypestateMethod> p0) {
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
    createTypestate_reset();
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
  public TypestateMethodList clone() throws CloneNotSupportedException {
    TypestateMethodList node = (TypestateMethodList) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public TypestateMethodList copy() {
    try {
      TypestateMethodList node = (TypestateMethodList) clone();
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
  public TypestateMethodList fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public TypestateMethodList treeCopyNoTransform() {
    TypestateMethodList tree = (TypestateMethodList) copy();
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
  public TypestateMethodList treeCopy() {
    TypestateMethodList tree = (TypestateMethodList) copy();
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
   * Replaces the TypestateMethod list.
   * @param list The new list node to be used as the TypestateMethod list.
   * @apilevel high-level
   */
  public void setTypestateMethodList(List<TypestateMethod> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the TypestateMethod list.
   * @return Number of children in the TypestateMethod list.
   * @apilevel high-level
   */
  public int getNumTypestateMethod() {
    return getTypestateMethodList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TypestateMethod list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the TypestateMethod list.
   * @apilevel low-level
   */
  public int getNumTypestateMethodNoTransform() {
    return getTypestateMethodListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TypestateMethod list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TypestateMethod list.
   * @apilevel high-level
   */
  public TypestateMethod getTypestateMethod(int i) {
    return (TypestateMethod) getTypestateMethodList().getChild(i);
  }
  /**
   * Check whether the TypestateMethod list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTypestateMethod() {
    return getTypestateMethodList().getNumChild() != 0;
  }
  /**
   * Append an element to the TypestateMethod list.
   * @param node The element to append to the TypestateMethod list.
   * @apilevel high-level
   */
  public void addTypestateMethod(TypestateMethod node) {
    List<TypestateMethod> list = (parent == null) ? getTypestateMethodListNoTransform() : getTypestateMethodList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTypestateMethodNoTransform(TypestateMethod node) {
    List<TypestateMethod> list = getTypestateMethodListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TypestateMethod list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTypestateMethod(TypestateMethod node, int i) {
    List<TypestateMethod> list = getTypestateMethodList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TypestateMethod list.
   * @return The node representing the TypestateMethod list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="TypestateMethod")
  public List<TypestateMethod> getTypestateMethodList() {
    List<TypestateMethod> list = (List<TypestateMethod>) getChild(0);
    return list;
  }
  /**
   * Retrieves the TypestateMethod list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypestateMethod list.
   * @apilevel low-level
   */
  public List<TypestateMethod> getTypestateMethodListNoTransform() {
    return (List<TypestateMethod>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the TypestateMethod list without
   * triggering rewrites.
   */
  public TypestateMethod getTypestateMethodNoTransform(int i) {
    return (TypestateMethod) getTypestateMethodListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the TypestateMethod list.
   * @return The node representing the TypestateMethod list.
   * @apilevel high-level
   */
  public List<TypestateMethod> getTypestateMethods() {
    return getTypestateMethodList();
  }
  /**
   * Retrieves the TypestateMethod list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypestateMethod list.
   * @apilevel low-level
   */
  public List<TypestateMethod> getTypestateMethodsNoTransform() {
    return getTypestateMethodListNoTransform();
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:16
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:14")
  public GraphNode createTypestate() {
    ASTState state = state();
    if (createTypestate_computed == ASTState.NON_CYCLE || createTypestate_computed == state().cycle()) {
      return createTypestate_value;
    }
    createTypestate_value = createTypestate_compute();
    if (state().inCircle()) {
      createTypestate_computed = state().cycle();
    
    } else {
      createTypestate_computed = ASTState.NON_CYCLE;
    
    }
    return createTypestate_value;
  }
  /** @apilevel internal */
  private GraphNode createTypestate_compute() {
  		GraphNode n = new LoopNode();
  		for(int i = 0; i < getNumTypestateMethod(); i++){
  			n.addNext(getTypestateMethod(i).createTypestate());
  		}
  		return n;
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
