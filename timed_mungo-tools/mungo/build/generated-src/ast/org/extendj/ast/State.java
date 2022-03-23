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
 * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/grammar/Typestate.ast:5
 * @astdecl State : ASTNode ::= <ID:String> Typestate;
 * @production State : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link Typestate}</span>;

 */
public class State extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect CreateTypestate
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:5
   */
  private GraphNode StateNode = null;
  /**
   * @aspect typestateSemanticCheck
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateSemanticCheck.jrag:9
   */
  protected void semanticCheck() {
		if(isDuplicate())
			addSemanticError("Duplicate State: " + getID() + ".");
		if(!isReachable())
			addWarning("State not reachable: " + getID() + ".");

		String path;
		if((path = getCircularPath()) != null)
			addWarning("Circular-referenced state definition: " + path + ".");
	}
  /**
   * @aspect Rewrite
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/Rewrite.jadd:746
   */
  protected void Rewrite(TypestateStream stream) {
		stream.println();
		stream.print(getID() + " = ");
		stream.pushIndent();
		getTypestate().Rewrite(stream);
		stream.popIndent();
	}
  /**
   * @declaredat ASTNode:1
   */
  public State() {
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
    name = {"ID", "Typestate"},
    type = {"String", "Typestate"},
    kind = {"Token", "Child"}
  )
  public State(String p0, Typestate p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @declaredat ASTNode:22
   */
  public State(beaver.Symbol p0, Typestate p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:27
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    createTypestate_reset();
    isDuplicate_reset();
    isReachable_reset();
    reachable_reset();
    isTypestateLabel_reset();
    getCircularPath_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    State_successors_computed = null;
    State_successors_value = null;
    contributorMap_State_successors = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:54
   */
  public State clone() throws CloneNotSupportedException {
    State node = (State) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:59
   */
  public State copy() {
    try {
      State node = (State) clone();
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
   * @declaredat ASTNode:78
   */
  @Deprecated
  public State fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:88
   */
  public State treeCopyNoTransform() {
    State tree = (State) copy();
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
   * @declaredat ASTNode:108
   */
  public State treeCopy() {
    State tree = (State) copy();
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
   * @declaredat ASTNode:122
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((State) node).tokenString_ID);    
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
   * Replaces the Typestate child.
   * @param node The new node to replace the Typestate child.
   * @apilevel high-level
   */
  public void setTypestate(Typestate node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Typestate child.
   * @return The current node used as the Typestate child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Typestate")
  public Typestate getTypestate() {
    return (Typestate) getChild(0);
  }
  /**
   * Retrieves the Typestate child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Typestate child.
   * @apilevel low-level
   */
  public Typestate getTypestateNoTransform() {
    return (Typestate) getChildNoTransform(0);
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:54
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_State_successors = null;

  /** @apilevel internal */
  protected void survey_State_successors() {
    if (contributorMap_State_successors == null) {
      contributorMap_State_successors = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_State_successors(this, contributorMap_State_successors);
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:6")
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
  		StateNode = new LoopNode();
  		return StateNode.addNext(getTypestate().createTypestate());
  	}
  /**
   * @attribute syn
   * @aspect CreateTypestate
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:11
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:11")
  public boolean hasStateNode() {
    boolean hasStateNode_value = StateNode != null;
    return hasStateNode_value;
  }
  /**
   * @attribute syn
   * @aspect CreateTypestate
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CreateTypestate", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/CreateTypestate.jrag:12")
  public GraphNode getStateNode() {
    GraphNode getStateNode_value = StateNode;
    return getStateNode_value;
  }
  /** @apilevel internal */
  private void isDuplicate_reset() {
    isDuplicate_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isDuplicate_computed = null;

  /** @apilevel internal */
  protected boolean isDuplicate_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:20
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:20")
  public boolean isDuplicate() {
    ASTState state = state();
    if (isDuplicate_computed == ASTState.NON_CYCLE || isDuplicate_computed == state().cycle()) {
      return isDuplicate_value;
    }
    isDuplicate_value = isDuplicate(getID());
    if (state().inCircle()) {
      isDuplicate_computed = state().cycle();
    
    } else {
      isDuplicate_computed = ASTState.NON_CYCLE;
    
    }
    return isDuplicate_value;
  }
  /** @apilevel internal */
  private void isReachable_reset() {
    isReachable_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isReachable_computed = null;

  /** @apilevel internal */
  protected boolean isReachable_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:39
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:39")
  public boolean isReachable() {
    ASTState state = state();
    if (isReachable_computed == ASTState.NON_CYCLE || isReachable_computed == state().cycle()) {
      return isReachable_value;
    }
    isReachable_value = isReachable(this);
    if (state().inCircle()) {
      isReachable_computed = state().cycle();
    
    } else {
      isReachable_computed = ASTState.NON_CYCLE;
    
    }
    return isReachable_value;
  }
/** @apilevel internal */
protected ASTState.Cycle reachable_cycle = null;
  /** @apilevel internal */
  private void reachable_reset() {
    reachable_computed = false;
    reachable_initialized = false;
    reachable_value = null;
    reachable_cycle = null;
  }
  /** @apilevel internal */
  protected boolean reachable_computed = false;

  /** @apilevel internal */
  protected Set<State> reachable_value;
  /** @apilevel internal */
  protected boolean reachable_initialized = false;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:44")
  public Set<State> reachable() {
    if (reachable_computed) {
      return reachable_value;
    }
    ASTState state = state();
    if (!reachable_initialized) {
      reachable_initialized = true;
      reachable_value = new HashSet<State>();
    }
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      do {
        reachable_cycle = state.nextCycle();
        Set<State> new_reachable_value = reachable_compute();
        if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
          state.setChangeInCycle();
        }
        reachable_value = new_reachable_value;
      } while (state.testAndClearChangeInCycle());
      reachable_computed = true;

      state.leaveCircle();
    } else if (reachable_cycle != state.cycle()) {
      reachable_cycle = state.cycle();
      Set<State> new_reachable_value = reachable_compute();
      if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
        state.setChangeInCycle();
      }
      reachable_value = new_reachable_value;
    } else {
    }
    return reachable_value;
  }
  /** @apilevel internal */
  private Set<State> reachable_compute() {
  		Set result = new HashSet<State>();
  		result.add(this);
  		for(State n: successors())
  			result.addAll(n.reachable());
  		return result;
  	}
  /** @apilevel internal */
  private void isTypestateLabel_reset() {
    isTypestateLabel_computed = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle isTypestateLabel_computed = null;

  /** @apilevel internal */
  protected boolean isTypestateLabel_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:60
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:60")
  public boolean isTypestateLabel() {
    ASTState state = state();
    if (isTypestateLabel_computed == ASTState.NON_CYCLE || isTypestateLabel_computed == state().cycle()) {
      return isTypestateLabel_value;
    }
    isTypestateLabel_value = getTypestate() instanceof TypestateLabel;
    if (state().inCircle()) {
      isTypestateLabel_computed = state().cycle();
    
    } else {
      isTypestateLabel_computed = ASTState.NON_CYCLE;
    
    }
    return isTypestateLabel_value;
  }
  /** @apilevel internal */
  private void getCircularPath_reset() {
    getCircularPath_computed = null;
    getCircularPath_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle getCircularPath_computed = null;

  /** @apilevel internal */
  protected String getCircularPath_value;

  /**
   * @attribute syn
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:62
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:62")
  public String getCircularPath() {
    ASTState state = state();
    if (getCircularPath_computed == ASTState.NON_CYCLE || getCircularPath_computed == state().cycle()) {
      return getCircularPath_value;
    }
    getCircularPath_value = getCircularPath_compute();
    if (state().inCircle()) {
      getCircularPath_computed = state().cycle();
    
    } else {
      getCircularPath_computed = ASTState.NON_CYCLE;
    
    }
    return getCircularPath_value;
  }
  /** @apilevel internal */
  private String getCircularPath_compute() {
  		if(!isTypestateLabel())
  			return null;
  
  		State s = this;
  		Set<State> visited = new HashSet<State>();
  		String path = "";
  		while(s != null && s.isTypestateLabel() && !visited.contains(s)) {
  			path = path + s.getID() + "-->";
  			visited.add(s);
  			s = ((TypestateLabel) s.getTypestate()).getTarget();
  		}
  		if(s != null && s.equals(this))
  			return path + getID();
  
  		return null;
  	}
  /**
   * @attribute inh
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:19
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:19")
  public boolean isDuplicate(String name) {
    boolean isDuplicate_String_value = getParent().Define_isDuplicate(this, null, name);
    return isDuplicate_String_value;
  }
  /**
   * @attribute inh
   * @aspect typestateFunctionality
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:38
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:38")
  public boolean isReachable(State tn) {
    boolean isReachable_State_value = getParent().Define_isReachable(this, null, tn);
    return isReachable_State_value;
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:57
   * @apilevel internal
   */
  public State Define_getStateAncestor(ASTNode _callerNode, ASTNode _childNode) {
    if (getTypestateNoTransform() != null && _callerNode == getTypestate()) {
      // @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:58
      return this;
    }
    else {
      return getParent().Define_getStateAncestor(this, _callerNode);
    }
  }
  /**
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:57
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute getStateAncestor
   */
  protected boolean canDefine_getStateAncestor(ASTNode _callerNode, ASTNode _childNode) {
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
   * @declaredat /home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:54
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="typestateFunctionality", declaredAt="/home/luke/Level-5-Project/Mungo/updated_mungo-tools/mungo/src/jastadd/frontend/TypestateFunctionality.jrag:54")
  public Set<State> successors() {
    ASTState state = state();
    if (State_successors_computed == ASTState.NON_CYCLE || State_successors_computed == state().cycle()) {
      return State_successors_value;
    }
    State_successors_value = successors_compute();
    if (state().inCircle()) {
      State_successors_computed = state().cycle();
    
    } else {
      State_successors_computed = ASTState.NON_CYCLE;
    
    }
    return State_successors_value;
  }
  /** @apilevel internal */
  private Set<State> successors_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof State)) {
      node = node.getParent();
    }
    State root = (State) node;
    root.survey_State_successors();
    Set<State> _computedValue = new HashSet<State>();
    if (root.contributorMap_State_successors.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_State_successors.get(this)) {
        contributor.contributeTo_State_successors(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle State_successors_computed = null;

  /** @apilevel internal */
  protected Set<State> State_successors_value;

}
