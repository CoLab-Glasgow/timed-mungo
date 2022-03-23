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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:14
 * @astdecl TypestateSwitch : Typestate ::= TypestateSwitchCase*;
 * @production TypestateSwitch : {@link Typestate} ::= <span class="component">{@link TypestateSwitchCase}*</span>;

 */
public class TypestateSwitch extends Typestate implements Cloneable {
  /**
   * @aspect typestateSemanticCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateSemanticCheck.jrag:48
   */
  protected void semanticCheck() {
		for(int i = 0; i < getNumTypestateSwitchCase(); i++)
			for(int j = i + 1; j < getNumTypestateSwitchCase(); j++)
				if(getTypestateSwitchCase(i).getLabel().equals(getTypestateSwitchCase(j).getLabel())){
					addSemanticError("Duplicate case label: " + getTypestateSwitchCase(i).getLabel() + ".");
				}
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:796
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		stream.print("<");
		for (int j = 0; j< getNumTypestateSwitchCase(); j++) {
			if (j != 0)
				stream.print(",");
			getTypestateSwitchCase(j).Rewrite(stream, hasNewLine);
		}
		stream.print(">");
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateSwitch() {
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
    name = {"TypestateSwitchCase"},
    type = {"List<TypestateSwitchCase>"},
    kind = {"List"}
  )
  public TypestateSwitch(List<TypestateSwitchCase> p0) {
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
    TypestateSwitch_getLabels_computed = null;
    TypestateSwitch_getLabels_value = null;
    contributorMap_TypestateSwitch_getLabels = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public TypestateSwitch clone() throws CloneNotSupportedException {
    TypestateSwitch node = (TypestateSwitch) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public TypestateSwitch copy() {
    try {
      TypestateSwitch node = (TypestateSwitch) clone();
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
   * @declaredat ASTNode:69
   */
  @Deprecated
  public TypestateSwitch fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public TypestateSwitch treeCopyNoTransform() {
    TypestateSwitch tree = (TypestateSwitch) copy();
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
   * @declaredat ASTNode:99
   */
  public TypestateSwitch treeCopy() {
    TypestateSwitch tree = (TypestateSwitch) copy();
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
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the TypestateSwitchCase list.
   * @param list The new list node to be used as the TypestateSwitchCase list.
   * @apilevel high-level
   */
  public void setTypestateSwitchCaseList(List<TypestateSwitchCase> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the TypestateSwitchCase list.
   * @return Number of children in the TypestateSwitchCase list.
   * @apilevel high-level
   */
  public int getNumTypestateSwitchCase() {
    return getTypestateSwitchCaseList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TypestateSwitchCase list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the TypestateSwitchCase list.
   * @apilevel low-level
   */
  public int getNumTypestateSwitchCaseNoTransform() {
    return getTypestateSwitchCaseListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TypestateSwitchCase list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TypestateSwitchCase list.
   * @apilevel high-level
   */
  public TypestateSwitchCase getTypestateSwitchCase(int i) {
    return (TypestateSwitchCase) getTypestateSwitchCaseList().getChild(i);
  }
  /**
   * Check whether the TypestateSwitchCase list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTypestateSwitchCase() {
    return getTypestateSwitchCaseList().getNumChild() != 0;
  }
  /**
   * Append an element to the TypestateSwitchCase list.
   * @param node The element to append to the TypestateSwitchCase list.
   * @apilevel high-level
   */
  public void addTypestateSwitchCase(TypestateSwitchCase node) {
    List<TypestateSwitchCase> list = (parent == null) ? getTypestateSwitchCaseListNoTransform() : getTypestateSwitchCaseList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTypestateSwitchCaseNoTransform(TypestateSwitchCase node) {
    List<TypestateSwitchCase> list = getTypestateSwitchCaseListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TypestateSwitchCase list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTypestateSwitchCase(TypestateSwitchCase node, int i) {
    List<TypestateSwitchCase> list = getTypestateSwitchCaseList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TypestateSwitchCase list.
   * @return The node representing the TypestateSwitchCase list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="TypestateSwitchCase")
  public List<TypestateSwitchCase> getTypestateSwitchCaseList() {
    List<TypestateSwitchCase> list = (List<TypestateSwitchCase>) getChild(0);
    return list;
  }
  /**
   * Retrieves the TypestateSwitchCase list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypestateSwitchCase list.
   * @apilevel low-level
   */
  public List<TypestateSwitchCase> getTypestateSwitchCaseListNoTransform() {
    return (List<TypestateSwitchCase>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the TypestateSwitchCase list without
   * triggering rewrites.
   */
  public TypestateSwitchCase getTypestateSwitchCaseNoTransform(int i) {
    return (TypestateSwitchCase) getTypestateSwitchCaseListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the TypestateSwitchCase list.
   * @return The node representing the TypestateSwitchCase list.
   * @apilevel high-level
   */
  public List<TypestateSwitchCase> getTypestateSwitchCases() {
    return getTypestateSwitchCaseList();
  }
  /**
   * Retrieves the TypestateSwitchCase list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypestateSwitchCase list.
   * @apilevel low-level
   */
  public List<TypestateSwitchCase> getTypestateSwitchCasesNoTransform() {
    return getTypestateSwitchCaseListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:80
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_TypestateSwitch_getLabels = null;

  /** @apilevel internal */
  protected void survey_TypestateSwitch_getLabels() {
    if (contributorMap_TypestateSwitch_getLabels == null) {
      contributorMap_TypestateSwitch_getLabels = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_TypestateSwitch_getLabels(this, contributorMap_TypestateSwitch_getLabels);
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:30
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
  		SwitchNode n =  new SwitchNode();
  
  		for(int i = 0; i < getNumTypestateSwitchCase(); i++) {
  			SwitchCase c = new SwitchCase(getTypestateSwitchCase(i).getLabel(), null, getTypestateSwitchCase(i).getTimeConstraint());
  
  			c.addNext(getTypestateSwitchCase(i).getTypestate().createTypestate());
  			n.addNext(c);
  		}
  		return n;
  	}
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:83
   * @apilevel internal
   */
  public TypestateSwitch Define_getTypestateSwitchAncestor(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getTypestateSwitchCaseListNoTransform()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:84
      int i = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_getTypestateSwitchAncestor(this, _callerNode);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:83
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute getTypestateSwitchAncestor
   */
  protected boolean canDefine_getTypestateSwitchAncestor(ASTNode _callerNode, ASTNode _childNode) {
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:80
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:80")
  public Set<String> getLabels() {
    ASTState state = state();
    if (TypestateSwitch_getLabels_computed == ASTState.NON_CYCLE || TypestateSwitch_getLabels_computed == state().cycle()) {
      return TypestateSwitch_getLabels_value;
    }
    TypestateSwitch_getLabels_value = getLabels_compute();
    if (state().inCircle()) {
      TypestateSwitch_getLabels_computed = state().cycle();
    
    } else {
      TypestateSwitch_getLabels_computed = ASTState.NON_CYCLE;
    
    }
    return TypestateSwitch_getLabels_value;
  }
  /** @apilevel internal */
  private Set<String> getLabels_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof TypestateSwitch)) {
      node = node.getParent();
    }
    TypestateSwitch root = (TypestateSwitch) node;
    root.survey_TypestateSwitch_getLabels();
    Set<String> _computedValue = new HashSet<String>();
    if (root.contributorMap_TypestateSwitch_getLabels.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_TypestateSwitch_getLabels.get(this)) {
        contributor.contributeTo_TypestateSwitch_getLabels(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle TypestateSwitch_getLabels_computed = null;

  /** @apilevel internal */
  protected Set<String> TypestateSwitch_getLabels_value;

}
