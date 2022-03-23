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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:17
 * @astdecl TypestateSwitchCase : ASTNode ::= <Label:String> [TimeConstraint] Typestate;
 * @production TypestateSwitchCase : {@link ASTNode} ::= <span class="component">&lt;Label:String&gt;</span> <span class="component">[{@link TimeConstraint}]</span> <span class="component">{@link Typestate}</span>;

 */
public class TypestateSwitchCase extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:810
   */
  protected void Rewrite(TypestateStream stream) {
		stream.print(getLabel() + ": ");
		getTypestate().Rewrite(stream, true);
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:815
   */
  protected void Rewrite(TypestateStream stream, boolean hasNewLine) {
		stream.print(getLabel() + ": ");
		getTypestate().Rewrite(stream, hasNewLine);
	}
  /**
   * @declaredat ASTNode:1
   */
  public TypestateSwitchCase() {
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
    children = new ASTNode[2];
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Label", "TimeConstraint", "Typestate"},
    type = {"String", "Opt<TimeConstraint>", "Typestate"},
    kind = {"Token", "Opt", "Child"}
  )
  public TypestateSwitchCase(String p0, Opt<TimeConstraint> p1, Typestate p2) {
    setLabel(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /**
   * @declaredat ASTNode:24
   */
  public TypestateSwitchCase(beaver.Symbol p0, Opt<TimeConstraint> p1, Typestate p2) {
    setLabel(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:30
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public TypestateSwitchCase clone() throws CloneNotSupportedException {
    TypestateSwitchCase node = (TypestateSwitchCase) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public TypestateSwitchCase copy() {
    try {
      TypestateSwitchCase node = (TypestateSwitchCase) clone();
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
   * @declaredat ASTNode:72
   */
  @Deprecated
  public TypestateSwitchCase fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public TypestateSwitchCase treeCopyNoTransform() {
    TypestateSwitchCase tree = (TypestateSwitchCase) copy();
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
   * @declaredat ASTNode:102
   */
  public TypestateSwitchCase treeCopy() {
    TypestateSwitchCase tree = (TypestateSwitchCase) copy();
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
   * @declaredat ASTNode:116
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Label == ((TypestateSwitchCase) node).tokenString_Label);    
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
   * Replaces the Typestate child.
   * @param node The new node to replace the Typestate child.
   * @apilevel high-level
   */
  public void setTypestate(Typestate node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Typestate child.
   * @return The current node used as the Typestate child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Typestate")
  public Typestate getTypestate() {
    return (Typestate) getChild(1);
  }
  /**
   * Retrieves the Typestate child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Typestate child.
   * @apilevel low-level
   */
  public Typestate getTypestateNoTransform() {
    return (Typestate) getChildNoTransform(1);
  }
  /**
   * @attribute inh
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:83
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:83")
  public TypestateSwitch getTypestateSwitchAncestor() {
    TypestateSwitch getTypestateSwitchAncestor_value = getParent().Define_getTypestateSwitchAncestor(this, null);
    return getTypestateSwitchAncestor_value;
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
  protected void collect_contributors_TypestateSwitch_getLabels(TypestateSwitch _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:81
    {
      TypestateSwitch target = (TypestateSwitch) (getTypestateSwitchAncestor());
      java.util.Set<ASTNode> contributors = _map.get(target);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) target, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_TypestateSwitch_getLabels(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_TypestateSwitch_getLabels(Set<String> collection) {
    super.contributeTo_TypestateSwitch_getLabels(collection);
    collection.add(getLabel());
  }
}
