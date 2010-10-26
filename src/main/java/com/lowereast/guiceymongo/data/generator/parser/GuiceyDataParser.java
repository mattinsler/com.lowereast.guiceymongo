// $ANTLR 3.2 Sep 23, 2009 14:05:07 com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g 2010-10-26 09:34:13

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
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:31:7: ( ( entry )+ EOF )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:31:9: ( entry )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:31:9: ( entry )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case DATA:
                case ENUM:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: entry
            	    {
            	    pushFollow(FOLLOW_entry_in_start120);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start123); if (state.failed) return retval;
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:34:1: entry : ( data | enumeration );
    public final GuiceyDataParser.entry_return entry() throws RecognitionException {
        GuiceyDataParser.entry_return retval = new GuiceyDataParser.entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.data_return data3 = null;

        GuiceyDataParser.enumeration_return enumeration4 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:34:7: ( data | enumeration )
            int alt2=2;
            switch ( input.LA(1) ) {
            case DATA:
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:34:9: data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_in_entry133);
                    data3=data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data3.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:35:4: enumeration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_entry138);
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:1: data : ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) );
    public final GuiceyDataParser.data_return data() throws RecognitionException {
        GuiceyDataParser.data_return retval = new GuiceyDataParser.data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token DATA10=null;
        Token ID11=null;
        Token string_literal12=null;
        GuiceyDataParser.data_entry_return data_entry8 = null;


        Object DATA5_tree=null;
        Object ID6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object DATA10_tree=null;
        Object ID11_tree=null;
        Object string_literal12_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:6: ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case DATA:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt4=1;
                        }
                        break;
                    case 28:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:8: DATA ID '{' ( data_entry )* '}'
                    {
                    DATA5=(Token)match(input,DATA,FOLLOW_DATA_in_data148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA5);

                    ID6=(Token)match(input,ID,FOLLOW_ID_in_data150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID6);

                    char_literal7=(Token)match(input,26,FOLLOW_26_in_data152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal7);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:20: ( data_entry )*
                    loop3:
                    do {
                        int alt3=2;
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
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: data_entry
                    	    {
                    	    pushFollow(FOLLOW_data_entry_in_data154);
                    	    data_entry8=data_entry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_entry.add(data_entry8.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    char_literal9=(Token)match(input,27,FOLLOW_27_in_data157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal9);



                    // AST REWRITE
                    // elements: DATA, data_entry, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:36: -> ^( DATA ID ( data_entry )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:39: ^( DATA ID ( data_entry )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:49: ( data_entry )*
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:39:4: DATA ID '{}'
                    {
                    DATA10=(Token)match(input,DATA,FOLLOW_DATA_in_data173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_data175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    string_literal12=(Token)match(input,28,FOLLOW_28_in_data177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(string_literal12);



                    // AST REWRITE
                    // elements: ID, DATA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:17: -> ^( DATA ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:39:20: ^( DATA ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:1: enumeration : ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM13=null;
        Token ID14=null;
        Token string_literal15=null;
        Token ENUM16=null;
        Token ID17=null;
        Token char_literal18=null;
        Token ID19=null;
        Token char_literal20=null;
        Token ID21=null;
        Token char_literal22=null;

        Object ENUM13_tree=null;
        Object ID14_tree=null;
        Object string_literal15_tree=null;
        Object ENUM16_tree=null;
        Object ID17_tree=null;
        Object char_literal18_tree=null;
        Object ID19_tree=null;
        Object char_literal20_tree=null;
        Object ID21_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:2: ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt6=1;
                        }
                        break;
                    case 26:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:4: ENUM ID '{}'
                    {
                    ENUM13=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM13);

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_enumeration198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    string_literal15=(Token)match(input,28,FOLLOW_28_in_enumeration200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(string_literal15);



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
                    // 43:17: -> ^( ENUM ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:20: ^( ENUM ID )
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:44:4: ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    ENUM16=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM16);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_enumeration215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID17);

                    char_literal18=(Token)match(input,26,FOLLOW_26_in_enumeration217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal18);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:44:16: ( ID ',' )*
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 29:
                                {
                                alt5=1;
                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:44:17: ID ','
                    	    {
                    	    ID19=(Token)match(input,ID,FOLLOW_ID_in_enumeration220); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID19);

                    	    char_literal20=(Token)match(input,29,FOLLOW_29_in_enumeration222); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal20);


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    ID21=(Token)match(input,ID,FOLLOW_ID_in_enumeration226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID21);

                    char_literal22=(Token)match(input,27,FOLLOW_27_in_enumeration228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal22);



                    // AST REWRITE
                    // elements: ENUM, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 44:33: -> ^( ENUM ( ID )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:44:36: ^( ENUM ( ID )+ )
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:1: data_entry : ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) );
    public final GuiceyDataParser.data_entry_return data_entry() throws RecognitionException {
        GuiceyDataParser.data_entry_return retval = new GuiceyDataParser.data_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.entry_return entry23 = null;

        GuiceyDataParser.javadoc_return javadoc24 = null;

        GuiceyDataParser.option_return option25 = null;

        GuiceyDataParser.property_return property26 = null;


        RewriteRuleSubtreeStream stream_javadoc=new RewriteRuleSubtreeStream(adaptor,"rule javadoc");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:2: ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case DATA:
            case ENUM:
                {
                alt9=1;
                }
                break;
            case ID:
            case TYPE:
            case 30:
            case 32:
            case 39:
            case 41:
            case 42:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry248);
                    entry23=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry23.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:4: ( javadoc )? ( option )* property
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:4: ( javadoc )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt7=1;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_data_entry253);
                            javadoc24=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc24.getTree());

                            }
                            break;

                    }

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:13: ( option )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry256);
                    	    option25=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry259);
                    property26=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property26.getTree());


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
                    // 49:30: -> ^( property ( javadoc )? ( option )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:33: ^( property ( javadoc )? ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:44: ( javadoc )?
                        if ( stream_javadoc.hasNext() ) {
                            adaptor.addChild(root_1, stream_javadoc.nextTree());

                        }
                        stream_javadoc.reset();
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:49:53: ( option )*
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:1: javadoc : '/*' comment '*/' -> ^( COMMENT comment ) ;
    public final GuiceyDataParser.javadoc_return javadoc() throws RecognitionException {
        GuiceyDataParser.javadoc_return retval = new GuiceyDataParser.javadoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token string_literal29=null;
        GuiceyDataParser.comment_return comment28 = null;


        Object string_literal27_tree=null;
        Object string_literal29_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:53:2: ( '/*' comment '*/' -> ^( COMMENT comment ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:53:4: '/*' comment '*/'
            {
            string_literal27=(Token)match(input,30,FOLLOW_30_in_javadoc282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal27);

            pushFollow(FOLLOW_comment_in_javadoc284);
            comment28=comment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_comment.add(comment28.getTree());
            string_literal29=(Token)match(input,31,FOLLOW_31_in_javadoc286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(string_literal29);



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
            // 53:22: -> ^( COMMENT comment )
            {
                // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:53:25: ^( COMMENT comment )
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:1: comment : (~ ( '*/' ) )* ;
    public final GuiceyDataParser.comment_return comment() throws RecognitionException {
        GuiceyDataParser.comment_return retval = new GuiceyDataParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:57:2: ( (~ ( '*/' ) )* )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:57:4: (~ ( '*/' ) )*
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:57:4: (~ ( '*/' ) )*
            loop10:
            do {
                int alt10=2;
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
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: ~ ( '*/' )
            	    {
            	    set30=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DATA && input.LA(1)<=30)||(input.LA(1)>=32 && input.LA(1)<=43) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set30));
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
            	    break loop10;
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
    public final GuiceyDataParser.option_return option() throws RecognitionException {
        GuiceyDataParser.option_return retval = new GuiceyDataParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token ID32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token ID40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token string_literal45=null;
        GuiceyDataParser.value_return value37 = null;

        GuiceyDataParser.pair_return pair42 = null;

        GuiceyDataParser.pair_return pair44 = null;


        Object char_literal31_tree=null;
        Object ID32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object ID35_tree=null;
        Object char_literal36_tree=null;
        Object string_literal38_tree=null;
        Object char_literal39_tree=null;
        Object ID40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object string_literal45_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:61:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt12=1;
                        }
                        break;
                    case 34:
                        {
                        switch ( input.LA(4) ) {
                        case INT:
                        case FLOAT:
                        case STRING:
                            {
                            alt12=2;
                            }
                            break;
                        case ID:
                            {
                            alt12=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:61:4: '[' ID ']'
                    {
                    char_literal31=(Token)match(input,32,FOLLOW_32_in_option322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal31);

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_option324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID32);

                    char_literal33=(Token)match(input,33,FOLLOW_33_in_option326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(char_literal33);



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
                    // 61:15: -> ^( OPTION ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:61:18: ^( OPTION ID )
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:62:4: '[' ID '(' value ')]'
                    {
                    char_literal34=(Token)match(input,32,FOLLOW_32_in_option339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal34);

                    ID35=(Token)match(input,ID,FOLLOW_ID_in_option341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID35);

                    char_literal36=(Token)match(input,34,FOLLOW_34_in_option343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal36);

                    pushFollow(FOLLOW_value_in_option345);
                    value37=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value37.getTree());
                    string_literal38=(Token)match(input,35,FOLLOW_35_in_option347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal38);



                    // AST REWRITE
                    // elements: value, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:26: -> ^( OPTION ID value )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:62:29: ^( OPTION ID value )
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal39=(Token)match(input,32,FOLLOW_32_in_option363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal39);

                    ID40=(Token)match(input,ID,FOLLOW_ID_in_option365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID40);

                    char_literal41=(Token)match(input,34,FOLLOW_34_in_option367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal41);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:15: ( pair ',' )*
                    loop11:
                    do {
                        int alt11=2;
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
                                        alt11=1;
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

                        switch (alt11) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option370);
                    	    pair42=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair42.getTree());
                    	    char_literal43=(Token)match(input,29,FOLLOW_29_in_option372); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal43);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option376);
                    pair44=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair44.getTree());
                    string_literal45=(Token)match(input,35,FOLLOW_35_in_option378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal45);



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
                    // 64:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:40: ^( OPTION ID ( pair )+ )
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:1: pair : key '=' value -> ^( PAIR key value ) ;
    public final GuiceyDataParser.pair_return pair() throws RecognitionException {
        GuiceyDataParser.pair_return retval = new GuiceyDataParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal47=null;
        GuiceyDataParser.key_return key46 = null;

        GuiceyDataParser.value_return value48 = null;


        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:68:2: ( key '=' value -> ^( PAIR key value ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:68:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair401);
            key46=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key46.getTree());
            char_literal47=(Token)match(input,36,FOLLOW_36_in_pair403); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal47);

            pushFollow(FOLLOW_value_in_pair405);
            value48=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value48.getTree());


            // AST REWRITE
            // elements: value, key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:18: -> ^( PAIR key value )
            {
                // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:68:21: ^( PAIR key value )
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID49=null;

        Object ID49_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:72:2: ( ID )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:72:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID49=(Token)match(input,ID,FOLLOW_ID_in_key427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID49_tree = (Object)adaptor.create(ID49);
            adaptor.addChild(root_0, ID49_tree);
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:74:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:75:2: ( INT | FLOAT | STRING )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set50=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set50));
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:80:1: property : ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal52=null;
        Token ID54=null;
        Token char_literal55=null;
        GuiceyDataParser.type_return type51 = null;

        GuiceyDataParser.type_return type53 = null;


        Object string_literal52_tree=null;
        Object ID54_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred17_GuiceyData()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred17_GuiceyData()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred17_GuiceyData()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA13_4 = input.LA(2);

                if ( (synpred17_GuiceyData()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred17_GuiceyData()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property461);
                    type51=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type51.getTree());
                    string_literal52=(Token)match(input,37,FOLLOW_37_in_property463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal52);



                    // AST REWRITE
                    // elements: type, DATA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:17: -> ^( PROPERTY 'data' type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:20: ^( PROPERTY 'data' type )
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:89:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property478);
                    type53=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type53.getTree());
                    ID54=(Token)match(input,ID,FOLLOW_ID_in_property480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID54);

                    char_literal55=(Token)match(input,38,FOLLOW_38_in_property482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal55);



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
                    // 89:16: -> ^( PROPERTY ID type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:89:19: ^( PROPERTY ID type )
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:92:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type56 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:93:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:93:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type503);
            type56=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type56.getTree());

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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type57 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:97:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:97:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type514);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type57.getTree());

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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:100:1: type : ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token string_literal63=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        Token TYPE69=null;
        Token ID70=null;
        Token ID71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        GuiceyDataParser.type_return type59 = null;

        GuiceyDataParser.type_return type61 = null;

        GuiceyDataParser.type_return type64 = null;

        GuiceyDataParser.type_return type67 = null;

        GuiceyDataParser.type_return type73 = null;

        GuiceyDataParser.type_return type75 = null;


        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object string_literal63_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        Object TYPE69_tree=null;
        Object ID70_tree=null;
        Object ID71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
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
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:101:2: ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case TYPE:
                {
                alt15=4;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt15=6;
                    }
                    break;
                case EOF:
                case ID:
                case 29:
                case 37:
                case 40:
                    {
                    alt15=5;
                    }
                    break;
                default:
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:101:4: 'map<' type ',' type '>'
                    {
                    string_literal58=(Token)match(input,39,FOLLOW_39_in_type525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal58);

                    pushFollow(FOLLOW_type_in_type527);
                    type59=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type59.getTree());
                    char_literal60=(Token)match(input,29,FOLLOW_29_in_type529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal60);

                    pushFollow(FOLLOW_type_in_type531);
                    type61=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type61.getTree());
                    char_literal62=(Token)match(input,40,FOLLOW_40_in_type533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal62);



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
                    // 101:29: -> TYPE_MAP ( type )+
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:102:4: 'set<' type '>'
                    {
                    string_literal63=(Token)match(input,41,FOLLOW_41_in_type545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal63);

                    pushFollow(FOLLOW_type_in_type547);
                    type64=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type64.getTree());
                    char_literal65=(Token)match(input,40,FOLLOW_40_in_type549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal65);



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
                    // 102:20: -> TYPE_SET type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:103:4: 'list<' type '>'
                    {
                    string_literal66=(Token)match(input,42,FOLLOW_42_in_type560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal66);

                    pushFollow(FOLLOW_type_in_type562);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type67.getTree());
                    char_literal68=(Token)match(input,40,FOLLOW_40_in_type564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal68);



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
                    // 103:21: -> TYPE_LIST type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:104:4: TYPE
                    {
                    TYPE69=(Token)match(input,TYPE,FOLLOW_TYPE_in_type575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE69);



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
                    // 104:9: -> TYPE_PRIMITIVE TYPE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_TYPE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:105:4: ID
                    {
                    ID70=(Token)match(input,ID,FOLLOW_ID_in_type586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID70);



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
                    // 105:7: -> TYPE_PRIMITIVE ID
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:106:4: ID '<' type ( ',' type )* '>'
                    {
                    ID71=(Token)match(input,ID,FOLLOW_ID_in_type597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID71);

                    char_literal72=(Token)match(input,43,FOLLOW_43_in_type599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(char_literal72);

                    pushFollow(FOLLOW_type_in_type601);
                    type73=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type73.getTree());
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:106:16: ( ',' type )*
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:106:17: ',' type
                    	    {
                    	    char_literal74=(Token)match(input,29,FOLLOW_29_in_type604); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal74);

                    	    pushFollow(FOLLOW_type_in_type606);
                    	    type75=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(type75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    char_literal76=(Token)match(input,40,FOLLOW_40_in_type610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal76);



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
                    // 106:32: -> PARAMETERIZED_TYPE ID ( type )+
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

    // $ANTLR start synpred17_GuiceyData
    public final void synpred17_GuiceyData_fragment() throws RecognitionException {   
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:4: ( type 'data;' )
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred17_GuiceyData461);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred17_GuiceyData463); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_GuiceyData

    // Delegated rules

    public final boolean synpred17_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_GuiceyData_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_entry_in_start120 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_EOF_in_start123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_entry133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_entry138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_data150 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data152 = new BitSet(new long[]{0x000006814808C010L});
    public static final BitSet FOLLOW_data_entry_in_data154 = new BitSet(new long[]{0x000006814808C010L});
    public static final BitSet FOLLOW_27_in_data157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_data175 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_data177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration196 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration198 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_enumeration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration215 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration220 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_enumeration222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration226 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_data_entry253 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_option_in_data_entry256 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_property_in_data_entry259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_javadoc282 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_comment_in_javadoc284 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_javadoc286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comment305 = new BitSet(new long[]{0x00000FFF7FFFFFF2L});
    public static final BitSet FOLLOW_32_in_option322 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option324 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_option326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option339 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option341 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option343 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_option345 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option363 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option365 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option367 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair401 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_pair403 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_pair405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property461 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_property463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property478 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_property480 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_property482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type525 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type527 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_type529 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type531 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_type545 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type547 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_type560 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type562 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type597 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_type599 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type601 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_type604 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type606 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_40_in_type610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred17_GuiceyData461 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred17_GuiceyData463 = new BitSet(new long[]{0x0000000000000002L});

}