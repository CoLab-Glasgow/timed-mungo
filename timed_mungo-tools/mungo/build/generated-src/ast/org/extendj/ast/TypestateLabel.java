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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:15
 * @astdecl TypestateLabel : Typestate ::= <Label:String>;
 * @production TypestateLabel : {@link Typestate} ::= <span class="component">&lt;Label:String&gt;</span>;

 */
public class TypestateLabel extends Typestate implements Cloneable {
  /**
   * @aspect typestateSemanticCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateSemanticCheck.jrag:20
   */
  protected void semanticCheck() {
		if(getTarget() == null)
			addSemanticError("No Definition for state: " + getLabel());
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:806
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		stream.print(getLabel());
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateLabel() {
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
    name = {"Label"},
    type = {"String"},
    kind = {"Token"}
  )
  public TypestateLabel(String p0) {
    setLabel(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public TypestateLabel(beaver.Symbol p0) {
    setLabel(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
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
    createTypestate_reset();
    getTarget_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public TypestateLabel clone() throws CloneNotSupportedException {
    TypestateLabel node = (TypestateLabel) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public TypestateLabel copy() {
    try {
      TypestateLabel node = (TypestateLabel) clone();
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
   * @declaredat ASTNode:68
   */
  @Deprecated
  public TypestateLabel fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public TypestateLabel treeCopyNoTransform() {
    TypestateLabel tree = (TypestateLabel) copy();
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
   * @declaredat ASTNode:98
   */
  public TypestateLabel treeCopy() {
    TypestateLabel tree = (TypestateLabel) copy();
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
   * @declaredat ASTNode:112
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Label == ((TypestateLabel) node).tokenString_Label);    
  }
  /**
   * Replaces the lexeme Label.
   * @param value The new value for the lexeme Label.
   * @apilevel high-level
   */
  public void setLabel(String value) {
    tokenString_Label = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Label;
  /**
   */
  public int Labelstart;
  /**
   */
  public int Labelend;
  /**
   * JastAdd-internal setter for lexeme Label using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Label
   * @apilevel internal
   */
  public void setLabel(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setLabel is only valid for String lexemes");
    tokenString_Label = (String)symbol.value;
    Labelstart = symbol.getStart();
    Labelend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Label.
   * @return The value for the lexeme Label.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Label")
  public String getLabel() {
    return tokenString_Label != null ? tokenString_Label : "";
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:42
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:14")
  public GraphNode createTypestate() {
    ASTState state = state();
    if (createTypestate_computed == ASTState.NON_CYCLE || createTypestate_computed == state().cycle()) {
      return createTypestate_value;
    }
    createTypestate_value = getTarget().hasStateNode() ? getTarget().getStateNode() : getTarget().createTypestate();
    if (state().inCircle()) {
      createTypestate_computed = state().cycle();
    
    } else {
      createTypestate_computed = ASTState.NON_CYCLE;
    
    }
    return createTypestate_value;
  }
  /** @apilevel internal */
  private void getTarget_reset() {
    getTarget_computed = null;
    getTarget_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getTarget_computed = null;

  /** @apilevel internal */
  protected State getTarget_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:5")
  public State getTarget() {
    ASTState state = state();
    if (getTarget_computed == ASTState.NON_CYCLE || getTarget_computed == state().cycle()) {
      return getTarget_value;
    }
    getTarget_value = getTarget(getLabel());
    if (state().inCircle()) {
      getTarget_computed = state().cycle();
    
    } else {
      getTarget_computed = ASTState.NON_CYCLE;
    
    }
    return getTarget_value;
  }
  /**
   * @attribute inh
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:4")
  public State getTarget(String name) {
    State getTarget_String_value = getParent().Define_getTarget(this, null, name);
    return getTarget_String_value;
  }
  /**
   * @attribute inh
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:57")
  public State getStateAncestor() {
    State getStateAncestor_value = getParent().Define_getStateAncestor(this, null);
    return getStateAncestor_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  /** @apilevel internal */
  protected void collect_contributors_State_successors(State _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:55
    if (getTarget() != null) {
      {
        State target = (State) (getStateAncestor());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_State_successors(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_State_successors(Set<State> collection) {
    super.contributeTo_State_successors(collection);
    if (getTarget() != null) {
      collection.add(getTarget());
    }
  }
}
