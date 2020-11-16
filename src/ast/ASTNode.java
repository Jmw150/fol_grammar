package ast;

import ast.visitor.ASTVisitor;

/**
 * Top-level interface for all AST nodes. Provides support for visitor pattern
 */
public interface ASTNode {

	/**
	 * Function to enable visitor pattern
	 * 
	 * Usage: 	pass visitor into this function, then use double dispatch to call
	 * 			type-specific <code>visit</code> method on visitor
	 * 
	 * @param <R> Type of object returned as part of processing this node
	 * @param visitor Visitor object that is walking the tree
	 * @return Object of type <code>R</code> that is the result of walking this node and its subtree
	 */
	<R> R accept(ASTVisitor<R> visitor);
	
}
