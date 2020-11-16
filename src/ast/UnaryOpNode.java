package ast;

import ast.visitor.ASTVisitor;

/**
 * A node for unary expressions (negation)
 * 
 * This has one child: the {@link ExpressionNode} being operated on
 */
public class UnaryOpNode extends ExpressionNode {

	public enum OpType {
		NEG
	}
	
	private ExpressionNode expr;
	private OpType op;
	
	public UnaryOpNode(ExpressionNode expr, String op) {
		this.setExpr(expr);
		this.setOp(getOpFromString(op));
		this.setType(expr.getType());
	}
		
	private OpType getOpFromString(String s) {
		switch (s) {
		case "-" : return OpType.NEG;
		default : throw new Error ("Unrecognized op type");
		}
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public ASTNode getExpr() {
		return expr;
	}

	private void setExpr(ExpressionNode right) {
		this.expr = right;
	}

	public OpType getOp() {
		return op;
	}

	private void setOp(OpType op) {
		this.op = op;
	}

}
