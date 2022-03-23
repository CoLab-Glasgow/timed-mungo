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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/grammar/ConstructorReference.ast:4
 * @astdecl ArrayReference : ConstructorReference ::= TypeAccess:Access;
 * @production ArrayReference : {@link ConstructorReference};

 */
public class ArrayReference extends ConstructorReference implements Cloneable {
  /**
   * @aspect Java8PrettyPrint
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/PrettyPrint.jadd:35
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print(getTypeAccess());
    out.print("::new");
  }
  /**
   * @declaredat ASTNode:1
   */
  public ArrayReference() {
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
    name = {"TypeAccess"},
    type = {"Access"},
    kind = {"Child"}
  )
  public ArrayReference(Access p0) {
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
    potentiallyCompatible_TypeDecl_BodyDecl_reset();
    congruentTo_FunctionDescriptor_reset();
    isExact_reset();
    getTypestateVar_reset();
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
  public ArrayReference clone() throws CloneNotSupportedException {
    ArrayReference node = (ArrayReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public ArrayReference copy() {
    try {
      ArrayReference node = (ArrayReference) clone();
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
  public ArrayReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public ArrayReference treeCopyNoTransform() {
    ArrayReference tree = (ArrayReference) copy();
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
  public ArrayReference treeCopy() {
    ArrayReference tree = (ArrayReference) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the TypeAccess child.
   * @param node The new node to replace the TypeAccess child.
   * @apilevel high-level
   */
  public void setTypeAccess(Access node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the TypeAccess child.
   * @return The current node used as the TypeAccess child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="TypeAccess")
  public Access getTypeAccess() {
    return (Access) getChild(0);
  }
  /**
   * Retrieves the TypeAccess child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TypeAccess child.
   * @apilevel low-level
   */
  public Access getTypeAccessNoTransform() {
    return (Access) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Java8NameCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/NameCheck.jrag:534
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Java8NameCheck", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/NameCheck.jrag:534")
  public Collection<Problem> nameProblems() {
    {
        Access typeAccess = getTypeAccess();
        while (typeAccess instanceof ArrayTypeAccess) {
          typeAccess = ((ArrayTypeAccess) typeAccess).getAccess();
        }
        if (typeAccess instanceof ParTypeAccess) {
          return Collections.singletonList(error("Cannot create array of generic type"));
        }
        return Collections.emptyList();
      }
  }
  /** @apilevel internal */
  private void potentiallyCompatible_TypeDecl_BodyDecl_reset() {
    potentiallyCompatible_TypeDecl_BodyDecl_computed = null;
    potentiallyCompatible_TypeDecl_BodyDecl_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map potentiallyCompatible_TypeDecl_BodyDecl_values;
  /** @apilevel internal */
  protected java.util.Map potentiallyCompatible_TypeDecl_BodyDecl_computed;
  /**
   * @attribute syn
   * @aspect MethodSignature18
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/MethodSignature.jrag:684
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="MethodSignature18", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/MethodSignature.jrag:511")
  public boolean potentiallyCompatible(TypeDecl type, BodyDecl candidateDecl) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(type);
    _parameters.add(candidateDecl);
    if (potentiallyCompatible_TypeDecl_BodyDecl_computed == null) potentiallyCompatible_TypeDecl_BodyDecl_computed = new java.util.HashMap(4);
    if (potentiallyCompatible_TypeDecl_BodyDecl_values == null) potentiallyCompatible_TypeDecl_BodyDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (potentiallyCompatible_TypeDecl_BodyDecl_values.containsKey(_parameters)
        && potentiallyCompatible_TypeDecl_BodyDecl_computed.containsKey(_parameters)
        && (potentiallyCompatible_TypeDecl_BodyDecl_computed.get(_parameters) == ASTState.NON_CYCLE || potentiallyCompatible_TypeDecl_BodyDecl_computed.get(_parameters) == state().cycle())) {
      return (Boolean) potentiallyCompatible_TypeDecl_BodyDecl_values.get(_parameters);
    }
    boolean potentiallyCompatible_TypeDecl_BodyDecl_value = potentiallyCompatible_compute(type, candidateDecl);
    if (state().inCircle()) {
      potentiallyCompatible_TypeDecl_BodyDecl_values.put(_parameters, potentiallyCompatible_TypeDecl_BodyDecl_value);
      potentiallyCompatible_TypeDecl_BodyDecl_computed.put(_parameters, state().cycle());
    
    } else {
      potentiallyCompatible_TypeDecl_BodyDecl_values.put(_parameters, potentiallyCompatible_TypeDecl_BodyDecl_value);
      potentiallyCompatible_TypeDecl_BodyDecl_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return potentiallyCompatible_TypeDecl_BodyDecl_value;
  }
  /** @apilevel internal */
  private boolean potentiallyCompatible_compute(TypeDecl type, BodyDecl candidateDecl) {
      if (super.potentiallyCompatible(type, candidateDecl) && type.isTypeVariable()) {
        return true;
      } else if (!super.potentiallyCompatible(type, candidateDecl)) {
        return false;
      }
      InterfaceDecl iDecl = (InterfaceDecl) type;
      FunctionDescriptor fd = iDecl.functionDescriptor();
      if (fd.method.hasValue()) {
        return fd.method.get().arity() == 1;
      } else {
        return false;
      }
    }
  /** @apilevel internal */
  private void congruentTo_FunctionDescriptor_reset() {
    congruentTo_FunctionDescriptor_computed = null;
    congruentTo_FunctionDescriptor_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map congruentTo_FunctionDescriptor_values;
  /** @apilevel internal */
  protected java.util.Map congruentTo_FunctionDescriptor_computed;
  /**
   * @attribute syn
   * @aspect ConstructorReference
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/ConstructorReference.jrag:94
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ConstructorReference", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/ConstructorReference.jrag:72")
  public boolean congruentTo(FunctionDescriptor fd) {
    Object _parameters = fd;
    if (congruentTo_FunctionDescriptor_computed == null) congruentTo_FunctionDescriptor_computed = new java.util.HashMap(4);
    if (congruentTo_FunctionDescriptor_values == null) congruentTo_FunctionDescriptor_values = new java.util.HashMap(4);
    ASTState state = state();
    if (congruentTo_FunctionDescriptor_values.containsKey(_parameters)
        && congruentTo_FunctionDescriptor_computed.containsKey(_parameters)
        && (congruentTo_FunctionDescriptor_computed.get(_parameters) == ASTState.NON_CYCLE || congruentTo_FunctionDescriptor_computed.get(_parameters) == state().cycle())) {
      return (Boolean) congruentTo_FunctionDescriptor_values.get(_parameters);
    }
    boolean congruentTo_FunctionDescriptor_value = congruentTo_compute(fd);
    if (state().inCircle()) {
      congruentTo_FunctionDescriptor_values.put(_parameters, congruentTo_FunctionDescriptor_value);
      congruentTo_FunctionDescriptor_computed.put(_parameters, state().cycle());
    
    } else {
      congruentTo_FunctionDescriptor_values.put(_parameters, congruentTo_FunctionDescriptor_value);
      congruentTo_FunctionDescriptor_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return congruentTo_FunctionDescriptor_value;
  }
  /** @apilevel internal */
  private boolean congruentTo_compute(FunctionDescriptor fd) {
      if (fd.method.hasValue()) {
        MethodDecl targetMethod = fd.method.get();
        if (targetMethod.getNumParameter() != 1) {
          return false;
        }
        if (!targetMethod.getParameter(0).type()
            .assignConversionTo(fd.fromInterface().typeInt(), null)) {
          return false;
        }
        if (!targetMethod.type().isVoid()) {
          if (!getTypeAccess().type().assignConversionTo(targetMethod.type(), null)) {
            return false;
          }
        }
        return true;
      } else {
        // No target method.
        return false;
      }
    }
  /** @apilevel internal */
  private void isExact_reset() {
    isExact_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isExact_computed = null;

  /** @apilevel internal */
  protected boolean isExact_value;

  /**
   * @attribute syn
   * @aspect ConstructorReference
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/ConstructorReference.jrag:193
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ConstructorReference", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/ConstructorReference.jrag:153")
  public boolean isExact() {
    ASTState state = state();
    if (isExact_computed == ASTState.NON_CYCLE || isExact_computed == state().cycle()) {
      return isExact_value;
    }
    isExact_value = true;
    if (state().inCircle()) {
      isExact_computed = state().cycle();
    
    } else {
      isExact_computed = ASTState.NON_CYCLE;
    
    }
    return isExact_value;
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:96
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:1036
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:741")
  public boolean getGraph(Set<TypestateVar> env) {
    boolean getGraph_Set_TypestateVar__value = true;
    return getGraph_Set_TypestateVar__value;
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
  protected void collect_contributors_CompilationUnit_problems(CompilationUnit _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/NameCheck.jrag:532
    {
      java.util.Set<ASTNode> contributors = _map.get(_root);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) _root, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_CompilationUnit_problems(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_CompilationUnit_problems(LinkedList<Problem> collection) {
    super.contributeTo_CompilationUnit_problems(collection);
    for (Problem value : nameProblems()) {
      collection.add(value);
    }
  }
}
