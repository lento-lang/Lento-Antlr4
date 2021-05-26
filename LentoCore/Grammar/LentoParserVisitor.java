// Generated from LentoParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LentoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LentoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LentoParser#whitespace_any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace_any(LentoParser.Whitespace_anyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#whitespace_sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace_sp(LentoParser.Whitespace_spContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#whitespace_nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace_nl(LentoParser.Whitespace_nlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#semi_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi_colon(LentoParser.Semi_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LentoParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LentoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#type_namespaced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_namespaced(LentoParser.Type_namespacedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LentoParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#identifier_namespaced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_namespaced(LentoParser.Identifier_namespacedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#identifier_ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_ignore(LentoParser.Identifier_ignoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(LentoParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#function_name_namespaced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name_namespaced(LentoParser.Function_name_namespacedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#operator_infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_infix(LentoParser.Operator_infixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#operator_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_prefix(LentoParser.Operator_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(LentoParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#floating_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point(LentoParser.Floating_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#number_hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_hex(LentoParser.Number_hexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#number_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_binary(LentoParser.Number_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#numerical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical(LentoParser.NumericalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LentoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(LentoParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#typed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_identifier(LentoParser.Typed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(LentoParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(LentoParser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LentoParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(LentoParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(LentoParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(LentoParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(LentoParser.Map_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LentoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LentoParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(LentoParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(LentoParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(LentoParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#variable_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initialization(LentoParser.Variable_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#expression_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_separator(LentoParser.Expression_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LentoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LentoParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(LentoParser.Compilation_unitContext ctx);
}