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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:13
 * @astdecl TypestateMethod : Typestate ::= [TimeConstraint] TType <ID:String> TTypeList Typestate;
 * @production TypestateMethod : {@link Typestate} ::= <span class="component">[{@link TimeConstraint}]</span> <span class="component">{@link TType}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link TTypeList}</span> <span class="component">{@link Typestate}</span>;

 */
public class TypestateMethod extends Typestate implements Cloneable {
  /**
   * @aspect typestateSemanticCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateSemanticCheck.jrag:56
   */
  protected void semanticCheck() {
		TypeDecl t;
		if(getTypestate() instanceof TypestateSwitch) {
			t = getTType().getAccess().lookupTSType();
			if(!t.isEnumDeclType())
				addSemanticError("Method " + signature() + " should return an enumeration type.");
			else {
				for(String s : t.getEnumDecl().getEnumLabels()) {
					if(!((TypestateSwitch) getTypestate()).getLabels().contains(s)){
						addSemanticError("Label " + s + " defined for the enumeration type " + t.getEnumDecl().getID() + " is not defined as a switch label.");
				}
			}
			}

		}
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:784
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		if(hasNewLine)
			stream.pushIndent();
		getTType().Rewrite(stream);
		stream.print(" " + getID());
		getTTypeList().Rewrite(stream);
		stream.print(": ");
		getTypestate().Rewrite(stream, hasNewLine);
		if(hasNewLine)
			stream.popIndent();
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateMethod() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"TimeConstraint", "TType", "ID", "TTypeList", "Typestate"},
    type = {"Opt<TimeConstraint>", "TType", "String", "TTypeList", "Typestate"},
    kind = {"Opt", "Child", "Token", "Child", "Child"}
  )
  public TypestateMethod(Opt<TimeConstraint> p0, TType p1, String p2, TTypeList p3, Typestate p4) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @declaredat ASTNode:26
   */
  public TypestateMethod(Opt<TimeConstraint> p0, TType p1, beaver.Symbol p2, TTypeList p3, Typestate p4) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:34
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    createTypestate_reset();
    getParameterTypes_reset();
    lookupTSMethod_TypeDecl_reset();
    signature_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public TypestateMethod clone() throws CloneNotSupportedException {
    TypestateMethod node = (TypestateMethod) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:61
   */
  public TypestateMethod copy() {
    try {
      TypestateMethod node = (TypestateMethod) clone();
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
   * @declaredat ASTNode:80
   */
  @Deprecated
  public TypestateMethod fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:90
   */
  public TypestateMethod treeCopyNoTransform() {
    TypestateMethod tree = (TypestateMethod) copy();
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
   * @declaredat ASTNode:110
   */
  public TypestateMethod treeCopy() {
    TypestateMethod tree = (TypestateMethod) copy();
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
   * @declaredat ASTNode:124
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((TypestateMethod) node).tokenString_ID);    
  }
  /**
   * Replaces the optional node for the TimeConstraint child. This is the <code>Opt</code>
   * node containing the child TimeConstraint, not the actual child!
   * @param opt The new node to be used as the optional node for the TimeConstraint child.
   * @apilevel low-level
   */
  public void setTimeConstraintOpt(Opt<TimeConstraint> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) TimeConstraint child.
   * @param node The new node to be used as the TimeConstraint child.
   * @apilevel high-level
   */
  public void setTimeConstraint(TimeConstraint node) {
    getTimeConstraintOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional TimeConstraint child exists.
   * @return {@code true} if the optional TimeConstraint child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasTimeConstraint() {
    return getTimeConstraintOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) TimeConstraint child.
   * @return The TimeConstraint child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public TimeConstraint getTimeConstraint() {
    return (TimeConstraint) getTimeConstraintOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the TimeConstraint child. This is the <code>Opt</code> node containing the child TimeConstraint, not the actual child!
   * @return The optional node for child the TimeConstraint child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="TimeConstraint")
  public Opt<TimeConstraint> getTimeConstraintOpt() {
    return (Opt<TimeConstraint>) getChild(0);
  }
  /**
   * Retrieves the optional node for child TimeConstraint. This is the <code>Opt</code> node containing the child TimeConstraint, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child TimeConstraint.
   * @apilevel low-level
   */
  public Opt<TimeConstraint> getTimeConstraintOptNoTransform() {
    return (Opt<TimeConstraint>) getChildNoTransform(0);
  }
  /**
   * Replaces the TType child.
   * @param node The new node to replace the TType child.
   * @apilevel high-level
   */
  public void setTType(TType node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the TType child.
   * @return The current node used as the TType child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="TType")
  public TType getTType() {
    return (TType) getChild(1);
  }
  /**
   * Retrieves the TType child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TType child.
   * @apilevel low-level
   */
  public TType getTTypeNoTransform() {
    return (TType) getChildNoTransform(1);
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
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
   * Replaces the TTypeList child.
   * @param node The new node to replace the TTypeList child.
   * @apilevel high-level
   */
  public void setTTypeList(TTypeList node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the TTypeList child.
   * @return The current node used as the TTypeList child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="TTypeList")
  public TTypeList getTTypeList() {
    return (TTypeList) getChild(2);
  }
  /**
   * Retrieves the TTypeList child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TTypeList child.
   * @apilevel low-level
   */
  public TTypeList getTTypeListNoTransform() {
    return (TTypeList) getChildNoTransform(2);
  }
  /**
   * Replaces the Typestate child.
   * @param node The new node to replace the Typestate child.
   * @apilevel high-level
   */
  public void setTypestate(Typestate node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Typestate child.
   * @return The current node used as the Typestate child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Typestate")
  public Typestate getTypestate() {
    return (Typestate) getChild(3);
  }
  /**
   * Retrieves the Typestate child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Typestate child.
   * @apilevel low-level
   */
  public Typestate getTypestateNoTransform() {
    return (Typestate) getChildNoTransform(3);
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:26
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
  			return new MethodNode(getTType().getAccess(), getID(), getParameterTypes(), null, getTimeConstraint()).addNext(getTypestate().createTypestate());
  	}
  /** @apilevel internal */
  private void getParameterTypes_reset() {
    getParameterTypes_computed = null;
    getParameterTypes_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getParameterTypes_computed = null;

  /** @apilevel internal */
  protected TypeDecl[] getParameterTypes_value;

  /**
   * @attribute syn
   * @aspect LookupTSMethod
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupMethod.jrag:11
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupTSMethod", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupMethod.jrag:11")
  public TypeDecl[] getParameterTypes() {
    ASTState state = state();
    if (getParameterTypes_computed == ASTState.NON_CYCLE || getParameterTypes_computed == state().cycle()) {
      return getParameterTypes_value;
    }
    getParameterTypes_value = getParameterTypes_compute();
    if (state().inCircle()) {
      getParameterTypes_computed = state().cycle();
    
    } else {
      getParameterTypes_computed = ASTState.NON_CYCLE;
    
    }
    return getParameterTypes_value;
  }
  /** @apilevel internal */
  private TypeDecl[] getParameterTypes_compute() {
  		TypeDecl[] ParameterAccess = new TypeDecl[getTTypeList().getNumTType()];
  		for(int i = 0; i <  getTTypeList().getNumTType(); i++)
  			ParameterAccess[i] = getTTypeList().getTType(i).getAccess().type();
  		return ParameterAccess;
  	}
  /** @apilevel internal */
  private void lookupTSMethod_TypeDecl_reset() {
    lookupTSMethod_TypeDecl_computed = null;
    lookupTSMethod_TypeDecl_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookupTSMethod_TypeDecl_values;
  /** @apilevel internal */
  protected java.util.Map lookupTSMethod_TypeDecl_computed;
  /**
   * @attribute syn
   * @aspect LookupTSMethod
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupMethod.jrag:22
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupTSMethod", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupMethod.jrag:22")
  public MethodDecl lookupTSMethod(TypeDecl t) {
    Object _parameters = t;
    if (lookupTSMethod_TypeDecl_computed == null) lookupTSMethod_TypeDecl_computed = new java.util.HashMap(4);
    if (lookupTSMethod_TypeDecl_values == null) lookupTSMethod_TypeDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookupTSMethod_TypeDecl_values.containsKey(_parameters)
        && lookupTSMethod_TypeDecl_computed.containsKey(_parameters)
        && (lookupTSMethod_TypeDecl_computed.get(_parameters) == ASTState.NON_CYCLE || lookupTSMethod_TypeDecl_computed.get(_parameters) == state().cycle())) {
      return (MethodDecl) lookupTSMethod_TypeDecl_values.get(_parameters);
    }
    MethodDecl lookupTSMethod_TypeDecl_value = lookupTSMethod_compute(t);
    if (state().inCircle()) {
      lookupTSMethod_TypeDecl_values.put(_parameters, lookupTSMethod_TypeDecl_value);
      lookupTSMethod_TypeDecl_computed.put(_parameters, state().cycle());
    
    } else {
      lookupTSMethod_TypeDecl_values.put(_parameters, lookupTSMethod_TypeDecl_value);
      lookupTSMethod_TypeDecl_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return lookupTSMethod_TypeDecl_value;
  }
  /** @apilevel internal */
  private MethodDecl lookupTSMethod_compute(TypeDecl t) {
  		if(t != null) {
  			MethodDecl md = t.lookupTSMethod(getID(), getParameterTypes());
  			TypeDecl td = getTType().getAccess().lookupTSType();
  			if(md != null && (md.getTypeAccess().lookupTSType().toString().equals(td.toString())
  			|| (td instanceof UnknownType))){
  				return md;
  			}
  		}
  
  		return null;
  	}
  /** @apilevel internal */
  private void signature_reset() {
    signature_computed = null;
    signature_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle signature_computed = null;

  /** @apilevel internal */
  protected String signature_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:96
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:96")
  public String signature() {
    ASTState state = state();
    if (signature_computed == ASTState.NON_CYCLE || signature_computed == state().cycle()) {
      return signature_value;
    }
    signature_value = signature_compute();
    if (state().inCircle()) {
      signature_computed = state().cycle();
    
    } else {
      signature_computed = ASTState.NON_CYCLE;
    
    }
    return signature_value;
  }
  /** @apilevel internal */
  private String signature_compute() {
  		String s = getTType().getAccess().toString() + " " + getID() + "(";
  		for(int i = 0; i < getTTypeList().getNumTType(); i ++) {
  			if(i != 0)
  				s += ", ";
  			s += getTTypeList().getTType(i).getAccess().toString();
  		}
  		return s + ")";
  	}
  /**
   * @attribute inh
   * @aspect LookupType
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:11
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupType", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/LookupType.jrag:11")
  public TypeDecl lookupTSType(String packageName, String typeName) {
    TypeDecl lookupTSType_String_String_value = getParent().Define_lookupTSType(this, null, packageName, typeName);
    return lookupTSType_String_String_value;
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
  protected void collect_contributors_TypestateDecl_getMethods(TypestateDecl _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:87
    {
      TypestateDecl target = (TypestateDecl) (getTypestateDeclAncestor());
      java.util.Set<ASTNode> contributors = _map.get(target);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) target, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_TypestateDecl_getMethods(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_TypestateDecl_getMethods(Set<TypestateMethod> collection) {
    super.contributeTo_TypestateDecl_getMethods(collection);
    collection.add(this);
  }
}
