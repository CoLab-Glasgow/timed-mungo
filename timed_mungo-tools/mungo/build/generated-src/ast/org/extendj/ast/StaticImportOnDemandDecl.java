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
 * 7.5.4 A static-import-on-demand declaration allows all accessible (\u00a76.6) static
 * members declared in the type named by a canonical name to be imported as
 * needed.
 * @ast node
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/grammar/StaticImports.ast:19
 * @astdecl StaticImportOnDemandDecl : StaticImportDecl ::= Access;
 * @production StaticImportOnDemandDecl : {@link StaticImportDecl};

 */
public class StaticImportOnDemandDecl extends StaticImportDecl implements Cloneable {
  /**
   * @aspect Java5PrettyPrint
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/PrettyPrint.jadd:350
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print("import static ");
    out.print(getAccess());
    out.print(".*;");
  }
  /**
   * @declaredat ASTNode:1
   */
  public StaticImportOnDemandDecl() {
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
  public StaticImportOnDemandDecl(Access p0) {
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
    startsWith_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public StaticImportOnDemandDecl clone() throws CloneNotSupportedException {
    StaticImportOnDemandDecl node = (StaticImportOnDemandDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public StaticImportOnDemandDecl copy() {
    try {
      StaticImportOnDemandDecl node = (StaticImportOnDemandDecl) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public StaticImportOnDemandDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public StaticImportOnDemandDecl treeCopyNoTransform() {
    StaticImportOnDemandDecl tree = (StaticImportOnDemandDecl) copy();
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
   * @declaredat ASTNode:95
   */
  public StaticImportOnDemandDecl treeCopy() {
    StaticImportOnDemandDecl tree = (StaticImportOnDemandDecl) copy();
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
   * @declaredat ASTNode:109
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
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/StaticImports.jrag:108
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StaticImports", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/StaticImports.jrag:106")
  public TypeDecl type() {
    TypeDecl type_value = getAccess().type();
    return type_value;
  }
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/StaticImports.jrag:111
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/LookupType.jrag:531")
  public boolean isOnDemand() {
    boolean isOnDemand_value = true;
    return isOnDemand_value;
  }
  /** @apilevel internal */
  private void startsWith_String_reset() {
    startsWith_String_computed = null;
    startsWith_String_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map startsWith_String_values;
  /** @apilevel internal */
  protected java.util.Map startsWith_String_computed;
  /**
   * @attribute syn
   * @aspect RewriteAccess
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/RewriteAccess.jrag:92
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RewriteAccess", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/RewriteAccess.jrag:55")
  public boolean startsWith(String Package) {
    Object _parameters = Package;
    if (startsWith_String_computed == null) startsWith_String_computed = new java.util.HashMap(4);
    if (startsWith_String_values == null) startsWith_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (startsWith_String_values.containsKey(_parameters)
        && startsWith_String_computed.containsKey(_parameters)
        && (startsWith_String_computed.get(_parameters) == ASTState.NON_CYCLE || startsWith_String_computed.get(_parameters) == state().cycle())) {
      return (Boolean) startsWith_String_values.get(_parameters);
    }
    boolean startsWith_String_value = startsWith_compute(Package);
    if (state().inCircle()) {
      startsWith_String_values.put(_parameters, startsWith_String_value);
      startsWith_String_computed.put(_parameters, state().cycle());
    
    } else {
      startsWith_String_values.put(_parameters, startsWith_String_value);
      startsWith_String_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return startsWith_String_value;
  }
  /** @apilevel internal */
  private boolean startsWith_compute(String Package) {
  		String[] imp = getAccess().toString().split("\\.");
  		String[] packages = Package.split("\\.");
  		if(imp.length < packages.length)
  			return false;
  		for(int i = 0; i < packages.length; i++)
  			if(!imp[i].equals(packages[i]))
  				return false;
  
  		return true;
  	}
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:36
   * @apilevel internal
   */
  public NameType Define_nameType(ASTNode _callerNode, ASTNode _childNode) {
    if (getAccessNoTransform() != null && _callerNode == getAccess()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/StaticImports.jrag:325
      return NameType.TYPE_NAME;
    }
    else {
      return getParent().Define_nameType(this, _callerNode);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java4/frontend/SyntacticClassification.jrag:36
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute nameType
   */
  protected boolean canDefine_nameType(ASTNode _callerNode, ASTNode _childNode) {
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
  /** @apilevel internal */
  protected void collect_contributors_CompilationUnit_problems(CompilationUnit _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/extendj/java5/frontend/StaticImports.jrag:146
    if (!getAccess().type().typeName().equals(typeName())
              && !getAccess().type().isUnknown()) {
      {
        java.util.Set<ASTNode> contributors = _map.get(_root);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) _root, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_CompilationUnit_problems(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_CompilationUnit_problems(LinkedList<Problem> collection) {
    super.contributeTo_CompilationUnit_problems(collection);
    if (!getAccess().type().typeName().equals(typeName())
              && !getAccess().type().isUnknown()) {
      collection.add(errorf("on demand import %s is not the canonical name of type %s.",
                typeName(), getAccess().type().typeName()));
    }
  }
}
