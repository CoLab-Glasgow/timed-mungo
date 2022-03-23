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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:3
 * @astdecl TypestateDecl : TypeDecl ::= Modifiers <ID:String> BodyDecl* InitState State*;
 * @production TypestateDecl : {@link TypeDecl} ::= <span class="component">{@link InitState}</span> <span class="component">{@link State}*</span>;

 */
public class TypestateDecl extends TypeDecl implements Cloneable {
  /**
   * @aspect debug
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Debug.jrag:6
   */
  void printStates() {
		System.out.println(getInitState().getID() + ":");
		getInitState().getStateNode().printPaths();
		System.out.println("\n\n");

		for(int i = 0; i < getNumState(); i++) {
			System.out.println(getState(i).getID() + ":");
			getState(i).getStateNode().printPaths();
			System.out.println("\n\n");
		}
	}
  /***********************************************************
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:726
   */
  protected void Rewrite(TypestateStream stream) {
		stream.println("typestate " + getID() + " {");
		stream.pushIndent();
		stream.println("session");
		stream.pushIndent();
		getInitState().Rewrite(stream);
		stream.popIndent();
		stream.println();
		if(getNumState() != 0)
			stream.println("where");
		stream.pushIndent();
		for (int i = 0; i < getNumState(); i++) {
			getState(i).Rewrite(stream);
		}
		stream.popIndent();
		stream.popIndent();
		stream.println();
		stream.println("}");
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateDecl() {
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
    children = new ASTNode[4];
    setChild(new List(), 1);
    setChild(new List(), 3);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Modifiers", "ID", "BodyDecl", "InitState", "State"},
    type = {"Modifiers", "String", "List<BodyDecl>", "InitState", "List<State>"},
    kind = {"Child", "Token", "List", "Child", "List"}
  )
  public TypestateDecl(Modifiers p0, String p1, List<BodyDecl> p2, InitState p3, List<State> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @declaredat ASTNode:27
   */
  public TypestateDecl(Modifiers p0, beaver.Symbol p1, List<BodyDecl> p2, InitState p3, List<State> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:35
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:41
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    createTypestate_reset();
    isTypestateDeclType_reset();
    getTypestateDecl_reset();
    getStateMap_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    TypestateDecl_getMethods_computed = null;
    TypestateDecl_getMethods_value = null;
    TypestateDecl_getClocks_computed = null;
    TypestateDecl_getClocks_value = null;
    contributorMap_TypestateDecl_getMethods = null;
    contributorMap_TypestateDecl_getClocks = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:63
   */
  public TypestateDecl clone() throws CloneNotSupportedException {
    TypestateDecl node = (TypestateDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:68
   */
  public TypestateDecl copy() {
    try {
      TypestateDecl node = (TypestateDecl) clone();
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
   * @declaredat ASTNode:87
   */
  @Deprecated
  public TypestateDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:97
   */
  public TypestateDecl treeCopyNoTransform() {
    TypestateDecl tree = (TypestateDecl) copy();
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
   * @declaredat ASTNode:117
   */
  public TypestateDecl treeCopy() {
    TypestateDecl tree = (TypestateDecl) copy();
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
   * @declaredat ASTNode:131
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((TypestateDecl) node).tokenString_ID);    
  }
  /**
   * Replaces the Modifiers child.
   * @param node The new node to replace the Modifiers child.
   * @apilevel high-level
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Modifiers child.
   * @return The current node used as the Modifiers child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Modifiers")
  public Modifiers getModifiers() {
    return (Modifiers) getChild(0);
  }
  /**
   * Retrieves the Modifiers child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Modifiers child.
   * @apilevel low-level
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
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
  /**
   * Replaces the BodyDecl list.
   * @param list The new list node to be used as the BodyDecl list.
   * @apilevel high-level
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * @return Number of children in the BodyDecl list.
   * @apilevel high-level
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the BodyDecl list.
   * @apilevel low-level
   */
  public int getNumBodyDeclNoTransform() {
    return getBodyDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the BodyDecl list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the BodyDecl list.
   * @apilevel high-level
   */
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl) getBodyDeclList().getChild(i);
  }
  /**
   * Check whether the BodyDecl list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBodyDecl() {
    return getBodyDeclList().getNumChild() != 0;
  }
  /**
   * Append an element to the BodyDecl list.
   * @param node The element to append to the BodyDecl list.
   * @apilevel high-level
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the BodyDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="BodyDecl")
  public List<BodyDecl> getBodyDeclList() {
    List<BodyDecl> list = (List<BodyDecl>) getChild(1);
    return list;
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the BodyDecl list without
   * triggering rewrites.
   */
  public BodyDecl getBodyDeclNoTransform(int i) {
    return (BodyDecl) getBodyDeclListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * Replaces the InitState child.
   * @param node The new node to replace the InitState child.
   * @apilevel high-level
   */
  public void setInitState(InitState node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the InitState child.
   * @return The current node used as the InitState child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="InitState")
  public InitState getInitState() {
    return (InitState) getChild(2);
  }
  /**
   * Retrieves the InitState child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the InitState child.
   * @apilevel low-level
   */
  public InitState getInitStateNoTransform() {
    return (InitState) getChildNoTransform(2);
  }
  /**
   * Replaces the State list.
   * @param list The new list node to be used as the State list.
   * @apilevel high-level
   */
  public void setStateList(List<State> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the State list.
   * @return Number of children in the State list.
   * @apilevel high-level
   */
  public int getNumState() {
    return getStateList().getNumChild();
  }
  /**
   * Retrieves the number of children in the State list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the State list.
   * @apilevel low-level
   */
  public int getNumStateNoTransform() {
    return getStateListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the State list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the State list.
   * @apilevel high-level
   */
  public State getState(int i) {
    return (State) getStateList().getChild(i);
  }
  /**
   * Check whether the State list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasState() {
    return getStateList().getNumChild() != 0;
  }
  /**
   * Append an element to the State list.
   * @param node The element to append to the State list.
   * @apilevel high-level
   */
  public void addState(State node) {
    List<State> list = (parent == null) ? getStateListNoTransform() : getStateList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addStateNoTransform(State node) {
    List<State> list = getStateListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the State list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setState(State node, int i) {
    List<State> list = getStateList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the State list.
   * @return The node representing the State list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="State")
  public List<State> getStateList() {
    List<State> list = (List<State>) getChild(3);
    return list;
  }
  /**
   * Retrieves the State list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the State list.
   * @apilevel low-level
   */
  public List<State> getStateListNoTransform() {
    return (List<State>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the State list without
   * triggering rewrites.
   */
  public State getStateNoTransform(int i) {
    return (State) getStateListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the State list.
   * @return The node representing the State list.
   * @apilevel high-level
   */
  public List<State> getStates() {
    return getStateList();
  }
  /**
   * Retrieves the State list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the State list.
   * @apilevel low-level
   */
  public List<State> getStatesNoTransform() {
    return getStateListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:86
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_TypestateDecl_getMethods = null;

  /** @apilevel internal */
  protected void survey_TypestateDecl_getMethods() {
    if (contributorMap_TypestateDecl_getMethods == null) {
      contributorMap_TypestateDecl_getMethods = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_TypestateDecl_getMethods(this, contributorMap_TypestateDecl_getMethods);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:5
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_TypestateDecl_getClocks = null;

  /** @apilevel internal */
  protected void survey_TypestateDecl_getClocks() {
    if (contributorMap_TypestateDecl_getClocks == null) {
      contributorMap_TypestateDecl_getClocks = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_TypestateDecl_getClocks(this, contributorMap_TypestateDecl_getClocks);
    }
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:3")
  public GraphNode createTypestate() {
    ASTState state = state();
    if (createTypestate_computed == ASTState.NON_CYCLE || createTypestate_computed == state().cycle()) {
      return createTypestate_value;
    }
    createTypestate_value = new InitNode().addNext(getInitState().createTypestate());
    if (state().inCircle()) {
      createTypestate_computed = state().cycle();
    
    } else {
      createTypestate_computed = ASTState.NON_CYCLE;
    
    }
    return createTypestate_value;
  }
  /** @apilevel internal */
  private void isTypestateDeclType_reset() {
    isTypestateDeclType_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isTypestateDeclType_computed = null;

  /** @apilevel internal */
  protected boolean isTypestateDeclType_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:42")
  public boolean isTypestateDeclType() {
    ASTState state = state();
    if (isTypestateDeclType_computed == ASTState.NON_CYCLE || isTypestateDeclType_computed == state().cycle()) {
      return isTypestateDeclType_value;
    }
    isTypestateDeclType_value = true;
    if (state().inCircle()) {
      isTypestateDeclType_computed = state().cycle();
    
    } else {
      isTypestateDeclType_computed = ASTState.NON_CYCLE;
    
    }
    return isTypestateDeclType_value;
  }
  /** @apilevel internal */
  private void getTypestateDecl_reset() {
    getTypestateDecl_computed = null;
    getTypestateDecl_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getTypestateDecl_computed = null;

  /** @apilevel internal */
  protected TypestateDecl getTypestateDecl_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:58
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:48")
  public TypestateDecl getTypestateDecl() {
    ASTState state = state();
    if (getTypestateDecl_computed == ASTState.NON_CYCLE || getTypestateDecl_computed == state().cycle()) {
      return getTypestateDecl_value;
    }
    getTypestateDecl_value = this;
    if (state().inCircle()) {
      getTypestateDecl_computed = state().cycle();
    
    } else {
      getTypestateDecl_computed = ASTState.NON_CYCLE;
    
    }
    return getTypestateDecl_value;
  }
  /** @apilevel internal */
  private void getStateMap_reset() {
    getStateMap_computed = null;
    getStateMap_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getStateMap_computed = null;

  /** @apilevel internal */
  protected Map<String, State> getStateMap_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:10
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:10")
  public Map<String, State> getStateMap() {
    ASTState state = state();
    if (getStateMap_computed == ASTState.NON_CYCLE || getStateMap_computed == state().cycle()) {
      return getStateMap_value;
    }
    getStateMap_value = getStateMap_compute();
    if (state().inCircle()) {
      getStateMap_computed = state().cycle();
    
    } else {
      getStateMap_computed = ASTState.NON_CYCLE;
    
    }
    return getStateMap_value;
  }
  /** @apilevel internal */
  private Map<String, State> getStateMap_compute() {
  		Map<String, State> m = new HashMap<String, State>();
  		m.put(getInitState().getID(), getInitState());
  		for(int i = 0; i < getNumState(); i++)
  			if(!m.containsKey(getState(i).getID()))
  				m.put(getState(i).getID(), getState(i));
  		return m;
  	}
  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:25
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:25")
  public boolean isDuplicate(String name) {
    {
    		int count = 0;
    
    		if(getInitState().getID().equals(name))
    			count++;
    
    		for(int i = 0; i < getNumState(); i++)
    			if(getState(i).getID().equals(name))
    				count++;
    
    		return count > 1;
    	}
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:4
   * @apilevel internal
   */
  public State Define_getTarget(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (getInitStateNoTransform() != null && _callerNode == getInitState()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:8
      return getStateMap().get(name);
    }
    else if (_callerNode == getStateListNoTransform()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:7
      int i = _callerNode.getIndexOfChild(_childNode);
      return getStateMap().get(name);
    }
    else {
      return getParent().Define_getTarget(this, _callerNode, name);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:4
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute getTarget
   */
  protected boolean canDefine_getTarget(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:19
   * @apilevel internal
   */
  public boolean Define_isDuplicate(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (getInitStateNoTransform() != null && _callerNode == getInitState()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:23
      return isDuplicate(name);
    }
    else if (_callerNode == getStateListNoTransform()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:22
      int i = _callerNode.getIndexOfChild(_childNode);
      return isDuplicate(name);
    }
    else {
      return getParent().Define_isDuplicate(this, _callerNode, name);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:19
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isDuplicate
   */
  protected boolean canDefine_isDuplicate(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:38
   * @apilevel internal
   */
  public boolean Define_isReachable(ASTNode _callerNode, ASTNode _childNode, State tn) {
    if (getInitStateNoTransform() != null && _callerNode == getInitState()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:42
      return true;
    }
    else if (_callerNode == getStateListNoTransform()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:41
      int i = _callerNode.getIndexOfChild(_childNode);
      return getInitState().reachable().contains(tn);
    }
    else {
      return getParent().Define_isReachable(this, _callerNode, tn);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:38
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isReachable
   */
  protected boolean canDefine_isReachable(ASTNode _callerNode, ASTNode _childNode, State tn) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:8
   * @apilevel internal
   */
  public TypestateDecl Define_getTypestateDeclAncestor(ASTNode _callerNode, ASTNode _childNode) {
    if (getInitStateNoTransform() != null && _callerNode == getInitState()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:91
      return this;
    }
    else if (_callerNode == getStateListNoTransform()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:90
      int i = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_getTypestateDeclAncestor(this, _callerNode);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:8
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute getTypestateDeclAncestor
   */
  protected boolean canDefine_getTypestateDeclAncestor(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  /**
   * @attribute coll
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:86
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:86")
  public Set<TypestateMethod> getMethods() {
    ASTState state = state();
    if (TypestateDecl_getMethods_computed == ASTState.NON_CYCLE || TypestateDecl_getMethods_computed == state().cycle()) {
      return TypestateDecl_getMethods_value;
    }
    TypestateDecl_getMethods_value = getMethods_compute();
    if (state().inCircle()) {
      TypestateDecl_getMethods_computed = state().cycle();
    
    } else {
      TypestateDecl_getMethods_computed = ASTState.NON_CYCLE;
    
    }
    return TypestateDecl_getMethods_value;
  }
  /** @apilevel internal */
  private Set<TypestateMethod> getMethods_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof TypestateDecl)) {
      node = node.getParent();
    }
    TypestateDecl root = (TypestateDecl) node;
    root.survey_TypestateDecl_getMethods();
    Set<TypestateMethod> _computedValue = new HashSet<TypestateMethod>();
    if (root.contributorMap_TypestateDecl_getMethods.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_TypestateDecl_getMethods.get(this)) {
        contributor.contributeTo_TypestateDecl_getMethods(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle TypestateDecl_getMethods_computed = null;

  /** @apilevel internal */
  protected Set<TypestateMethod> TypestateDecl_getMethods_value;

  /**
   * @attribute coll
   * @aspect Time
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Time", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Time.jrag:5")
  public Set<String> getClocks() {
    ASTState state = state();
    if (TypestateDecl_getClocks_computed == ASTState.NON_CYCLE || TypestateDecl_getClocks_computed == state().cycle()) {
      return TypestateDecl_getClocks_value;
    }
    TypestateDecl_getClocks_value = getClocks_compute();
    if (state().inCircle()) {
      TypestateDecl_getClocks_computed = state().cycle();
    
    } else {
      TypestateDecl_getClocks_computed = ASTState.NON_CYCLE;
    
    }
    return TypestateDecl_getClocks_value;
  }
  /** @apilevel internal */
  private Set<String> getClocks_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof TypestateDecl)) {
      node = node.getParent();
    }
    TypestateDecl root = (TypestateDecl) node;
    root.survey_TypestateDecl_getClocks();
    Set<String> _computedValue = new HashSet<String>();
    if (root.contributorMap_TypestateDecl_getClocks.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_TypestateDecl_getClocks.get(this)) {
        contributor.contributeTo_TypestateDecl_getClocks(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle TypestateDecl_getClocks_computed = null;

  /** @apilevel internal */
  protected Set<String> TypestateDecl_getClocks_value;

}
