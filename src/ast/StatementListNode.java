package ast;

import java.util.LinkedList;
import java.util.List;

import ast.visitor.ASTVisitor;

/**
 * Node for <code>statements</code>
 * 
 * This has a list of children, one for each statement
 */
public class StatementListNode implements ASTNode {

	private List<StatementNode> statements;
	
	/**
	 * An empty statement list node
	 */
	public StatementListNode() {
		statements = new LinkedList<StatementNode>();
	}
	
	/**
	 * A statement list node with one statement
	 * 
	 * @param s the statement
	 */
	public StatementListNode(StatementNode s) {
		statements = new LinkedList<StatementNode>();
		statements.add(s);
	}
	
	/**
	 * A statement list node constructed of a statement followed by
	 * another statement list node.
	 * 
	 * @param s The first statement
	 * @param sl The rests of the statements
	 */
	public StatementListNode(StatementNode s, StatementListNode sl) {
		statements = new LinkedList<StatementNode>();
		statements.add(s);
		statements.addAll(sl.statements);
	}
	
	/**
	 * A statement list node constructed of a list of statements
	 * followed by a single statement.
	 * 
	 * @param sl The list of statements
	 * @param s The last statement
	 */
	public StatementListNode(StatementListNode sl, StatementNode s) {
		statements = new LinkedList<StatementNode>();
		statements.addAll(sl.statements);
		statements.add(s);
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public List<StatementNode> getStatements() {return statements;}
	
}
