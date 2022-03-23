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
 * A type variable that should have its type bounds substituted during type
 * argument bounds checking.
 * @ast node
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/grammar/Generics.ast:62
 * @astdecl SubstitutedTypeVariable : TypeVariable ::= Modifiers <ID:String> BodyDecl* Bound:Access* <Parameterization:Parameterization>;
 * @production SubstitutedTypeVariable : {@link TypeVariable} ::= <span class="component">{@link Modifiers}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link BodyDecl}*</span> <span class="component">Bound:{@link Access}*</span> <span class="component">&lt;Parameterization:Parameterization&gt;</span>;

 */
public class SubstitutedTypeVariable extends TypeVariable implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SubstitutedTypeVariable() {
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
    children = new ASTNode[3];
    setChild(new List(), 1);
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Modifiers", "ID", "BodyDecl", "Bound", "Parameterization"},
    type = {"Modifiers", "String", "List<BodyDecl>", "List<Access>", "Parameterization"},
    kind = {"Child", "Token", "List", "List", "Token"}
  )
  public SubstitutedTypeVariable(Modifiers p0, String p1, List<BodyDecl> p2, List<Access> p3, Parameterization p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setParameterization(p4);
  }
  /**
   * @declaredat ASTNode:27
   */
  public SubstitutedTypeVariable(Modifiers p0, beaver.Symbol p1, List<BodyDecl> p2, List<Access> p3, Parameterization p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setParameterization(p4);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:35
   */
  protected int numChildren() {
    return 3;
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
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public SubstitutedTypeVariable clone() throws CloneNotSupportedException {
    SubstitutedTypeVariable node = (SubstitutedTypeVariable) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:58
   */
  public SubstitutedTypeVariable copy() {
    try {
      SubstitutedTypeVariable node = (SubstitutedTypeVariable) clone();
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
   * @declaredat ASTNode:77
   */
  @Deprecated
  public SubstitutedTypeVariable fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:87
   */
  public SubstitutedTypeVariable treeCopyNoTransform() {
    SubstitutedTypeVariable tree = (SubstitutedTypeVariable) copy();
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
   * @declaredat ASTNode:107
   */
  public SubstitutedTypeVariable treeCopy() {
    SubstitutedTypeVariable tree = (SubstitutedTypeVariable) copy();
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
   * @declaredat ASTNode:121
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((SubstitutedTypeVariable) node).tokenString_ID) && (tokenParameterization_Parameterization == ((SubstitutedTypeVariable) node).tokenParameterization_Parameterization);    
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
   * Replaces the Bound list.
   * @param list The new list node to be used as the Bound list.
   * @apilevel high-level
   */
  public void setBoundList(List<Access> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Bound list.
   * @return Number of children in the Bound list.
   * @apilevel high-level
   */
  public int getNumBound() {
    return getBoundList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Bound list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Bound list.
   * @apilevel low-level
   */
  public int getNumBoundNoTransform() {
    return getBoundListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Bound list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Bound list.
   * @apilevel high-level
   */
  public Access getBound(int i) {
    return (Access) getBoundList().getChild(i);
  }
  /**
   * Check whether the Bound list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBound() {
    return getBoundList().getNumChild() != 0;
  }
  /**
   * Append an element to the Bound list.
   * @param node The element to append to the Bound list.
   * @apilevel high-level
   */
  public void addBound(Access node) {
    List<Access> list = (parent == null) ? getBoundListNoTransform() : getBoundList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addBoundNoTransform(Access node) {
    List<Access> list = getBoundListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Bound list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setBound(Access node, int i) {
    List<Access> list = getBoundList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Bound list.
   * @return The node representing the Bound list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Bound")
  public List<Access> getBoundList() {
    List<Access> list = (List<Access>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Bound list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Bound list.
   * @apilevel low-level
   */
  public List<Access> getBoundListNoTransform() {
    return (List<Access>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Bound list without
   * triggering rewrites.
   */
  public Access getBoundNoTransform(int i) {
    return (Access) getBoundListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Bound list.
   * @return The node representing the Bound list.
   * @apilevel high-level
   */
  public List<Access> getBounds() {
    return getBoundList();
  }
  /**
   * Retrieves the Bound list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Bound list.
   * @apilevel low-level
   */
  public List<Access> getBoundsNoTransform() {
    return getBoundListNoTransform();
  }
  /**
   * Replaces the lexeme Parameterization.
   * @param value The new value for the lexeme Parameterization.
   * @apilevel high-level
   */
  public void setParameterization(Parameterization value) {
    tokenParameterization_Parameterization = value;
  }
  /** @apilevel internal 
   */
  protected Parameterization tokenParameterization_Parameterization;
  /**
   * Retrieves the value for the lexeme Parameterization.
   * @return The value for the lexeme Parameterization.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Parameterization")
  public Parameterization getParameterization() {
    return tokenParameterization_Parameterization;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/GenericMethods.jrag:231
   * @apilevel internal
   */
  public SimpleSet<TypeDecl> Define_lookupType(ASTNode _callerNode, ASTNode _childNode, String name) {
    int childIndex = this.getIndexOfChild(_callerNode);
    {
        TypeDecl paramType = getParameterization().substituteBound(name);
        if (paramType != null) {
          return paramType;
        }
        return lookupType(name);
      }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/GenericMethods.jrag:231
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookupType
   */
  protected boolean canDefine_lookupType(ASTNode _callerNode, ASTNode _childNode, String name) {
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
}
