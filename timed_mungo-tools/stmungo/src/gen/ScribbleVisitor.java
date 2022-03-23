// Generated from /home/luke/Level-5-Project/Mungo/mungo-tools/stmungo/src/main/antlr/Scribble.g4 by ANTLR 4.9.2

package genantlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScribbleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScribbleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#rolename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolename(ScribbleParser.RolenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#payloadtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayloadtypename(ScribbleParser.PayloadtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#protocolname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolname(ScribbleParser.ProtocolnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#parametername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametername(ScribbleParser.ParameternameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#annotationname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationname(ScribbleParser.AnnotationnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#recursionlabelname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursionlabelname(ScribbleParser.RecursionlabelnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#recursionvarname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursionvarname(ScribbleParser.RecursionvarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#scopename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopename(ScribbleParser.ScopenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#simplemessagesignaturename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplemessagesignaturename(ScribbleParser.SimplemessagesignaturenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#choiceannotationname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceannotationname(ScribbleParser.ChoiceannotationnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongModuleName(ScribbleParser.LongModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stndModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStndModuleName(ScribbleParser.StndModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMemName(ScribbleParser.SimpleMemNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullMemName(ScribbleParser.FullMemNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stndPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStndPayloadTypeName(ScribbleParser.StndPayloadTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code protName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtName(ScribbleParser.ProtNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#fullmembername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullmembername(ScribbleParser.FullmembernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(ScribbleParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#datatypedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypedecl(ScribbleParser.DatatypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#moduledecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuledecl(ScribbleParser.ModuledeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#importdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportdecl(ScribbleParser.ImportdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#importmodule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportmodule(ScribbleParser.ImportmoduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#importmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportmember(ScribbleParser.ImportmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#payloadtypedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayloadtypedecl(ScribbleParser.PayloadtypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#messagesignaturedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessagesignaturedecl(ScribbleParser.MessagesignaturedeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPayload}
	 * labeled alternative in {@link ScribbleParser#messagesignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPayload(ScribbleParser.IdPayloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayload(ScribbleParser.PayloadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplePayload}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePayload(ScribbleParser.SimplePayloadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotPayloadTypeName(ScribbleParser.AnnotPayloadTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotParamName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotParamName(ScribbleParser.AnnotParamNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code glProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlProtocolDecl(ScribbleParser.GlProtocolDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lcProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcProtocolDecl(ScribbleParser.LcProtocolDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#choiceannot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceannot(ScribbleParser.ChoiceannotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalprotocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocoldecl(ScribbleParser.GlobalprotocoldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalprotocolheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocolheader(ScribbleParser.GlobalprotocolheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#roledecllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoledecllist(ScribbleParser.RoledecllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#roledecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoledecl(ScribbleParser.RoledeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#parameterdecllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdecllist(ScribbleParser.ParameterdecllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#parameterdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdecl(ScribbleParser.ParameterdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalprotocoldefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocoldefinition(ScribbleParser.GlobalprotocoldefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalprotocolinstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocolinstance(ScribbleParser.GlobalprotocolinstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#roleinstantiationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleinstantiationlist(ScribbleParser.RoleinstantiationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#roleinstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleinstantiation(ScribbleParser.RoleinstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(ScribbleParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ScribbleParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalprotocolblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocolblock(ScribbleParser.GlobalprotocolblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalinteractionsequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalinteractionsequence(ScribbleParser.GlobalinteractionsequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalinteraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalinteraction(ScribbleParser.GlobalinteractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalmessagetransfer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalmessagetransfer(ScribbleParser.GlobalmessagetransferContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(ScribbleParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalconnect(ScribbleParser.GlobalconnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globaldisconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaldisconnect(ScribbleParser.GlobaldisconnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalwrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalwrap(ScribbleParser.GlobalwrapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalchoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalchoice(ScribbleParser.GlobalchoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalrecursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalrecursion(ScribbleParser.GlobalrecursionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalcontinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalcontinue(ScribbleParser.GlobalcontinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalparallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalparallel(ScribbleParser.GlobalparallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalinterruptible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalinterruptible(ScribbleParser.GlobalinterruptibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globalinterrupt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalinterrupt(ScribbleParser.GlobalinterruptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#globaldo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaldo(ScribbleParser.GlobaldoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stndLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStndLocalProtocolDecl(ScribbleParser.StndLocalProtocolDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstLocalProtocolDecl(ScribbleParser.InstLocalProtocolDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stndLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStndLocalProtocolHeader(ScribbleParser.StndLocalProtocolHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamLocalProtocolHeader(ScribbleParser.ParamLocalProtocolHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localprotocoldefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalprotocoldefinition(ScribbleParser.LocalprotocoldefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localprotocolinstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalprotocolinstance(ScribbleParser.LocalprotocolinstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localprotocolblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalprotocolblock(ScribbleParser.LocalprotocolblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localinteraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalinteraction(ScribbleParser.LocalinteractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localsend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsend(ScribbleParser.LocalsendContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localreceive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalreceive(ScribbleParser.LocalreceiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localsendwrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsendwrap(ScribbleParser.LocalsendwrapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localreceivewrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalreceivewrap(ScribbleParser.LocalreceivewrapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalconnect(ScribbleParser.LocalconnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localaccept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalaccept(ScribbleParser.LocalacceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localdisconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaldisconnect(ScribbleParser.LocaldisconnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localchoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalchoice(ScribbleParser.LocalchoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localrecursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalrecursion(ScribbleParser.LocalrecursionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localcontinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalcontinue(ScribbleParser.LocalcontinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localparallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalparallel(ScribbleParser.LocalparallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localinterruptible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalinterruptible(ScribbleParser.LocalinterruptibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localthrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalthrow(ScribbleParser.LocalthrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localcatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalcatch(ScribbleParser.LocalcatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#localdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaldo(ScribbleParser.LocaldoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#clockid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockid(ScribbleParser.ClockidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#intconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntconst(ScribbleParser.IntconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#timeconstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeconstraint(ScribbleParser.TimeconstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#constraintspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintspec(ScribbleParser.ConstraintspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#clockconstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockconstraint(ScribbleParser.ClockconstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#resetpredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetpredicate(ScribbleParser.ResetpredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScribbleParser#resetpredlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetpredlist(ScribbleParser.ResetpredlistContext ctx);
}