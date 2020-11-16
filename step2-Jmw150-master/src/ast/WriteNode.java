package ast;

import ast.visitor.ASTVisitor;

/**
 * AST Node associated with <code>print</code> statements
 * 
 * Has one child: the {@link ExpressionNode} to print
 */
public class WriteNode implements StatementNode {
	
	private ExpressionNode writeExpr;

	public WriteNode(ExpressionNode writeExpr) {
		setWriteExpr(writeExpr);
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public ExpressionNode getWriteExpr() {
		return writeExpr;
	}

	private void setWriteExpr(ExpressionNode expr) {
		writeExpr = expr;
	}

}