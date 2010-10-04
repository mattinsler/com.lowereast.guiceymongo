// $ANTLR 3.2 Sep 23, 2009 12:02:23 GuiceyData.g 2010-05-26 15:57:53

package com.lowereast.guiceymongo.data.generator.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GuiceyDataLexer extends Lexer {
    public static final int EXPONENT=19;
    public static final int T__29=29;
    public static final int OPTION=10;
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
    public static final int T__33=33;
    public static final int WS=18;
    public static final int ESC_SEQ=20;
    public static final int T__34=34;
    public static final int ENUM=12;
    public static final int T__35=35;
    public static final int TYPE_MAP=5;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int PROPERTY=9;
    public static final int T__38=38;
    public static final int TYPE_SET=6;
    public static final int PAIR=11;
    public static final int DATA=4;
    public static final int STRING=16;

    // delegates
    // delegators

    public GuiceyDataLexer() {;} 
    public GuiceyDataLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GuiceyDataLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "GuiceyData.g"; }

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:11:6: ( 'data' )
            // GuiceyData.g:11:8: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "TYPE_MAP"
    public final void mTYPE_MAP() throws RecognitionException {
        try {
            int _type = TYPE_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:12:10: ( 'map' )
            // GuiceyData.g:12:12: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_MAP"

    // $ANTLR start "TYPE_SET"
    public final void mTYPE_SET() throws RecognitionException {
        try {
            int _type = TYPE_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:13:10: ( 'set' )
            // GuiceyData.g:13:12: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_SET"

    // $ANTLR start "TYPE_LIST"
    public final void mTYPE_LIST() throws RecognitionException {
        try {
            int _type = TYPE_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:14:11: ( 'list' )
            // GuiceyData.g:14:13: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_LIST"

    // $ANTLR start "TYPE_PRIMITIVE"
    public final void mTYPE_PRIMITIVE() throws RecognitionException {
        try {
            int _type = TYPE_PRIMITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:15:16: ( 'primitive' )
            // GuiceyData.g:15:18: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_PRIMITIVE"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:16:10: ( 'property' )
            // GuiceyData.g:16:12: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPERTY"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:17:8: ( 'option' )
            // GuiceyData.g:17:10: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTION"

    // $ANTLR start "PAIR"
    public final void mPAIR() throws RecognitionException {
        try {
            int _type = PAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:18:6: ( 'pair' )
            // GuiceyData.g:18:8: 'pair'
            {
            match("pair"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAIR"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:19:6: ( 'enum' )
            // GuiceyData.g:19:8: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:20:7: ( '{' )
            // GuiceyData.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:21:7: ( '}' )
            // GuiceyData.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:22:7: ( '{}' )
            // GuiceyData.g:22:9: '{}'
            {
            match("{}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:23:7: ( ',' )
            // GuiceyData.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:24:7: ( '[' )
            // GuiceyData.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:25:7: ( ']' )
            // GuiceyData.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:26:7: ( '(' )
            // GuiceyData.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:27:7: ( ')]' )
            // GuiceyData.g:27:9: ')]'
            {
            match(")]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:28:7: ( '=' )
            // GuiceyData.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:29:7: ( 'data;' )
            // GuiceyData.g:29:9: 'data;'
            {
            match("data;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:30:7: ( ';' )
            // GuiceyData.g:30:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:31:7: ( 'map<' )
            // GuiceyData.g:31:9: 'map<'
            {
            match("map<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:32:7: ( '>' )
            // GuiceyData.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:33:7: ( 'set<' )
            // GuiceyData.g:33:9: 'set<'
            {
            match("set<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:34:7: ( 'list<' )
            // GuiceyData.g:34:9: 'list<'
            {
            match("list<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:98:6: ( ID ( '.' ID )+ )
            // GuiceyData.g:98:8: ID ( '.' ID )+
            {
            mID(); 
            // GuiceyData.g:98:11: ( '.' ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // GuiceyData.g:98:12: '.' ID
            	    {
            	    match('.'); 
            	    mID(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:101:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // GuiceyData.g:101:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // GuiceyData.g:101:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // GuiceyData.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:104:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // GuiceyData.g:104:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:111:5: ( ( '0' .. '9' )+ )
            // GuiceyData.g:111:7: ( '0' .. '9' )+
            {
            // GuiceyData.g:111:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // GuiceyData.g:111:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:115:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // GuiceyData.g:115:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // GuiceyData.g:115:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // GuiceyData.g:115:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // GuiceyData.g:115:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // GuiceyData.g:115:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // GuiceyData.g:115:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // GuiceyData.g:115:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // GuiceyData.g:116:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // GuiceyData.g:116:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // GuiceyData.g:116:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // GuiceyData.g:116:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // GuiceyData.g:116:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // GuiceyData.g:117:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // GuiceyData.g:117:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // GuiceyData.g:117:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GuiceyData.g:126:5: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // GuiceyData.g:126:8: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // GuiceyData.g:126:13: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // GuiceyData.g:126:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // GuiceyData.g:126:25: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // GuiceyData.g:130:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // GuiceyData.g:130:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // GuiceyData.g:130:22: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // GuiceyData.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // GuiceyData.g:130:33: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // GuiceyData.g:130:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // GuiceyData.g:133:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // GuiceyData.g:133:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // GuiceyData.g:137:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt14=1;
                    }
                    break;
                case 'u':
                    {
                    alt14=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // GuiceyData.g:137:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // GuiceyData.g:138:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // GuiceyData.g:139:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // GuiceyData.g:144:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>='0' && LA15_1<='3')) ) {
                    int LA15_2 = input.LA(3);

                    if ( ((LA15_2>='0' && LA15_2<='7')) ) {
                        int LA15_5 = input.LA(4);

                        if ( ((LA15_5>='0' && LA15_5<='7')) ) {
                            alt15=1;
                        }
                        else {
                            alt15=2;}
                    }
                    else {
                        alt15=3;}
                }
                else if ( ((LA15_1>='4' && LA15_1<='7')) ) {
                    int LA15_3 = input.LA(3);

                    if ( ((LA15_3>='0' && LA15_3<='7')) ) {
                        alt15=2;
                    }
                    else {
                        alt15=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // GuiceyData.g:144:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // GuiceyData.g:144:14: ( '0' .. '3' )
                    // GuiceyData.g:144:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // GuiceyData.g:144:25: ( '0' .. '7' )
                    // GuiceyData.g:144:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // GuiceyData.g:144:36: ( '0' .. '7' )
                    // GuiceyData.g:144:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // GuiceyData.g:145:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // GuiceyData.g:145:14: ( '0' .. '7' )
                    // GuiceyData.g:145:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // GuiceyData.g:145:25: ( '0' .. '7' )
                    // GuiceyData.g:145:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // GuiceyData.g:146:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // GuiceyData.g:146:14: ( '0' .. '7' )
                    // GuiceyData.g:146:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // GuiceyData.g:151:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // GuiceyData.g:151:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // GuiceyData.g:1:8: ( DATA | TYPE_MAP | TYPE_SET | TYPE_LIST | TYPE_PRIMITIVE | PROPERTY | OPTION | PAIR | ENUM | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | TYPE | ID | WS | INT | FLOAT | STRING )
        int alt16=30;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // GuiceyData.g:1:10: DATA
                {
                mDATA(); 

                }
                break;
            case 2 :
                // GuiceyData.g:1:15: TYPE_MAP
                {
                mTYPE_MAP(); 

                }
                break;
            case 3 :
                // GuiceyData.g:1:24: TYPE_SET
                {
                mTYPE_SET(); 

                }
                break;
            case 4 :
                // GuiceyData.g:1:33: TYPE_LIST
                {
                mTYPE_LIST(); 

                }
                break;
            case 5 :
                // GuiceyData.g:1:43: TYPE_PRIMITIVE
                {
                mTYPE_PRIMITIVE(); 

                }
                break;
            case 6 :
                // GuiceyData.g:1:58: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 7 :
                // GuiceyData.g:1:67: OPTION
                {
                mOPTION(); 

                }
                break;
            case 8 :
                // GuiceyData.g:1:74: PAIR
                {
                mPAIR(); 

                }
                break;
            case 9 :
                // GuiceyData.g:1:79: ENUM
                {
                mENUM(); 

                }
                break;
            case 10 :
                // GuiceyData.g:1:84: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // GuiceyData.g:1:90: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // GuiceyData.g:1:96: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // GuiceyData.g:1:102: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // GuiceyData.g:1:108: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // GuiceyData.g:1:114: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // GuiceyData.g:1:120: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // GuiceyData.g:1:126: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // GuiceyData.g:1:132: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // GuiceyData.g:1:138: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // GuiceyData.g:1:144: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // GuiceyData.g:1:150: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // GuiceyData.g:1:156: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // GuiceyData.g:1:162: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // GuiceyData.g:1:168: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // GuiceyData.g:1:174: TYPE
                {
                mTYPE(); 

                }
                break;
            case 26 :
                // GuiceyData.g:1:179: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // GuiceyData.g:1:182: WS
                {
                mWS(); 

                }
                break;
            case 28 :
                // GuiceyData.g:1:185: INT
                {
                mINT(); 

                }
                break;
            case 29 :
                // GuiceyData.g:1:189: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 30 :
                // GuiceyData.g:1:195: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
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
            return "114:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\7\31\1\43\11\uffff\1\31\1\uffff\1\44\2\uffff\2\31\2\uffff"+
        "\7\31\3\uffff\1\31\1\60\1\62\6\31\1\72\4\uffff\1\74\2\31\1\77\1"+
        "\31\1\101\4\uffff\2\31\1\uffff\1\31\1\uffff\2\31\1\107\2\31\1\uffff"+
        "\1\31\1\113\1\114\2\uffff";
    static final String DFA16_eofS =
        "\115\uffff";
    static final String DFA16_minS =
        "\1\11\7\56\1\175\11\uffff\1\56\1\uffff\1\56\2\uffff\2\56\2\uffff"+
        "\7\56\3\uffff\12\56\4\uffff\6\56\4\uffff\2\56\1\uffff\1\56\1\uffff"+
        "\5\56\1\uffff\3\56\2\uffff";
    static final String DFA16_maxS =
        "\1\175\7\172\1\175\11\uffff\1\172\1\uffff\1\145\2\uffff\2\172\2"+
        "\uffff\7\172\3\uffff\12\172\4\uffff\6\172\4\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\5\172\1\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\11\uffff\1\13\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\26\1\uffff\1"+
        "\33\1\uffff\1\35\1\36\2\uffff\1\32\1\31\7\uffff\1\14\1\12\1\34\12"+
        "\uffff\1\25\1\2\1\27\1\3\6\uffff\1\23\1\1\1\30\1\4\2\uffff\1\10"+
        "\1\uffff\1\11\5\uffff\1\7\3\uffff\1\6\1\5";
    static final String DFA16_specialS =
        "\115\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\6\uffff\1\26\1\15\1\16\2\uffff"+
            "\1\12\1\uffff\1\25\1\uffff\12\24\1\uffff\1\20\1\uffff\1\17\1"+
            "\21\2\uffff\32\22\1\13\1\uffff\1\14\3\uffff\3\22\1\1\1\7\6\22"+
            "\1\4\1\2\1\22\1\6\1\5\2\22\1\3\7\22\1\10\1\uffff\1\11",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\27"+
            "\31\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\33"+
            "\31\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30"+
            "\1\34\25\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\35\21\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\37"+
            "\20\30\1\36\10\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\17\30"+
            "\1\40\12\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\15\30"+
            "\1\41\14\30",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\25\1\uffff\12\24\13\uffff\1\25\37\uffff\1\25",
            "",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\45\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\17\30"+
            "\1\46\12\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\47\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30"+
            "\1\50\7\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\51\5\30\1\52\13\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\53\21\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\54\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\24\30"+
            "\1\55\5\30",
            "",
            "",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\56"+
            "\31\30",
            "\1\32\1\uffff\12\30\2\uffff\1\57\4\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30",
            "\1\32\1\uffff\12\30\2\uffff\1\61\4\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\63\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\14\30"+
            "\1\64\15\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\17\30"+
            "\1\65\12\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\21\30"+
            "\1\66\10\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\67\21\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\14\30"+
            "\1\70\15\30",
            "\1\32\1\uffff\12\30\1\uffff\1\71\5\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "\1\32\1\uffff\12\30\2\uffff\1\73\4\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\75\21\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30"+
            "\1\76\25\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\16\30"+
            "\1\100\13\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\102\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\21\30"+
            "\1\103\10\30",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\15\30"+
            "\1\104\14\30",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\10\30"+
            "\1\105\21\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30"+
            "\1\106\6\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\25\30"+
            "\1\110\4\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\30\30"+
            "\1\111\1\30",
            "",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30"+
            "\1\112\25\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\32\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DATA | TYPE_MAP | TYPE_SET | TYPE_LIST | TYPE_PRIMITIVE | PROPERTY | OPTION | PAIR | ENUM | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | TYPE | ID | WS | INT | FLOAT | STRING );";
        }
    }
 

}