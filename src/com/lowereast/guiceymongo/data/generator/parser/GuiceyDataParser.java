/**
 *      Copyright (C) 2010 Lowereast Software
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

// $ANTLR 3.2 Sep 23, 2009 12:02:23 GuiceyData.g 2010-05-17 23:08:50

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
    // GuiceyData.g:36:1: data : ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) );
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        try {
            // GuiceyData.g:36:6: ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DATA) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==24) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==26) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
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
                    // elements: DATA, ID, data_entry
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
                    break;
                case 2 :
                    // GuiceyData.g:37:4: DATA ID '{}'
                    {
                    DATA10=(Token)match(input,DATA,FOLLOW_DATA_in_data161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_data163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    string_literal12=(Token)match(input,26,FOLLOW_26_in_data165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(string_literal12);



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
                    // 37:17: -> ^( DATA ID )
                    {
                        // GuiceyData.g:37:20: ^( DATA ID )
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
    // GuiceyData.g:40:1: enumeration : ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) );
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

        try {
            // GuiceyData.g:41:2: ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ENUM) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==26) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==24) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // GuiceyData.g:41:4: ENUM ID '{}'
                    {
                    ENUM13=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM13);

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_enumeration186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    string_literal15=(Token)match(input,26,FOLLOW_26_in_enumeration188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(string_literal15);



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
                    // 41:17: -> ^( ENUM ID )
                    {
                        // GuiceyData.g:41:20: ^( ENUM ID )
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
                    // GuiceyData.g:42:4: ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    ENUM16=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM16);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_enumeration203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID17);

                    char_literal18=(Token)match(input,24,FOLLOW_24_in_enumeration205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_24.add(char_literal18);

                    // GuiceyData.g:42:16: ( ID ',' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ID) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==27) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // GuiceyData.g:42:17: ID ','
                    	    {
                    	    ID19=(Token)match(input,ID,FOLLOW_ID_in_enumeration208); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID19);

                    	    char_literal20=(Token)match(input,27,FOLLOW_27_in_enumeration210); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal20);


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    ID21=(Token)match(input,ID,FOLLOW_ID_in_enumeration214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID21);

                    char_literal22=(Token)match(input,25,FOLLOW_25_in_enumeration216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal22);



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
                    // 42:33: -> ^( ENUM ( ID )+ )
                    {
                        // GuiceyData.g:42:36: ^( ENUM ( ID )+ )
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
    // GuiceyData.g:45:1: data_entry : ( entry | ( option )* property -> ^( property ( option )* ) );
    public final GuiceyDataParser.data_entry_return data_entry() throws RecognitionException {
        GuiceyDataParser.data_entry_return retval = new GuiceyDataParser.data_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.entry_return entry23 = null;

        GuiceyDataParser.option_return option24 = null;

        GuiceyDataParser.property_return property25 = null;


        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // GuiceyData.g:46:2: ( entry | ( option )* property -> ^( property ( option )* ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DATA||LA8_0==ENUM) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID||LA8_0==TYPE||LA8_0==28||LA8_0==35||(LA8_0>=37 && LA8_0<=38)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // GuiceyData.g:46:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry236);
                    entry23=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry23.getTree());

                    }
                    break;
                case 2 :
                    // GuiceyData.g:47:4: ( option )* property
                    {
                    // GuiceyData.g:47:4: ( option )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry241);
                    	    option24=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry244);
                    property25=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property25.getTree());


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
                    // 47:21: -> ^( property ( option )* )
                    {
                        // GuiceyData.g:47:24: ^( property ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // GuiceyData.g:47:35: ( option )*
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
    // GuiceyData.g:50:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
    public final GuiceyDataParser.option_return option() throws RecognitionException {
        GuiceyDataParser.option_return retval = new GuiceyDataParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token ID27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token ID30=null;
        Token char_literal31=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token string_literal40=null;
        GuiceyDataParser.value_return value32 = null;

        GuiceyDataParser.pair_return pair37 = null;

        GuiceyDataParser.pair_return pair39 = null;


        Object char_literal26_tree=null;
        Object ID27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object ID30_tree=null;
        Object char_literal31_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object ID35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object string_literal40_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // GuiceyData.g:51:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==ID) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==29) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==30) ) {
                        int LA10_4 = input.LA(4);

                        if ( (LA10_4==ID) ) {
                            alt10=3;
                        }
                        else if ( ((LA10_4>=INT && LA10_4<=STRING)) ) {
                            alt10=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // GuiceyData.g:51:4: '[' ID ']'
                    {
                    char_literal26=(Token)match(input,28,FOLLOW_28_in_option264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal26);

                    ID27=(Token)match(input,ID,FOLLOW_ID_in_option266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    char_literal28=(Token)match(input,29,FOLLOW_29_in_option268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal28);



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
                    // 51:15: -> ^( OPTION ID )
                    {
                        // GuiceyData.g:51:18: ^( OPTION ID )
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
                    // GuiceyData.g:52:4: '[' ID '(' value ')]'
                    {
                    char_literal29=(Token)match(input,28,FOLLOW_28_in_option281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal29);

                    ID30=(Token)match(input,ID,FOLLOW_ID_in_option283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID30);

                    char_literal31=(Token)match(input,30,FOLLOW_30_in_option285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal31);

                    pushFollow(FOLLOW_value_in_option287);
                    value32=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value32.getTree());
                    string_literal33=(Token)match(input,31,FOLLOW_31_in_option289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal33);



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
                    // 52:26: -> ^( OPTION ID value )
                    {
                        // GuiceyData.g:52:29: ^( OPTION ID value )
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
                    // GuiceyData.g:54:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal34=(Token)match(input,28,FOLLOW_28_in_option305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal34);

                    ID35=(Token)match(input,ID,FOLLOW_ID_in_option307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID35);

                    char_literal36=(Token)match(input,30,FOLLOW_30_in_option309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal36);

                    // GuiceyData.g:54:15: ( pair ',' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==32) ) {
                                int LA9_2 = input.LA(3);

                                if ( ((LA9_2>=INT && LA9_2<=STRING)) ) {
                                    int LA9_3 = input.LA(4);

                                    if ( (LA9_3==27) ) {
                                        alt9=1;
                                    }


                                }


                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // GuiceyData.g:54:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option312);
                    	    pair37=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair37.getTree());
                    	    char_literal38=(Token)match(input,27,FOLLOW_27_in_option314); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal38);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option318);
                    pair39=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair39.getTree());
                    string_literal40=(Token)match(input,31,FOLLOW_31_in_option320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal40);



                    // AST REWRITE
                    // elements: ID, pair
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // GuiceyData.g:54:40: ^( OPTION ID ( pair )+ )
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
    // GuiceyData.g:57:1: pair : key '=' value -> ^( PAIR key value ) ;
    public final GuiceyDataParser.pair_return pair() throws RecognitionException {
        GuiceyDataParser.pair_return retval = new GuiceyDataParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal42=null;
        GuiceyDataParser.key_return key41 = null;

        GuiceyDataParser.value_return value43 = null;


        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // GuiceyData.g:58:2: ( key '=' value -> ^( PAIR key value ) )
            // GuiceyData.g:58:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair343);
            key41=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key41.getTree());
            char_literal42=(Token)match(input,32,FOLLOW_32_in_pair345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal42);

            pushFollow(FOLLOW_value_in_pair347);
            value43=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value43.getTree());


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
            // 58:18: -> ^( PAIR key value )
            {
                // GuiceyData.g:58:21: ^( PAIR key value )
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
    // GuiceyData.g:61:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID44=null;

        Object ID44_tree=null;

        try {
            // GuiceyData.g:62:2: ( ID )
            // GuiceyData.g:62:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID44=(Token)match(input,ID,FOLLOW_ID_in_key369); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID44_tree = (Object)adaptor.create(ID44);
            adaptor.addChild(root_0, ID44_tree);
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
    // GuiceyData.g:64:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // GuiceyData.g:65:2: ( INT | FLOAT | STRING )
            // GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set45));
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
    // GuiceyData.g:70:1: property : ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token ID49=null;
        Token char_literal50=null;
        GuiceyDataParser.type_return type46 = null;

        GuiceyDataParser.type_return type48 = null;


        Object string_literal47_tree=null;
        Object ID49_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:78:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
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
                    // GuiceyData.g:78:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property403);
                    type46=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type46.getTree());
                    string_literal47=(Token)match(input,33,FOLLOW_33_in_property405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal47);



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
                    // 78:17: -> ^( PROPERTY 'data' type )
                    {
                        // GuiceyData.g:78:20: ^( PROPERTY 'data' type )
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
                    // GuiceyData.g:79:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property420);
                    type48=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type48.getTree());
                    ID49=(Token)match(input,ID,FOLLOW_ID_in_property422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID49);

                    char_literal50=(Token)match(input,34,FOLLOW_34_in_property424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(char_literal50);



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
                    // 79:16: -> ^( PROPERTY ID type )
                    {
                        // GuiceyData.g:79:19: ^( PROPERTY ID type )
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
    // GuiceyData.g:82:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type51 = null;



        try {
            // GuiceyData.g:83:2: ( type )
            // GuiceyData.g:83:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type445);
            type51=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type51.getTree());

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
    // GuiceyData.g:86:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type52 = null;



        try {
            // GuiceyData.g:87:2: ( type )
            // GuiceyData.g:87:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type456);
            type52=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type52.getTree());

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
    // GuiceyData.g:90:1: type : ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal60=null;
        Token string_literal61=null;
        Token char_literal63=null;
        Token TYPE64=null;
        Token ID65=null;
        GuiceyDataParser.type_return type54 = null;

        GuiceyDataParser.type_return type56 = null;

        GuiceyDataParser.type_return type59 = null;

        GuiceyDataParser.type_return type62 = null;


        Object string_literal53_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object string_literal61_tree=null;
        Object char_literal63_tree=null;
        Object TYPE64_tree=null;
        Object ID65_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:91:2: ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case TYPE:
                {
                alt12=4;
                }
                break;
            case ID:
                {
                alt12=5;
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
                    // GuiceyData.g:91:4: 'map<' type ',' type '>'
                    {
                    string_literal53=(Token)match(input,35,FOLLOW_35_in_type467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal53);

                    pushFollow(FOLLOW_type_in_type469);
                    type54=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type54.getTree());
                    char_literal55=(Token)match(input,27,FOLLOW_27_in_type471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal55);

                    pushFollow(FOLLOW_type_in_type473);
                    type56=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type56.getTree());
                    char_literal57=(Token)match(input,36,FOLLOW_36_in_type475); if (state.failed) return retval; 
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
                    // 91:29: -> TYPE_MAP ( type )+
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
                    // GuiceyData.g:92:4: 'set<' type '>'
                    {
                    string_literal58=(Token)match(input,37,FOLLOW_37_in_type487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal58);

                    pushFollow(FOLLOW_type_in_type489);
                    type59=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type59.getTree());
                    char_literal60=(Token)match(input,36,FOLLOW_36_in_type491); if (state.failed) return retval; 
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
                    // 92:20: -> TYPE_SET type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // GuiceyData.g:93:4: 'list<' type '>'
                    {
                    string_literal61=(Token)match(input,38,FOLLOW_38_in_type502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal61);

                    pushFollow(FOLLOW_type_in_type504);
                    type62=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type62.getTree());
                    char_literal63=(Token)match(input,36,FOLLOW_36_in_type506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal63);



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
                    // 93:21: -> TYPE_LIST type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // GuiceyData.g:94:4: TYPE
                    {
                    TYPE64=(Token)match(input,TYPE,FOLLOW_TYPE_in_type517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE64);



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
                    // 94:9: -> TYPE_PRIMITIVE TYPE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_TYPE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // GuiceyData.g:95:4: ID
                    {
                    ID65=(Token)match(input,ID,FOLLOW_ID_in_type528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID65);



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
                    // 95:7: -> TYPE_PRIMITIVE ID
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

    // $ANTLR start synpred14_GuiceyData
    public final void synpred14_GuiceyData_fragment() throws RecognitionException {   
        // GuiceyData.g:78:4: ( type 'data;' )
        // GuiceyData.g:78:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred14_GuiceyData403);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred14_GuiceyData405); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_GuiceyData

    // Delegated rules

    public final boolean synpred14_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_GuiceyData_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_DATA_in_data161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_data163 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration203 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_enumeration205 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration208 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration210 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_enumeration214 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_enumeration216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_data_entry241 = new BitSet(new long[]{0x0000006810023010L});
    public static final BitSet FOLLOW_property_in_data_entry244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option283 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option285 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_option287 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option305 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option312 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_option314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option318 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair343 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_pair345 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_pair347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property403 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_property405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property420 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property422 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type467 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type469 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_type471 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type473 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_type487 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type489 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type502 = new BitSet(new long[]{0x0000006800022000L});
    public static final BitSet FOLLOW_type_in_type504 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_type506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred14_GuiceyData403 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred14_GuiceyData405 = new BitSet(new long[]{0x0000000000000002L});

}