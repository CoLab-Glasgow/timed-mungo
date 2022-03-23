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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/grammar/Generics.ast:68
 * @astdecl WildcardSuper : AbstractWildcard ::= Access;
 * @production WildcardSuper : {@link AbstractWildcard} ::= <span class="component">{@link Access}</span>;

 */
public class WildcardSuper extends AbstractWildcard implements Cloneable {
  /**
   * @aspect Java5PrettyPrint
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/PrettyPrint.jadd:380
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print("? super ");
    out.print(getAccess());
  }
  /**
   * @aspect PrettyPrintUtil5
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/PrettyPrintUtil.jrag:133
   */
  @Override public String toString() {
    return String.format("? super %s", getAccessNoTransform().toString());
  }
  /**
   * @aspect Diamond
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java7/frontend/Diamond.jrag:259
   */
  public Access substituted(Map<TypeVariable, String>  substitution) {
    return new WildcardSuper(getAccess().substituted(substitution));
  }
  /**
   * @declaredat ASTNode:1
   */
  public WildcardSuper() {
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
    name = {"Access"},
    type = {"Access"},
    kind = {"Child"}
  )
  public WildcardSuper(Access p0) {
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
    type_reset();
    getTypestateVar_reset();
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
  public WildcardSuper clone() throws CloneNotSupportedException {
    WildcardSuper node = (WildcardSuper) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public WildcardSuper copy() {
    try {
      WildcardSuper node = (WildcardSuper) clone();
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
  public WildcardSuper fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public WildcardSuper treeCopyNoTransform() {
    WildcardSuper tree = (WildcardSuper) copy();
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
  public WildcardSuper treeCopy() {
    WildcardSuper tree = (WildcardSuper) copy();
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
   * Replaces the Access child.
   * @param node The new node to replace the Access child.
   * @apilevel high-level
   */
  public void setAccess(Access node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Access child.
   * @return The current node used as the Access child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Access")
  public Access getAccess() {
    return (Access) getChild(0);
  }
  /**
   * Retrieves the Access child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Access child.
   * @apilevel low-level
   */
  public Access getAccessNoTransform() {
    return (Access) getChildNoTransform(0);
  }
  /** @apilevel internal */
  private void type_reset() {
    type_computed = null;
    type_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle type_computed = null;

  /** @apilevel internal */
  protected TypeDecl type_value;

  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1754
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/TypeAnalysis.jrag:295")
  public TypeDecl type() {
    ASTState state = state();
    if (type_computed == ASTState.NON_CYCLE || type_computed == state().cycle()) {
      return type_value;
    }
    type_value = lookupWildcardSuper(getAccess().type());
    if (state().inCircle()) {
      type_computed = state().cycle();
    
    } else {
      type_computed = ASTState.NON_CYCLE;
    
    }
    return type_value;
  }
  /**
   * @attribute syn
   * @aspect LambdaParametersInference
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/TypeCheck.jrag:632
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LambdaParametersInference", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/TypeCheck.jrag:624")
  public boolean mentionsTypeVariable(TypeVariable var) {
    boolean mentionsTypeVariable_TypeVariable_value = getAccess().mentionsTypeVariable(var);
    return mentionsTypeVariable_TypeVariable_value;
  }
  /** @apilevel internal */
  private void getTypestateVar_reset() {
    getTypestateVar_computed = null;
    getTypestateVar_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getTypestateVar_computed = null;

  /** @apilevel internal */
  protected TypestateVar getTypestateVar_value;

  /**
   * @attribute syn
   * @aspect GetGraph
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:92
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:33")
  public TypestateVar getTypestateVar() {
    ASTState state = state();
    if (getTypestateVar_computed == ASTState.NON_CYCLE || getTypestateVar_computed == state().cycle()) {
      return getTypestateVar_value;
    }
    getTypestateVar_value = null;
    if (state().inCircle()) {
      getTypestateVar_computed = state().cycle();
    
    } else {
      getTypestateVar_computed = ASTState.NON_CYCLE;
    
    }
    return getTypestateVar_value;
  }
  /**
   * @attribute syn
   * @aspect GetGraph
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:1031
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:741")
  public boolean getGraph(Set<TypestateVar> env) {
    boolean getGraph_Set_TypestateVar__value = true;
    return getGraph_Set_TypestateVar__value;
  }
  /**
   * @attribute inh
   * @aspect LookupParTypeDecl
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1755
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1755")
  public TypeDecl lookupWildcardSuper(TypeDecl typeDecl) {
    TypeDecl lookupWildcardSuper_TypeDecl_value = getParent().Define_lookupWildcardSuper(this, null, typeDecl);
    return lookupWildcardSuper_TypeDecl_value;
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
