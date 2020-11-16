package ast;

import ast.visitor.ASTVisitor;

/**
 * This is a comparison expression that compares two {@link ExpressionNode}s
 * 
 * It has two children:
 * 
 * 1. <code>right</code>
 * 2. <code>left</code>
 * 
 * It also keeps track of the comparison operation
 */
public class CondNode implements ASTNode {

	public enum OpType {
		EQ,
		NE,
		LT,
		LE,
		GT,
		GE,
	}
	
	private ExpressionNode left;
	private ExpressionNode right;
	private OpType op;
	
	public CondNode(ExpressionNode left, ExpressionNode right, String op) {
		this.setLeft(left);
		this.setRight(right);
		this.setOp(getOpFromString(op));
	}
		
	private OpType getOpFromString(String s) {
		switch (s) {
		case "<=" : return OpType.LE;
		case "<" : return OpType.LT;
		case ">=" : return OpType.GE;
		case ">" : return OpType.GT;
		case "==" : return OpType.EQ;
		case "!=" : return OpType.NE;
		default : throw new Error ("Unrecognized op type");
		}
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public ExpressionNode getLeft() {
		return left;
	}

	private void setLeft(ExpressionNode left) {
		this.left = left;
	}

	public ExpressionNode getRight() {
		return right;
	}

	private void setRight(ExpressionNode right) {
		this.right = right;
	}

	public OpType getOp() {
		return op;
	}

	private void setOp(OpType op) {
		this.op = op;
	}
	
}
