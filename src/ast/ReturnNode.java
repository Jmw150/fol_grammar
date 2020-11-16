package ast;

import ast.visitor.ASTVisitor;

/**
 * Node associated with <code>return_stmt</code>
 * 
 * This has one child: the expression whose value is being returned
 */
public class ReturnNode implements StatementNode {
	
	private ExpressionNode retExpr;

	public ReturnNode(ExpressionNode retExpr) {
		setRetExpr(retExpr);
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public ExpressionNode getRetExpr() {
		return retExpr;
	}

	private void setRetExpr(ExpressionNode expr) {
		retExpr = expr;
	}

}