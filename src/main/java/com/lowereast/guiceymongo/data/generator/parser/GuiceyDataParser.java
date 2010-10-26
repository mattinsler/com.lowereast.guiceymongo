// $ANTLR 3.2 Sep 23, 2009 14:05:07 com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g 2010-10-26 15:02:48

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
            alt2 = dfa2.predict(input);
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
                    // elements: ID, data_entry, javadoc, DATA
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
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:45:1: enumeration : ( ( javadoc )? ENUM ID '{}' -> ^( ENUM ID ( javadoc )? ) | ( javadoc )? ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ( javadoc )? ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM16=null;
        Token ID17=null;
        Token string_literal18=null;
        Token ENUM20=null;
        Token ID21=null;
        Token char_literal22=null;
        Token ID23=null;
        Token char_literal24=null;
        Token ID25=null;
        Token char_literal26=null;
        GuiceyDataParser.javadoc_return javadoc15 = null;

        GuiceyDataParser.javadoc_return javadoc19 = null;


        Object ENUM16_tree=null;
        Object ID17_tree=null;
        Object string_literal18_tree=null;
        Object ENUM20_tree=null;
        Object ID21_tree=null;
        Object char_literal22_tree=null;
        Object ID23_tree=null;
        Object char_literal24_tree=null;
        Object ID25_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_javadoc=new RewriteRuleSubtreeStream(adaptor,"rule javadoc");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:2: ( ( javadoc )? ENUM ID '{}' -> ^( ENUM ID ( javadoc )? ) | ( javadoc )? ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ( javadoc )? ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:4: ( javadoc )? ENUM ID '{}'
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:4: ( javadoc )?
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
                            pushFollow(FOLLOW_javadoc_in_enumeration211);
                            javadoc15=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc15.getTree());

                            }
                            break;

                    }

                    ENUM16=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM16);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_enumeration216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID17);

                    string_literal18=(Token)match(input,28,FOLLOW_28_in_enumeration218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(string_literal18);



                    // AST REWRITE
                    // elements: ID, ENUM, javadoc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:26: -> ^( ENUM ID ( javadoc )? )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:29: ^( ENUM ID ( javadoc )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:39: ( javadoc )?
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
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:4: ( javadoc )? ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:4: ( javadoc )?
                    int alt8=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt8=1;
                            }
                            break;
                    }

                    switch (alt8) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_enumeration234);
                            javadoc19=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc19.getTree());

                            }
                            break;

                    }

                    ENUM20=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM20);

                    ID21=(Token)match(input,ID,FOLLOW_ID_in_enumeration239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID21);

                    char_literal22=(Token)match(input,26,FOLLOW_26_in_enumeration241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal22);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:25: ( ID ',' )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 29:
                                {
                                alt9=1;
                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:26: ID ','
                    	    {
                    	    ID23=(Token)match(input,ID,FOLLOW_ID_in_enumeration244); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID23);

                    	    char_literal24=(Token)match(input,29,FOLLOW_29_in_enumeration246); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal24);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    ID25=(Token)match(input,ID,FOLLOW_ID_in_enumeration250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID25);

                    char_literal26=(Token)match(input,27,FOLLOW_27_in_enumeration252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal26);



                    // AST REWRITE
                    // elements: ID, ENUM, javadoc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:42: -> ^( ENUM ( ID )+ ( javadoc )? )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:45: ^( ENUM ( ID )+ ( javadoc )? )
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
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:56: ( javadoc )?
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

        GuiceyDataParser.entry_return entry27 = null;

        GuiceyDataParser.javadoc_return javadoc28 = null;

        GuiceyDataParser.option_return option29 = null;

        GuiceyDataParser.property_return property30 = null;


        RewriteRuleSubtreeStream stream_javadoc=new RewriteRuleSubtreeStream(adaptor,"rule javadoc");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:51:2: ( entry | ( javadoc )? ( option )* property -> ^( property ( javadoc )? ( option )* ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:51:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry275);
                    entry27=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry27.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:4: ( javadoc )? ( option )* property
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:4: ( javadoc )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case 30:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: javadoc
                            {
                            pushFollow(FOLLOW_javadoc_in_data_entry280);
                            javadoc28=javadoc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_javadoc.add(javadoc28.getTree());

                            }
                            break;

                    }

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:13: ( option )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry283);
                    	    option29=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry286);
                    property30=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property30.getTree());


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

        Token string_literal31=null;
        Token string_literal33=null;
        GuiceyDataParser.comment_return comment32 = null;


        Object string_literal31_tree=null;
        Object string_literal33_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:2: ( '/*' comment '*/' -> ^( COMMENT comment ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:56:4: '/*' comment '*/'
            {
            string_literal31=(Token)match(input,30,FOLLOW_30_in_javadoc309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal31);

            pushFollow(FOLLOW_comment_in_javadoc311);
            comment32=comment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_comment.add(comment32.getTree());
            string_literal33=(Token)match(input,31,FOLLOW_31_in_javadoc313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(string_literal33);



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

        Token set34=null;

        Object set34_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:2: ( (~ ( '*/' ) )* )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:4: (~ ( '*/' ) )*
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:60:4: (~ ( '*/' ) )*
            loop14:
            do {
                int alt14=2;
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
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: ~ ( '*/' )
            	    {
            	    set34=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DATA && input.LA(1)<=30)||(input.LA(1)>=32 && input.LA(1)<=43) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set34));
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
            	    break loop14;
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

        Token char_literal35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token ID39=null;
        Token char_literal40=null;
        Token string_literal42=null;
        Token char_literal43=null;
        Token ID44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token string_literal49=null;
        GuiceyDataParser.value_return value41 = null;

        GuiceyDataParser.pair_return pair46 = null;

        GuiceyDataParser.pair_return pair48 = null;


        Object char_literal35_tree=null;
        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object ID39_tree=null;
        Object char_literal40_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        Object ID44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal47_tree=null;
        Object string_literal49_tree=null;
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
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt16=1;
                        }
                        break;
                    case 34:
                        {
                        switch ( input.LA(4) ) {
                        case INT:
                        case FLOAT:
                        case STRING:
                            {
                            alt16=2;
                            }
                            break;
                        case ID:
                            {
                            alt16=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:64:4: '[' ID ']'
                    {
                    char_literal35=(Token)match(input,32,FOLLOW_32_in_option349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal35);

                    ID36=(Token)match(input,ID,FOLLOW_ID_in_option351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID36);

                    char_literal37=(Token)match(input,33,FOLLOW_33_in_option353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(char_literal37);



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
                    char_literal38=(Token)match(input,32,FOLLOW_32_in_option366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal38);

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_option368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID39);

                    char_literal40=(Token)match(input,34,FOLLOW_34_in_option370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal40);

                    pushFollow(FOLLOW_value_in_option372);
                    value41=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value41.getTree());
                    string_literal42=(Token)match(input,35,FOLLOW_35_in_option374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal42);



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
                    char_literal43=(Token)match(input,32,FOLLOW_32_in_option390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal43);

                    ID44=(Token)match(input,ID,FOLLOW_ID_in_option392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID44);

                    char_literal45=(Token)match(input,34,FOLLOW_34_in_option394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal45);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:15: ( pair ',' )*
                    loop15:
                    do {
                        int alt15=2;
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
                                        alt15=1;
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

                        switch (alt15) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:67:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option397);
                    	    pair46=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair46.getTree());
                    	    char_literal47=(Token)match(input,29,FOLLOW_29_in_option399); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal47);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option403);
                    pair48=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair48.getTree());
                    string_literal49=(Token)match(input,35,FOLLOW_35_in_option405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal49);



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

        Token char_literal51=null;
        GuiceyDataParser.key_return key50 = null;

        GuiceyDataParser.value_return value52 = null;


        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:2: ( key '=' value -> ^( PAIR key value ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair428);
            key50=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key50.getTree());
            char_literal51=(Token)match(input,36,FOLLOW_36_in_pair430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal51);

            pushFollow(FOLLOW_value_in_pair432);
            value52=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value52.getTree());


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

        Token ID53=null;

        Object ID53_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:75:2: ( ID )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:75:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID53=(Token)match(input,ID,FOLLOW_ID_in_key454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID53_tree = (Object)adaptor.create(ID53);
            adaptor.addChild(root_0, ID53_tree);
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

        Token set54=null;

        Object set54_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:78:2: ( INT | FLOAT | STRING )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set54=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set54));
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

        Token string_literal56=null;
        Token ID58=null;
        Token char_literal59=null;
        GuiceyDataParser.type_return type55 = null;

        GuiceyDataParser.type_return type57 = null;


        Object string_literal56_tree=null;
        Object ID58_tree=null;
        Object char_literal59_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA17_1 = input.LA(2);

                if ( (synpred21_GuiceyData()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred21_GuiceyData()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred21_GuiceyData()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred21_GuiceyData()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred21_GuiceyData()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
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
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property488);
                    type55=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type55.getTree());
                    string_literal56=(Token)match(input,37,FOLLOW_37_in_property490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal56);



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
                    pushFollow(FOLLOW_type_in_property505);
                    type57=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type57.getTree());
                    ID58=(Token)match(input,ID,FOLLOW_ID_in_property507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID58);

                    char_literal59=(Token)match(input,38,FOLLOW_38_in_property509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal59);



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

        GuiceyDataParser.type_return type60 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type530);
            type60=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type60.getTree());

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

        GuiceyDataParser.type_return type61 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:100:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:100:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type541);
            type61=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type61.getTree());

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

        Token string_literal62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token char_literal72=null;
        Token TYPE73=null;
        Token ID74=null;
        Token ID75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        GuiceyDataParser.type_return type63 = null;

        GuiceyDataParser.type_return type65 = null;

        GuiceyDataParser.type_return type68 = null;

        GuiceyDataParser.type_return type71 = null;

        GuiceyDataParser.type_return type77 = null;

        GuiceyDataParser.type_return type79 = null;


        Object string_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        Object string_literal67_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        Object TYPE73_tree=null;
        Object ID74_tree=null;
        Object ID75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
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
            int alt19=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case TYPE:
                {
                alt19=4;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt19=6;
                    }
                    break;
                case EOF:
                case ID:
                case 29:
                case 37:
                case 40:
                    {
                    alt19=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:104:4: 'map<' type ',' type '>'
                    {
                    string_literal62=(Token)match(input,39,FOLLOW_39_in_type552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal62);

                    pushFollow(FOLLOW_type_in_type554);
                    type63=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type63.getTree());
                    char_literal64=(Token)match(input,29,FOLLOW_29_in_type556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal64);

                    pushFollow(FOLLOW_type_in_type558);
                    type65=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type65.getTree());
                    char_literal66=(Token)match(input,40,FOLLOW_40_in_type560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal66);



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
                    string_literal67=(Token)match(input,41,FOLLOW_41_in_type572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal67);

                    pushFollow(FOLLOW_type_in_type574);
                    type68=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type68.getTree());
                    char_literal69=(Token)match(input,40,FOLLOW_40_in_type576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal69);



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
                    string_literal70=(Token)match(input,42,FOLLOW_42_in_type587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal70);

                    pushFollow(FOLLOW_type_in_type589);
                    type71=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type71.getTree());
                    char_literal72=(Token)match(input,40,FOLLOW_40_in_type591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal72);



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
                    TYPE73=(Token)match(input,TYPE,FOLLOW_TYPE_in_type602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE73);



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
                    ID74=(Token)match(input,ID,FOLLOW_ID_in_type613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID74);



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
                    ID75=(Token)match(input,ID,FOLLOW_ID_in_type624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID75);

                    char_literal76=(Token)match(input,43,FOLLOW_43_in_type626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(char_literal76);

                    pushFollow(FOLLOW_type_in_type628);
                    type77=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type77.getTree());
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:109:16: ( ',' type )*
                    loop18:
                    do {
                        int alt18=2;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt18=1;
                            }
                            break;

                        }

                        switch (alt18) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:109:17: ',' type
                    	    {
                    	    char_literal78=(Token)match(input,29,FOLLOW_29_in_type631); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal78);

                    	    pushFollow(FOLLOW_type_in_type633);
                    	    type79=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(type79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    char_literal80=(Token)match(input,40,FOLLOW_40_in_type637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal80);



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

    // $ANTLR start synpred21_GuiceyData
    public final void synpred21_GuiceyData_fragment() throws RecognitionException {   
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: ( type 'data;' )
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred21_GuiceyData488);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred21_GuiceyData490); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_GuiceyData

    // Delegated rules

    public final boolean synpred21_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_GuiceyData_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\2\4\2\uffff\2\4";
    static final String DFA2_maxS =
        "\1\36\1\53\2\uffff\1\53\1\16";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\11\uffff\1\3\17\uffff\1\1",
            "\33\4\1\5\14\4",
            "",
            "",
            "\33\4\1\5\14\4",
            "\1\2\11\uffff\1\3"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "35:1: entry : ( data | enumeration );";
        }
    }
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
    static final String DFA10_eotS =
        "\10\uffff";
    static final String DFA10_eofS =
        "\10\uffff";
    static final String DFA10_minS =
        "\1\16\1\4\1\17\1\4\1\16\1\32\2\uffff";
    static final String DFA10_maxS =
        "\1\36\1\53\1\17\1\53\1\16\1\34\2\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\10\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\17\uffff\1\1",
            "\33\3\1\4\14\3",
            "\1\5",
            "\33\3\1\4\14\3",
            "\1\2",
            "\1\7\1\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "45:1: enumeration : ( ( javadoc )? ENUM ID '{}' -> ^( ENUM ID ( javadoc )? ) | ( javadoc )? ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ( javadoc )? ) );";
        }
    }
    static final String DFA13_eotS =
        "\6\uffff";
    static final String DFA13_eofS =
        "\6\uffff";
    static final String DFA13_minS =
        "\2\4\2\uffff\2\4";
    static final String DFA13_maxS =
        "\1\52\1\53\2\uffff\1\53\1\52";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA13_specialS =
        "\6\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\11\uffff\1\2\1\3\3\uffff\1\3\12\uffff\1\1\1\uffff\1\3"+
            "\6\uffff\1\3\1\uffff\2\3",
            "\33\4\1\5\14\4",
            "",
            "",
            "\33\4\1\5\14\4",
            "\1\2\11\uffff\1\2\1\3\3\uffff\1\3\14\uffff\1\3\6\uffff\1\3"+
            "\1\uffff\2\3"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
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
    public static final BitSet FOLLOW_javadoc_in_enumeration211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENUM_in_enumeration214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration216 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_enumeration218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_enumeration234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENUM_in_enumeration237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration239 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration241 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration244 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_enumeration246 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enumeration250 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javadoc_in_data_entry280 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_option_in_data_entry283 = new BitSet(new long[]{0x000006814008C010L});
    public static final BitSet FOLLOW_property_in_data_entry286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_javadoc309 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_comment_in_javadoc311 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_javadoc313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comment332 = new BitSet(new long[]{0x00000FFF7FFFFFF2L});
    public static final BitSet FOLLOW_32_in_option349 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option351 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_option353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option368 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option370 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_option372 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_option390 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_option392 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_option394 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option397 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option399 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pair_in_option403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_option405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair428 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_pair430 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_value_in_pair432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property488 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_property490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property505 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_property507 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_property509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type552 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type554 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_type556 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type558 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_type572 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type574 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_type587 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type589 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type624 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_type626 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type628 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_type631 = new BitSet(new long[]{0x0000068000088000L});
    public static final BitSet FOLLOW_type_in_type633 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_40_in_type637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred21_GuiceyData488 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred21_GuiceyData490 = new BitSet(new long[]{0x0000000000000002L});

}