package ast;

import ast.visitor.ASTVisitor;

/**
 * Node associated with <code>read_stmt</code>
 * 
 * This has one child: a variable node
 */
public class ReadNode extends TypedASTNode implements StatementNode {

	private VarNode node;

	public ReadNode(VarNode node) {
		setVarNode(node);
		setType(node.type);
	}
	
	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public VarNode getVarNode() {
		return node;
	}

	private void setVarNode(VarNode node) {
		this.node = node;
	}
}
