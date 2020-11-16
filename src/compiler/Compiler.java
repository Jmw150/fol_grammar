package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import assembly.CodeGenerator;
import assembly.CodeObject;
import ast.ASTNode;

import ast.visitor.PrintVisitor; // for debugging

import java.util.Collection;

public class Compiler {

	static public SymbolTable symbolTable = new SymbolTable();

	public Compiler() {
		
	}

	public static void main(String args[]) {
		
		
		try {
			folLexer lexer = new folLexer(CharStreams.fromFileName(args[0]));
			
			folParser parser = new folParser(new CommonTokenStream(lexer));

			parser.setSymbolTable(symbolTable);
			
			parser.program(); //parse the program to build the ast
			
			//Print out the symbol table. Helpful for debugging
			symbolTable.printTable();

			ASTNode ast = parser.getAST();

			// Uncomment these lines to print out your AST for debugging purposes
            //PrintVisitor pv = new PrintVisitor();
            //pv.run(ast);

			CodeGenerator cg = new CodeGenerator();
			CodeObject co = cg.run(ast);

			// Print out ".section .text"
			System.out.println(".section .text");

			// Print out the code. Runme script will redirect as necessary
			System.out.println(co);

			//Print out strings
			printStrings();

		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
			System.exit(1);
		}		
	}

	private static void printStrings() {
		System.out.println();
		System.out.println(".section .strings");

		Scope g = symbolTable.getGlobalScope();

		Collection<Scope.SymbolTableEntry> stes = g.getEntries();
		for (Scope.SymbolTableEntry ste : stes) {
			if (ste.getType() == Scope.Type.STRING) {
				Scope.StringSymbolTableEntry sste = (Scope.StringSymbolTableEntry) ste;
				System.out.println(String.format("0x%x", sste.getAddress()) + " " + sste.getValue());
			}
		}
	}
	
}
