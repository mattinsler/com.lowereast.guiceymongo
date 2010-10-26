// $ANTLR 3.2 Sep 23, 2009 14:05:07 com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g 2010-10-26 13:54:02

package com.lowereast.guiceymongo.data.generator.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GuiceyDataParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATA", "TYPE_MAP", "TYPE_SET", "TYPE_LIST", "PARAMETERIZED_TYPE", "TYPE_PRIMITIVE", "PROPERTY", "OPTION", "COMMENT", "PAIR", "ENUM", "ID", "INT", "FLOAT", "STRING", "TYPE", "WS", "EXPONENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'{'", "'}'", "'{}'", "','", "'/*'", "'*/'", "'['", "']'", "'('", "')]'", "'='", "'data;'", "';'", "'map<'", "'>'", "'set<'", "'list<'", "'<'"
    };
    public static final int EXPONENT=21;
    public static final int T__29=29;
    public static final int OPTION=11;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int OCTAL_ESC=25;
    public static final int FLOAT=17;
    public static final int TYPE_LIST=7;
    public static final int ID=15;
    public static final int EOF=-1;
    public static final int TYPE_PRIMITIVE=9;
    public static final int TYPE=19;
    public static final int ESC_SEQ=22;
    public static final int TYPE_MAP=5;
    public static final int PAIR=13;
    public static final int COMMENT=12;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int UNICODE_ESC=24;
    public static final int HEX_DIGIT=23;
    public static final int INT=16;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int PARAMETERIZED_TYPE=8;
    public static final int T__33=33;
    public static final int WS=20;
    public static final int T__34=34;
    public static final int ENUM=14;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int PROPERTY=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int TYPE_SET=6;
    public static final int DATA=4;
    public static final int STRING=18;

    // delegates
    // delegators


        public GuiceyDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GuiceyDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GuiceyDataParser.tokenNames; }
    public String getGrammarFileName() { return "com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:31:1: start : ( entry )+ EOF ;
    public final GuiceyDataParser.start_return start() throws RecognitionException {
        GuiceyDataParser.start_return retval = new GuiceyDataParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        GuiceyDataParser.entry_return entry1 = null;


        Object EOF2_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:32:2: ( ( entry )+ EOF )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:32:4: ( entry )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:32:4: ( entry )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case DATA:
                case ENUM:
                case 30:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: entry
            	    {
            	    pushFollow(FOLLOW_entry_in_start121);
            	    entry1=entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start124); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = (Object)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entry"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:35:1: entry : ( data | enumeration );
    public final GuiceyDataParser.entry_return entry() throws RecognitionException {
        GuiceyDataParser.entry_return retval = new GuiceyDataParser.entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.data_return data3 = null;

        GuiceyDataParser.enumeration_return enumeration4 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:36:2: ( data | enumeration )
            int alt2=2;
            switch ( input.LA(1) ) {
            case DATA:
            case 30:
                {
                alt2=1;
                }
                break;
            case ENUM:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:36:4: data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_in_entry135);
                    data3=data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data3.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:4: enumeration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_entry140);
                    enumeration4=enumeration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumeration4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entry"

    public static class data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:40:1: data : ( ( javadoc )? DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( javadoc )? ( data_entry )* ) | ( javadoc )? DATA ID '{}' -> ^( DATA ID ( javadoc )? ) );
    public final GuiceyDataParser.data_return data() throws RecognitionException {
        GuiceyDataParser.data_return retval = new GuiceyDataParser.data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA6=null;
        Token ID7=null;
        Token char_literal8=null;
        Token char_literal10=null;
        Token DATA12=null;
        Token ID13=null;
        Token string_literal14=null;
        GuiceyDataParser.javadoc_return javadoc5 = null;

        GuiceyDataParser.data_entry_return data_entry9 = null;

        GuiceyDataParser.javadoc_return javadoc11 = null;


        Object DATA6_tree=null;
        Object ID7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal10_tree=null;
        Object DATA12_tree=null;
        Object ID13_tree=null;
        Object string_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        RewriteRuleSubtreeStream stream_javadoc=new RewriteRuleSubtreeStream(adaptor,"rule javadoc");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:2: ( ( javadoc )? DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( javadoc )? ( data_entry )* ) | ( javadoc )? DATA ID '{}' -> ^( DATA ID ( javadoc )? ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:4: ( javadoc )? DATA ID '{' ( data_entry )* '}'
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:4: ( javadoc )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt3=1;
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_data151);
                            javadoc5=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc5.getTree());

                            }
                            break;

                    }

                    DATA6=(Token)match(input,DATA,FOLLOW_DATA_in_data154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA6);

                    ID7=(Token)match(input,ID,FOLLOW_ID_in_data156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID7);

                    char_literal8=(Token)match(input,26,FOLLOW_26_in_data158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal8);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:25: ( data_entry )*
                    loop4:
                    do {
                        int alt4=2;
                        switch ( input.LA(1) ) {
                        case DATA:
                        case ENUM:
                        case ID:
                        case TYPE:
                        case 30:
                        case 32:
                        case 39:
                        case 41:
                        case 42:
                            {
                            alt4=1;
                            }
                            break;

                        }

                        switch (alt4) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: data_entry
                    	    {
                    	    pushFollow(FOLLOW_data_entry_in_data160);
                    	    data_entry9=data_entry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_entry.add(data_entry9.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    char_literal10=(Token)match(input,27,FOLLOW_27_in_data163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal10);



                    // AST REWRITE
                    // elements: ID, DATA, data_entry, javadoc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:41: -> ^( DATA ID ( javadoc )? ( data_entry )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:44: ^( DATA ID ( javadoc )? ( data_entry )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:54: ( javadoc )?
                        if ( stream_javadoc.hasNext() ) {
                            adaptor.addChild(root_1, stream_javadoc.nextTree());

                        }
                        stream_javadoc.reset();
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:63: ( data_entry )*
                        while ( stream_data_entry.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_entry.nextTree());

                        }
                        stream_data_entry.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:4: ( javadoc )? DATA ID '{}'
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:4: ( javadoc )?
                    int alt5=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt5=1;
                            }
                            break;
                    }

                    switch (alt5) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_data182);
                            javadoc11=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc11.getTree());

                            }
                            break;

                    }

                    DATA12=(Token)match(input,DATA,FOLLOW_DATA_in_data185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA12);

                    ID13=(Token)match(input,ID,FOLLOW_ID_in_data187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID13);

                    string_literal14=(Token)match(input,28,FOLLOW_28_in_data189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(string_literal14);



                    // AST REWRITE
                    // elements: javadoc, ID, DATA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:26: -> ^( DATA ID ( javadoc )? )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:29: ^( DATA ID ( javadoc )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:39: ( javadoc )?
                        if ( stream_javadoc.hasNext() ) {
                            adaptor.addChild(root_1, stream_javadoc.nextTree());

                        }
                        stream_javadoc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data"

    public static class enumeration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumeration"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:45:1: enumeration : ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM15=null;
        Token ID16=null;
        Token string_literal17=null;
        Token ENUM18=null;
        Token ID19=null;
        Token char_literal20=null;
        Token ID21=null;
        Token char_literal22=null;
        Token ID23=null;
        Token char_literal24=null;

        Object ENUM15_tree=null;
        Object ID16_tree=null;
        Object string_literal17_tree=null;
        Object ENUM18_tree=null;
        Object ID19_tree=null;
        Object char_literal20_tree=null;
        Object ID21_tree=null;
        Object char_literal22_tree=null;
        Object ID23_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:2: ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt8=1;
                        }
                        break;
                    case 26:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:4: ENUM ID '{}'
                    {
                    ENUM15=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM15);

                    ID16=(Token)match(input,ID,FOLLOW_ID_in_enumeration213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID16);

                    string_literal17=(Token)match(input,28,FOLLOW_28_in_enumeration215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(string_literal17);



                    // AST REWRITE
                    // elements: ID, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:17: -> ^( ENUM ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:20: ^( ENUM ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:4: ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    ENUM18=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM18);

                    ID19=(Token)match(input,ID,FOLLOW_ID_in_enumeration230); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID19);

                    char_literal20=(Token)match(input,26,FOLLOW_26_in_enumeration232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal20);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:16: ( ID ',' )*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 29:
                                {
                                alt7=1;
                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:17: ID ','
                    	    {
                    	    ID21=(Token)match(input,ID,FOLLOW_ID_in_enumeration235); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID21);

                    	    char_literal22=(Token)match(input,29,FOLLOW_29_in_enumeration237); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal22);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    ID23=(Token)match(input,ID,FOLLOW_ID_in_enumeration241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID23);

                    char_literal24=(Token)match(input,27,FOLLOW_27_in_enumeration243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal24);



                    // AST REWRITE
                    // elements: ID, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:33: -> ^( ENUM ( ID )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:36: ^( ENUM ( ID )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumeration"

    public static class data_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_entry"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:50:1: data_entry : ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) );
    public final GuiceyDataParser.data_entry_return data_entry() throws RecognitionException {
        GuiceyDataParser.data_entry_return retval = new GuiceyDataParser.data_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.entry_return entry25 = null;

        GuiceyDataParser.javadoc_return javadoc26 = null;

        GuiceyDataParser.option_return option27 = null;

        GuiceyDataParser.property_return property28 = null;


        RewriteRuleSubtreeStream stream_javadoc=new RewriteRuleSubtreeStream(adaptor,"rule javadoc");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:51:2: ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:51:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry263);
                    entry25=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry25.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:4: ( javadoc )? ( option )* property
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:4: ( javadoc )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_data_entry268);
                            javadoc26=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc26.getTree());

                            }
                            break;

                    }

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:13: ( option )*
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry271);
                    	    option27=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry274);
                    property28=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property28.getTree());


                    // AST REWRITE
                    // elements: property, option, javadoc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:30: -> ^( property ( javadoc )? ( option )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:33: ^( property ( javadoc )? ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:44: ( javadoc )?
                        if ( stream_javadoc.hasNext() ) {
                            adaptor.addChild(root_1, stream_javadoc.nextTree());

                        }
                        stream_javadoc.reset();
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:53: ( option )*
                        while ( stream_option.hasNext() ) {
                            adaptor.addChild(root_1, stream_option.nextTree());

                        }
                        stream_option.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data_entry"

    public static class javadoc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "javadoc"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:55:1: javadoc : '/*' comment '*/' -> ^( COMMENT comment ) ;
    public final GuiceyDataParser.javadoc_return javadoc() throws RecognitionException {
        GuiceyDataParser.javadoc_return retval = new GuiceyDataParser.javadoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal29=null;
        Token string_literal31=null;
        GuiceyDataParser.comment_return comment30 = null;


        Object string_literal29_tree=null;
        Object string_literal31_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:2: ( '/*' comment '*/' -> ^( COMMENT comment ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:4: '/*' comment '*/'
            {
            string_literal29=(Token)match(input,30,FOLLOW_30_in_javadoc297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal29);

            pushFollow(FOLLOW_comment_in_javadoc299);
            comment30=comment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_comment.add(comment30.getTree());
            string_literal31=(Token)match(input,31,FOLLOW_31_in_javadoc301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(string_literal31);



            // AST REWRITE
            // elements: comment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:22: -> ^( COMMENT comment )
            {
                // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:25: ^( COMMENT comment )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMENT, "COMMENT"), root_1);

                adaptor.addChild(root_1, stream_comment.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "javadoc"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:59:1: comment : (~ ( '*/' ) )* ;
    public final GuiceyDataParser.comment_return comment() throws RecognitionException {
        GuiceyDataParser.comment_return retval = new GuiceyDataParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:2: ( (~ ( '*/' ) )* )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:4: (~ ( '*/' ) )*
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:4: (~ ( '*/' ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case DATA:
                case TYPE_MAP:
                case TYPE_SET:
                case TYPE_LIST:
                case PARAMETERIZED_TYPE:
                case TYPE_PRIMITIVE:
                case PROPERTY:
                case OPTION:
                case COMMENT:
                case PAIR:
                case ENUM:
                case ID:
                case INT:
                case FLOAT:
                case STRING:
                case TYPE:
                case WS:
                case EXPONENT:
                case ESC_SEQ:
                case HEX_DIGIT:
                case UNICODE_ESC:
                case OCTAL_ESC:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: ~ ( '*/' )
            	    {
            	    set32=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DATA && input.LA(1)<=30)||(input.LA(1)>=32 && input.LA(1)<=43) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set32));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comment"

    public static class option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:63:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
    public final GuiceyDataParser.option_return option() throws RecognitionException {
        GuiceyDataParser.option_return retval = new GuiceyDataParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        Token ID34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token ID37=null;
        Token char_literal38=null;
        Token string_literal40=null;
        Token char_literal41=null;
        Token ID42=null;
        Token char_literal43=null;
        Token char_literal45=null;
        Token string_literal47=null;
        GuiceyDataParser.value_return value39 = null;

        GuiceyDataParser.pair_return pair44 = null;

        GuiceyDataParser.pair_return pair46 = null;


        Object char_literal33_tree=null;
        Object ID34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal36_tree=null;
        Object ID37_tree=null;
        Object char_literal38_tree=null;
        Object string_literal40_tree=null;
        Object char_literal41_tree=null;
        Object ID42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        Object string_literal47_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt14=1;
                        }
                        break;
                    case 34:
                        {
                        switch ( input.LA(4) ) {
                        case INT:
                        case FLOAT:
                        case STRING:
                            {
                            alt14=2;
                            }
                            break;
                        case ID:
                            {
                            alt14=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:4: '[' ID ']'
                    {
                    char_literal33=(Token)match(input,32,FOLLOW_32_in_option337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal33);

                    ID34=(Token)match(input,ID,FOLLOW_ID_in_option339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);

                    char_literal35=(Token)match(input,33,FOLLOW_33_in_option341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(char_literal35);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:15: -> ^( OPTION ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:18: ^( OPTION ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:65:4: '[' ID '(' value ')]'
                    {
                    char_literal36=(Token)match(input,32,FOLLOW_32_in_option354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal36);

                    ID37=(Token)match(input,ID,FOLLOW_ID_in_option356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID37);

                    char_literal38=(Token)match(input,34,FOLLOW_34_in_option358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal38);

                    pushFollow(FOLLOW_value_in_option360);
                    value39=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value39.getTree());
                    string_literal40=(Token)match(input,35,FOLLOW_35_in_option362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal40);



                    // AST REWRITE
                    // elements: ID, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:26: -> ^( OPTION ID value )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:65:29: ^( OPTION ID value )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal41=(Token)match(input,32,FOLLOW_32_in_option378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal41);

                    ID42=(Token)match(input,ID,FOLLOW_ID_in_option380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID42);

                    char_literal43=(Token)match(input,34,FOLLOW_34_in_option382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal43);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:15: ( pair ',' )*
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 36:
                                {
                                switch ( input.LA(3) ) {
                                case INT:
                                case FLOAT:
                                case STRING:
                                    {
                                    switch ( input.LA(4) ) {
                                    case 29:
                                        {
                                        alt13=1;
                                        }
                                        break;

                                    }

                                    }
                                    break;

                                }

                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option385);
                    	    pair44=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair44.getTree());
                    	    char_literal45=(Token)match(input,29,FOLLOW_29_in_option387); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal45);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option391);
                    pair46=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair46.getTree());
                    string_literal47=(Token)match(input,35,FOLLOW_35_in_option393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal47);



                    // AST REWRITE
                    // elements: pair, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:40: ^( OPTION ID ( pair )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        if ( !(stream_pair.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_pair.hasNext() ) {
                            adaptor.addChild(root_1, stream_pair.nextTree());

                        }
                        stream_pair.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pair"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:70:1: pair : key '=' value -> ^( PAIR key value ) ;
    public final GuiceyDataParser.pair_return pair() throws RecognitionException {
        GuiceyDataParser.pair_return retval = new GuiceyDataParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        GuiceyDataParser.key_return key48 = null;

        GuiceyDataParser.value_return value50 = null;


        Object char_literal49_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:2: ( key '=' value -> ^( PAIR key value ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair416);
            key48=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key48.getTree());
            char_literal49=(Token)match(input,36,FOLLOW_36_in_pair418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal49);

            pushFollow(FOLLOW_value_in_pair420);
            value50=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value50.getTree());


            // AST REWRITE
            // elements: key, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:18: -> ^( PAIR key value )
            {
                // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:21: ^( PAIR key value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_key.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pair"

    public static class key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:74:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID51=null;

        Object ID51_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:75:2: ( ID )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:75:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID51=(Token)match(input,ID,FOLLOW_ID_in_key442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID51_tree = (Object)adaptor.create(ID51);
            adaptor.addChild(root_0, ID51_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:77:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:78:2: ( INT | FLOAT | STRING )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set52=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set52));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:83:1: property : ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal54=null;
        Token ID56=null;
        Token char_literal57=null;
        GuiceyDataParser.type_return type53 = null;

        GuiceyDataParser.type_return type55 = null;


        Object string_literal54_tree=null;
        Object ID56_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred19_GuiceyData()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred19_GuiceyData()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred19_GuiceyData()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred19_GuiceyData()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA15_5 = input.LA(2);

                if ( (synpred19_GuiceyData()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property476);
                    type53=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type53.getTree());
                    string_literal54=(Token)match(input,37,FOLLOW_37_in_property478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal54);



                    // AST REWRITE
                    // elements: DATA, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:17: -> ^( PROPERTY 'data' type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:20: ^( PROPERTY 'data' type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DATA, "DATA"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:92:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property493);
                    type55=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type55.getTree());
                    ID56=(Token)match(input,ID,FOLLOW_ID_in_property495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID56);

                    char_literal57=(Token)match(input,38,FOLLOW_38_in_property497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal57);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:16: -> ^( PROPERTY ID type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:92:19: ^( PROPERTY ID type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "property"

    public static class key_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:95:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type58 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type518);
            type58=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type58.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key_type"

    public static class value_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:99:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type59 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:100:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:100:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type529);
            type59=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type59.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value_type"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:103:1: type : ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token string_literal65=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token char_literal70=null;
        Token TYPE71=null;
        Token ID72=null;
        Token ID73=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        GuiceyDataParser.type_return type61 = null;

        GuiceyDataParser.type_return type63 = null;

        GuiceyDataParser.type_return type66 = null;

        GuiceyDataParser.type_return type69 = null;

        GuiceyDataParser.type_return type75 = null;

        GuiceyDataParser.type_return type77 = null;


        Object string_literal60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        Object char_literal70_tree=null;
        Object TYPE71_tree=null;
        Object ID72_tree=null;
        Object ID73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:104:2: ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 41:
                {
                alt17=2;
                }
                break;
            case 42:
                {
                alt17=3;
                }
                break;
            case TYPE:
                {
                alt17=4;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt17=6;
                    }
                    break;
                case EOF:
                case ID:
                case 29:
                case 37:
                case 40:
                    {
                    alt17=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:104:4: 'map<' type ',' type '>'
                    {
                    string_literal60=(Token)match(input,39,FOLLOW_39_in_type540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal60);

                    pushFollow(FOLLOW_type_in_type542);
                    type61=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type61.getTree());
                    char_literal62=(Token)match(input,29,FOLLOW_29_in_type544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal62);

                    pushFollow(FOLLOW_type_in_type546);
                    type63=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type63.getTree());
                    char_literal64=(Token)match(input,40,FOLLOW_40_in_type548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal64);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:29: -> TYPE_MAP ( type )+
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_MAP, "TYPE_MAP"));
                        if ( !(stream_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_type.hasNext() ) {
                            adaptor.addChild(root_0, stream_type.nextTree());

                        }
                        stream_type.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:105:4: 'set<' type '>'
                    {
                    string_literal65=(Token)match(input,41,FOLLOW_41_in_type560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal65);

                    pushFollow(FOLLOW_type_in_type562);
                    type66=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type66.getTree());
                    char_literal67=(Token)match(input,40,FOLLOW_40_in_type564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal67);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:20: -> TYPE_SET type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:106:4: 'list<' type '>'
                    {
                    string_literal68=(Token)match(input,42,FOLLOW_42_in_type575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal68);

                    pushFollow(FOLLOW_type_in_type577);
                    type69=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type69.getTree());
                    char_literal70=(Token)match(input,40,FOLLOW_40_in_type579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal70);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:21: -> TYPE_LIST type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:107:4: TYPE
                    {
                    TYPE71=(Token)match(input,TYPE,FOLLOW_TYPE_in_type590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE71);



                    // AST REWRITE
                    // elements: TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:9: -> TYPE_PRIMITIVE TYPE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_TYPE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:108:4: ID
                    {
                    ID72=(Token)match(input,ID,FOLLOW_ID_in_type601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID72);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:7: -> TYPE_PRIMITIVE ID
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:109:4: ID '<' type ( ',' type )* '>'
                    {
                    ID73=(Token)match(input,ID,FOLLOW_ID_in_type612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID73);

                    char_literal74=(Token)match(input,43,FOLLOW_43_in_type614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(char_literal74);

                    pushFollow(FOLLOW_type_in_type616);
                    type75=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type75.getTree());
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:109:16: ( ',' type )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:109:17: ',' type
                    	    {
                    	    char_literal76=(Token)match(input,29,FOLLOW_29_in_type619); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal76);

                    	    pushFollow(FOLLOW_type_in_type621);
                    	    type77=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(type77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    char_literal78=(Token)match(input,40,FOLLOW_40_in_type625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal78);



                    // AST REWRITE
                    // elements: type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:32: -> PARAMETERIZED_TYPE ID ( type )+
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(PARAMETERIZED_TYPE, "PARAMETERIZED_TYPE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());
                        if ( !(stream_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_type.hasNext() ) {
                            adaptor.addChild(root_0, stream_type.nextTree());

                        }
                        stream_type.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred19_GuiceyData
    public final void synpred19_GuiceyData_fragment() throws RecognitionException {   
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: ( type 'data;' )
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred19_GuiceyData476);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred19_GuiceyData478); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_GuiceyData

    // Delegated rules

    public final boolean synpred19_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_GuiceyData_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA6_eotS =
        "\10\uffff";
    static final String DFA6_eofS =
        "\10\uffff";
    static final String DFA6_minS =
        "\2\4\1\17\2\4\1\32\2\uffff";
    static final String DFA6_maxS =
        "\1\36\1\53\1\17\1\53\1\4\1\34\2\uffff";
    static final String DFA6_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\10\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\31\uffff\1\1",
            "\33\3\1\4\14\3",
            "\1\5",
            "\33\3\1\4\14\3",
            "\1\2",
            "\1\6\1\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "40:1: data : ( ( javadoc )? DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( javadoc )? ( data_entry )* ) | ( javadoc )? DATA ID '{}' -> ^( DATA ID ( javadoc )? ) );";
        }
    }
    static final String DFA11_eotS =
        "\6\uffff";
    static final String DFA11_eofS =
        "\6\uffff";
    static final String DFA11_minS =
        "\2\4\2\uffff\2\4";
    static final String DFA11_maxS =
        "\1\52\1\53\2\uffff\1\53\1\52";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA11_specialS =
        "\6\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\11\uffff\1\2\1\3\3\uffff\1\3\12\uffff\1\1\1\uffff\1\3"+
            "\6\uffff\1\3\1\uffff\2\3",
            "\33\4\1\5\14\4",
            "",
            "",
            "\33\4\1\5\14\4",
            "\1\2\12\uffff\1\3\3\uffff\1\3\14\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\2\3"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "50:1: data_entry : ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) );";
        }
    }
 

    public static final BitSet FOLLOW_entry_in_start121 = new BitSet(new long[]{0x0000000040004010L});
    public static final BitSet FOLLOW_EOF_in_start124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_entry135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_entry140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_data151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DATA_in_data154 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_data156 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data158 = new BitSet(new long[]{0x000006814808C010L});
    public static final BitSet FOLLOW_data_entry_in_data160 = new BitSet(new long[]{0x000006814808C010L});
    public static final BitSet FOLLOW_27_in_data163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_data182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DATA_in_data185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_data187 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_data189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration211 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration213 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_enumeration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration230 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration232 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_enumeration237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration241 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_data_entry268 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_option_in_data_entry271 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_property_in_data_entry274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_javadoc297 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_comment_in_javadoc299 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_javadoc301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comment320 = new BitSet(new long[]{0x00000FFF7FFFFFF2L});
    public static final BitSet FOLLOW_32_in_option337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option339 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_option341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option356 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option358 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_option360 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option378 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option380 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option382 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option385 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option391 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_pair418 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_pair420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property476 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_property478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_property495 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_property497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type540 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type542 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_type544 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type546 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_type560 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type562 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_type575 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type577 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type612 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_type614 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type616 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_type619 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type621 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_40_in_type625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred19_GuiceyData476 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred19_GuiceyData478 = new BitSet(new long[]{0x0000000000000002L});

}