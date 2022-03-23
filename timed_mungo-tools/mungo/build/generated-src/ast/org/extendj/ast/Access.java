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
 * An abstract access.
 * Concrete subclasses include field, method, and type access.
 * @ast node
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/grammar/Java.ast:69
 * @astdecl Access : Expr;
 * @production Access : {@link Expr};

 */
public abstract class Access extends Expr implements Cloneable {
  /**
   * Used by the parser to build a method access from a parsed, potentially qualified, name.
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:452
   */
  public Access buildMethodAccess(List<Expr> arguments) {
    throw new Error("Can not build method access from access of type "
        + getClass().getSimpleName());
  }
  /**
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:475
   */
  public Access addArrayDims(List list) {
    Access a = this;
    for (int i = 0; i < list.getNumChildNoTransform(); i++) {
      Dims dims = (Dims) list.getChildNoTransform(i);
      Opt<Expr> opt = dims.getExprOpt();
      if (opt.getNumChildNoTransform() == 1) {
        a = new ArrayTypeWithSizeAccess(a, (Expr) opt.getChildNoTransform(0));
      } else {
        a = new ArrayTypeAccess(a);
      }
      a.setStart(dims.start());
      a.setEnd(dims.end());
    }
    return a;
  }
  /**
   * Builds a copy of this Access node where all occurrences
   * of type variables in the original type parameter list have been replaced
   * by the substitution type parameters.
   * 
   * <p>This should only be used to generate candidate methods for Diamond type
   * inference.
   * 
   * @return the substituted Access node
   * @aspect Diamond
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java7/frontend/Diamond.jrag:251
   */
  public Access substituted(Map<TypeVariable, String>  substitution) {
    return (Access) treeCopyNoTransform();
  }
  /**
   * Checks that two type accesses are the same, while taking type variable
   * substitution into account.
   * @aspect FunctionalInterface
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/FunctionalInterface.jrag:164
   */
  public boolean sameType(Access a) {
    if (this instanceof ArrayTypeAccess && a instanceof ArrayTypeAccess) {
      ArrayTypeAccess at1 = (ArrayTypeAccess) this;
      ArrayTypeAccess at2 = (ArrayTypeAccess) a;
      return at1.sameType(at2);
    } else if (this instanceof AbstractWildcard && a instanceof AbstractWildcard) {
      AbstractWildcard w1 = (AbstractWildcard) this;
      AbstractWildcard w2 = (AbstractWildcard) a;
      return w1.sameType(w2);
    } else if (this instanceof TypeAccess && a instanceof TypeAccess) {
      TypeAccess t1 = (TypeAccess) this;
      TypeAccess t2 = (TypeAccess) a;
      return t1.sameType(t2);
    } else if (this instanceof ParTypeAccess && a instanceof ParTypeAccess) {
      ParTypeAccess pta1 = (ParTypeAccess) this;
      ParTypeAccess pta2 = (ParTypeAccess) a;
      return pta1.sameType(pta2);
    } else {
      return false;
    }
  }
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:264
   */
  protected void Rewrite(TypestateStream stream) {}
  /**
   * @declaredat ASTNode:1
   */
  public Access() {
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
    type_reset();
    getQualifiedType_reset();
    getQualifiedTypestateVar_reset();
    lookupTSType_reset();
    lookupTSVariable_reset();
    lookupTSVariable_TypeDecl_reset();
    isAccess_reset();
    isAbstractDotParent_reset();
    getQualifiedAccess_reset();
    getLastAccess_reset();
    getQualifiedString_reset();
    countDims_reset();
    hasDims_reset();
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
  public Access clone() throws CloneNotSupportedException {
    Access node = (Access) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:55
   */
  @Deprecated
  public abstract Access fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:63
   */
  public abstract Access treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public abstract Access treeCopy();
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
   * @aspect TypeAnalysis
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/TypeAnalysis.jrag:300
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/TypeAnalysis.jrag:295")
  public TypeDecl type() {
    ASTState state = state();
    if (type_computed == ASTState.NON_CYCLE || type_computed == state().cycle()) {
      return type_value;
    }
    type_value = unknownType();
    if (state().inCircle()) {
      type_computed = state().cycle();
    
    } else {
      type_computed = ASTState.NON_CYCLE;
    
    }
    return type_value;
  }
  /**
   * Find the outermost qualified expression this access.
   * 
   * <p>If this is not a qualified access, then this access is returned.
   * 
   * <p>For example, if {@code unqualifiedScope()} is evaluated for the {@code
   * MethodAccess} inside the expression {@code Dot(FieldAccess,
   * Dot(FieldAccess, MethodAcceess))}, then the outermost {@code Dot} is the
   * unqualified scope of the {@code MethodAccess}.
   * @attribute syn
   * @aspect LookupMethod
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupMethod.jrag:87
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupMethod", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupMethod.jrag:87")
  public Expr unqualifiedScope() {
    Expr unqualifiedScope_value = isQualified() ? nestedScope() : this;
    return unqualifiedScope_value;
  }
  /**
   * Defines the expected kind of name for the left hand side in a qualified
   * expression.
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:60
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SyntacticClassification", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:60")
  public NameType predNameType() {
    {
        switch (nameType()) {
          case PACKAGE_NAME:
            return NameType.PACKAGE_NAME;
          case TYPE_NAME:
          case PACKAGE_OR_TYPE_NAME:
            return NameType.PACKAGE_OR_TYPE_NAME;
          case AMBIGUOUS_NAME:
          case EXPRESSION_NAME:
            return NameType.AMBIGUOUS_NAME;
          case NOT_CLASSIFIED:
          default:
            return NameType.NOT_CLASSIFIED;
        }
      }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:164
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="QualifiedNames", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:164")
  public boolean isQualified() {
    boolean isQualified_value = hasPrevExpr();
    return isQualified_value;
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:167
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="QualifiedNames", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:167")
  public Expr qualifier() {
    Expr qualifier_value = prevExpr();
    return qualifier_value;
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:174
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="QualifiedNames", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:174")
  public Access lastAccess() {
    Access lastAccess_value = this;
    return lastAccess_value;
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:184
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="QualifiedNames", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:184")
  public boolean hasPrevExpr() {
    boolean hasPrevExpr_value = isRightChildOfDot();
    return hasPrevExpr_value;
  }
  /**
   * Creates a copy of this access where parameterized types have been erased.
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1612
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Generics.jrag:1612")
  public Access erasedCopy() {
    Access erasedCopy_value = treeCopyNoTransform();
    return erasedCopy_value;
  }
  /**
   * WARNING: this attribute is not the same as TypeDecl.isWildcard,
   * which returns true for any wildcard type (even bounded wildcard types).
   * @return {@code true} if this is an unbounded wildcard access
   * @attribute syn
   * @aspect ReifiableTypes
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/ReifiableTypes.jrag:106
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReifiableTypes", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/ReifiableTypes.jrag:106")
  public boolean isWildcard() {
    boolean isWildcard_value = false;
    return isWildcard_value;
  }
  /**
   * @attribute syn
   * @aspect Diamond
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java7/frontend/Diamond.jrag:92
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Diamond", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java7/frontend/Diamond.jrag:92")
  public boolean isDiamond() {
    boolean isDiamond_value = false;
    return isDiamond_value;
  }
  /**
   * @attribute syn
   * @aspect LambdaParametersInference
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/TypeCheck.jrag:624
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LambdaParametersInference", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java8/frontend/TypeCheck.jrag:624")
  public boolean mentionsTypeVariable(TypeVariable var) {
    boolean mentionsTypeVariable_TypeVariable_value = false;
    return mentionsTypeVariable_TypeVariable_value;
  }
  /** @apilevel internal */
  private void getQualifiedType_reset() {
    getQualifiedType_computed = null;
    getQualifiedType_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getQualifiedType_computed = null;

  /** @apilevel internal */
  protected TypeDecl getQualifiedType_value;

  /****************Qualified Type*************************
   * @attribute syn
   * @aspect Type
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Type.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Type.jrag:23")
  public TypeDecl getQualifiedType() {
    ASTState state = state();
    if (getQualifiedType_computed == ASTState.NON_CYCLE || getQualifiedType_computed == state().cycle()) {
      return getQualifiedType_value;
    }
    getQualifiedType_value = getQualifiedAccess() != null ?
    		getQualifiedAccess().__getQualifiedType():
    		getTypeNoQualified();
    if (state().inCircle()) {
      getQualifiedType_computed = state().cycle();
    
    } else {
      getQualifiedType_computed = ASTState.NON_CYCLE;
    
    }
    return getQualifiedType_value;
  }
  /** @apilevel internal */
  private void getQualifiedTypestateVar_reset() {
    getQualifiedTypestateVar_computed = null;
    getQualifiedTypestateVar_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getQualifiedTypestateVar_computed = null;

  /** @apilevel internal */
  protected TypestateVar getQualifiedTypestateVar_value;

  /**
   * @attribute syn
   * @aspect GetGraph
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:84
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:84")
  public TypestateVar getQualifiedTypestateVar() {
    ASTState state = state();
    if (getQualifiedTypestateVar_computed == ASTState.NON_CYCLE || getQualifiedTypestateVar_computed == state().cycle()) {
      return getQualifiedTypestateVar_value;
    }
    getQualifiedTypestateVar_value = getQualifiedAccess() != null ?
          getQualifiedAccess().getLeft().getTypestateVar() : null;
    if (state().inCircle()) {
      getQualifiedTypestateVar_computed = state().cycle();
    
    } else {
      getQualifiedTypestateVar_computed = ASTState.NON_CYCLE;
    
    }
    return getQualifiedTypestateVar_value;
  }
  /**
   * @attribute syn
   * @aspect GetGraph
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:846
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GetGraph", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/GetGraph.jrag:741")
  public boolean getGraph(Set<TypestateVar> env) {
    boolean getGraph_Set_TypestateVar__value = true;
    return getGraph_Set_TypestateVar__value;
  }
  /** @apilevel internal */
  private void lookupTSType_reset() {
    lookupTSType_computed = null;
    lookupTSType_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle lookupTSType_computed = null;

  /** @apilevel internal */
  protected TypeDecl lookupTSType_value;

  /**
   * @attribute syn
   * @aspect LookupType
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:93
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupType", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:93")
  public TypeDecl lookupTSType() {
    ASTState state = state();
    if (lookupTSType_computed == ASTState.NON_CYCLE || lookupTSType_computed == state().cycle()) {
      return lookupTSType_value;
    }
    lookupTSType_value = lookupTSType_compute();
    if (state().inCircle()) {
      lookupTSType_computed = state().cycle();
    
    } else {
      lookupTSType_computed = ASTState.NON_CYCLE;
    
    }
    return lookupTSType_value;
  }
  /** @apilevel internal */
  private TypeDecl lookupTSType_compute() {
  		String packageName = lastAccess().getQualifiedString();
  		String typeName = lastAccess().toString();
  		if(typeName.contains(".")){
  			String[] str = typeName.split("\\.");
  				typeName = str[str.length-1];
  		}
  		typeName = typeName.replace("[]", "");
  
  		return lookupTSType(packageName, typeName);
  	}
  /** @apilevel internal */
  private void lookupTSVariable_reset() {
    lookupTSVariable_computed = null;
    lookupTSVariable_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle lookupTSVariable_computed = null;

  /** @apilevel internal */
  protected NameDecl lookupTSVariable_value;

  /**
   * @attribute syn
   * @aspect LookupTSVariable
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupTSVariable", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:6")
  public NameDecl lookupTSVariable() {
    ASTState state = state();
    if (lookupTSVariable_computed == ASTState.NON_CYCLE || lookupTSVariable_computed == state().cycle()) {
      return lookupTSVariable_value;
    }
    lookupTSVariable_value = lookupTSVariable(this.toString());
    if (state().inCircle()) {
      lookupTSVariable_computed = state().cycle();
    
    } else {
      lookupTSVariable_computed = ASTState.NON_CYCLE;
    
    }
    return lookupTSVariable_value;
  }
  /** @apilevel internal */
  private void lookupTSVariable_TypeDecl_reset() {
    lookupTSVariable_TypeDecl_computed = null;
    lookupTSVariable_TypeDecl_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookupTSVariable_TypeDecl_values;
  /** @apilevel internal */
  protected java.util.Map lookupTSVariable_TypeDecl_computed;
  /**
   * @attribute syn
   * @aspect LookupTSVariable
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:10
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupTSVariable", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:10")
  public NameDecl lookupTSVariable(TypeDecl t) {
    Object _parameters = t;
    if (lookupTSVariable_TypeDecl_computed == null) lookupTSVariable_TypeDecl_computed = new java.util.HashMap(4);
    if (lookupTSVariable_TypeDecl_values == null) lookupTSVariable_TypeDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookupTSVariable_TypeDecl_values.containsKey(_parameters)
        && lookupTSVariable_TypeDecl_computed.containsKey(_parameters)
        && (lookupTSVariable_TypeDecl_computed.get(_parameters) == ASTState.NON_CYCLE || lookupTSVariable_TypeDecl_computed.get(_parameters) == state().cycle())) {
      return (NameDecl) lookupTSVariable_TypeDecl_values.get(_parameters);
    }
    NameDecl lookupTSVariable_TypeDecl_value = t != null ? t.lookupTSVariable(this.toString()) : null;
    if (state().inCircle()) {
      lookupTSVariable_TypeDecl_values.put(_parameters, lookupTSVariable_TypeDecl_value);
      lookupTSVariable_TypeDecl_computed.put(_parameters, state().cycle());
    
    } else {
      lookupTSVariable_TypeDecl_values.put(_parameters, lookupTSVariable_TypeDecl_value);
      lookupTSVariable_TypeDecl_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return lookupTSVariable_TypeDecl_value;
  }
  /** @apilevel internal */
  private void isAccess_reset() {
    isAccess_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isAccess_computed = null;

  /** @apilevel internal */
  protected boolean isAccess_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:188
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:187")
  public boolean isAccess() {
    ASTState state = state();
    if (isAccess_computed == ASTState.NON_CYCLE || isAccess_computed == state().cycle()) {
      return isAccess_value;
    }
    isAccess_value = true;
    if (state().inCircle()) {
      isAccess_computed = state().cycle();
    
    } else {
      isAccess_computed = ASTState.NON_CYCLE;
    
    }
    return isAccess_value;
  }
  /** @apilevel internal */
  private void isAbstractDotParent_reset() {
    isAbstractDotParent_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isAbstractDotParent_computed = null;

  /** @apilevel internal */
  protected boolean isAbstractDotParent_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:192
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:192")
  public boolean isAbstractDotParent() {
    ASTState state = state();
    if (isAbstractDotParent_computed == ASTState.NON_CYCLE || isAbstractDotParent_computed == state().cycle()) {
      return isAbstractDotParent_value;
    }
    isAbstractDotParent_value = getParent().isAbstractDot();
    if (state().inCircle()) {
      isAbstractDotParent_computed = state().cycle();
    
    } else {
      isAbstractDotParent_computed = ASTState.NON_CYCLE;
    
    }
    return isAbstractDotParent_value;
  }
  /** @apilevel internal */
  private void getQualifiedAccess_reset() {
    getQualifiedAccess_computed = null;
    getQualifiedAccess_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getQualifiedAccess_computed = null;

  /** @apilevel internal */
  protected Dot getQualifiedAccess_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:194
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:194")
  public Dot getQualifiedAccess() {
    ASTState state = state();
    if (getQualifiedAccess_computed == ASTState.NON_CYCLE || getQualifiedAccess_computed == state().cycle()) {
      return getQualifiedAccess_value;
    }
    getQualifiedAccess_value = getQualifiedAccess_compute();
    if (state().inCircle()) {
      getQualifiedAccess_computed = state().cycle();
    
    } else {
      getQualifiedAccess_computed = ASTState.NON_CYCLE;
    
    }
    return getQualifiedAccess_value;
  }
  /** @apilevel internal */
  private Dot getQualifiedAccess_compute() {
  		if(isAbstractDotParent()) {
  			Dot p = (Dot) getParent();
  			if(p.getLeft().equals(this)) {
  				if(p.isAbstractDotParent())
  					return (Dot) p.getParent();
  			}
  			else
  				return p;
  		}
  
  		return null;
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:208
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:208")
  public Access getLastAccess() {
    ASTState state = state();
    if (getLastAccess_computed == ASTState.NON_CYCLE || getLastAccess_computed == state().cycle()) {
      return getLastAccess_value;
    }
    getLastAccess_value = getLastAccess_compute();
    if (state().inCircle()) {
      getLastAccess_computed = state().cycle();
    
    } else {
      getLastAccess_computed = ASTState.NON_CYCLE;
    
    }
    return getLastAccess_value;
  }
  /** @apilevel internal */
  private Access getLastAccess_compute() {
  		Access a;
  		for(a = this; a.isAbstractDot(); a = ((Dot) a).getRight());
  			return a;
  	}
  /** @apilevel internal */
  private void getQualifiedString_reset() {
    getQualifiedString_computed = null;
    getQualifiedString_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getQualifiedString_computed = null;

  /** @apilevel internal */
  protected String getQualifiedString_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:216
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:216")
  public String getQualifiedString() {
    ASTState state = state();
    if (getQualifiedString_computed == ASTState.NON_CYCLE || getQualifiedString_computed == state().cycle()) {
      return getQualifiedString_value;
    }
    getQualifiedString_value = (isAbstractDotParent()) ? ((Access) getParent()).getQualifiedString() :	"";
    if (state().inCircle()) {
      getQualifiedString_computed = state().cycle();
    
    } else {
      getQualifiedString_computed = ASTState.NON_CYCLE;
    
    }
    return getQualifiedString_value;
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:223
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:223")
  public int countDims() {
    ASTState state = state();
    if (countDims_computed == ASTState.NON_CYCLE || countDims_computed == state().cycle()) {
      return countDims_value;
    }
    countDims_value = 0;
    if (state().inCircle()) {
      countDims_computed = state().cycle();
    
    } else {
      countDims_computed = ASTState.NON_CYCLE;
    
    }
    return countDims_value;
  }
  /** @apilevel internal */
  private void hasDims_reset() {
    hasDims_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle hasDims_computed = null;

  /** @apilevel internal */
  protected boolean hasDims_value;

  /**
   * @attribute syn
   * @aspect javaASTFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:242
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="javaASTFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/JavaASTFunctionality.jrag:242")
  public boolean hasDims() {
    ASTState state = state();
    if (hasDims_computed == ASTState.NON_CYCLE || hasDims_computed == state().cycle()) {
      return hasDims_value;
    }
    hasDims_value = countDims() != 0;
    if (state().inCircle()) {
      hasDims_computed = state().cycle();
    
    } else {
      hasDims_computed = ASTState.NON_CYCLE;
    
    }
    return hasDims_value;
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupType.jrag:329
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupType.jrag:329")
  public TypeDecl unknownType() {
    TypeDecl unknownType_value = getParent().Define_unknownType(this, null);
    return unknownType_value;
  }
  /**
   * @attribute inh
   * @aspect VariableScopePropagation
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupVariable.jrag:386
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="VariableScopePropagation", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupVariable.jrag:386")
  public Variable unknownField() {
    Variable unknownField_value = getParent().Define_unknownField(this, null);
    return unknownField_value;
  }
  /**
   * Find the outermost qualified expression of a qualified access.
   * 
   * <p>It is an error if this attribute is evaluated on an unqualified
   * access.
   * 
   * @throws UnsupportedOperationException if evaluated on an unqualified
   * access.
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupMethod.jrag:98
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupMethod", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupMethod.jrag:98")
  public Expr nestedScope() {
    Expr nestedScope_value = getParent().Define_nestedScope(this, null);
    return nestedScope_value;
  }
  /**
   * @attribute inh
   * @aspect Annotations
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Annotations.jrag:400
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Annotations.jrag:400")
  public boolean withinSuppressWarnings(String annot) {
    boolean withinSuppressWarnings_String_value = getParent().Define_withinSuppressWarnings(this, null, annot);
    return withinSuppressWarnings_String_value;
  }
  /**
   * @attribute inh
   * @aspect Annotations
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Annotations.jrag:531
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/Annotations.jrag:531")
  public boolean withinDeprecatedAnnotation() {
    boolean withinDeprecatedAnnotation_value = getParent().Define_withinDeprecatedAnnotation(this, null);
    return withinDeprecatedAnnotation_value;
  }
  /**
   * @attribute inh
   * @aspect LookupType
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:92
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupType", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:92")
  public TypeDecl lookupTSType(String packageName, String typeName) {
    TypeDecl lookupTSType_String_String_value = getParent().Define_lookupTSType(this, null, packageName, typeName);
    return lookupTSType_String_String_value;
  }
  /**
   * @attribute inh
   * @aspect LookupTSVariable
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupTSVariable", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupVariable.jrag:5")
  public NameDecl lookupTSVariable(String var) {
    NameDecl lookupTSVariable_String_value = getParent().Define_lookupTSVariable(this, null, var);
    return lookupTSVariable_String_value;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:86
   * @apilevel internal
   */
  public boolean Define_isLeftChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return false;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:86
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isLeftChildOfDot
   */
  protected boolean canDefine_isLeftChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:101
   * @apilevel internal
   */
  public boolean Define_isRightChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return false;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:101
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isRightChildOfDot
   */
  protected boolean canDefine_isRightChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:118
   * @apilevel internal
   */
  public Expr Define_prevExpr(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return prevExprError();
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:118
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute prevExpr
   */
  protected boolean canDefine_prevExpr(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:142
   * @apilevel internal
   */
  public Access Define_nextAccess(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return nextAccessError();
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/ResolveAmbiguousNames.jrag:142
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute nextAccess
   */
  protected boolean canDefine_nextAccess(ASTNode _callerNode, ASTNode _childNode) {
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
