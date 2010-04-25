// $ANTLR 3.2 Sep 23, 2009 12:02:23 GuiceyData.g 2010-04-24 21:12:26

package com.lowereast.guiceymongo.data.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GuiceyDataParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATA", "TYPE_MAP", "TYPE_SET", "TYPE_LIST", "TYPE_PRIMITIVE", "PROPERTY", "OPTION", "PAIR", "ENUM", "ID", "INT", "FLOAT", "STRING", "TYPE", "WS", "EXPONENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'{'", "'}'", "'{}'", "','", "'['", "']'", "'('", "')]'", "'='", "'data;'", "';'", "'map<'", "'>'", "'set<'", "'list<'"
    };
    public static final int EXPONENT=19;
    public static final int OPTION=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int UNICODE_ESC=22;
    public static final int OCTAL_ESC=23;
    public static final int HEX_DIGIT=21;
    public static final int FLOAT=15;
    public static final int INT=14;
    public static final int TYPE_LIST=7;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int TYPE_PRIMITIVE=8;
    public static final int TYPE=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int ESC_SEQ=20;
    public static final int WS=18;
    public static final int T__33=33;
    public static final int ENUM=12;
    public static final int T__34=34;
    public static final int TYPE_MAP=5;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int PROPERTY=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int TYPE_SET=6;
    public static final int PAIR=11;
    public static final int DATA=4;
    public static final int STRING=16;

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
    public String getGrammarFileName() { return "GuiceyData.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // GuiceyData.g:29:1: start : ( entry )+ EOF ;
    public final GuiceyDataParser.start_return start() throws RecognitionException {
        GuiceyDataParser.start_return retval = new GuiceyDataParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        GuiceyDataParser.entry_return entry1 = null;


        Object EOF2_tree=null;

        try {
            // GuiceyData.g:29:7: ( ( entry )+ EOF )
            // GuiceyData.g:29:9: ( entry )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // GuiceyData.g:29:9: ( entry )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATA||LA1_0==ENUM) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // GuiceyData.g:0:0: entry
            	    {
            	    pushFollow(FOLLOW_entry_in_start108);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start111); if (state.failed) return retval;
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
    // GuiceyData.g:32:1: entry : ( data | enumeration );
    public final GuiceyDataParser.entry_return entry() throws RecognitionException {
        GuiceyDataParser.entry_return retval = new GuiceyDataParser.entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.data_return data3 = null;

        GuiceyDataParser.enumeration_return enumeration4 = null;



        try {
            // GuiceyData.g:32:7: ( data | enumeration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DATA) ) {
                alt2=1;
            }
            else if ( (LA2_0==ENUM) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // GuiceyData.g:32:9: data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_in_entry121);
                    data3=data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data3.getTree());

                    }
                    break;
                case 2 :
                    // GuiceyData.g:33:4: enumeration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_entry126);
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
    // GuiceyData.g:36:1: data : DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) ;
    public final GuiceyDataParser.data_return data() throws RecognitionException {
        GuiceyDataParser.data_return retval = new GuiceyDataParser.data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        GuiceyDataParser.data_entry_return data_entry8 = null;


        Object DATA5_tree=null;
        Object ID6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        try {
            // GuiceyData.g:36:6: ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) )
            // GuiceyData.g:36:8: DATA ID '{' ( data_entry )* '}'
            {
            DATA5=(Token)match(input,DATA,FOLLOW_DATA_in_data136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA.add(DATA5);

            ID6=(Token)match(input,ID,FOLLOW_ID_in_data138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            char_literal7=(Token)match(input,24,FOLLOW_24_in_data140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal7);

            // GuiceyData.g:36:20: ( data_entry )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DATA||(LA3_0>=ENUM && LA3_0<=ID)||LA3_0==TYPE||LA3_0==28||LA3_0==35||(LA3_0>=37 && LA3_0<=38)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // GuiceyData.g:0:0: data_entry
            	    {
            	    pushFollow(FOLLOW_data_entry_in_data142);
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

            char_literal9=(Token)match(input,25,FOLLOW_25_in_data145); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal9);



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
            // 36:36: -> ^( DATA ID ( data_entry )* )
            {
                // GuiceyData.g:36:39: ^( DATA ID ( data_entry )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // GuiceyData.g:36:49: ( data_entry )*
                while ( stream_data_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_entry.nextTree());

                }
                stream_data_entry.reset();

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
    // $ANTLR end "data"

    public static class enumeration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumeration"
    // GuiceyData.g:39:1: enumeration : ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM10=null;
        Token ID11=null;
        Token string_literal12=null;
        Token ENUM13=null;
        Token ID14=null;
        Token char_literal15=null;
        Token ID16=null;
        Token char_literal17=null;
        Token ID18=null;
        Token char_literal19=null;

        Object ENUM10_tree=null;
        Object ID11_tree=null;
        Object string_literal12_tree=null;
        Object ENUM13_tree=null;
        Object ID14_tree=null;
        Object char_literal15_tree=null;
        Object ID16_tree=null;
        Object char_literal17_tree=null;
        Object ID18_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

        try {
            // GuiceyData.g:40:2: ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ENUM) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==26) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==24) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // GuiceyData.g:40:4: ENUM ID '{}'
                    {
                    ENUM10=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_enumeration169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    string_literal12=(Token)match(input,26,FOLLOW_26_in_enumeration171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(string_literal12);



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
                    // 40:17: -> ^( ENUM ID )
                    {
                        // GuiceyData.g:40:20: ^( ENUM ID )
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
                    // GuiceyData.g:41:4: ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    ENUM13=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM13);

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_enumeration186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    char_literal15=(Token)match(input,24,FOLLOW_24_in_enumeration188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_24.add(char_literal15);

                    // GuiceyData.g:41:16: ( ID ',' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ID) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==27) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // GuiceyData.g:41:17: ID ','
                    	    {
                    	    ID16=(Token)match(input,ID,FOLLOW_ID_in_enumeration191); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID16);

                    	    char_literal17=(Token)match(input,27,FOLLOW_27_in_enumeration193); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal17);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    ID18=(Token)match(input,ID,FOLLOW_ID_in_enumeration197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID18);

                    char_literal19=(Token)match(input,25,FOLLOW_25_in_enumeration199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal19);



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
                    // 41:33: -> ^( ENUM ( ID )+ )
                    {
                        // GuiceyData.g:41:36: ^( ENUM ( ID )+ )
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
    // GuiceyData.g:44:1: data_entry : ( entry | ( option )* property -> ^( property ( option )* ) );
    public final GuiceyDataParser.data_entry_return data_entry() throws RecognitionException {
        GuiceyDataParser.data_entry_return retval = new GuiceyDataParser.data_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.entry_return entry20 = null;

        GuiceyDataParser.option_return option21 = null;

        GuiceyDataParser.property_return property22 = null;


        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // GuiceyData.g:45:2: ( entry | ( option )* property -> ^( property ( option )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DATA||LA7_0==ENUM) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID||LA7_0==TYPE||LA7_0==28||LA7_0==35||(LA7_0>=37 && LA7_0<=38)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // GuiceyData.g:45:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry219);
                    entry20=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry20.getTree());

                    }
                    break;
                case 2 :
                    // GuiceyData.g:46:4: ( option )* property
                    {
                    // GuiceyData.g:46:4: ( option )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==28) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry224);
                    	    option21=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry227);
                    property22=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property22.getTree());


                    // AST REWRITE
                    // elements: property, option
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:21: -> ^( property ( option )* )
                    {
                        // GuiceyData.g:46:24: ^( property ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // GuiceyData.g:46:35: ( option )*
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

    public static class option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // GuiceyData.g:49:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
    public final GuiceyDataParser.option_return option() throws RecognitionException {
        GuiceyDataParser.option_return retval = new GuiceyDataParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal23=null;
        Token ID24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token ID27=null;
        Token char_literal28=null;
        Token string_literal30=null;
        Token char_literal31=null;
        Token ID32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token string_literal37=null;
        GuiceyDataParser.value_return value29 = null;

        GuiceyDataParser.pair_return pair34 = null;

        GuiceyDataParser.pair_return pair36 = null;


        Object char_literal23_tree=null;
        Object ID24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object ID27_tree=null;
        Object char_literal28_tree=null;
        Object string_literal30_tree=null;
        Object char_literal31_tree=null;
        Object ID32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object string_literal37_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // GuiceyData.g:50:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==30) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==ID) ) {
                            alt9=3;
                        }
                        else if ( ((LA9_4>=INT && LA9_4<=STRING)) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // GuiceyData.g:50:4: '[' ID ']'
                    {
                    char_literal23=(Token)match(input,28,FOLLOW_28_in_option247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal23);

                    ID24=(Token)match(input,ID,FOLLOW_ID_in_option249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID24);

                    char_literal25=(Token)match(input,29,FOLLOW_29_in_option251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal25);



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
                    // 50:15: -> ^( OPTION ID )
                    {
                        // GuiceyData.g:50:18: ^( OPTION ID )
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
                    // GuiceyData.g:51:4: '[' ID '(' value ')]'
                    {
                    char_literal26=(Token)match(input,28,FOLLOW_28_in_option264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal26);

                    ID27=(Token)match(input,ID,FOLLOW_ID_in_option266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    char_literal28=(Token)match(input,30,FOLLOW_30_in_option268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal28);

                    pushFollow(FOLLOW_value_in_option270);
                    value29=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value29.getTree());
                    string_literal30=(Token)match(input,31,FOLLOW_31_in_option272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal30);



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
                    // 51:26: -> ^( OPTION ID value )
                    {
                        // GuiceyData.g:51:29: ^( OPTION ID value )
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
                    // GuiceyData.g:53:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal31=(Token)match(input,28,FOLLOW_28_in_option288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal31);

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_option290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID32);

                    char_literal33=(Token)match(input,30,FOLLOW_30_in_option292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal33);

                    // GuiceyData.g:53:15: ( pair ',' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==32) ) {
                                int LA8_2 = input.LA(3);

                                if ( ((LA8_2>=INT && LA8_2<=STRING)) ) {
                                    int LA8_3 = input.LA(4);

                                    if ( (LA8_3==27) ) {
                                        alt8=1;
                                    }


                                }


                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // GuiceyData.g:53:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option295);
                    	    pair34=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair34.getTree());
                    	    char_literal35=(Token)match(input,27,FOLLOW_27_in_option297); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal35);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option301);
                    pair36=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair36.getTree());
                    string_literal37=(Token)match(input,31,FOLLOW_31_in_option303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal37);



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
                    // 53:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // GuiceyData.g:53:40: ^( OPTION ID ( pair )+ )
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
    // GuiceyData.g:56:1: pair : key '=' value -> ^( PAIR key value ) ;
    public final GuiceyDataParser.pair_return pair() throws RecognitionException {
        GuiceyDataParser.pair_return retval = new GuiceyDataParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        GuiceyDataParser.key_return key38 = null;

        GuiceyDataParser.value_return value40 = null;


        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // GuiceyData.g:57:2: ( key '=' value -> ^( PAIR key value ) )
            // GuiceyData.g:57:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair326);
            key38=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key38.getTree());
            char_literal39=(Token)match(input,32,FOLLOW_32_in_pair328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal39);

            pushFollow(FOLLOW_value_in_pair330);
            value40=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value40.getTree());


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
            // 57:18: -> ^( PAIR key value )
            {
                // GuiceyData.g:57:21: ^( PAIR key value )
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
    // GuiceyData.g:60:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID41=null;

        Object ID41_tree=null;

        try {
            // GuiceyData.g:61:2: ( ID )
            // GuiceyData.g:61:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID41=(Token)match(input,ID,FOLLOW_ID_in_key352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID41_tree = (Object)adaptor.create(ID41);
            adaptor.addChild(root_0, ID41_tree);
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
    // GuiceyData.g:63:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try {
            // GuiceyData.g:64:2: ( INT | FLOAT | STRING )
            // GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set42));
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
    // GuiceyData.g:69:1: property : ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Token ID46=null;
        Token char_literal47=null;
        GuiceyDataParser.type_return type43 = null;

        GuiceyDataParser.type_return type45 = null;


        Object string_literal44_tree=null;
        Object ID46_tree=null;
        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:77:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred13_GuiceyData()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred13_GuiceyData()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred13_GuiceyData()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred13_GuiceyData()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA10_5 = input.LA(2);

                if ( (synpred13_GuiceyData()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // GuiceyData.g:77:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property386);
                    type43=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type43.getTree());
                    string_literal44=(Token)match(input,33,FOLLOW_33_in_property388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal44);



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
                    // 77:17: -> ^( PROPERTY 'data' type )
                    {
                        // GuiceyData.g:77:20: ^( PROPERTY 'data' type )
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
                    // GuiceyData.g:78:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property403);
                    type45=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type45.getTree());
                    ID46=(Token)match(input,ID,FOLLOW_ID_in_property405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID46);

                    char_literal47=(Token)match(input,34,FOLLOW_34_in_property407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal47);



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
                    // 78:16: -> ^( PROPERTY ID type )
                    {
                        // GuiceyData.g:78:19: ^( PROPERTY ID type )
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
    // GuiceyData.g:81:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type48 = null;



        try {
            // GuiceyData.g:82:2: ( type )
            // GuiceyData.g:82:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type428);
            type48=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type48.getTree());

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
    // GuiceyData.g:85:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type49 = null;



        try {
            // GuiceyData.g:86:2: ( type )
            // GuiceyData.g:86:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type439);
            type49=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type49.getTree());

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
    // GuiceyData.g:89:1: type : ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token string_literal55=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal60=null;
        Token TYPE61=null;
        Token ID62=null;
        GuiceyDataParser.type_return type51 = null;

        GuiceyDataParser.type_return type53 = null;

        GuiceyDataParser.type_return type56 = null;

        GuiceyDataParser.type_return type59 = null;


        Object string_literal50_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;
        Object string_literal55_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object TYPE61_tree=null;
        Object ID62_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:90:2: ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case TYPE:
                {
                alt11=4;
                }
                break;
            case ID:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // GuiceyData.g:90:4: 'map<' type ',' type '>'
                    {
                    string_literal50=(Token)match(input,35,FOLLOW_35_in_type450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal50);

                    pushFollow(FOLLOW_type_in_type452);
                    type51=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type51.getTree());
                    char_literal52=(Token)match(input,27,FOLLOW_27_in_type454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal52);

                    pushFollow(FOLLOW_type_in_type456);
                    type53=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type53.getTree());
                    char_literal54=(Token)match(input,36,FOLLOW_36_in_type458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal54);



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
                    // 90:29: -> TYPE_MAP ( type )+
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
                    // GuiceyData.g:91:4: 'set<' type '>'
                    {
                    string_literal55=(Token)match(input,37,FOLLOW_37_in_type470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal55);

                    pushFollow(FOLLOW_type_in_type472);
                    type56=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type56.getTree());
                    char_literal57=(Token)match(input,36,FOLLOW_36_in_type474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal57);



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
                    // 91:20: -> TYPE_SET type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // GuiceyData.g:92:4: 'list<' type '>'
                    {
                    string_literal58=(Token)match(input,38,FOLLOW_38_in_type485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal58);

                    pushFollow(FOLLOW_type_in_type487);
                    type59=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type59.getTree());
                    char_literal60=(Token)match(input,36,FOLLOW_36_in_type489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal60);



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
                    // 92:21: -> TYPE_LIST type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // GuiceyData.g:93:4: TYPE
                    {
                    TYPE61=(Token)match(input,TYPE,FOLLOW_TYPE_in_type500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE61);



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
                    // 93:9: -> TYPE_PRIMITIVE TYPE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_TYPE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // GuiceyData.g:94:4: ID
                    {
                    ID62=(Token)match(input,ID,FOLLOW_ID_in_type511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID62);



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
                    // 94:7: -> TYPE_PRIMITIVE ID
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());

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

    // $ANTLR start synpred13_GuiceyData
    public final void synpred13_GuiceyData_fragment() throws RecognitionException {   
        // GuiceyData.g:77:4: ( type 'data;' )
        // GuiceyData.g:77:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred13_GuiceyData386);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred13_GuiceyData388); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_GuiceyData

    // Delegated rules

    public final boolean synpred13_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_GuiceyData_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_entry_in_start108 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_EOF_in_start111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_entry121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_entry126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data136 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_data138 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_data140 = new BitSet(new long[]{0x0000006812023010L});
    public static final BitSet FOLLOW_data_entry_in_data142 = new BitSet(new long[]{0x0000006812023010L});
    public static final BitSet FOLLOW_25_in_data145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration169 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration186 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_enumeration188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration191 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration193 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration197 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_enumeration199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_data_entry224 = new BitSet(new long[]{0x0000006810023010L});
    public static final BitSet FOLLOW_property_in_data_entry227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option249 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option266 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option268 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_option270 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option292 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option295 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_option297 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option301 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair326 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_pair328 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_pair330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property386 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_property388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property403 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property405 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type450 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type452 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_type454 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type456 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_type470 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type485 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type487 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred13_GuiceyData386 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred13_GuiceyData388 = new BitSet(new long[]{0x0000000000000002L});

}