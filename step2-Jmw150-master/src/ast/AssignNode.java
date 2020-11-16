package ast;

import ast.visitor.ASTVisitor;

/**
 * Assignment statements. Node is created from <code>assign_stmt</code> rule.
 * 
 * Has two children:
 * 
 * 1. <code>left</code> which is the LHS of the assignment.
 * 2. <code>right</code> which is the RHS of the assignment.
 */
public class AssignNode extends TypedASTNode implements StatementNode {

	private TypedASTNode left;
	private ExpressionNode right;
	
	public AssignNode(TypedASTNode left, ExpressionNode right) {
		this.setLeft(left);
		this.setRight(right);
		this.setType(left.getType());
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public TypedASTNode getLeft() {
		return left;
	}

	private void setLeft(TypedASTNode left) {
		this.left = left;
	}

	public TypedASTNode getRight() {
		return right;
	}

	private void setRight(ExpressionNode right) {
		this.right = right;
	}

}
