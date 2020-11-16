package ast;

import ast.visitor.ASTVisitor;

/**
 * Node for if statements
 * 
 * This node has three children:
 * 
 * 1. <code>condExpr</code>, a {@link CondNode} for the conditional.
 * 2. <code>thenBlock</code>, a {@link StatementListNode} for the then block.
 * 3. <code>elseBlock</code>, a {@link StatementListNode} for the else block.
 * 
 * Note that <code>elseBlock</code> can be null, if there is no else
 */
public class IfStatementNode implements StatementNode {
	
	private CondNode condExpr;
	private StatementListNode thenBlock;
	private StatementListNode elseBlock;

	public IfStatementNode(CondNode cond, StatementListNode tlist,
			StatementListNode elist) {
		setCondExpr(cond);
		setThenBlock(tlist);
		setElseBlock(elist);
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public CondNode getCondExpr() {
		return condExpr;
	}

	private void setCondExpr(CondNode condExpr) {
		this.condExpr = condExpr;
	}

	public StatementListNode getThenBlock() {
		return thenBlock;
	}

	private void setThenBlock(StatementListNode thenBlock) {
		this.thenBlock = thenBlock;
	}

	public StatementListNode getElseBlock() {
		return elseBlock;
	}

	private void setElseBlock(StatementListNode elseBlock) {
		this.elseBlock = elseBlock;
	}

}
