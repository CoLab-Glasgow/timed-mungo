/*
 * Raymond@HZHL2 ~/code/python/scribble-tools
 * $ java -cp lib/antlr-3.1.3.jar org.antlr.Tool -o bin src/scribble/Scribble.g
 *
 * Modified by
 *       Ornela Dardha, University of Glasgow,
 *           for ANTLR 4.5
 *		-	February 2015  -
*/


grammar Scribble;


@header {
package genantlr;
}

/*
 * Parser input constants (lexer output; keywords, Section 2.4)
 */
MODULEKW : 'module';
IMPORTKW : 'import';
TYPEKW : 'type';
PROTOCOLKW : 'protocol';
GLOBALKW : 'global';
EXPLICITKW : 'explicit';
AUXKW :'aux';
LOCALKW : 'local';
ROLEKW : 'role';
SELFKW: 'self';
SIGKW : 'sig';
INSTANTIATESKW : 'instantiates';
ASKW : 'as';
FROMKW : 'from';
TOKW : 'to';
CHOICEKW : 'choice';
ATKW : 'at';
ORKW : 'or';
RECKW : 'rec';
CONTINUEKW : 'continue';
PARKW : 'par';
ANDKW : 'and';
INTERRUPTIBLEKW : 'interruptible';
WITHKW : 'with';
BYKW : 'by';  /* from for interrupts is more expected, but from is
				 not good for multiple roles (generally, the comma
				 in interrupt message list and role list looks like
				 "and" rather than "or") */
THROWSKW : 'throws';
CATCHESKW : 'catches';
DOKW : 'do';
CHOICENAMEKW: 'choicename';

CONNECTKW : 'connect';
DISCONNECTKW : 'disconnect';
ACCEPTKW : 'accept';
WRAPKW :'wrap';

/****************************************************************************
 * Chapter 2 Lexical Strucure (Lexer rules)
 ***************************************************************************/

/*
 * Section 2.1 White space (Section 2.1)
 */
WHITESPACE:
	('\t' | ' ' | '\r' | '\n'| '\u000C')+
	{skip();}
;

/**
 * Section 2.2 Comments
 */
COMMENT:
	'/*' .*? '*/'
	{skip();}
;

LINE_COMMENT:
	'//' ~('\n'|'\r')* '\r'? '\n'
	{skip();}
;

/**
 * Section 2.3 Identifiers
 */
fragment SYMBOL:
	'{' | '}' | '(' | ')' | '[' | ']' | ':' | '/' | '\\' | '.' | '#'
	|
	'&' | '?' | '!'	| UNDERSCORE
;

// Comes after SYMBOL due to an ANTLR syntax highlighting issue involving quotes
// Parser doesn't work without quotes here (e.g. if inlined into parser rules)
EXTIDENTIFIER:
	'\"' (LETTER | UNDERSCORE) (LETTER | DIGIT | SYMBOL)* '\"'
	//( LETTER  |  UNDERSCORE |  SYMBOL)   ( LETTER  |  DIGIT  |  UNDERSCORE | SYMBOL  )*
;


fragment LETTER:
	'a'..'z' | 'A'..'Z'
;

fragment DIGIT:
	'0'..'9'
;

fragment UNDERSCORE:
	'_'
;

INT: DIGIT +;
FLOAT: DIGIT + '.' DIGIT +;
clockconst: INT | FLOAT;
BOOL: 'false' | 'true';

// The IDENTIFER has been changed to not allow full digit identifers as this clashes with the 
// required INTs for clock constraints
IDENTIFIER:
	(LETTER | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE)*
    // (LETTER | DIGIT | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE)*
;

// ID: (LETTER) (LETTER)*;
clockid: IDENTIFIER;
/**
* Other tokens
*/
COMMA: ',';
COLON:	':';
SEMICOLON: ';';
CURLYLEFT: '{';
CURLYRIGHT: '}';
ROUNDLEFT: '(';
ROUNDRIGHT: ')';
ANGLELEFT: '<';
ANGLERIGHT: '>';
AT: '@';

/****************************************************************************
 * Chapter 3 Syntax (Parser rules)
 ***************************************************************************/

/*
 * Section 3.1 Primitive Names
 */
rolename: IDENTIFIER;
payloadtypename: IDENTIFIER;
protocolname: IDENTIFIER;
parametername: IDENTIFIER;
annotationname: IDENTIFIER;
recursionlabelname: IDENTIFIER;
recursionvarname: IDENTIFIER;
scopename: IDENTIFIER;
simplemessagesignaturename: IDENTIFIER;
choiceannotationname: IDENTIFIER;


/*
 * Section 3.2.1 Package, Module and Module Member Names
 */

modulename:
	IDENTIFIER ('.' IDENTIFIER)* '.' IDENTIFIER	# longModuleName
|
	IDENTIFIER									# stndModuleName
;

membername:
	simplemembername	# simpleMemName
|
	fullmembername		# fullMemName
;

simplemembername:
	payloadtypename		# stndPayloadTypeName
|
	protocolname  		# protName
					/* Generates an ANTLR warning since both are IDENTIFIER
	                 if no backtrack (makes ANTLR think this alternative
	                 is reachable, but actually it isn't) */
;

fullmembername:
	modulename '.' simplemembername  /* Needs backtrack=true
	                                    since the simplemembername can/will
										be eagerly consumed by modulename */
;


/**
 * Section 3.2.2 Top-level Module Structure
 */
module:
	moduledecl (importdecl)* (datatypedecl)* (protocoldecl)*
;

datatypedecl:
	payloadtypedecl
|
	messagesignaturedecl
;

/**
 * Section 3.2.3 Module Declarations
 */
moduledecl:
	MODULEKW modulename ';'
;

/**
 * Section 3.3 Import Declarations
 */
importdecl:
	importmodule
|
	importmember
;

importmodule:
	IMPORTKW modulename ';'
|
	IMPORTKW modulename ASKW IDENTIFIER ';'
;

importmember:
	FROMKW modulename IMPORTKW simplemembername ';'
|
	FROMKW modulename IMPORTKW simplemembername ASKW IDENTIFIER ';'
;


/**
 * Section 3.4 Data Type Declarations: Payload Type Declarations and Message Sig. Declarations
 */
payloadtypedecl:
	TYPEKW '<' IDENTIFIER '>' EXTIDENTIFIER FROMKW EXTIDENTIFIER ASKW payloadtypename ';'
;

messagesignaturedecl:
	SIGKW '<' IDENTIFIER '>' EXTIDENTIFIER FROMKW EXTIDENTIFIER ASKW simplemessagesignaturename ';'
;

/**
 * Section 3.5 Message Signatures
 */
// Not used
//messageoperator:
//	IDENTIFIER
//;

messagesignature:
	'(' ')' # idPayload
|
	'(' payload ')' # idPayload
|
    IDENTIFIER ('(' payload ')' )?	# idPayload
|
    IDENTIFIER '(' ')'     # idPayload
;

payload:
	payloadelement (',' payloadelement)*
;

payloadelement:
	payloadtypename							# simplePayload
|
	parametername 					 		# simplePayload
					/* An IDENTIFIER, like payloadtypename, so generates warnings
	                (unless backtrack=true) */
|
	annotationname ':' payloadtypename		# annotPayloadTypeName
|
	annotationname ':' parametername		# annotParamName
;


/**
 * Section 3.6 Protocol Declarations
 */
protocoldecl:
	globalprotocoldecl	# glProtocolDecl
|
	localprotocoldecl	# lcProtocolDecl
;

choiceannot:
    LINE_COMMENT AT CHOICENAMEKW '(' choiceannotationname')'
;

/**
 * Section 3.7 Global Protocol Declarations
 */
globalprotocoldecl:
	globalprotocolheader globalprotocoldefinition
|
	globalprotocolheader globalprotocolinstance
;

globalprotocolheader:  // Currently, header is not an explicit category
	GLOBALKW PROTOCOLKW protocolname roledecllist
|
	GLOBALKW PROTOCOLKW protocolname parameterdecllist roledecllist
;

roledecllist:
	'(' roledecl (',' roledecl)* ')'
;

roledecl:
	ROLEKW rolename
|
	ROLEKW rolename ASKW rolename
|
    SELFKW rolename
;

parameterdecllist:
	'<' parameterdecl (',' parameterdecl)* '>'
;

parameterdecl:
	 TYPEKW parametername
|
	 TYPEKW parametername ASKW parametername
|
	 SIGKW parametername
|
	 SIGKW parametername ASKW parametername
;


/**
 * Section 3.7.1 Global Protocol Definitions
 */
globalprotocoldefinition:
	globalprotocolblock
;


/**
 * Section 3.7.2 Global Protocol Instantiation
 */
globalprotocolinstance:
	INSTANTIATESKW membername roleinstantiationlist ';'
|
	INSTANTIATESKW membername argumentlist roleinstantiationlist ';'
;

roleinstantiationlist:
	'(' roleinstantiation (',' roleinstantiation)* ')'
;

roleinstantiation:
	rolename
|
	rolename ASKW rolename
;

argumentlist:
	'<' argument (',' argument)* '>'
;

argument:
	messagesignature
|
	messagesignature ASKW parametername
|
	payloadtypename
|
	payloadtypename ASKW parametername
|
	parametername  // generates warnings unless backtrack=true
|
	parametername ASKW parametername
;


/**
 * Section 3.7.3 Global Interaction Sequences and Blocks
 */
globalprotocolblock:
	'{' globalinteractionsequence '}'
;

globalinteractionsequence:
	(globalinteraction)*
;

globalinteraction:
	globalmessagetransfer
|
	globalchoice
|
	globalrecursion
|
	globalcontinue
|
	globalparallel
|
	globalinterruptible
|
	globaldo
|
    globalconnect
|
    globaldisconnect
|
    globalwrap
/*|
	globalspawn*/
;


/**
 * Section 3.7.4 Global Message Transfer
 */
globalmessagetransfer:
	message FROMKW rolename TOKW rolename (',' rolename )* ';'
;

message:
	messagesignature
;

globalconnect:
	message CONNECTKW rolename TOKW rolename ';' // includes empty message
;

globaldisconnect:
	DISCONNECTKW rolename ANDKW rolename ';'
;

globalwrap:
    WRAPKW rolename TOKW rolename ';'
;

/**
 * Section 3.7.5 Global Choice
 */
globalchoice:
	choiceannot? CHOICEKW ATKW rolename globalprotocolblock (ORKW globalprotocolblock)*
;


/**
 * Section 3.7.6 Global Recursion
 */
globalrecursion:
	RECKW recursionlabelname globalprotocolblock
;

globalcontinue:
	CONTINUEKW recursionlabelname ';'
;


/**
 * Section 3.7.7 Global Parallel
 */
globalparallel:
	PARKW globalprotocolblock (ANDKW globalprotocolblock)*
;


/**
 * Section 3.7.8 Global Interruptible
 */
globalinterruptible:
	INTERRUPTIBLEKW globalprotocolblock WITHKW '{' (globalinterrupt)* '}'
|
	INTERRUPTIBLEKW scopename ':' globalprotocolblock WITHKW '{' (globalinterrupt)* '}'
;

globalinterrupt:
	message (',' message)* BYKW rolename ';'
;


/**
 * Section 3.7.9 Global Do
 */
globaldo:
	DOKW membername roleinstantiationlist ';'
|
	DOKW membername argumentlist roleinstantiationlist ';'
|
	DOKW scopename ':' membername roleinstantiationlist ';'
|
	DOKW scopename ':' membername argumentlist roleinstantiationlist ';'
;


/*
 * Section 3.8 Local Protocol Declarations
 */
localprotocoldecl:
	localprotocolheader localprotocoldefinition	# stndLocalProtocolDecl
|
	localprotocolheader localprotocolinstance	# instLocalProtocolDecl
;

// Old localprotocolheader, using keyword at
//localprotocolheader:
//	LOCALKW PROTOCOLKW protocolname ATKW rolename roledecllist						# stndLocalProtocolHeader
//|
//	LOCALKW PROTOCOLKW protocolname ATKW rolename parameterdecllist roledecllist	# paramLocalProtocolHeader
//;

localprotocolheader:
	LOCALKW PROTOCOLKW protocolname roledecllist                                        # stndLocalProtocolHeader
|
	LOCALKW PROTOCOLKW protocolname ATKW rolename roledecllist						# stndLocalProtocolHeader
|
	LOCALKW PROTOCOLKW protocolname parameterdecllist roledecllist                      # paramLocalProtocolHeader
|
  	LOCALKW PROTOCOLKW protocolname ATKW rolename parameterdecllist roledecllist	# paramLocalProtocolHeader
;

/**
 * Section 3.8.1 Local Protocol Definitions
 */
localprotocoldefinition:
	localprotocolblock
;


/**
 * Section 3.8.2 Local Protocol Instantiation
 */
localprotocolinstance:
	INSTANTIATESKW membername roleinstantiationlist ';'
|
	INSTANTIATESKW membername argumentlist roleinstantiationlist ';'
;


/**
 * Section 3.8.3 Local Interaction Blocks and Sequences
 */
localprotocolblock:
	'{' (localinteraction)* '}'
;

//localinteractionsequence:
//	(localinteraction)*
//;

localinteraction:
	localsend
|
	localreceive
|
	localchoice
|
	localparallel
|
	localrecursion
|
	localcontinue
|
	localinterruptible
|
	localdo
|
    localsendwrap
|
    localreceivewrap
|
    localconnect
|
    localaccept
|
   localdisconnect
/*|
	localspawn*/
;


/**
 * Section 3.8.4 Local Send and Receive
 */
// This is where I will add new stuff 
localsend:
	'[' timeconstraint ']' messagesignature TOKW rolename (',' rolename)* ';'
|
	messagesignature TOKW rolename (',' rolename)* ';'
;

localreceive:
	'[' timeconstraint ']' messagesignature FROMKW IDENTIFIER ';'
| 
	messagesignature FROMKW IDENTIFIER ';'
;

localsendwrap:
    WRAPKW TOKW rolename ';'
;

localreceivewrap:
    WRAPKW FROMKW rolename ';'
;

localconnect:
    messagesignature CONNECTKW rolename ';'
;

localaccept:
    messagesignature ACCEPTKW rolename ';'
;

localdisconnect:
    DISCONNECTKW rolename ';'
;
/**
 * Section 3.8.5 Local Choice
 */
localchoice:
	choiceannot? CHOICEKW ATKW rolename localprotocolblock (ORKW localprotocolblock)*
;


/**
 * Section 3.8.6 Local Recursion
 */
localrecursion:
	RECKW recursionlabelname localprotocolblock
;

localcontinue:
	CONTINUEKW recursionlabelname ';'
;


/**
 * Section 3.8.7 Local Parallel
 */
localparallel:
	PARKW localprotocolblock (ANDKW localprotocolblock)*
;


/**
 * Section 3.8.8 Local Interruptible
 */
localinterruptible:
	INTERRUPTIBLEKW scopename ':' localprotocolblock WITHKW '{' (localcatch)* '}'
|
	INTERRUPTIBLEKW scopename ':' localprotocolblock WITHKW '{' localthrow (localcatch)* '}'
;

/*localthrowandorcatch:
	localthrow (localcatch)*
|
	(localcatch)+
;*/

localthrow:
	THROWSKW message (',' message)* TOKW rolename (',' rolename)* ';'
;

localcatch:
	CATCHESKW message (',' message)* FROMKW rolename ';'
;


/**
 * Section 3.8.9 Local Do
 */
localdo:
	DOKW membername roleinstantiationlist ';'
|
	DOKW membername argumentlist roleinstantiationlist ';'
|
	DOKW scopename ':' membername roleinstantiationlist ';'
|
	DOKW scopename ':' membername argumentlist roleinstantiationlist ';'
;


/**
 * Time Constraints 
 */
timeconstraint:
	constraintspec	
| 
	constraintspec ',' resetpredicate 
;

constraintspec:
	AT rolename ':' clockconstraint
;

clockconstraint:
	ROUNDLEFT clockconstraint ROUNDRIGHT	#ordering
|
	BOOL	#bool
|
	clockid ANGLERIGHT clockconst	#gt
| 
	clockid ANGLELEFT clockconst	#lt
|
	clockid '=' clockconst	#eq
| 
	clockid '<=' clockconst	#lteq
| 
	clockid '>=' clockconst	#gteq
| 
	'!' clockconstraint	#not
|
	clockconstraint '&' clockconstraint	#and
|
	clockconstraint '|' clockconstraint	#or
;

resetpredicate:
	'reset' ROUNDLEFT resetpredlist ROUNDRIGHT
;

resetpredlist:
	clockid
| 
	clockid ',' resetpredlist 
;




