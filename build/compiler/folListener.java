// Generated from fol.g4 by ANTLR 4.8

    package compiler;

    import java.util.List;
    import java.util.LinkedList;
    import ast.*;
 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link folParser}.
 */
public interface folListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link folParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(folParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(folParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#wffs}.
	 * @param ctx the parse tree
	 */
	void enterWffs(folParser.WffsContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#wffs}.
	 * @param ctx the parse tree
	 */
	void exitWffs(folParser.WffsContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#wff}.
	 * @param ctx the parse tree
	 */
	void enterWff(folParser.WffContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#wff}.
	 * @param ctx the parse tree
	 */
	void exitWff(folParser.WffContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#atomic_formula}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_formula(folParser.Atomic_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#atomic_formula}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_formula(folParser.Atomic_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(folParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(folParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(folParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(folParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(folParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(folParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(folParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(folParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(folParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(folParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(folParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(folParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link folParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(folParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link folParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(folParser.ConstantContext ctx);
}