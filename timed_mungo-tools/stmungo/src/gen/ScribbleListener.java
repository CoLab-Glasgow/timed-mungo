// Generated from /home/luke/Level-5-Project/Mungo/mungo-tools/stmungo/src/main/antlr/Scribble.g4 by ANTLR 4.9.2

package genantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScribbleParser}.
 */
public interface ScribbleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#rolename}.
	 * @param ctx the parse tree
	 */
	void enterRolename(ScribbleParser.RolenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#rolename}.
	 * @param ctx the parse tree
	 */
	void exitRolename(ScribbleParser.RolenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#payloadtypename}.
	 * @param ctx the parse tree
	 */
	void enterPayloadtypename(ScribbleParser.PayloadtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#payloadtypename}.
	 * @param ctx the parse tree
	 */
	void exitPayloadtypename(ScribbleParser.PayloadtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#protocolname}.
	 * @param ctx the parse tree
	 */
	void enterProtocolname(ScribbleParser.ProtocolnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#protocolname}.
	 * @param ctx the parse tree
	 */
	void exitProtocolname(ScribbleParser.ProtocolnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#parametername}.
	 * @param ctx the parse tree
	 */
	void enterParametername(ScribbleParser.ParameternameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#parametername}.
	 * @param ctx the parse tree
	 */
	void exitParametername(ScribbleParser.ParameternameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#annotationname}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationname(ScribbleParser.AnnotationnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#annotationname}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationname(ScribbleParser.AnnotationnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#recursionlabelname}.
	 * @param ctx the parse tree
	 */
	void enterRecursionlabelname(ScribbleParser.RecursionlabelnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#recursionlabelname}.
	 * @param ctx the parse tree
	 */
	void exitRecursionlabelname(ScribbleParser.RecursionlabelnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#recursionvarname}.
	 * @param ctx the parse tree
	 */
	void enterRecursionvarname(ScribbleParser.RecursionvarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#recursionvarname}.
	 * @param ctx the parse tree
	 */
	void exitRecursionvarname(ScribbleParser.RecursionvarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#scopename}.
	 * @param ctx the parse tree
	 */
	void enterScopename(ScribbleParser.ScopenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#scopename}.
	 * @param ctx the parse tree
	 */
	void exitScopename(ScribbleParser.ScopenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#simplemessagesignaturename}.
	 * @param ctx the parse tree
	 */
	void enterSimplemessagesignaturename(ScribbleParser.SimplemessagesignaturenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#simplemessagesignaturename}.
	 * @param ctx the parse tree
	 */
	void exitSimplemessagesignaturename(ScribbleParser.SimplemessagesignaturenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#choiceannotationname}.
	 * @param ctx the parse tree
	 */
	void enterChoiceannotationname(ScribbleParser.ChoiceannotationnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#choiceannotationname}.
	 * @param ctx the parse tree
	 */
	void exitChoiceannotationname(ScribbleParser.ChoiceannotationnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 */
	void enterLongModuleName(ScribbleParser.LongModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 */
	void exitLongModuleName(ScribbleParser.LongModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stndModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 */
	void enterStndModuleName(ScribbleParser.StndModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stndModuleName}
	 * labeled alternative in {@link ScribbleParser#modulename}.
	 * @param ctx the parse tree
	 */
	void exitStndModuleName(ScribbleParser.StndModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMemName(ScribbleParser.SimpleMemNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMemName(ScribbleParser.SimpleMemNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 */
	void enterFullMemName(ScribbleParser.FullMemNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullMemName}
	 * labeled alternative in {@link ScribbleParser#membername}.
	 * @param ctx the parse tree
	 */
	void exitFullMemName(ScribbleParser.FullMemNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stndPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 */
	void enterStndPayloadTypeName(ScribbleParser.StndPayloadTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stndPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 */
	void exitStndPayloadTypeName(ScribbleParser.StndPayloadTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code protName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 */
	void enterProtName(ScribbleParser.ProtNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code protName}
	 * labeled alternative in {@link ScribbleParser#simplemembername}.
	 * @param ctx the parse tree
	 */
	void exitProtName(ScribbleParser.ProtNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#fullmembername}.
	 * @param ctx the parse tree
	 */
	void enterFullmembername(ScribbleParser.FullmembernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#fullmembername}.
	 * @param ctx the parse tree
	 */
	void exitFullmembername(ScribbleParser.FullmembernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(ScribbleParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(ScribbleParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#datatypedecl}.
	 * @param ctx the parse tree
	 */
	void enterDatatypedecl(ScribbleParser.DatatypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#datatypedecl}.
	 * @param ctx the parse tree
	 */
	void exitDatatypedecl(ScribbleParser.DatatypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#moduledecl}.
	 * @param ctx the parse tree
	 */
	void enterModuledecl(ScribbleParser.ModuledeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#moduledecl}.
	 * @param ctx the parse tree
	 */
	void exitModuledecl(ScribbleParser.ModuledeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#importdecl}.
	 * @param ctx the parse tree
	 */
	void enterImportdecl(ScribbleParser.ImportdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#importdecl}.
	 * @param ctx the parse tree
	 */
	void exitImportdecl(ScribbleParser.ImportdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#importmodule}.
	 * @param ctx the parse tree
	 */
	void enterImportmodule(ScribbleParser.ImportmoduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#importmodule}.
	 * @param ctx the parse tree
	 */
	void exitImportmodule(ScribbleParser.ImportmoduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#importmember}.
	 * @param ctx the parse tree
	 */
	void enterImportmember(ScribbleParser.ImportmemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#importmember}.
	 * @param ctx the parse tree
	 */
	void exitImportmember(ScribbleParser.ImportmemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#payloadtypedecl}.
	 * @param ctx the parse tree
	 */
	void enterPayloadtypedecl(ScribbleParser.PayloadtypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#payloadtypedecl}.
	 * @param ctx the parse tree
	 */
	void exitPayloadtypedecl(ScribbleParser.PayloadtypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#messagesignaturedecl}.
	 * @param ctx the parse tree
	 */
	void enterMessagesignaturedecl(ScribbleParser.MessagesignaturedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#messagesignaturedecl}.
	 * @param ctx the parse tree
	 */
	void exitMessagesignaturedecl(ScribbleParser.MessagesignaturedeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPayload}
	 * labeled alternative in {@link ScribbleParser#messagesignature}.
	 * @param ctx the parse tree
	 */
	void enterIdPayload(ScribbleParser.IdPayloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPayload}
	 * labeled alternative in {@link ScribbleParser#messagesignature}.
	 * @param ctx the parse tree
	 */
	void exitIdPayload(ScribbleParser.IdPayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterPayload(ScribbleParser.PayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitPayload(ScribbleParser.PayloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplePayload}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void enterSimplePayload(ScribbleParser.SimplePayloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplePayload}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void exitSimplePayload(ScribbleParser.SimplePayloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotPayloadTypeName(ScribbleParser.AnnotPayloadTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotPayloadTypeName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotPayloadTypeName(ScribbleParser.AnnotPayloadTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotParamName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotParamName(ScribbleParser.AnnotParamNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotParamName}
	 * labeled alternative in {@link ScribbleParser#payloadelement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotParamName(ScribbleParser.AnnotParamNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterGlProtocolDecl(ScribbleParser.GlProtocolDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitGlProtocolDecl(ScribbleParser.GlProtocolDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lcProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterLcProtocolDecl(ScribbleParser.LcProtocolDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lcProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitLcProtocolDecl(ScribbleParser.LcProtocolDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#choiceannot}.
	 * @param ctx the parse tree
	 */
	void enterChoiceannot(ScribbleParser.ChoiceannotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#choiceannot}.
	 * @param ctx the parse tree
	 */
	void exitChoiceannot(ScribbleParser.ChoiceannotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocoldecl(ScribbleParser.GlobalprotocoldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocoldecl(ScribbleParser.GlobalprotocoldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalprotocolheader}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocolheader(ScribbleParser.GlobalprotocolheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalprotocolheader}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocolheader(ScribbleParser.GlobalprotocolheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#roledecllist}.
	 * @param ctx the parse tree
	 */
	void enterRoledecllist(ScribbleParser.RoledecllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#roledecllist}.
	 * @param ctx the parse tree
	 */
	void exitRoledecllist(ScribbleParser.RoledecllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#roledecl}.
	 * @param ctx the parse tree
	 */
	void enterRoledecl(ScribbleParser.RoledeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#roledecl}.
	 * @param ctx the parse tree
	 */
	void exitRoledecl(ScribbleParser.RoledeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#parameterdecllist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdecllist(ScribbleParser.ParameterdecllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#parameterdecllist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdecllist(ScribbleParser.ParameterdecllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterdecl(ScribbleParser.ParameterdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterdecl(ScribbleParser.ParameterdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalprotocoldefinition}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocoldefinition(ScribbleParser.GlobalprotocoldefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalprotocoldefinition}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocoldefinition(ScribbleParser.GlobalprotocoldefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalprotocolinstance}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocolinstance(ScribbleParser.GlobalprotocolinstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalprotocolinstance}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocolinstance(ScribbleParser.GlobalprotocolinstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#roleinstantiationlist}.
	 * @param ctx the parse tree
	 */
	void enterRoleinstantiationlist(ScribbleParser.RoleinstantiationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#roleinstantiationlist}.
	 * @param ctx the parse tree
	 */
	void exitRoleinstantiationlist(ScribbleParser.RoleinstantiationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#roleinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterRoleinstantiation(ScribbleParser.RoleinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#roleinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitRoleinstantiation(ScribbleParser.RoleinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(ScribbleParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(ScribbleParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ScribbleParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ScribbleParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalprotocolblock}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocolblock(ScribbleParser.GlobalprotocolblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalprotocolblock}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocolblock(ScribbleParser.GlobalprotocolblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalinteractionsequence}.
	 * @param ctx the parse tree
	 */
	void enterGlobalinteractionsequence(ScribbleParser.GlobalinteractionsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalinteractionsequence}.
	 * @param ctx the parse tree
	 */
	void exitGlobalinteractionsequence(ScribbleParser.GlobalinteractionsequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalinteraction}.
	 * @param ctx the parse tree
	 */
	void enterGlobalinteraction(ScribbleParser.GlobalinteractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalinteraction}.
	 * @param ctx the parse tree
	 */
	void exitGlobalinteraction(ScribbleParser.GlobalinteractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalmessagetransfer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalmessagetransfer(ScribbleParser.GlobalmessagetransferContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalmessagetransfer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalmessagetransfer(ScribbleParser.GlobalmessagetransferContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ScribbleParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ScribbleParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalconnect}.
	 * @param ctx the parse tree
	 */
	void enterGlobalconnect(ScribbleParser.GlobalconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalconnect}.
	 * @param ctx the parse tree
	 */
	void exitGlobalconnect(ScribbleParser.GlobalconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globaldisconnect}.
	 * @param ctx the parse tree
	 */
	void enterGlobaldisconnect(ScribbleParser.GlobaldisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globaldisconnect}.
	 * @param ctx the parse tree
	 */
	void exitGlobaldisconnect(ScribbleParser.GlobaldisconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalwrap}.
	 * @param ctx the parse tree
	 */
	void enterGlobalwrap(ScribbleParser.GlobalwrapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalwrap}.
	 * @param ctx the parse tree
	 */
	void exitGlobalwrap(ScribbleParser.GlobalwrapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalchoice}.
	 * @param ctx the parse tree
	 */
	void enterGlobalchoice(ScribbleParser.GlobalchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalchoice}.
	 * @param ctx the parse tree
	 */
	void exitGlobalchoice(ScribbleParser.GlobalchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalrecursion}.
	 * @param ctx the parse tree
	 */
	void enterGlobalrecursion(ScribbleParser.GlobalrecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalrecursion}.
	 * @param ctx the parse tree
	 */
	void exitGlobalrecursion(ScribbleParser.GlobalrecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalcontinue}.
	 * @param ctx the parse tree
	 */
	void enterGlobalcontinue(ScribbleParser.GlobalcontinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalcontinue}.
	 * @param ctx the parse tree
	 */
	void exitGlobalcontinue(ScribbleParser.GlobalcontinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalparallel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalparallel(ScribbleParser.GlobalparallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalparallel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalparallel(ScribbleParser.GlobalparallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalinterruptible}.
	 * @param ctx the parse tree
	 */
	void enterGlobalinterruptible(ScribbleParser.GlobalinterruptibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalinterruptible}.
	 * @param ctx the parse tree
	 */
	void exitGlobalinterruptible(ScribbleParser.GlobalinterruptibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globalinterrupt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalinterrupt(ScribbleParser.GlobalinterruptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globalinterrupt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalinterrupt(ScribbleParser.GlobalinterruptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#globaldo}.
	 * @param ctx the parse tree
	 */
	void enterGlobaldo(ScribbleParser.GlobaldoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#globaldo}.
	 * @param ctx the parse tree
	 */
	void exitGlobaldo(ScribbleParser.GlobaldoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stndLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterStndLocalProtocolDecl(ScribbleParser.StndLocalProtocolDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stndLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitStndLocalProtocolDecl(ScribbleParser.StndLocalProtocolDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterInstLocalProtocolDecl(ScribbleParser.InstLocalProtocolDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instLocalProtocolDecl}
	 * labeled alternative in {@link ScribbleParser#localprotocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitInstLocalProtocolDecl(ScribbleParser.InstLocalProtocolDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stndLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 */
	void enterStndLocalProtocolHeader(ScribbleParser.StndLocalProtocolHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stndLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 */
	void exitStndLocalProtocolHeader(ScribbleParser.StndLocalProtocolHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 */
	void enterParamLocalProtocolHeader(ScribbleParser.ParamLocalProtocolHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramLocalProtocolHeader}
	 * labeled alternative in {@link ScribbleParser#localprotocolheader}.
	 * @param ctx the parse tree
	 */
	void exitParamLocalProtocolHeader(ScribbleParser.ParamLocalProtocolHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localprotocoldefinition}.
	 * @param ctx the parse tree
	 */
	void enterLocalprotocoldefinition(ScribbleParser.LocalprotocoldefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localprotocoldefinition}.
	 * @param ctx the parse tree
	 */
	void exitLocalprotocoldefinition(ScribbleParser.LocalprotocoldefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localprotocolinstance}.
	 * @param ctx the parse tree
	 */
	void enterLocalprotocolinstance(ScribbleParser.LocalprotocolinstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localprotocolinstance}.
	 * @param ctx the parse tree
	 */
	void exitLocalprotocolinstance(ScribbleParser.LocalprotocolinstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localprotocolblock}.
	 * @param ctx the parse tree
	 */
	void enterLocalprotocolblock(ScribbleParser.LocalprotocolblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localprotocolblock}.
	 * @param ctx the parse tree
	 */
	void exitLocalprotocolblock(ScribbleParser.LocalprotocolblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localinteraction}.
	 * @param ctx the parse tree
	 */
	void enterLocalinteraction(ScribbleParser.LocalinteractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localinteraction}.
	 * @param ctx the parse tree
	 */
	void exitLocalinteraction(ScribbleParser.LocalinteractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localsend}.
	 * @param ctx the parse tree
	 */
	void enterLocalsend(ScribbleParser.LocalsendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localsend}.
	 * @param ctx the parse tree
	 */
	void exitLocalsend(ScribbleParser.LocalsendContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localreceive}.
	 * @param ctx the parse tree
	 */
	void enterLocalreceive(ScribbleParser.LocalreceiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localreceive}.
	 * @param ctx the parse tree
	 */
	void exitLocalreceive(ScribbleParser.LocalreceiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localsendwrap}.
	 * @param ctx the parse tree
	 */
	void enterLocalsendwrap(ScribbleParser.LocalsendwrapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localsendwrap}.
	 * @param ctx the parse tree
	 */
	void exitLocalsendwrap(ScribbleParser.LocalsendwrapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localreceivewrap}.
	 * @param ctx the parse tree
	 */
	void enterLocalreceivewrap(ScribbleParser.LocalreceivewrapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localreceivewrap}.
	 * @param ctx the parse tree
	 */
	void exitLocalreceivewrap(ScribbleParser.LocalreceivewrapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localconnect}.
	 * @param ctx the parse tree
	 */
	void enterLocalconnect(ScribbleParser.LocalconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localconnect}.
	 * @param ctx the parse tree
	 */
	void exitLocalconnect(ScribbleParser.LocalconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localaccept}.
	 * @param ctx the parse tree
	 */
	void enterLocalaccept(ScribbleParser.LocalacceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localaccept}.
	 * @param ctx the parse tree
	 */
	void exitLocalaccept(ScribbleParser.LocalacceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localdisconnect}.
	 * @param ctx the parse tree
	 */
	void enterLocaldisconnect(ScribbleParser.LocaldisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localdisconnect}.
	 * @param ctx the parse tree
	 */
	void exitLocaldisconnect(ScribbleParser.LocaldisconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localchoice}.
	 * @param ctx the parse tree
	 */
	void enterLocalchoice(ScribbleParser.LocalchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localchoice}.
	 * @param ctx the parse tree
	 */
	void exitLocalchoice(ScribbleParser.LocalchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localrecursion}.
	 * @param ctx the parse tree
	 */
	void enterLocalrecursion(ScribbleParser.LocalrecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localrecursion}.
	 * @param ctx the parse tree
	 */
	void exitLocalrecursion(ScribbleParser.LocalrecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localcontinue}.
	 * @param ctx the parse tree
	 */
	void enterLocalcontinue(ScribbleParser.LocalcontinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localcontinue}.
	 * @param ctx the parse tree
	 */
	void exitLocalcontinue(ScribbleParser.LocalcontinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localparallel}.
	 * @param ctx the parse tree
	 */
	void enterLocalparallel(ScribbleParser.LocalparallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localparallel}.
	 * @param ctx the parse tree
	 */
	void exitLocalparallel(ScribbleParser.LocalparallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localinterruptible}.
	 * @param ctx the parse tree
	 */
	void enterLocalinterruptible(ScribbleParser.LocalinterruptibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localinterruptible}.
	 * @param ctx the parse tree
	 */
	void exitLocalinterruptible(ScribbleParser.LocalinterruptibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localthrow}.
	 * @param ctx the parse tree
	 */
	void enterLocalthrow(ScribbleParser.LocalthrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localthrow}.
	 * @param ctx the parse tree
	 */
	void exitLocalthrow(ScribbleParser.LocalthrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localcatch}.
	 * @param ctx the parse tree
	 */
	void enterLocalcatch(ScribbleParser.LocalcatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localcatch}.
	 * @param ctx the parse tree
	 */
	void exitLocalcatch(ScribbleParser.LocalcatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#localdo}.
	 * @param ctx the parse tree
	 */
	void enterLocaldo(ScribbleParser.LocaldoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#localdo}.
	 * @param ctx the parse tree
	 */
	void exitLocaldo(ScribbleParser.LocaldoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#clockid}.
	 * @param ctx the parse tree
	 */
	void enterClockid(ScribbleParser.ClockidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#clockid}.
	 * @param ctx the parse tree
	 */
	void exitClockid(ScribbleParser.ClockidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#intconst}.
	 * @param ctx the parse tree
	 */
	void enterIntconst(ScribbleParser.IntconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#intconst}.
	 * @param ctx the parse tree
	 */
	void exitIntconst(ScribbleParser.IntconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#timeconstraint}.
	 * @param ctx the parse tree
	 */
	void enterTimeconstraint(ScribbleParser.TimeconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#timeconstraint}.
	 * @param ctx the parse tree
	 */
	void exitTimeconstraint(ScribbleParser.TimeconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#constraintspec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintspec(ScribbleParser.ConstraintspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#constraintspec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintspec(ScribbleParser.ConstraintspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#clockconstraint}.
	 * @param ctx the parse tree
	 */
	void enterClockconstraint(ScribbleParser.ClockconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#clockconstraint}.
	 * @param ctx the parse tree
	 */
	void exitClockconstraint(ScribbleParser.ClockconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#resetpredicate}.
	 * @param ctx the parse tree
	 */
	void enterResetpredicate(ScribbleParser.ResetpredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#resetpredicate}.
	 * @param ctx the parse tree
	 */
	void exitResetpredicate(ScribbleParser.ResetpredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScribbleParser#resetpredlist}.
	 * @param ctx the parse tree
	 */
	void enterResetpredlist(ScribbleParser.ResetpredlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScribbleParser#resetpredlist}.
	 * @param ctx the parse tree
	 */
	void exitResetpredlist(ScribbleParser.ResetpredlistContext ctx);
}