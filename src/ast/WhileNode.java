package ast;

import ast.visitor.ASTVisitor;

/**
 * Node for <code>while_stmt</code>
 * 
 * This node has two children:
 * 
 * 1. <code>cond</code> for the conditional
 * 2. <code>slist</code> for the loop body
 */
public class WhileNode implements StatementNode {

	private CondNode cond;
	private StatementListNode slist;
	
	public WhileNode(CondNode cond, StatementListNode slist) {
		this.setCond(cond);
		this.setSlist(slist);
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public CondNode getCond() {
		return cond;
	}

	private void setCond(CondNode cond) {
		this.cond = cond;
	}

	public StatementListNode getSlist() {
		return slist;
	}

	private void setSlist(StatementListNode slist) {
		this.slist = slist;
	}

}
