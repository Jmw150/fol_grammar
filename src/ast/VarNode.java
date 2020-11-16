package ast;

import ast.visitor.ASTVisitor;
import compiler.Scope.SymbolTableEntry;
import compiler.Compiler;

/**
 * A node for variables
 * 
 * This node tracks the symbol table entry of the variable
 * (because the STE is determined by the scope the parser is in when
 * it constructs the node, and can be hard to recover later.)
 */
public class VarNode extends ExpressionNode {
	private String id;
	private SymbolTableEntry ste;
	
	public VarNode(String id) {
		this.setId(id);
		setSymbol(Compiler.symbolTable.getSymbolTableEntry(id));
		setType(ste.getType());
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public SymbolTableEntry getSymbol() {
		return ste;
	}

	private void setSymbol(SymbolTableEntry ste) {
		this.ste = ste;
	}
}
