// $ANTLR 3.2 Sep 23, 2009 12:02:23 GuiceyData.g 2010-04-18 05:28:18

package com.lowereast.guiceymongo.data.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class GuiceyDataParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATA", "TYPE_MAP", "TYPE_SET", "TYPE_LIST", "TYPE_PRIMITIVE", "PROPERTY", "OPTION", "PAIR", "ENUM", "ID", "INT", "FLOAT", "STRING", "TYPE", "WS", "EXPONENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'{'", "'}'", "'{}'", "','", "'['", "']'", "'('", "')]'", "'='", "'map<'", "'>'", "';'", "'set<'", "'list<'", "'data;'"
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
    // GuiceyData.g:28:1: start : ( entry )+ EOF ;
    public final GuiceyDataParser.start_return start() throws RecognitionException {
        GuiceyDataParser.start_return retval = new GuiceyDataParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        GuiceyDataParser.entry_return entry1 = null;


        Object EOF2_tree=null;

        try {
            // GuiceyData.g:28:7: ( ( entry )+ EOF )
            // GuiceyData.g:28:9: ( entry )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // GuiceyData.g:28:9: ( entry )+
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
            	    // GuiceyData.g:28:9: entry
            	    {
            	    pushFollow(FOLLOW_entry_in_start102);
            	    entry1=entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, entry1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start105); 
            EOF2_tree = (Object)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:31:1: entry : ( data | enumeration );
    public final GuiceyDataParser.entry_return entry() throws RecognitionException {
        GuiceyDataParser.entry_return retval = new GuiceyDataParser.entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.data_return data3 = null;

        GuiceyDataParser.enumeration_return enumeration4 = null;



        try {
            // GuiceyData.g:31:7: ( data | enumeration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DATA) ) {
                alt2=1;
            }
            else if ( (LA2_0==ENUM) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // GuiceyData.g:31:9: data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_in_entry115);
                    data3=data();

                    state._fsp--;

                    adaptor.addChild(root_0, data3.getTree());

                    }
                    break;
                case 2 :
                    // GuiceyData.g:32:4: enumeration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_entry120);
                    enumeration4=enumeration();

                    state._fsp--;

                    adaptor.addChild(root_0, enumeration4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:35:1: data : DATA type '{' ( data_entry )* '}' -> ^( DATA type ( data_entry )* ) ;
    public final GuiceyDataParser.data_return data() throws RecognitionException {
        GuiceyDataParser.data_return retval = new GuiceyDataParser.data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        GuiceyDataParser.type_return type6 = null;

        GuiceyDataParser.data_entry_return data_entry8 = null;


        Object DATA5_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:35:6: ( DATA type '{' ( data_entry )* '}' -> ^( DATA type ( data_entry )* ) )
            // GuiceyData.g:35:8: DATA type '{' ( data_entry )* '}'
            {
            DATA5=(Token)match(input,DATA,FOLLOW_DATA_in_data130);  
            stream_DATA.add(DATA5);

            pushFollow(FOLLOW_type_in_data132);
            type6=type();

            state._fsp--;

            stream_type.add(type6.getTree());
            char_literal7=(Token)match(input,24,FOLLOW_24_in_data134);  
            stream_24.add(char_literal7);

            // GuiceyData.g:35:22: ( data_entry )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DATA||(LA3_0>=ENUM && LA3_0<=ID)||LA3_0==TYPE||LA3_0==28||LA3_0==33||(LA3_0>=36 && LA3_0<=37)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // GuiceyData.g:35:22: data_entry
            	    {
            	    pushFollow(FOLLOW_data_entry_in_data136);
            	    data_entry8=data_entry();

            	    state._fsp--;

            	    stream_data_entry.add(data_entry8.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal9=(Token)match(input,25,FOLLOW_25_in_data139);  
            stream_25.add(char_literal9);



            // AST REWRITE
            // elements: type, DATA, data_entry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:38: -> ^( DATA type ( data_entry )* )
            {
                // GuiceyData.g:35:41: ^( DATA type ( data_entry )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // GuiceyData.g:35:53: ( data_entry )*
                while ( stream_data_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_entry.nextTree());

                }
                stream_data_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:38:1: enumeration : ( ENUM type '{}' -> ^( ENUM type ) | ENUM type '{' ( value_type ',' )* value_type '}' -> ^( ENUM type ( value_type )+ ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM10=null;
        Token string_literal12=null;
        Token ENUM13=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal19=null;
        GuiceyDataParser.type_return type11 = null;

        GuiceyDataParser.type_return type14 = null;

        GuiceyDataParser.value_type_return value_type16 = null;

        GuiceyDataParser.value_type_return value_type18 = null;


        Object ENUM10_tree=null;
        Object string_literal12_tree=null;
        Object ENUM13_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_value_type=new RewriteRuleSubtreeStream(adaptor,"rule value_type");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:39:2: ( ENUM type '{}' -> ^( ENUM type ) | ENUM type '{' ( value_type ',' )* value_type '}' -> ^( ENUM type ( value_type )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ENUM) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID||LA5_1==TYPE) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==26) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==24) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // GuiceyData.g:39:4: ENUM type '{}'
                    {
                    ENUM10=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration161);  
                    stream_ENUM.add(ENUM10);

                    pushFollow(FOLLOW_type_in_enumeration163);
                    type11=type();

                    state._fsp--;

                    stream_type.add(type11.getTree());
                    string_literal12=(Token)match(input,26,FOLLOW_26_in_enumeration165);  
                    stream_26.add(string_literal12);



                    // AST REWRITE
                    // elements: ENUM, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:19: -> ^( ENUM type )
                    {
                        // GuiceyData.g:39:22: ^( ENUM type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // GuiceyData.g:40:4: ENUM type '{' ( value_type ',' )* value_type '}'
                    {
                    ENUM13=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration178);  
                    stream_ENUM.add(ENUM13);

                    pushFollow(FOLLOW_type_in_enumeration180);
                    type14=type();

                    state._fsp--;

                    stream_type.add(type14.getTree());
                    char_literal15=(Token)match(input,24,FOLLOW_24_in_enumeration182);  
                    stream_24.add(char_literal15);

                    // GuiceyData.g:40:18: ( value_type ',' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ID||LA4_0==TYPE) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==27) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // GuiceyData.g:40:19: value_type ','
                    	    {
                    	    pushFollow(FOLLOW_value_type_in_enumeration185);
                    	    value_type16=value_type();

                    	    state._fsp--;

                    	    stream_value_type.add(value_type16.getTree());
                    	    char_literal17=(Token)match(input,27,FOLLOW_27_in_enumeration187);  
                    	    stream_27.add(char_literal17);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    pushFollow(FOLLOW_value_type_in_enumeration191);
                    value_type18=value_type();

                    state._fsp--;

                    stream_value_type.add(value_type18.getTree());
                    char_literal19=(Token)match(input,25,FOLLOW_25_in_enumeration193);  
                    stream_25.add(char_literal19);



                    // AST REWRITE
                    // elements: value_type, type, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:51: -> ^( ENUM type ( value_type )+ )
                    {
                        // GuiceyData.g:40:54: ^( ENUM type ( value_type )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        if ( !(stream_value_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_value_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_value_type.nextTree());

                        }
                        stream_value_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:43:1: data_entry : ( entry | ( option )* property -> ^( property ( option )* ) );
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
            // GuiceyData.g:44:2: ( entry | ( option )* property -> ^( property ( option )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DATA||LA7_0==ENUM) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID||LA7_0==TYPE||LA7_0==28||LA7_0==33||(LA7_0>=36 && LA7_0<=37)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // GuiceyData.g:44:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry215);
                    entry20=entry();

                    state._fsp--;

                    adaptor.addChild(root_0, entry20.getTree());

                    }
                    break;
                case 2 :
                    // GuiceyData.g:45:4: ( option )* property
                    {
                    // GuiceyData.g:45:4: ( option )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==28) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // GuiceyData.g:45:4: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry220);
                    	    option21=option();

                    	    state._fsp--;

                    	    stream_option.add(option21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry223);
                    property22=property();

                    state._fsp--;

                    stream_property.add(property22.getTree());


                    // AST REWRITE
                    // elements: property, option
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 45:21: -> ^( property ( option )* )
                    {
                        // GuiceyData.g:45:24: ^( property ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // GuiceyData.g:45:35: ( option )*
                        while ( stream_option.hasNext() ) {
                            adaptor.addChild(root_1, stream_option.nextTree());

                        }
                        stream_option.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:48:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
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
            // GuiceyData.g:49:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
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

                        if ( ((LA9_4>=INT && LA9_4<=STRING)) ) {
                            alt9=2;
                        }
                        else if ( (LA9_4==ID) ) {
                            alt9=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // GuiceyData.g:49:4: '[' ID ']'
                    {
                    char_literal23=(Token)match(input,28,FOLLOW_28_in_option243);  
                    stream_28.add(char_literal23);

                    ID24=(Token)match(input,ID,FOLLOW_ID_in_option245);  
                    stream_ID.add(ID24);

                    char_literal25=(Token)match(input,29,FOLLOW_29_in_option247);  
                    stream_29.add(char_literal25);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:15: -> ^( OPTION ID )
                    {
                        // GuiceyData.g:49:18: ^( OPTION ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // GuiceyData.g:50:4: '[' ID '(' value ')]'
                    {
                    char_literal26=(Token)match(input,28,FOLLOW_28_in_option260);  
                    stream_28.add(char_literal26);

                    ID27=(Token)match(input,ID,FOLLOW_ID_in_option262);  
                    stream_ID.add(ID27);

                    char_literal28=(Token)match(input,30,FOLLOW_30_in_option264);  
                    stream_30.add(char_literal28);

                    pushFollow(FOLLOW_value_in_option266);
                    value29=value();

                    state._fsp--;

                    stream_value.add(value29.getTree());
                    string_literal30=(Token)match(input,31,FOLLOW_31_in_option268);  
                    stream_31.add(string_literal30);



                    // AST REWRITE
                    // elements: value, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:26: -> ^( OPTION ID value )
                    {
                        // GuiceyData.g:50:29: ^( OPTION ID value )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // GuiceyData.g:52:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal31=(Token)match(input,28,FOLLOW_28_in_option284);  
                    stream_28.add(char_literal31);

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_option286);  
                    stream_ID.add(ID32);

                    char_literal33=(Token)match(input,30,FOLLOW_30_in_option288);  
                    stream_30.add(char_literal33);

                    // GuiceyData.g:52:15: ( pair ',' )*
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
                    	    // GuiceyData.g:52:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option291);
                    	    pair34=pair();

                    	    state._fsp--;

                    	    stream_pair.add(pair34.getTree());
                    	    char_literal35=(Token)match(input,27,FOLLOW_27_in_option293);  
                    	    stream_27.add(char_literal35);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option297);
                    pair36=pair();

                    state._fsp--;

                    stream_pair.add(pair36.getTree());
                    string_literal37=(Token)match(input,31,FOLLOW_31_in_option299);  
                    stream_31.add(string_literal37);



                    // AST REWRITE
                    // elements: ID, pair
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // GuiceyData.g:52:40: ^( OPTION ID ( pair )+ )
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

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:55:1: pair : key '=' value -> ^( PAIR key value ) ;
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
            // GuiceyData.g:56:2: ( key '=' value -> ^( PAIR key value ) )
            // GuiceyData.g:56:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair322);
            key38=key();

            state._fsp--;

            stream_key.add(key38.getTree());
            char_literal39=(Token)match(input,32,FOLLOW_32_in_pair324);  
            stream_32.add(char_literal39);

            pushFollow(FOLLOW_value_in_pair326);
            value40=value();

            state._fsp--;

            stream_value.add(value40.getTree());


            // AST REWRITE
            // elements: value, key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:18: -> ^( PAIR key value )
            {
                // GuiceyData.g:56:21: ^( PAIR key value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_key.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:59:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID41=null;

        Object ID41_tree=null;

        try {
            // GuiceyData.g:60:2: ( ID )
            // GuiceyData.g:60:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID41=(Token)match(input,ID,FOLLOW_ID_in_key348); 
            ID41_tree = (Object)adaptor.create(ID41);
            adaptor.addChild(root_0, ID41_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:62:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try {
            // GuiceyData.g:63:2: ( INT | FLOAT | STRING )
            // GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set42));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:68:1: property : ( 'map<' key_type ',' value_type '>' ID ';' -> ^( PROPERTY ID TYPE_MAP key_type value_type ) | 'set<' type '>' ID ';' -> ^( PROPERTY ID TYPE_SET type ) | 'list<' type '>' ID ';' -> ^( PROPERTY ID TYPE_LIST type ) | type 'data;' -> ^( PROPERTY 'data' TYPE_PRIMITIVE type ) | type ID ';' -> ^( PROPERTY ID TYPE_PRIMITIVE type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token ID48=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token char_literal52=null;
        Token ID53=null;
        Token char_literal54=null;
        Token string_literal55=null;
        Token char_literal57=null;
        Token ID58=null;
        Token char_literal59=null;
        Token string_literal61=null;
        Token ID63=null;
        Token char_literal64=null;
        GuiceyDataParser.key_type_return key_type44 = null;

        GuiceyDataParser.value_type_return value_type46 = null;

        GuiceyDataParser.type_return type51 = null;

        GuiceyDataParser.type_return type56 = null;

        GuiceyDataParser.type_return type60 = null;

        GuiceyDataParser.type_return type62 = null;


        Object string_literal43_tree=null;
        Object char_literal45_tree=null;
        Object char_literal47_tree=null;
        Object ID48_tree=null;
        Object char_literal49_tree=null;
        Object string_literal50_tree=null;
        Object char_literal52_tree=null;
        Object ID53_tree=null;
        Object char_literal54_tree=null;
        Object string_literal55_tree=null;
        Object char_literal57_tree=null;
        Object ID58_tree=null;
        Object char_literal59_tree=null;
        Object string_literal61_tree=null;
        Object ID63_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_value_type=new RewriteRuleSubtreeStream(adaptor,"rule value_type");
        RewriteRuleSubtreeStream stream_key_type=new RewriteRuleSubtreeStream(adaptor,"rule key_type");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // GuiceyData.g:69:2: ( 'map<' key_type ',' value_type '>' ID ';' -> ^( PROPERTY ID TYPE_MAP key_type value_type ) | 'set<' type '>' ID ';' -> ^( PROPERTY ID TYPE_SET type ) | 'list<' type '>' ID ';' -> ^( PROPERTY ID TYPE_LIST type ) | type 'data;' -> ^( PROPERTY 'data' TYPE_PRIMITIVE type ) | type ID ';' -> ^( PROPERTY ID TYPE_PRIMITIVE type ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case ID:
            case TYPE:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==38) ) {
                    alt10=4;
                }
                else if ( (LA10_4==ID) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // GuiceyData.g:69:4: 'map<' key_type ',' value_type '>' ID ';'
                    {
                    string_literal43=(Token)match(input,33,FOLLOW_33_in_property380);  
                    stream_33.add(string_literal43);

                    pushFollow(FOLLOW_key_type_in_property382);
                    key_type44=key_type();

                    state._fsp--;

                    stream_key_type.add(key_type44.getTree());
                    char_literal45=(Token)match(input,27,FOLLOW_27_in_property384);  
                    stream_27.add(char_literal45);

                    pushFollow(FOLLOW_value_type_in_property386);
                    value_type46=value_type();

                    state._fsp--;

                    stream_value_type.add(value_type46.getTree());
                    char_literal47=(Token)match(input,34,FOLLOW_34_in_property388);  
                    stream_34.add(char_literal47);

                    ID48=(Token)match(input,ID,FOLLOW_ID_in_property390);  
                    stream_ID.add(ID48);

                    char_literal49=(Token)match(input,35,FOLLOW_35_in_property392);  
                    stream_35.add(char_literal49);



                    // AST REWRITE
                    // elements: value_type, key_type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:46: -> ^( PROPERTY ID TYPE_MAP key_type value_type )
                    {
                        // GuiceyData.g:69:49: ^( PROPERTY ID TYPE_MAP key_type value_type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, (Object)adaptor.create(TYPE_MAP, "TYPE_MAP"));
                        adaptor.addChild(root_1, stream_key_type.nextTree());
                        adaptor.addChild(root_1, stream_value_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // GuiceyData.g:70:4: 'set<' type '>' ID ';'
                    {
                    string_literal50=(Token)match(input,36,FOLLOW_36_in_property411);  
                    stream_36.add(string_literal50);

                    pushFollow(FOLLOW_type_in_property413);
                    type51=type();

                    state._fsp--;

                    stream_type.add(type51.getTree());
                    char_literal52=(Token)match(input,34,FOLLOW_34_in_property415);  
                    stream_34.add(char_literal52);

                    ID53=(Token)match(input,ID,FOLLOW_ID_in_property417);  
                    stream_ID.add(ID53);

                    char_literal54=(Token)match(input,35,FOLLOW_35_in_property419);  
                    stream_35.add(char_literal54);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:27: -> ^( PROPERTY ID TYPE_SET type )
                    {
                        // GuiceyData.g:70:30: ^( PROPERTY ID TYPE_SET type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // GuiceyData.g:71:4: 'list<' type '>' ID ';'
                    {
                    string_literal55=(Token)match(input,37,FOLLOW_37_in_property436);  
                    stream_37.add(string_literal55);

                    pushFollow(FOLLOW_type_in_property438);
                    type56=type();

                    state._fsp--;

                    stream_type.add(type56.getTree());
                    char_literal57=(Token)match(input,34,FOLLOW_34_in_property440);  
                    stream_34.add(char_literal57);

                    ID58=(Token)match(input,ID,FOLLOW_ID_in_property442);  
                    stream_ID.add(ID58);

                    char_literal59=(Token)match(input,35,FOLLOW_35_in_property444);  
                    stream_35.add(char_literal59);



                    // AST REWRITE
                    // elements: type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:28: -> ^( PROPERTY ID TYPE_LIST type )
                    {
                        // GuiceyData.g:71:31: ^( PROPERTY ID TYPE_LIST type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // GuiceyData.g:72:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property462);
                    type60=type();

                    state._fsp--;

                    stream_type.add(type60.getTree());
                    string_literal61=(Token)match(input,38,FOLLOW_38_in_property464);  
                    stream_38.add(string_literal61);



                    // AST REWRITE
                    // elements: type, DATA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:17: -> ^( PROPERTY 'data' TYPE_PRIMITIVE type )
                    {
                        // GuiceyData.g:72:20: ^( PROPERTY 'data' TYPE_PRIMITIVE type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DATA, "DATA"));
                        adaptor.addChild(root_1, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // GuiceyData.g:73:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property481);
                    type62=type();

                    state._fsp--;

                    stream_type.add(type62.getTree());
                    ID63=(Token)match(input,ID,FOLLOW_ID_in_property483);  
                    stream_ID.add(ID63);

                    char_literal64=(Token)match(input,35,FOLLOW_35_in_property485);  
                    stream_35.add(char_literal64);



                    // AST REWRITE
                    // elements: type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:16: -> ^( PROPERTY ID TYPE_PRIMITIVE type )
                    {
                        // GuiceyData.g:73:19: ^( PROPERTY ID TYPE_PRIMITIVE type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:76:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type65 = null;



        try {
            // GuiceyData.g:77:2: ( type )
            // GuiceyData.g:77:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type508);
            type65=type();

            state._fsp--;

            adaptor.addChild(root_0, type65.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:80:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type66 = null;



        try {
            // GuiceyData.g:81:2: ( type )
            // GuiceyData.g:81:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type519);
            type66=type();

            state._fsp--;

            adaptor.addChild(root_0, type66.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // GuiceyData.g:84:1: type : ( ID | TYPE );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set67=null;

        Object set67_tree=null;

        try {
            // GuiceyData.g:85:2: ( ID | TYPE )
            // GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==TYPE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set67));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_entry_in_start102 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_entry115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_entry120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data130 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_type_in_data132 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_data134 = new BitSet(new long[]{0x0000003212023010L});
    public static final BitSet FOLLOW_data_entry_in_data136 = new BitSet(new long[]{0x0000003212023010L});
    public static final BitSet FOLLOW_25_in_data139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration161 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_type_in_enumeration163 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration178 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_type_in_enumeration180 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_enumeration182 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_value_type_in_enumeration185 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration187 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_value_type_in_enumeration191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_enumeration193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_data_entry220 = new BitSet(new long[]{0x0000003210023010L});
    public static final BitSet FOLLOW_property_in_data_entry223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option245 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_option247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option262 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option264 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_option266 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_option284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_option286 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option291 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_option293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_option297 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair322 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_pair324 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_value_in_pair326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_property380 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_key_type_in_property382 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_property384 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_value_type_in_property386 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property388 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property390 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_property392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_property411 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_type_in_property413 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property415 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property417 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_property419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_property436 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_type_in_property438 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property440 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property442 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_property444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property462 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_property464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_property483 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_property485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});

}