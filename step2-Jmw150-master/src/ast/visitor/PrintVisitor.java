package ast.visitor;

import java.util.List;

import ast.ASTNode;
import ast.AssignNode;
import ast.BinaryOpNode;
import ast.UnaryOpNode;
import ast.WhileNode;
import ast.IfStatementNode;
import ast.IntLitNode;
import ast.ReadNode;
import ast.StatementListNode;
import ast.VarNode;
import ast.WriteNode;
import ast.ReturnNode;
import ast.CondNode;
import ast.FloatLitNode;
import ast.FloatLitNode;

public class PrintVisitor extends AbstractASTVisitor<Void> {

	int depth;
	
	public PrintVisitor() {depth = 0;}
	
	@Override
	public Void run(ASTNode node) {
		depth = 1;
		return node.accept(this);
	}
	
	@Override
	protected void preprocess(VarNode node) {
		printTabs();
		System.out.println("VarNode: " + node.getId());
	}

	@Override
	protected void preprocess(IntLitNode node) {
		printTabs();
		System.out.println("IntLitNode: " + node.getVal());
	}

	@Override
	protected void preprocess(FloatLitNode node) {
		printTabs();
		System.out.println("FloatLitNode: " + node.getVal());
	}

	@Override
	protected void preprocess(BinaryOpNode node) {
		printTabs();
		System.out.println("BinaryOpNode: " + node.getOp());
		depth++;
	}

    
    @Override
    protected void preprocess(UnaryOpNode node) {
        printTabs();
        System.out.println("UnaryOpNode: " + node.getOp());
        depth++;
    }

    @Override
    protected Void postprocess(UnaryOpNode node, Void child) {
        --depth;
        return null;
    }
    
	
	@Override
	protected Void postprocess(BinaryOpNode node, Void left, Void right) {
		--depth;
		return null;
	}
	
	@Override
	protected void preprocess(AssignNode node) {
		printTabs();
		System.out.println("AssignNode:");
		depth++;
	}
	
	@Override
	protected Void postprocess(AssignNode node, Void left, Void right) {
		--depth;
		return null;
	}
	
	private void printTabs() {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
	}

	@Override
	protected void preprocess(StatementListNode node) {
		printTabs();
		System.out.println("Statement list:");
		depth++;
	}

	@Override
	protected Void postprocess(StatementListNode node, List<Void> statements) {
		--depth;
		return null;
	}
	
	@Override
	protected void preprocess(ReadNode node) {
		printTabs();
		System.out.println("Read: ");
		depth++;
	}

	@Override
	protected void preprocess(WriteNode node) {
		printTabs();
		System.out.println("Write: ");
		depth++;
	}

	@Override
	protected Void postprocess(WriteNode node, Void writeExpr) {
		--depth;
		return null;
	}

	@Override
	protected Void postprocess(ReadNode node, Void var) {
		--depth;
		return null;
	}

	@Override
	protected void preprocess(ReturnNode node) {
		printTabs();
		System.out.println("Return: ");
		depth++;
	}

	@Override
	protected Void postprocess(ReturnNode node, Void retExpr) {
		--depth;
		return null;
	}

	@Override
	protected void preprocess(CondNode node) {
		printTabs();
		System.out.println("Cond: " + node.getOp());
		depth++;
	}
	
	@Override
	protected Void postprocess(CondNode node, Void left, Void right) {
		--depth;
		return null;
	}

	@Override
	protected void preprocess(IfStatementNode node) {
		printTabs();
		System.out.println("If ");
		depth++;
	}
	
	@Override
	protected Void postprocess(IfStatementNode node, Void cond, Void slist, Void epart) {
		--depth;
		return null;
	}
	
	@Override
	protected void preprocess(WhileNode node) {
		printTabs();
		System.out.println("While: ");
		depth++;
	}
	
	@Override
	protected Void postprocess(WhileNode node, Void cond, Void slist) {
		--depth;
		return null;
	}

}
