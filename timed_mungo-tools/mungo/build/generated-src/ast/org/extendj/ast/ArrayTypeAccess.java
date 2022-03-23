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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/grammar/Java.ast:100
 * @astdecl ArrayTypeAccess : TypeAccess ::= Access <Package:String> <ID:String>;
 * @production ArrayTypeAccess : {@link TypeAccess} ::= <span class="component">&lt;Package:String&gt;</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link Access}</span>;

 */
public class ArrayTypeAccess extends TypeAccess implements Cloneable {
  /**
   * @aspect Java4PrettyPrint
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/PrettyPrint.jadd:58
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print(getAccess());
    out.print("[]");
  }
  /**
   * @aspect PrettyPrintUtil
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/PrettyPrintUtil.jrag:87
   */
  @Override public String toString() {
    return getAccessNoTransform().toString() + "[]";
  }
  /**
   * @aspect FunctionalInterface
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/FunctionalInterface.jrag:269
   */
  public boolean sameType(ArrayTypeAccess a) {
    ArrayTypeAccess at1 = this;
    ArrayTypeAccess at2 = a;
    while (true) {
      Access a1 = at1.getAccess();
      Access a2 = at2.getAccess();
      if (a1 instanceof ArrayTypeAccess && a2 instanceof ArrayTypeAccess) {
        at1 = (ArrayTypeAccess) a1;
        at2 = (ArrayTypeAccess) a2;
        continue;
      } else {
        return a1.sameType(a2);
      }
    }
  }
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:299
   */
  protected void Rewrite(TypestateStream stream) {
		getAccess().Rewrite(stream);
		stream.print("[]");
	}
  /**
   * @declaredat ASTNode:1
   */
  public ArrayTypeAccess() {
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
  public ArrayTypeAccess(Access p0) {
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
    decl_reset();
    getPackage_reset();
    getID_reset();
    unassignedAfter_Variable_reset();
    getLastAccess_reset();
    countDims_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public ArrayTypeAccess clone() throws CloneNotSupportedException {
    ArrayTypeAccess node = (ArrayTypeAccess) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public ArrayTypeAccess copy() {
    try {
      ArrayTypeAccess node = (ArrayTypeAccess) clone();
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
   * @declaredat ASTNode:70
   */
  @Deprecated
  public ArrayTypeAccess fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public ArrayTypeAccess treeCopyNoTransform() {
    ArrayTypeAccess tree = (ArrayTypeAccess) copy();
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
   * @declaredat ASTNode:100
   */
  public ArrayTypeAccess treeCopy() {
    ArrayTypeAccess tree = (ArrayTypeAccess) copy();
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
   * @declaredat ASTNode:114
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
  /**
   * This method should not be called. This method throws an exception due to
   * the corresponding child being an NTA shadowing a non-NTA child.
   * @param node
   * @apilevel internal
   */
  public void setPackage(String node) {
    throw new Error("Can not replace NTA child Package in ArrayTypeAccess!");
  }
  /** @apilevel internal 
   */
  protected String tokenString_Package;
  /**
   * This method should not be called. This method throws an exception due to
   * the corresponding child being an NTA shadowing a non-NTA child.
   * @param node
   * @apilevel internal
   */
  public void setID(String node) {
    throw new Error("Can not replace NTA child ID in ArrayTypeAccess!");
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /** @apilevel internal */
  private void decl_reset() {
    decl_computed = null;
    decl_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle decl_computed = null;

  /** @apilevel internal */
  protected TypeDecl decl_value;

  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupType.jrag:369
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupType.jrag:369")
  public TypeDecl decl() {
    ASTState state = state();
    if (decl_computed == ASTState.NON_CYCLE || decl_computed == state().cycle()) {
      return decl_value;
    }
    decl_value = getAccess().type().arrayType();
    if (state().inCircle()) {
      decl_computed = state().cycle();
    
    } else {
      decl_computed = ASTState.NON_CYCLE;
    
    }
    return decl_value;
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/TypeHierarchyCheck.jrag:245
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeHierarchyCheck", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/TypeHierarchyCheck.jrag:240")
  public boolean staticContextQualifier() {
    boolean staticContextQualifier_value = true;
    return staticContextQualifier_value;
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/NameCheck.jrag:236
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameCheck", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/NameCheck.jrag:236")
  public Collection<Problem> nameProblems() {
    {
        if (decl().elementType().isUnknown()) {
          return Collections.singletonList(errorf("no type named %s", decl().elementType().typeName()));
        }
        return Collections.emptyList();
      }
  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:149
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SyntacticClassification", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:60")
  public NameType predNameType() {
    NameType predNameType_value = NameType.AMBIGUOUS_NAME;
    return predNameType_value;
  }
  /** @apilevel internal */
  private void getPackage_reset() {
    getPackage_computed = null;
    getPackage_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getPackage_computed = null;

  /** @apilevel internal */
  protected String getPackage_value;

  /**
   * @attribute syn nta
   * @aspect Arrays
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/Arrays.jrag:95
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="Arrays", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/Arrays.jrag:95")
  public String getPackage() {
    ASTState state = state();
    if (getPackage_computed == ASTState.NON_CYCLE || getPackage_computed == state().cycle()) {
      return getPackage_value;
    }
    getPackage_value = getAccess().type().packageName();
    if (state().inCircle()) {
      getPackage_computed = state().cycle();
    
    } else {
      getPackage_computed = ASTState.NON_CYCLE;
    
    }
    return getPackage_value;
  }
  /** @apilevel internal */
  private void getID_reset() {
    getID_computed = null;
    getID_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getID_computed = null;

  /** @apilevel internal */
  protected String getID_value;

  /**
   * @attribute syn nta
   * @aspect Arrays
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/Arrays.jrag:97
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="Arrays", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/Arrays.jrag:97")
  public String getID() {
    ASTState state = state();
    if (getID_computed == ASTState.NON_CYCLE || getID_computed == state().cycle()) {
      return getID_value;
    }
    getID_value = getAccess().type().name();
    if (state().inCircle()) {
      getID_computed = state().cycle();
    
    } else {
      getID_computed = ASTState.NON_CYCLE;
    
    }
    return getID_value;
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/DefiniteAssignment.jrag:406
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="DefiniteAssignment", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/DefiniteAssignment.jrag:268")
  public boolean assignedAfter(Variable v) {
    boolean assignedAfter_Variable_value = getAccess().assignedAfter(v);
    return assignedAfter_Variable_value;
  }
  /** @apilevel internal */
  private void unassignedAfter_Variable_reset() {
    unassignedAfter_Variable_values = null;
  }
  protected java.util.Map unassignedAfter_Variable_values;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="DefiniteUnassignment", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/DefiniteAssignment.jrag:899")
  public boolean unassignedAfter(Variable v) {
    Object _parameters = v;
    if (unassignedAfter_Variable_values == null) unassignedAfter_Variable_values = new java.util.HashMap(4);
    ASTState.CircularValue _value;
    if (unassignedAfter_Variable_values.containsKey(_parameters)) {
      Object _cache = unassignedAfter_Variable_values.get(_parameters);
      if (!(_cache instanceof ASTState.CircularValue)) {
        return (Boolean) _cache;
      } else {
        _value = (ASTState.CircularValue) _cache;
      }
    } else {
      _value = new ASTState.CircularValue();
      unassignedAfter_Variable_values.put(_parameters, _value);
      _value.value = true;
    }
    ASTState state = state();
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      boolean new_unassignedAfter_Variable_value;
      do {
        _value.cycle = state.nextCycle();
        new_unassignedAfter_Variable_value = getAccess().unassignedAfter(v);
        if (((Boolean)_value.value) != new_unassignedAfter_Variable_value) {
          state.setChangeInCycle();
          _value.value = new_unassignedAfter_Variable_value;
        }
      } while (state.testAndClearChangeInCycle());
      unassignedAfter_Variable_values.put(_parameters, new_unassignedAfter_Variable_value);

      state.leaveCircle();
      return new_unassignedAfter_Variable_value;
    } else if (_value.cycle != state.cycle()) {
      _value.cycle = state.cycle();
      boolean new_unassignedAfter_Variable_value = getAccess().unassignedAfter(v);
      if (((Boolean)_value.value) != new_unassignedAfter_Variable_value) {
        state.setChangeInCycle();
        _value.value = new_unassignedAfter_Variable_value;
      }
      return new_unassignedAfter_Variable_value;
    } else {
      return (Boolean) _value.value;
    }
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1618
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1612")
  public Access erasedCopy() {
    Access erasedCopy_value = new ArrayTypeAccess(getAccess().erasedCopy());
    return erasedCopy_value;
  }
  /**
   * @attribute syn
   * @aspect GetGraph
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:852
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:741")
  public boolean getGraph(Set<TypestateVar> env) {
    boolean getGraph_Set_TypestateVar__value = getAccess().getGraph(env);
    return getGraph_Set_TypestateVar__value;
  }
  /** @apilevel internal */
  private void getLastAccess_reset() {
    getLastAccess_computed = null;
    getLastAccess_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getLastAccess_computed = null;

  /** @apilevel internal */
  protected Access getLastAccess_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:214
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:208")
  public Access getLastAccess() {
    ASTState state = state();
    if (getLastAccess_computed == ASTState.NON_CYCLE || getLastAccess_computed == state().cycle()) {
      return getLastAccess_value;
    }
    getLastAccess_value = getAccess().getLastAccess();
    if (state().inCircle()) {
      getLastAccess_computed = state().cycle();
    
    } else {
      getLastAccess_computed = ASTState.NON_CYCLE;
    
    }
    return getLastAccess_value;
  }
  /** @apilevel internal */
  private void countDims_reset() {
    countDims_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle countDims_computed = null;

  /** @apilevel internal */
  protected int countDims_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:224
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:223")
  public int countDims() {
    ASTState state = state();
    if (countDims_computed == ASTState.NON_CYCLE || countDims_computed == state().cycle()) {
      return countDims_value;
    }
    countDims_value = 1 + getAccess().countDims();
    if (state().inCircle()) {
      countDims_computed = state().cycle();
    
    } else {
      countDims_computed = ASTState.NON_CYCLE;
    
    }
    return countDims_value;
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
