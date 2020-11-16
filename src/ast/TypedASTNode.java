package ast;

import compiler.Scope;

/**
 * Abstract class for any AST node that needs to carry type information
 * 
 * Expressions carry type
 */
public abstract class TypedASTNode implements ASTNode {

	protected Scope.Type type;

	public Scope.Type getType() {
		return type;
	}

	protected void setType(Scope.Type type) {
		this.type = type;
	}

}
