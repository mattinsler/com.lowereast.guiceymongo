// $ANTLR 3.2 Sep 23, 2009 14:05:07 com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g 2010-10-25 20:04:49

package com.lowereast.guiceymongo.data.generator.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GuiceyDataLexer extends Lexer {
    public static final int T__42=42;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int EXPONENT=21;
    public static final int OPTION=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int UNICODE_ESC=24;
    public static final int OCTAL_ESC=25;
    public static final int HEX_DIGIT=23;
    public static final int FLOAT=17;
    public static final int INT=16;
    public static final int TYPE_LIST=7;
    public static final int ID=14;
    public static final int EOF=-1;
    public static final int TYPE_PRIMITIVE=9;
    public static final int TYPE=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int PARAMETERIZED_TYPE=8;
    public static final int T__33=33;
    public static final int WS=20;
    public static final int ESC_SEQ=22;
    public static final int T__34=34;
    public static final int ENUM=13;
    public static final int T__35=35;
    public static final int TYPE_MAP=5;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int PROPERTY=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int TYPE_SET=6;
    public static final int PAIR=12;
    public static final int COMMENT=15;
    public static final int DATA=4;
    public static final int STRING=18;

    // delegates
    // delegators

    public GuiceyDataLexer() {;} 
    public GuiceyDataLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GuiceyDataLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g"; }

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:11:6: ( 'data' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:11:8: 'data'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:12:10: ( 'map' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:12:12: 'map'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:13:10: ( 'set' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:13:12: 'set'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:14:11: ( 'list' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:14:13: 'list'
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

    // $ANTLR start "PARAMETERIZED_TYPE"
    public final void mPARAMETERIZED_TYPE() throws RecognitionException {
        try {
            int _type = PARAMETERIZED_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:15:20: ( 'parameterized-type' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:15:22: 'parameterized-type'
            {
            match("parameterized-type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAMETERIZED_TYPE"

    // $ANTLR start "TYPE_PRIMITIVE"
    public final void mTYPE_PRIMITIVE() throws RecognitionException {
        try {
            int _type = TYPE_PRIMITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:16:16: ( 'primitive' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:16:18: 'primitive'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:17:10: ( 'property' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:17:12: 'property'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:18:8: ( 'option' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:18:10: 'option'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:19:6: ( 'pair' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:19:8: 'pair'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:20:6: ( 'enum' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:20:8: 'enum'
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

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:21:7: ( '{' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:21:9: '{'
            {
            match('{'); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:22:7: ( '}' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:22:9: '}'
            {
            match('}'); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:23:7: ( '{}' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:23:9: '{}'
            {
            match("{}"); 


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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:24:7: ( ',' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:24:9: ','
            {
            match(','); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:25:7: ( '#' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:25:9: '#'
            {
            match('#'); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:26:7: ( '[' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:26:9: '['
            {
            match('['); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:27:7: ( ']' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:27:9: ']'
            {
            match(']'); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:28:7: ( '(' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:28:9: '('
            {
            match('('); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:29:7: ( ')]' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:29:9: ')]'
            {
            match(")]"); 


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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:30:7: ( '=' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:30:9: '='
            {
            match('='); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:31:7: ( 'data;' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:31:9: 'data;'
            {
            match("data;"); 


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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:32:7: ( ';' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:32:9: ';'
            {
            match(';'); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:33:7: ( 'map<' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:33:9: 'map<'
            {
            match("map<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:34:7: ( '>' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:34:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:35:7: ( 'set<' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:35:9: 'set<'
            {
            match("set<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:36:7: ( 'list<' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:36:9: 'list<'
            {
            match("list<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:37:7: ( '<' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:37:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:2: ( (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' | '\\r' ) )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:4: (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' | '\\r' )
            {
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:4: (~ ( '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:4: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:22: ( ( '\\r' )? '\\n' | '\\r' )
            int alt3=2;
            switch ( input.LA(1) ) {
            case '\r':
                {
                switch ( input.LA(2) ) {
                case '\n':
                    {
                    alt3=1;
                    }
                    break;
                default:
                    alt3=2;}

                }
                break;
            case '\n':
                {
                alt3=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:24: ( '\\r' )? '\\n'
                    {
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:24: ( '\\r' )?
                    int alt2=2;
                    switch ( input.LA(1) ) {
                        case '\r':
                            {
                            alt2=1;
                            }
                            break;
                    }

                    switch (alt2) {
                        case 1 :
                            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:24: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:56:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:108:6: ( ID ( '.' ID )+ )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:108:8: ID ( '.' ID )+
            {
            mID(); 
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:108:11: ( '.' ID )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case '.':
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:108:12: '.' ID
            	    {
            	    match('.'); 
            	    mID(); 

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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:111:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:111:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:111:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:
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
            	    break loop5;
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:114:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:114:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:121:5: ( ( '0' .. '9' )+ )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:121:7: ( '0' .. '9' )+
            {
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:121:7: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:121:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:10: '0' .. '9'
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

                    match('.'); 
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:37: ( EXPONENT )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:125:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:126:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:126:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:126:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:126:25: ( EXPONENT )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt11=1;
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:126:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:127:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:127:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:127:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:136:5: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:136:8: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:136:13: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:136:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:136:25: ~ ( '\\\\' | '\\'' )
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
            	    break loop14;
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:140:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:140:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:140:22: ( '+' | '-' )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:
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

            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:140:33: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:140:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:143:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:143:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:147:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt17=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
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
                    alt17=1;
                    }
                    break;
                case 'u':
                    {
                    alt17=2;
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
                    alt17=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:147:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:148:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:149:9: OCTAL_ESC
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        switch ( input.LA(4) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                            {
                            alt18=1;
                            }
                            break;
                        default:
                            alt18=2;}

                        }
                        break;
                    default:
                        alt18=3;}

                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        alt18=3;}

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:14: ( '0' .. '3' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:25: ( '0' .. '7' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:36: ( '0' .. '7' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:154:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:155:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:155:14: ( '0' .. '7' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:155:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:155:25: ( '0' .. '7' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:155:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:156:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:156:14: ( '0' .. '7' )
                    // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:156:15: '0' .. '7'
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
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:161:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:161:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:8: ( DATA | TYPE_MAP | TYPE_SET | TYPE_LIST | PARAMETERIZED_TYPE | TYPE_PRIMITIVE | PROPERTY | OPTION | PAIR | ENUM | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | COMMENT | TYPE | ID | WS | INT | FLOAT | STRING )
        int alt19=34;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:10: DATA
                {
                mDATA(); 

                }
                break;
            case 2 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:15: TYPE_MAP
                {
                mTYPE_MAP(); 

                }
                break;
            case 3 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:24: TYPE_SET
                {
                mTYPE_SET(); 

                }
                break;
            case 4 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:33: TYPE_LIST
                {
                mTYPE_LIST(); 

                }
                break;
            case 5 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:43: PARAMETERIZED_TYPE
                {
                mPARAMETERIZED_TYPE(); 

                }
                break;
            case 6 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:62: TYPE_PRIMITIVE
                {
                mTYPE_PRIMITIVE(); 

                }
                break;
            case 7 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:77: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 8 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:86: OPTION
                {
                mOPTION(); 

                }
                break;
            case 9 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:93: PAIR
                {
                mPAIR(); 

                }
                break;
            case 10 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:98: ENUM
                {
                mENUM(); 

                }
                break;
            case 11 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:103: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:109: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:115: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:121: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:127: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:133: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:139: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:145: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:151: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:157: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:163: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:169: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:175: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:181: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:187: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:193: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:199: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:205: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 29 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:213: TYPE
                {
                mTYPE(); 

                }
                break;
            case 30 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:218: ID
                {
                mID(); 

                }
                break;
            case 31 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:221: WS
                {
                mWS(); 

                }
                break;
            case 32 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:224: INT
                {
                mINT(); 

                }
                break;
            case 33 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:228: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 34 :
                // com/lowereast/guiceymongo/data/generator/parser/GuiceyData.g:1:234: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
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
            return "124:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\7\36\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\uffff\1\60\1"+
        "\61\1\62\1\63\1\36\2\uffff\1\64\1\67\3\uffff\2\36\2\uffff\7\36\1"+
        "\111\7\uffff\1\112\6\uffff\1\117\1\uffff\1\117\1\uffff\1\33\1\125"+
        "\1\33\1\uffff\1\36\1\130\1\132\1\134\7\36\3\uffff\2\117\10\uffff"+
        "\1\154\1\130\1\uffff\1\155\1\uffff\1\156\1\uffff\1\160\1\36\1\162"+
        "\3\36\1\166\1\uffff\1\117\1\uffff\1\117\3\uffff\1\171\3\uffff\1"+
        "\172\1\uffff\1\36\1\uffff\3\36\5\uffff\3\36\1\u0083\1\uffff\3\36"+
        "\2\uffff\2\36\1\u008a\1\36\1\u008c\1\uffff\1\36\1\uffff\3\36\4\uffff"+
        "\1\u0095\1\uffff";
    static final String DFA19_eofS =
        "\u0096\uffff";
    static final String DFA19_minS =
        "\25\0\2\uffff\4\0\1\uffff\2\0\1\uffff\11\0\7\uffff\1\0\5\uffff\2"+
        "\0\1\uffff\21\0\2\uffff\4\0\1\uffff\5\0\1\uffff\2\0\1\uffff\1\0"+
        "\1\uffff\1\0\1\uffff\17\0\3\uffff\1\0\1\uffff\1\0\1\uffff\3\0\1"+
        "\uffff\2\0\2\uffff\10\0\1\uffff\6\0\1\uffff\1\0\1\uffff\10\0\1\uffff";
    static final String DFA19_maxS =
        "\25\uffff\2\uffff\4\uffff\1\uffff\2\uffff\1\uffff\11\uffff\7\uffff"+
        "\1\uffff\5\uffff\2\uffff\1\uffff\21\uffff\2\uffff\4\uffff\1\uffff"+
        "\5\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff"+
        "\17\uffff\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\3\uffff\1\uffff"+
        "\2\uffff\2\uffff\10\uffff\1\uffff\6\uffff\1\uffff\1\uffff\1\uffff"+
        "\10\uffff\1\uffff";
    static final String DFA19_acceptS =
        "\25\uffff\2\34\4\uffff\1\34\2\uffff\1\36\11\uffff\1\13\1\14\1\16"+
        "\1\17\1\20\1\21\1\22\1\uffff\1\24\1\26\1\30\1\33\1\37\2\uffff\1"+
        "\40\21\uffff\1\15\1\23\4\uffff\1\41\5\uffff\1\42\2\uffff\1\35\1"+
        "\uffff\1\2\1\uffff\1\3\17\uffff\1\1\1\27\1\31\1\uffff\1\4\1\uffff"+
        "\1\11\3\uffff\1\12\2\uffff\1\25\1\32\10\uffff\1\10\6\uffff\1\7\1"+
        "\uffff\1\6\10\uffff\1\5";
    static final String DFA19_specialS =
        "\1\157\1\124\1\72\1\105\1\71\1\123\1\4\1\10\1\7\1\62\1\34\1\42\1"+
        "\112\1\130\1\77\1\101\1\103\1\153\1\140\1\5\1\152\2\uffff\1\106"+
        "\1\122\1\74\1\3\1\uffff\1\141\1\156\1\uffff\1\117\1\76\1\127\1\126"+
        "\1\161\1\160\1\23\1\44\1\21\7\uffff\1\75\5\uffff\1\114\1\145\1\uffff"+
        "\1\45\1\136\1\57\1\154\1\121\1\125\1\107\1\31\1\14\1\36\1\120\1"+
        "\104\1\32\1\66\1\15\1\24\1\43\2\uffff\1\41\1\132\1\155\1\115\1\uffff"+
        "\1\116\1\137\1\100\1\0\1\113\1\uffff\1\61\1\12\1\uffff\1\133\1\uffff"+
        "\1\134\1\uffff\1\11\1\50\1\142\1\65\1\16\1\25\1\102\1\40\1\2\1\37"+
        "\1\6\1\73\1\146\1\147\1\143\3\uffff\1\13\1\uffff\1\51\1\uffff\1"+
        "\64\1\17\1\26\1\uffff\1\110\1\144\2\uffff\1\46\1\63\1\20\1\151\1"+
        "\111\1\47\1\70\1\22\1\uffff\1\150\1\54\1\67\1\131\1\55\1\135\1\uffff"+
        "\1\52\1\uffff\1\53\1\56\1\60\1\27\1\30\1\33\1\35\1\1\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\33\1\27\1\26\2\33\1\25\22\33\1\27\2\33\1\13\3\33\1\32\1"+
            "\16\1\17\2\33\1\12\1\33\1\31\1\33\12\30\1\33\1\21\1\23\1\20"+
            "\1\22\2\33\32\24\1\14\1\33\1\15\3\33\3\24\1\1\1\7\6\24\1\4\1"+
            "\2\1\24\1\6\1\5\2\24\1\3\7\24\1\10\1\33\1\11\uff82\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\1\34\31\35"+
            "\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\1\40\31\35"+
            "\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\41"+
            "\25\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\42"+
            "\21\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\1\43\20\35"+
            "\1\44\10\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\17\35\1\45"+
            "\12\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\15\35\1\46"+
            "\14\35\uff85\33",
            "\175\33\1\47\uff82\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\135\33\1\57\uffa2\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\0\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "",
            "",
            "\0\33",
            "\56\33\1\66\1\33\12\30\13\33\1\65\37\33\1\65\uff9a\33",
            "\60\33\12\70\uffc6\33",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\76"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "",
            "\101\33\32\77\6\33\32\77\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\17\35\1\100"+
            "\12\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\101"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\22\35\1\102"+
            "\7\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\104"+
            "\10\35\1\103\10\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\105"+
            "\5\35\1\106\13\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\107"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\24\35\1\110"+
            "\5\35\uff85\33",
            "\0\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\33",
            "",
            "",
            "",
            "",
            "",
            "\53\33\1\113\1\33\1\113\2\33\12\114\uffc6\33",
            "\60\33\12\115\13\33\1\116\37\33\1\116\uff9a\33",
            "",
            "\60\33\12\70\13\33\1\120\37\33\1\120\uff9a\33",
            "\42\33\1\121\4\33\1\121\10\33\4\123\4\124\44\33\1\121\5\33"+
            "\1\121\3\33\1\121\7\33\1\121\3\33\1\121\1\33\1\121\1\122\uff8a"+
            "\33",
            "\12\125\1\74\ufff5\125",
            "\0\33",
            "\0\125",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\1\126\31\35"+
            "\uff85\33",
            "\56\33\1\37\1\33\12\127\7\33\32\127\4\33\1\127\1\33\32\127"+
            "\uff85\33",
            "\56\33\1\37\1\33\12\35\2\33\1\131\4\33\32\35\4\33\1\35\1\33"+
            "\32\35\uff85\33",
            "\56\33\1\37\1\33\12\35\2\33\1\133\4\33\32\35\4\33\1\35\1\33"+
            "\32\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\135"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\1\136\31\35"+
            "\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\21\35\1\137"+
            "\10\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\14\35\1\140"+
            "\15\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\17\35\1\141"+
            "\12\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\142"+
            "\21\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\14\35\1\143"+
            "\15\35\uff85\33",
            "",
            "",
            "\60\33\12\114\uffc6\33",
            "\60\33\12\114\uffc6\33",
            "\60\33\12\115\13\33\1\116\37\33\1\116\uff9a\33",
            "\53\33\1\144\1\33\1\144\2\33\12\145\uffc6\33",
            "",
            "\53\33\1\146\1\33\1\146\2\33\12\147\uffc6\33",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "\60\33\12\150\7\33\6\150\32\33\6\150\uff99\33",
            "\12\75\1\74\2\75\1\72\31\75\1\73\10\75\10\151\44\75\1\71\uffa3"+
            "\75",
            "\12\75\1\74\2\75\1\72\31\75\1\73\10\75\10\152\44\75\1\71\uffa3"+
            "\75",
            "",
            "\56\33\1\37\1\33\12\35\1\33\1\153\5\33\32\35\4\33\1\35\1\33"+
            "\32\35\uff85\33",
            "\56\33\1\37\1\33\12\127\7\33\32\127\4\33\1\127\1\33\32\127"+
            "\uff85\33",
            "",
            "\0\33",
            "",
            "\0\33",
            "",
            "\56\33\1\37\1\33\12\35\2\33\1\157\4\33\32\35\4\33\1\35\1\33"+
            "\32\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\14\35\1\161"+
            "\15\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\163"+
            "\21\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\164"+
            "\25\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\16\35\1\165"+
            "\13\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "\60\33\12\145\uffc6\33",
            "\60\33\12\145\uffc6\33",
            "\60\33\12\147\uffc6\33",
            "\60\33\12\147\uffc6\33",
            "\60\33\12\167\7\33\6\167\32\33\6\167\uff99\33",
            "\12\75\1\74\2\75\1\72\31\75\1\73\10\75\10\170\44\75\1\71\uffa3"+
            "\75",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "\0\33",
            "",
            "",
            "",
            "\0\33",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\173"+
            "\25\35\uff85\33",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\174"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\21\35\1\175"+
            "\10\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\15\35\1\176"+
            "\14\35\uff85\33",
            "",
            "\60\33\12\177\7\33\6\177\32\33\6\177\uff99\33",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\u0080"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\u0081"+
            "\21\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\23\35\1\u0082"+
            "\6\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "\60\33\12\u0084\7\33\6\u0084\32\33\6\u0084\uff99\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\u0085"+
            "\25\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\25\35\1\u0086"+
            "\4\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\30\35\1\u0087"+
            "\1\35\uff85\33",
            "",
            "\12\75\1\74\2\75\1\72\31\75\1\73\64\75\1\71\uffa3\75",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\21\35\1\u0088"+
            "\10\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\u0089"+
            "\25\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\10\35\1\u008b"+
            "\21\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32\35\uff85"+
            "\33",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\31\35\1\u008d"+
            "\uff85\33",
            "",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\4\35\1\u008e"+
            "\25\35\uff85\33",
            "\56\33\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\3\35\1\u008f"+
            "\26\35\uff85\33",
            "\55\33\1\u0090\1\37\1\33\12\35\7\33\32\35\4\33\1\35\1\33\32"+
            "\35\uff85\33",
            "\164\33\1\u0091\uff8b\33",
            "\171\33\1\u0092\uff86\33",
            "\160\33\1\u0093\uff8f\33",
            "\145\33\1\u0094\uff9a\33",
            "\0\33",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DATA | TYPE_MAP | TYPE_SET | TYPE_LIST | PARAMETERIZED_TYPE | TYPE_PRIMITIVE | PROPERTY | OPTION | PAIR | ENUM | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | COMMENT | TYPE | ID | WS | INT | FLOAT | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_83 = input.LA(1);

                        s = -1;
                        if ( (LA19_83=='\'') ) {s = 59;}

                        else if ( (LA19_83=='\\') ) {s = 57;}

                        else if ( ((LA19_83>='0' && LA19_83<='7')) ) {s = 105;}

                        else if ( (LA19_83=='\r') ) {s = 58;}

                        else if ( (LA19_83=='\n') ) {s = 60;}

                        else if ( ((LA19_83>='\u0000' && LA19_83<='\t')||(LA19_83>='\u000B' && LA19_83<='\f')||(LA19_83>='\u000E' && LA19_83<='&')||(LA19_83>='(' && LA19_83<='/')||(LA19_83>='8' && LA19_83<='[')||(LA19_83>=']' && LA19_83<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_148 = input.LA(1);

                        s = -1;
                        if ( ((LA19_148>='\u0000' && LA19_148<='\uFFFF')) ) {s = 27;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_101 = input.LA(1);

                        s = -1;
                        if ( ((LA19_101>='0' && LA19_101<='9')) ) {s = 101;}

                        else if ( ((LA19_101>='\u0000' && LA19_101<='/')||(LA19_101>=':' && LA19_101<='\uFFFF')) ) {s = 27;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_26 = input.LA(1);

                        s = -1;
                        if ( (LA19_26=='\\') ) {s = 57;}

                        else if ( (LA19_26=='\r') ) {s = 58;}

                        else if ( (LA19_26=='\'') ) {s = 59;}

                        else if ( (LA19_26=='\n') ) {s = 60;}

                        else if ( ((LA19_26>='\u0000' && LA19_26<='\t')||(LA19_26>='\u000B' && LA19_26<='\f')||(LA19_26>='\u000E' && LA19_26<='&')||(LA19_26>='(' && LA19_26<='[')||(LA19_26>=']' && LA19_26<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_6 = input.LA(1);

                        s = -1;
                        if ( (LA19_6=='p') ) {s = 37;}

                        else if ( ((LA19_6>='0' && LA19_6<='9')||(LA19_6>='A' && LA19_6<='Z')||LA19_6=='_'||(LA19_6>='a' && LA19_6<='o')||(LA19_6>='q' && LA19_6<='z')) ) {s = 29;}

                        else if ( (LA19_6=='.') ) {s = 31;}

                        else if ( ((LA19_6>='\u0000' && LA19_6<='-')||LA19_6=='/'||(LA19_6>=':' && LA19_6<='@')||(LA19_6>='[' && LA19_6<='^')||LA19_6=='`'||(LA19_6>='{' && LA19_6<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_19 = input.LA(1);

                        s = -1;
                        if ( ((LA19_19>='\u0000' && LA19_19<='\uFFFF')) ) {s = 27;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_103 = input.LA(1);

                        s = -1;
                        if ( ((LA19_103>='0' && LA19_103<='9')) ) {s = 103;}

                        else if ( ((LA19_103>='\u0000' && LA19_103<='/')||(LA19_103>=':' && LA19_103<='\uFFFF')) ) {s = 27;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_8 = input.LA(1);

                        s = -1;
                        if ( (LA19_8=='}') ) {s = 39;}

                        else if ( ((LA19_8>='\u0000' && LA19_8<='|')||(LA19_8>='~' && LA19_8<='\uFFFF')) ) {s = 27;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_7 = input.LA(1);

                        s = -1;
                        if ( (LA19_7=='n') ) {s = 38;}

                        else if ( ((LA19_7>='0' && LA19_7<='9')||(LA19_7>='A' && LA19_7<='Z')||LA19_7=='_'||(LA19_7>='a' && LA19_7<='m')||(LA19_7>='o' && LA19_7<='z')) ) {s = 29;}

                        else if ( (LA19_7=='.') ) {s = 31;}

                        else if ( ((LA19_7>='\u0000' && LA19_7<='-')||LA19_7=='/'||(LA19_7>=':' && LA19_7<='@')||(LA19_7>='[' && LA19_7<='^')||LA19_7=='`'||(LA19_7>='{' && LA19_7<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_93 = input.LA(1);

                        s = -1;
                        if ( (LA19_93=='<') ) {s = 111;}

                        else if ( ((LA19_93>='0' && LA19_93<='9')||(LA19_93>='A' && LA19_93<='Z')||LA19_93=='_'||(LA19_93>='a' && LA19_93<='z')) ) {s = 29;}

                        else if ( (LA19_93=='.') ) {s = 31;}

                        else if ( ((LA19_93>='\u0000' && LA19_93<='-')||LA19_93=='/'||(LA19_93>=':' && LA19_93<=';')||(LA19_93>='=' && LA19_93<='@')||(LA19_93>='[' && LA19_93<='^')||LA19_93=='`'||(LA19_93>='{' && LA19_93<='\uFFFF')) ) {s = 27;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_87 = input.LA(1);

                        s = -1;
                        if ( ((LA19_87>='\u0000' && LA19_87<='-')||LA19_87=='/'||(LA19_87>=':' && LA19_87<='@')||(LA19_87>='[' && LA19_87<='^')||LA19_87=='`'||(LA19_87>='{' && LA19_87<='\uFFFF')) ) {s = 27;}

                        else if ( (LA19_87=='.') ) {s = 31;}

                        else if ( ((LA19_87>='0' && LA19_87<='9')||(LA19_87>='A' && LA19_87<='Z')||LA19_87=='_'||(LA19_87>='a' && LA19_87<='z')) ) {s = 87;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_111 = input.LA(1);

                        s = -1;
                        if ( ((LA19_111>='\u0000' && LA19_111<='\uFFFF')) ) {s = 27;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_64 = input.LA(1);

                        s = -1;
                        if ( (LA19_64=='<') ) {s = 89;}

                        else if ( ((LA19_64>='0' && LA19_64<='9')||(LA19_64>='A' && LA19_64<='Z')||LA19_64=='_'||(LA19_64>='a' && LA19_64<='z')) ) {s = 29;}

                        else if ( (LA19_64=='.') ) {s = 31;}

                        else if ( ((LA19_64>='\u0000' && LA19_64<='-')||LA19_64=='/'||(LA19_64>=':' && LA19_64<=';')||(LA19_64>='=' && LA19_64<='@')||(LA19_64>='[' && LA19_64<='^')||LA19_64=='`'||(LA19_64>='{' && LA19_64<='\uFFFF')) ) {s = 27;}

                        else s = 90;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_70 = input.LA(1);

                        s = -1;
                        if ( (LA19_70=='p') ) {s = 97;}

                        else if ( ((LA19_70>='0' && LA19_70<='9')||(LA19_70>='A' && LA19_70<='Z')||LA19_70=='_'||(LA19_70>='a' && LA19_70<='o')||(LA19_70>='q' && LA19_70<='z')) ) {s = 29;}

                        else if ( (LA19_70=='.') ) {s = 31;}

                        else if ( ((LA19_70>='\u0000' && LA19_70<='-')||LA19_70=='/'||(LA19_70>=':' && LA19_70<='@')||(LA19_70>='[' && LA19_70<='^')||LA19_70=='`'||(LA19_70>='{' && LA19_70<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_97 = input.LA(1);

                        s = -1;
                        if ( (LA19_97=='e') ) {s = 116;}

                        else if ( ((LA19_97>='0' && LA19_97<='9')||(LA19_97>='A' && LA19_97<='Z')||LA19_97=='_'||(LA19_97>='a' && LA19_97<='d')||(LA19_97>='f' && LA19_97<='z')) ) {s = 29;}

                        else if ( (LA19_97=='.') ) {s = 31;}

                        else if ( ((LA19_97>='\u0000' && LA19_97<='-')||LA19_97=='/'||(LA19_97>=':' && LA19_97<='@')||(LA19_97>='[' && LA19_97<='^')||LA19_97=='`'||(LA19_97>='{' && LA19_97<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_116 = input.LA(1);

                        s = -1;
                        if ( (LA19_116=='r') ) {s = 125;}

                        else if ( ((LA19_116>='0' && LA19_116<='9')||(LA19_116>='A' && LA19_116<='Z')||LA19_116=='_'||(LA19_116>='a' && LA19_116<='q')||(LA19_116>='s' && LA19_116<='z')) ) {s = 29;}

                        else if ( (LA19_116=='.') ) {s = 31;}

                        else if ( ((LA19_116>='\u0000' && LA19_116<='-')||LA19_116=='/'||(LA19_116>=':' && LA19_116<='@')||(LA19_116>='[' && LA19_116<='^')||LA19_116=='`'||(LA19_116>='{' && LA19_116<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_125 = input.LA(1);

                        s = -1;
                        if ( (LA19_125=='t') ) {s = 130;}

                        else if ( ((LA19_125>='0' && LA19_125<='9')||(LA19_125>='A' && LA19_125<='Z')||LA19_125=='_'||(LA19_125>='a' && LA19_125<='s')||(LA19_125>='u' && LA19_125<='z')) ) {s = 29;}

                        else if ( (LA19_125=='.') ) {s = 31;}

                        else if ( ((LA19_125>='\u0000' && LA19_125<='-')||LA19_125=='/'||(LA19_125>=':' && LA19_125<='@')||(LA19_125>='[' && LA19_125<='^')||LA19_125=='`'||(LA19_125>='{' && LA19_125<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_39 = input.LA(1);

                        s = -1;
                        if ( ((LA19_39>='\u0000' && LA19_39<='\uFFFF')) ) {s = 27;}

                        else s = 73;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_130 = input.LA(1);

                        s = -1;
                        if ( (LA19_130=='y') ) {s = 135;}

                        else if ( ((LA19_130>='0' && LA19_130<='9')||(LA19_130>='A' && LA19_130<='Z')||LA19_130=='_'||(LA19_130>='a' && LA19_130<='x')||LA19_130=='z') ) {s = 29;}

                        else if ( (LA19_130=='.') ) {s = 31;}

                        else if ( ((LA19_130>='\u0000' && LA19_130<='-')||LA19_130=='/'||(LA19_130>=':' && LA19_130<='@')||(LA19_130>='[' && LA19_130<='^')||LA19_130=='`'||(LA19_130>='{' && LA19_130<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_37 = input.LA(1);

                        s = -1;
                        if ( (LA19_37=='t') ) {s = 71;}

                        else if ( ((LA19_37>='0' && LA19_37<='9')||(LA19_37>='A' && LA19_37<='Z')||LA19_37=='_'||(LA19_37>='a' && LA19_37<='s')||(LA19_37>='u' && LA19_37<='z')) ) {s = 29;}

                        else if ( (LA19_37=='.') ) {s = 31;}

                        else if ( ((LA19_37>='\u0000' && LA19_37<='-')||LA19_37=='/'||(LA19_37>=':' && LA19_37<='@')||(LA19_37>='[' && LA19_37<='^')||LA19_37=='`'||(LA19_37>='{' && LA19_37<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA19_71 = input.LA(1);

                        s = -1;
                        if ( (LA19_71=='i') ) {s = 98;}

                        else if ( ((LA19_71>='0' && LA19_71<='9')||(LA19_71>='A' && LA19_71<='Z')||LA19_71=='_'||(LA19_71>='a' && LA19_71<='h')||(LA19_71>='j' && LA19_71<='z')) ) {s = 29;}

                        else if ( (LA19_71=='.') ) {s = 31;}

                        else if ( ((LA19_71>='\u0000' && LA19_71<='-')||LA19_71=='/'||(LA19_71>=':' && LA19_71<='@')||(LA19_71>='[' && LA19_71<='^')||LA19_71=='`'||(LA19_71>='{' && LA19_71<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA19_98 = input.LA(1);

                        s = -1;
                        if ( (LA19_98=='o') ) {s = 117;}

                        else if ( ((LA19_98>='0' && LA19_98<='9')||(LA19_98>='A' && LA19_98<='Z')||LA19_98=='_'||(LA19_98>='a' && LA19_98<='n')||(LA19_98>='p' && LA19_98<='z')) ) {s = 29;}

                        else if ( (LA19_98=='.') ) {s = 31;}

                        else if ( ((LA19_98>='\u0000' && LA19_98<='-')||LA19_98=='/'||(LA19_98>=':' && LA19_98<='@')||(LA19_98>='[' && LA19_98<='^')||LA19_98=='`'||(LA19_98>='{' && LA19_98<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA19_117 = input.LA(1);

                        s = -1;
                        if ( (LA19_117=='n') ) {s = 126;}

                        else if ( ((LA19_117>='0' && LA19_117<='9')||(LA19_117>='A' && LA19_117<='Z')||LA19_117=='_'||(LA19_117>='a' && LA19_117<='m')||(LA19_117>='o' && LA19_117<='z')) ) {s = 29;}

                        else if ( (LA19_117=='.') ) {s = 31;}

                        else if ( ((LA19_117>='\u0000' && LA19_117<='-')||LA19_117=='/'||(LA19_117>=':' && LA19_117<='@')||(LA19_117>='[' && LA19_117<='^')||LA19_117=='`'||(LA19_117>='{' && LA19_117<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA19_144 = input.LA(1);

                        s = -1;
                        if ( (LA19_144=='t') ) {s = 145;}

                        else if ( ((LA19_144>='\u0000' && LA19_144<='s')||(LA19_144>='u' && LA19_144<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA19_145 = input.LA(1);

                        s = -1;
                        if ( (LA19_145=='y') ) {s = 146;}

                        else if ( ((LA19_145>='\u0000' && LA19_145<='x')||(LA19_145>='z' && LA19_145<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA19_63 = input.LA(1);

                        s = -1;
                        if ( ((LA19_63>='0' && LA19_63<='9')||(LA19_63>='A' && LA19_63<='Z')||LA19_63=='_'||(LA19_63>='a' && LA19_63<='z')) ) {s = 87;}

                        else if ( (LA19_63=='.') ) {s = 31;}

                        else if ( ((LA19_63>='\u0000' && LA19_63<='-')||LA19_63=='/'||(LA19_63>=':' && LA19_63<='@')||(LA19_63>='[' && LA19_63<='^')||LA19_63=='`'||(LA19_63>='{' && LA19_63<='\uFFFF')) ) {s = 27;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA19_68 = input.LA(1);

                        s = -1;
                        if ( (LA19_68=='r') ) {s = 95;}

                        else if ( ((LA19_68>='0' && LA19_68<='9')||(LA19_68>='A' && LA19_68<='Z')||LA19_68=='_'||(LA19_68>='a' && LA19_68<='q')||(LA19_68>='s' && LA19_68<='z')) ) {s = 29;}

                        else if ( (LA19_68=='.') ) {s = 31;}

                        else if ( ((LA19_68>='\u0000' && LA19_68<='-')||LA19_68=='/'||(LA19_68>=':' && LA19_68<='@')||(LA19_68>='[' && LA19_68<='^')||LA19_68=='`'||(LA19_68>='{' && LA19_68<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA19_146 = input.LA(1);

                        s = -1;
                        if ( (LA19_146=='p') ) {s = 147;}

                        else if ( ((LA19_146>='\u0000' && LA19_146<='o')||(LA19_146>='q' && LA19_146<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA19_10 = input.LA(1);

                        s = -1;
                        if ( ((LA19_10>='\u0000' && LA19_10<='\uFFFF')) ) {s = 27;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA19_147 = input.LA(1);

                        s = -1;
                        if ( (LA19_147=='e') ) {s = 148;}

                        else if ( ((LA19_147>='\u0000' && LA19_147<='d')||(LA19_147>='f' && LA19_147<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA19_65 = input.LA(1);

                        s = -1;
                        if ( (LA19_65=='<') ) {s = 91;}

                        else if ( ((LA19_65>='0' && LA19_65<='9')||(LA19_65>='A' && LA19_65<='Z')||LA19_65=='_'||(LA19_65>='a' && LA19_65<='z')) ) {s = 29;}

                        else if ( (LA19_65=='.') ) {s = 31;}

                        else if ( ((LA19_65>='\u0000' && LA19_65<='-')||LA19_65=='/'||(LA19_65>=':' && LA19_65<=';')||(LA19_65>='=' && LA19_65<='@')||(LA19_65>='[' && LA19_65<='^')||LA19_65=='`'||(LA19_65>='{' && LA19_65<='\uFFFF')) ) {s = 27;}

                        else s = 92;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA19_102 = input.LA(1);

                        s = -1;
                        if ( ((LA19_102>='0' && LA19_102<='9')) ) {s = 103;}

                        else if ( ((LA19_102>='\u0000' && LA19_102<='/')||(LA19_102>=':' && LA19_102<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA19_100 = input.LA(1);

                        s = -1;
                        if ( ((LA19_100>='0' && LA19_100<='9')) ) {s = 101;}

                        else if ( ((LA19_100>='\u0000' && LA19_100<='/')||(LA19_100>=':' && LA19_100<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA19_75 = input.LA(1);

                        s = -1;
                        if ( ((LA19_75>='\u0000' && LA19_75<='/')||(LA19_75>=':' && LA19_75<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA19_75>='0' && LA19_75<='9')) ) {s = 76;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA19_11 = input.LA(1);

                        s = -1;
                        if ( ((LA19_11>='\u0000' && LA19_11<='\uFFFF')) ) {s = 27;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA19_72 = input.LA(1);

                        s = -1;
                        if ( (LA19_72=='m') ) {s = 99;}

                        else if ( ((LA19_72>='0' && LA19_72<='9')||(LA19_72>='A' && LA19_72<='Z')||LA19_72=='_'||(LA19_72>='a' && LA19_72<='l')||(LA19_72>='n' && LA19_72<='z')) ) {s = 29;}

                        else if ( (LA19_72=='.') ) {s = 31;}

                        else if ( ((LA19_72>='\u0000' && LA19_72<='-')||LA19_72=='/'||(LA19_72>=':' && LA19_72<='@')||(LA19_72>='[' && LA19_72<='^')||LA19_72=='`'||(LA19_72>='{' && LA19_72<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA19_38 = input.LA(1);

                        s = -1;
                        if ( (LA19_38=='u') ) {s = 72;}

                        else if ( ((LA19_38>='0' && LA19_38<='9')||(LA19_38>='A' && LA19_38<='Z')||LA19_38=='_'||(LA19_38>='a' && LA19_38<='t')||(LA19_38>='v' && LA19_38<='z')) ) {s = 29;}

                        else if ( (LA19_38=='.') ) {s = 31;}

                        else if ( ((LA19_38>='\u0000' && LA19_38<='-')||LA19_38=='/'||(LA19_38>=':' && LA19_38<='@')||(LA19_38>='[' && LA19_38<='^')||LA19_38=='`'||(LA19_38>='{' && LA19_38<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA19_56 = input.LA(1);

                        s = -1;
                        if ( (LA19_56=='E'||LA19_56=='e') ) {s = 80;}

                        else if ( ((LA19_56>='0' && LA19_56<='9')) ) {s = 56;}

                        else if ( ((LA19_56>='\u0000' && LA19_56<='/')||(LA19_56>=':' && LA19_56<='D')||(LA19_56>='F' && LA19_56<='d')||(LA19_56>='f' && LA19_56<='\uFFFF')) ) {s = 27;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA19_123 = input.LA(1);

                        s = -1;
                        if ( (LA19_123=='t') ) {s = 128;}

                        else if ( ((LA19_123>='0' && LA19_123<='9')||(LA19_123>='A' && LA19_123<='Z')||LA19_123=='_'||(LA19_123>='a' && LA19_123<='s')||(LA19_123>='u' && LA19_123<='z')) ) {s = 29;}

                        else if ( (LA19_123=='.') ) {s = 31;}

                        else if ( ((LA19_123>='\u0000' && LA19_123<='-')||LA19_123=='/'||(LA19_123>=':' && LA19_123<='@')||(LA19_123>='[' && LA19_123<='^')||LA19_123=='`'||(LA19_123>='{' && LA19_123<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA19_128 = input.LA(1);

                        s = -1;
                        if ( (LA19_128=='e') ) {s = 133;}

                        else if ( ((LA19_128>='0' && LA19_128<='9')||(LA19_128>='A' && LA19_128<='Z')||LA19_128=='_'||(LA19_128>='a' && LA19_128<='d')||(LA19_128>='f' && LA19_128<='z')) ) {s = 29;}

                        else if ( (LA19_128=='.') ) {s = 31;}

                        else if ( ((LA19_128>='\u0000' && LA19_128<='-')||LA19_128=='/'||(LA19_128>=':' && LA19_128<='@')||(LA19_128>='[' && LA19_128<='^')||LA19_128=='`'||(LA19_128>='{' && LA19_128<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA19_94 = input.LA(1);

                        s = -1;
                        if ( (LA19_94=='m') ) {s = 113;}

                        else if ( ((LA19_94>='0' && LA19_94<='9')||(LA19_94>='A' && LA19_94<='Z')||LA19_94=='_'||(LA19_94>='a' && LA19_94<='l')||(LA19_94>='n' && LA19_94<='z')) ) {s = 29;}

                        else if ( (LA19_94=='.') ) {s = 31;}

                        else if ( ((LA19_94>='\u0000' && LA19_94<='-')||LA19_94=='/'||(LA19_94>=':' && LA19_94<='@')||(LA19_94>='[' && LA19_94<='^')||LA19_94=='`'||(LA19_94>='{' && LA19_94<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA19_113 = input.LA(1);

                        s = -1;
                        if ( (LA19_113=='e') ) {s = 123;}

                        else if ( ((LA19_113>='0' && LA19_113<='9')||(LA19_113>='A' && LA19_113<='Z')||LA19_113=='_'||(LA19_113>='a' && LA19_113<='d')||(LA19_113>='f' && LA19_113<='z')) ) {s = 29;}

                        else if ( (LA19_113=='.') ) {s = 31;}

                        else if ( ((LA19_113>='\u0000' && LA19_113<='-')||LA19_113=='/'||(LA19_113>=':' && LA19_113<='@')||(LA19_113>='[' && LA19_113<='^')||LA19_113=='`'||(LA19_113>='{' && LA19_113<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA19_139 = input.LA(1);

                        s = -1;
                        if ( (LA19_139=='z') ) {s = 141;}

                        else if ( ((LA19_139>='0' && LA19_139<='9')||(LA19_139>='A' && LA19_139<='Z')||LA19_139=='_'||(LA19_139>='a' && LA19_139<='y')) ) {s = 29;}

                        else if ( (LA19_139=='.') ) {s = 31;}

                        else if ( ((LA19_139>='\u0000' && LA19_139<='-')||LA19_139=='/'||(LA19_139>=':' && LA19_139<='@')||(LA19_139>='[' && LA19_139<='^')||LA19_139=='`'||(LA19_139>='{' && LA19_139<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA19_141 = input.LA(1);

                        s = -1;
                        if ( (LA19_141=='e') ) {s = 142;}

                        else if ( ((LA19_141>='0' && LA19_141<='9')||(LA19_141>='A' && LA19_141<='Z')||LA19_141=='_'||(LA19_141>='a' && LA19_141<='d')||(LA19_141>='f' && LA19_141<='z')) ) {s = 29;}

                        else if ( (LA19_141=='.') ) {s = 31;}

                        else if ( ((LA19_141>='\u0000' && LA19_141<='-')||LA19_141=='/'||(LA19_141>=':' && LA19_141<='@')||(LA19_141>='[' && LA19_141<='^')||LA19_141=='`'||(LA19_141>='{' && LA19_141<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA19_133 = input.LA(1);

                        s = -1;
                        if ( (LA19_133=='r') ) {s = 136;}

                        else if ( ((LA19_133>='0' && LA19_133<='9')||(LA19_133>='A' && LA19_133<='Z')||LA19_133=='_'||(LA19_133>='a' && LA19_133<='q')||(LA19_133>='s' && LA19_133<='z')) ) {s = 29;}

                        else if ( (LA19_133=='.') ) {s = 31;}

                        else if ( ((LA19_133>='\u0000' && LA19_133<='-')||LA19_133=='/'||(LA19_133>=':' && LA19_133<='@')||(LA19_133>='[' && LA19_133<='^')||LA19_133=='`'||(LA19_133>='{' && LA19_133<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA19_136 = input.LA(1);

                        s = -1;
                        if ( (LA19_136=='i') ) {s = 139;}

                        else if ( ((LA19_136>='0' && LA19_136<='9')||(LA19_136>='A' && LA19_136<='Z')||LA19_136=='_'||(LA19_136>='a' && LA19_136<='h')||(LA19_136>='j' && LA19_136<='z')) ) {s = 29;}

                        else if ( (LA19_136=='.') ) {s = 31;}

                        else if ( ((LA19_136>='\u0000' && LA19_136<='-')||LA19_136=='/'||(LA19_136>=':' && LA19_136<='@')||(LA19_136>='[' && LA19_136<='^')||LA19_136=='`'||(LA19_136>='{' && LA19_136<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA19_142 = input.LA(1);

                        s = -1;
                        if ( (LA19_142=='d') ) {s = 143;}

                        else if ( ((LA19_142>='0' && LA19_142<='9')||(LA19_142>='A' && LA19_142<='Z')||LA19_142=='_'||(LA19_142>='a' && LA19_142<='c')||(LA19_142>='e' && LA19_142<='z')) ) {s = 29;}

                        else if ( (LA19_142=='.') ) {s = 31;}

                        else if ( ((LA19_142>='\u0000' && LA19_142<='-')||LA19_142=='/'||(LA19_142>=':' && LA19_142<='@')||(LA19_142>='[' && LA19_142<='^')||LA19_142=='`'||(LA19_142>='{' && LA19_142<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA19_58 = input.LA(1);

                        s = -1;
                        if ( (LA19_58=='\n') ) {s = 60;}

                        else if ( ((LA19_58>='\u0000' && LA19_58<='\t')||(LA19_58>='\u000B' && LA19_58<='\uFFFF')) ) {s = 85;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA19_143 = input.LA(1);

                        s = -1;
                        if ( (LA19_143=='-') ) {s = 144;}

                        else if ( ((LA19_143>='0' && LA19_143<='9')||(LA19_143>='A' && LA19_143<='Z')||LA19_143=='_'||(LA19_143>='a' && LA19_143<='z')) ) {s = 29;}

                        else if ( (LA19_143=='.') ) {s = 31;}

                        else if ( ((LA19_143>='\u0000' && LA19_143<=',')||LA19_143=='/'||(LA19_143>=':' && LA19_143<='@')||(LA19_143>='[' && LA19_143<='^')||LA19_143=='`'||(LA19_143>='{' && LA19_143<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA19_86 = input.LA(1);

                        s = -1;
                        if ( (LA19_86==';') ) {s = 107;}

                        else if ( ((LA19_86>='0' && LA19_86<='9')||(LA19_86>='A' && LA19_86<='Z')||LA19_86=='_'||(LA19_86>='a' && LA19_86<='z')) ) {s = 29;}

                        else if ( (LA19_86=='.') ) {s = 31;}

                        else if ( ((LA19_86>='\u0000' && LA19_86<='-')||LA19_86=='/'||LA19_86==':'||(LA19_86>='<' && LA19_86<='@')||(LA19_86>='[' && LA19_86<='^')||LA19_86=='`'||(LA19_86>='{' && LA19_86<='\uFFFF')) ) {s = 27;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA19_9 = input.LA(1);

                        s = -1;
                        if ( ((LA19_9>='\u0000' && LA19_9<='\uFFFF')) ) {s = 27;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA19_124 = input.LA(1);

                        s = -1;
                        if ( (LA19_124=='i') ) {s = 129;}

                        else if ( ((LA19_124>='0' && LA19_124<='9')||(LA19_124>='A' && LA19_124<='Z')||LA19_124=='_'||(LA19_124>='a' && LA19_124<='h')||(LA19_124>='j' && LA19_124<='z')) ) {s = 29;}

                        else if ( (LA19_124=='.') ) {s = 31;}

                        else if ( ((LA19_124>='\u0000' && LA19_124<='-')||LA19_124=='/'||(LA19_124>=':' && LA19_124<='@')||(LA19_124>='[' && LA19_124<='^')||LA19_124=='`'||(LA19_124>='{' && LA19_124<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA19_115 = input.LA(1);

                        s = -1;
                        if ( (LA19_115=='t') ) {s = 124;}

                        else if ( ((LA19_115>='0' && LA19_115<='9')||(LA19_115>='A' && LA19_115<='Z')||LA19_115=='_'||(LA19_115>='a' && LA19_115<='s')||(LA19_115>='u' && LA19_115<='z')) ) {s = 29;}

                        else if ( (LA19_115=='.') ) {s = 31;}

                        else if ( ((LA19_115>='\u0000' && LA19_115<='-')||LA19_115=='/'||(LA19_115>=':' && LA19_115<='@')||(LA19_115>='[' && LA19_115<='^')||LA19_115=='`'||(LA19_115>='{' && LA19_115<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA19_96 = input.LA(1);

                        s = -1;
                        if ( (LA19_96=='i') ) {s = 115;}

                        else if ( ((LA19_96>='0' && LA19_96<='9')||(LA19_96>='A' && LA19_96<='Z')||LA19_96=='_'||(LA19_96>='a' && LA19_96<='h')||(LA19_96>='j' && LA19_96<='z')) ) {s = 29;}

                        else if ( (LA19_96=='.') ) {s = 31;}

                        else if ( ((LA19_96>='\u0000' && LA19_96<='-')||LA19_96=='/'||(LA19_96>=':' && LA19_96<='@')||(LA19_96>='[' && LA19_96<='^')||LA19_96=='`'||(LA19_96>='{' && LA19_96<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA19_69 = input.LA(1);

                        s = -1;
                        if ( (LA19_69=='m') ) {s = 96;}

                        else if ( ((LA19_69>='0' && LA19_69<='9')||(LA19_69>='A' && LA19_69<='Z')||LA19_69=='_'||(LA19_69>='a' && LA19_69<='l')||(LA19_69>='n' && LA19_69<='z')) ) {s = 29;}

                        else if ( (LA19_69=='.') ) {s = 31;}

                        else if ( ((LA19_69>='\u0000' && LA19_69<='-')||LA19_69=='/'||(LA19_69>=':' && LA19_69<='@')||(LA19_69>='[' && LA19_69<='^')||LA19_69=='`'||(LA19_69>='{' && LA19_69<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA19_134 = input.LA(1);

                        s = -1;
                        if ( (LA19_134=='e') ) {s = 137;}

                        else if ( ((LA19_134>='0' && LA19_134<='9')||(LA19_134>='A' && LA19_134<='Z')||LA19_134=='_'||(LA19_134>='a' && LA19_134<='d')||(LA19_134>='f' && LA19_134<='z')) ) {s = 29;}

                        else if ( (LA19_134=='.') ) {s = 31;}

                        else if ( ((LA19_134>='\u0000' && LA19_134<='-')||LA19_134=='/'||(LA19_134>=':' && LA19_134<='@')||(LA19_134>='[' && LA19_134<='^')||LA19_134=='`'||(LA19_134>='{' && LA19_134<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA19_129 = input.LA(1);

                        s = -1;
                        if ( (LA19_129=='v') ) {s = 134;}

                        else if ( ((LA19_129>='0' && LA19_129<='9')||(LA19_129>='A' && LA19_129<='Z')||LA19_129=='_'||(LA19_129>='a' && LA19_129<='u')||(LA19_129>='w' && LA19_129<='z')) ) {s = 29;}

                        else if ( (LA19_129=='.') ) {s = 31;}

                        else if ( ((LA19_129>='\u0000' && LA19_129<='-')||LA19_129=='/'||(LA19_129>=':' && LA19_129<='@')||(LA19_129>='[' && LA19_129<='^')||LA19_129=='`'||(LA19_129>='{' && LA19_129<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA19_4 = input.LA(1);

                        s = -1;
                        if ( (LA19_4=='i') ) {s = 34;}

                        else if ( ((LA19_4>='0' && LA19_4<='9')||(LA19_4>='A' && LA19_4<='Z')||LA19_4=='_'||(LA19_4>='a' && LA19_4<='h')||(LA19_4>='j' && LA19_4<='z')) ) {s = 29;}

                        else if ( (LA19_4=='.') ) {s = 31;}

                        else if ( ((LA19_4>='\u0000' && LA19_4<='-')||LA19_4=='/'||(LA19_4>=':' && LA19_4<='@')||(LA19_4>='[' && LA19_4<='^')||LA19_4=='`'||(LA19_4>='{' && LA19_4<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA19_2 = input.LA(1);

                        s = -1;
                        if ( (LA19_2=='a') ) {s = 32;}

                        else if ( ((LA19_2>='0' && LA19_2<='9')||(LA19_2>='A' && LA19_2<='Z')||LA19_2=='_'||(LA19_2>='b' && LA19_2<='z')) ) {s = 29;}

                        else if ( (LA19_2=='.') ) {s = 31;}

                        else if ( ((LA19_2>='\u0000' && LA19_2<='-')||LA19_2=='/'||(LA19_2>=':' && LA19_2<='@')||(LA19_2>='[' && LA19_2<='^')||LA19_2=='`'||(LA19_2>='{' && LA19_2<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA19_104 = input.LA(1);

                        s = -1;
                        if ( ((LA19_104>='0' && LA19_104<='9')||(LA19_104>='A' && LA19_104<='F')||(LA19_104>='a' && LA19_104<='f')) ) {s = 119;}

                        else if ( ((LA19_104>='\u0000' && LA19_104<='/')||(LA19_104>=':' && LA19_104<='@')||(LA19_104>='G' && LA19_104<='`')||(LA19_104>='g' && LA19_104<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA19_25 = input.LA(1);

                        s = -1;
                        if ( ((LA19_25>='0' && LA19_25<='9')) ) {s = 56;}

                        else if ( ((LA19_25>='\u0000' && LA19_25<='/')||(LA19_25>=':' && LA19_25<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA19_47 = input.LA(1);

                        s = -1;
                        if ( ((LA19_47>='\u0000' && LA19_47<='\uFFFF')) ) {s = 27;}

                        else s = 74;

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA19_32 = input.LA(1);

                        s = -1;
                        if ( (LA19_32=='p') ) {s = 64;}

                        else if ( ((LA19_32>='0' && LA19_32<='9')||(LA19_32>='A' && LA19_32<='Z')||LA19_32=='_'||(LA19_32>='a' && LA19_32<='o')||(LA19_32>='q' && LA19_32<='z')) ) {s = 29;}

                        else if ( (LA19_32=='.') ) {s = 31;}

                        else if ( ((LA19_32>='\u0000' && LA19_32<='-')||LA19_32=='/'||(LA19_32>=':' && LA19_32<='@')||(LA19_32>='[' && LA19_32<='^')||LA19_32=='`'||(LA19_32>='{' && LA19_32<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA19_14 = input.LA(1);

                        s = -1;
                        if ( ((LA19_14>='\u0000' && LA19_14<='\uFFFF')) ) {s = 27;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA19_82 = input.LA(1);

                        s = -1;
                        if ( ((LA19_82>='0' && LA19_82<='9')||(LA19_82>='A' && LA19_82<='F')||(LA19_82>='a' && LA19_82<='f')) ) {s = 104;}

                        else if ( ((LA19_82>='\u0000' && LA19_82<='/')||(LA19_82>=':' && LA19_82<='@')||(LA19_82>='G' && LA19_82<='`')||(LA19_82>='g' && LA19_82<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA19_15 = input.LA(1);

                        s = -1;
                        if ( (LA19_15==']') ) {s = 47;}

                        else if ( ((LA19_15>='\u0000' && LA19_15<='\\')||(LA19_15>='^' && LA19_15<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA19_99 = input.LA(1);

                        s = -1;
                        if ( ((LA19_99>='0' && LA19_99<='9')||(LA19_99>='A' && LA19_99<='Z')||LA19_99=='_'||(LA19_99>='a' && LA19_99<='z')) ) {s = 29;}

                        else if ( (LA19_99=='.') ) {s = 31;}

                        else if ( ((LA19_99>='\u0000' && LA19_99<='-')||LA19_99=='/'||(LA19_99>=':' && LA19_99<='@')||(LA19_99>='[' && LA19_99<='^')||LA19_99=='`'||(LA19_99>='{' && LA19_99<='\uFFFF')) ) {s = 27;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA19_16 = input.LA(1);

                        s = -1;
                        if ( ((LA19_16>='\u0000' && LA19_16<='\uFFFF')) ) {s = 27;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA19_67 = input.LA(1);

                        s = -1;
                        if ( (LA19_67=='a') ) {s = 94;}

                        else if ( ((LA19_67>='0' && LA19_67<='9')||(LA19_67>='A' && LA19_67<='Z')||LA19_67=='_'||(LA19_67>='b' && LA19_67<='z')) ) {s = 29;}

                        else if ( (LA19_67=='.') ) {s = 31;}

                        else if ( ((LA19_67>='\u0000' && LA19_67<='-')||LA19_67=='/'||(LA19_67>=':' && LA19_67<='@')||(LA19_67>='[' && LA19_67<='^')||LA19_67=='`'||(LA19_67>='{' && LA19_67<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA19_3 = input.LA(1);

                        s = -1;
                        if ( (LA19_3=='e') ) {s = 33;}

                        else if ( ((LA19_3>='0' && LA19_3<='9')||(LA19_3>='A' && LA19_3<='Z')||LA19_3=='_'||(LA19_3>='a' && LA19_3<='d')||(LA19_3>='f' && LA19_3<='z')) ) {s = 29;}

                        else if ( (LA19_3=='.') ) {s = 31;}

                        else if ( ((LA19_3>='\u0000' && LA19_3<='-')||LA19_3=='/'||(LA19_3>=':' && LA19_3<='@')||(LA19_3>='[' && LA19_3<='^')||LA19_3=='`'||(LA19_3>='{' && LA19_3<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA19_23 = input.LA(1);

                        s = -1;
                        if ( ((LA19_23>='\u0000' && LA19_23<='\uFFFF')) ) {s = 27;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA19_62 = input.LA(1);

                        s = -1;
                        if ( (LA19_62=='a') ) {s = 86;}

                        else if ( ((LA19_62>='0' && LA19_62<='9')||(LA19_62>='A' && LA19_62<='Z')||LA19_62=='_'||(LA19_62>='b' && LA19_62<='z')) ) {s = 29;}

                        else if ( (LA19_62=='.') ) {s = 31;}

                        else if ( ((LA19_62>='\u0000' && LA19_62<='-')||LA19_62=='/'||(LA19_62>=':' && LA19_62<='@')||(LA19_62>='[' && LA19_62<='^')||LA19_62=='`'||(LA19_62>='{' && LA19_62<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA19_119 = input.LA(1);

                        s = -1;
                        if ( ((LA19_119>='\u0000' && LA19_119<='/')||(LA19_119>=':' && LA19_119<='@')||(LA19_119>='G' && LA19_119<='`')||(LA19_119>='g' && LA19_119<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA19_119>='0' && LA19_119<='9')||(LA19_119>='A' && LA19_119<='F')||(LA19_119>='a' && LA19_119<='f')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA19_127 = input.LA(1);

                        s = -1;
                        if ( ((LA19_127>='\u0000' && LA19_127<='/')||(LA19_127>=':' && LA19_127<='@')||(LA19_127>='G' && LA19_127<='`')||(LA19_127>='g' && LA19_127<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA19_127>='0' && LA19_127<='9')||(LA19_127>='A' && LA19_127<='F')||(LA19_127>='a' && LA19_127<='f')) ) {s = 132;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA19_12 = input.LA(1);

                        s = -1;
                        if ( ((LA19_12>='\u0000' && LA19_12<='\uFFFF')) ) {s = 27;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA19_84 = input.LA(1);

                        s = -1;
                        if ( (LA19_84=='\'') ) {s = 59;}

                        else if ( (LA19_84=='\\') ) {s = 57;}

                        else if ( ((LA19_84>='0' && LA19_84<='7')) ) {s = 106;}

                        else if ( (LA19_84=='\r') ) {s = 58;}

                        else if ( (LA19_84=='\n') ) {s = 60;}

                        else if ( ((LA19_84>='\u0000' && LA19_84<='\t')||(LA19_84>='\u000B' && LA19_84<='\f')||(LA19_84>='\u000E' && LA19_84<='&')||(LA19_84>='(' && LA19_84<='/')||(LA19_84>='8' && LA19_84<='[')||(LA19_84>=']' && LA19_84<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA19_53 = input.LA(1);

                        s = -1;
                        if ( (LA19_53=='+'||LA19_53=='-') ) {s = 75;}

                        else if ( ((LA19_53>='0' && LA19_53<='9')) ) {s = 76;}

                        else if ( ((LA19_53>='\u0000' && LA19_53<='*')||LA19_53==','||(LA19_53>='.' && LA19_53<='/')||(LA19_53>=':' && LA19_53<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA19_78 = input.LA(1);

                        s = -1;
                        if ( ((LA19_78>='\u0000' && LA19_78<='*')||LA19_78==','||(LA19_78>='.' && LA19_78<='/')||(LA19_78>=':' && LA19_78<='\uFFFF')) ) {s = 27;}

                        else if ( (LA19_78=='+'||LA19_78=='-') ) {s = 100;}

                        else if ( ((LA19_78>='0' && LA19_78<='9')) ) {s = 101;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA19_80 = input.LA(1);

                        s = -1;
                        if ( (LA19_80=='+'||LA19_80=='-') ) {s = 102;}

                        else if ( ((LA19_80>='0' && LA19_80<='9')) ) {s = 103;}

                        else if ( ((LA19_80>='\u0000' && LA19_80<='*')||LA19_80==','||(LA19_80>='.' && LA19_80<='/')||(LA19_80>=':' && LA19_80<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA19_31 = input.LA(1);

                        s = -1;
                        if ( ((LA19_31>='A' && LA19_31<='Z')||(LA19_31>='a' && LA19_31<='z')) ) {s = 63;}

                        else if ( ((LA19_31>='\u0000' && LA19_31<='@')||(LA19_31>='[' && LA19_31<='`')||(LA19_31>='{' && LA19_31<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA19_66 = input.LA(1);

                        s = -1;
                        if ( (LA19_66=='t') ) {s = 93;}

                        else if ( ((LA19_66>='0' && LA19_66<='9')||(LA19_66>='A' && LA19_66<='Z')||LA19_66=='_'||(LA19_66>='a' && LA19_66<='s')||(LA19_66>='u' && LA19_66<='z')) ) {s = 29;}

                        else if ( (LA19_66=='.') ) {s = 31;}

                        else if ( ((LA19_66>='\u0000' && LA19_66<='-')||LA19_66=='/'||(LA19_66>=':' && LA19_66<='@')||(LA19_66>='[' && LA19_66<='^')||LA19_66=='`'||(LA19_66>='{' && LA19_66<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA19_60 = input.LA(1);

                        s = -1;
                        if ( ((LA19_60>='\u0000' && LA19_60<='\uFFFF')) ) {s = 85;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA19_24 = input.LA(1);

                        s = -1;
                        if ( (LA19_24=='E'||LA19_24=='e') ) {s = 53;}

                        else if ( ((LA19_24>='0' && LA19_24<='9')) ) {s = 24;}

                        else if ( (LA19_24=='.') ) {s = 54;}

                        else if ( ((LA19_24>='\u0000' && LA19_24<='-')||LA19_24=='/'||(LA19_24>=':' && LA19_24<='D')||(LA19_24>='F' && LA19_24<='d')||(LA19_24>='f' && LA19_24<='\uFFFF')) ) {s = 27;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA19_5 = input.LA(1);

                        s = -1;
                        if ( (LA19_5=='a') ) {s = 35;}

                        else if ( (LA19_5=='r') ) {s = 36;}

                        else if ( ((LA19_5>='0' && LA19_5<='9')||(LA19_5>='A' && LA19_5<='Z')||LA19_5=='_'||(LA19_5>='b' && LA19_5<='q')||(LA19_5>='s' && LA19_5<='z')) ) {s = 29;}

                        else if ( (LA19_5=='.') ) {s = 31;}

                        else if ( ((LA19_5>='\u0000' && LA19_5<='-')||LA19_5=='/'||(LA19_5>=':' && LA19_5<='@')||(LA19_5>='[' && LA19_5<='^')||LA19_5=='`'||(LA19_5>='{' && LA19_5<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA19_1 = input.LA(1);

                        s = -1;
                        if ( (LA19_1=='a') ) {s = 28;}

                        else if ( ((LA19_1>='0' && LA19_1<='9')||(LA19_1>='A' && LA19_1<='Z')||LA19_1=='_'||(LA19_1>='b' && LA19_1<='z')) ) {s = 29;}

                        else if ( (LA19_1=='.') ) {s = 31;}

                        else if ( ((LA19_1>='\u0000' && LA19_1<='-')||LA19_1=='/'||(LA19_1>=':' && LA19_1<='@')||(LA19_1>='[' && LA19_1<='^')||LA19_1=='`'||(LA19_1>='{' && LA19_1<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA19_61 = input.LA(1);

                        s = -1;
                        if ( (LA19_61=='\'') ) {s = 59;}

                        else if ( (LA19_61=='\\') ) {s = 57;}

                        else if ( (LA19_61=='\r') ) {s = 58;}

                        else if ( (LA19_61=='\n') ) {s = 60;}

                        else if ( ((LA19_61>='\u0000' && LA19_61<='\t')||(LA19_61>='\u000B' && LA19_61<='\f')||(LA19_61>='\u000E' && LA19_61<='&')||(LA19_61>='(' && LA19_61<='[')||(LA19_61>=']' && LA19_61<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA19_34 = input.LA(1);

                        s = -1;
                        if ( (LA19_34=='s') ) {s = 66;}

                        else if ( ((LA19_34>='0' && LA19_34<='9')||(LA19_34>='A' && LA19_34<='Z')||LA19_34=='_'||(LA19_34>='a' && LA19_34<='r')||(LA19_34>='t' && LA19_34<='z')) ) {s = 29;}

                        else if ( (LA19_34=='.') ) {s = 31;}

                        else if ( ((LA19_34>='\u0000' && LA19_34<='-')||LA19_34=='/'||(LA19_34>=':' && LA19_34<='@')||(LA19_34>='[' && LA19_34<='^')||LA19_34=='`'||(LA19_34>='{' && LA19_34<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA19_33 = input.LA(1);

                        s = -1;
                        if ( (LA19_33=='t') ) {s = 65;}

                        else if ( ((LA19_33>='0' && LA19_33<='9')||(LA19_33>='A' && LA19_33<='Z')||LA19_33=='_'||(LA19_33>='a' && LA19_33<='s')||(LA19_33>='u' && LA19_33<='z')) ) {s = 29;}

                        else if ( (LA19_33=='.') ) {s = 31;}

                        else if ( ((LA19_33>='\u0000' && LA19_33<='-')||LA19_33=='/'||(LA19_33>=':' && LA19_33<='@')||(LA19_33>='[' && LA19_33<='^')||LA19_33=='`'||(LA19_33>='{' && LA19_33<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA19_13 = input.LA(1);

                        s = -1;
                        if ( ((LA19_13>='\u0000' && LA19_13<='\uFFFF')) ) {s = 27;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA19_135 = input.LA(1);

                        s = -1;
                        if ( ((LA19_135>='0' && LA19_135<='9')||(LA19_135>='A' && LA19_135<='Z')||LA19_135=='_'||(LA19_135>='a' && LA19_135<='z')) ) {s = 29;}

                        else if ( (LA19_135=='.') ) {s = 31;}

                        else if ( ((LA19_135>='\u0000' && LA19_135<='-')||LA19_135=='/'||(LA19_135>=':' && LA19_135<='@')||(LA19_135>='[' && LA19_135<='^')||LA19_135=='`'||(LA19_135>='{' && LA19_135<='\uFFFF')) ) {s = 27;}

                        else s = 138;

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA19_76 = input.LA(1);

                        s = -1;
                        if ( ((LA19_76>='\u0000' && LA19_76<='/')||(LA19_76>=':' && LA19_76<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA19_76>='0' && LA19_76<='9')) ) {s = 76;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA19_89 = input.LA(1);

                        s = -1;
                        if ( ((LA19_89>='\u0000' && LA19_89<='\uFFFF')) ) {s = 27;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA19_91 = input.LA(1);

                        s = -1;
                        if ( ((LA19_91>='\u0000' && LA19_91<='\uFFFF')) ) {s = 27;}

                        else s = 110;

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA19_137 = input.LA(1);

                        s = -1;
                        if ( ((LA19_137>='0' && LA19_137<='9')||(LA19_137>='A' && LA19_137<='Z')||LA19_137=='_'||(LA19_137>='a' && LA19_137<='z')) ) {s = 29;}

                        else if ( (LA19_137=='.') ) {s = 31;}

                        else if ( ((LA19_137>='\u0000' && LA19_137<='-')||LA19_137=='/'||(LA19_137>=':' && LA19_137<='@')||(LA19_137>='[' && LA19_137<='^')||LA19_137=='`'||(LA19_137>='{' && LA19_137<='\uFFFF')) ) {s = 27;}

                        else s = 140;

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA19_57 = input.LA(1);

                        s = -1;
                        if ( (LA19_57=='\"'||LA19_57=='\''||LA19_57=='\\'||LA19_57=='b'||LA19_57=='f'||LA19_57=='n'||LA19_57=='r'||LA19_57=='t') ) {s = 81;}

                        else if ( (LA19_57=='u') ) {s = 82;}

                        else if ( ((LA19_57>='0' && LA19_57<='3')) ) {s = 83;}

                        else if ( ((LA19_57>='4' && LA19_57<='7')) ) {s = 84;}

                        else if ( ((LA19_57>='\u0000' && LA19_57<='!')||(LA19_57>='#' && LA19_57<='&')||(LA19_57>='(' && LA19_57<='/')||(LA19_57>='8' && LA19_57<='[')||(LA19_57>=']' && LA19_57<='a')||(LA19_57>='c' && LA19_57<='e')||(LA19_57>='g' && LA19_57<='m')||(LA19_57>='o' && LA19_57<='q')||LA19_57=='s'||(LA19_57>='v' && LA19_57<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA19_81 = input.LA(1);

                        s = -1;
                        if ( (LA19_81=='\'') ) {s = 59;}

                        else if ( (LA19_81=='\\') ) {s = 57;}

                        else if ( (LA19_81=='\r') ) {s = 58;}

                        else if ( (LA19_81=='\n') ) {s = 60;}

                        else if ( ((LA19_81>='\u0000' && LA19_81<='\t')||(LA19_81>='\u000B' && LA19_81<='\f')||(LA19_81>='\u000E' && LA19_81<='&')||(LA19_81>='(' && LA19_81<='[')||(LA19_81>=']' && LA19_81<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA19_18 = input.LA(1);

                        s = -1;
                        if ( ((LA19_18>='\u0000' && LA19_18<='\uFFFF')) ) {s = 27;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA19_28 = input.LA(1);

                        s = -1;
                        if ( (LA19_28=='t') ) {s = 62;}

                        else if ( ((LA19_28>='0' && LA19_28<='9')||(LA19_28>='A' && LA19_28<='Z')||LA19_28=='_'||(LA19_28>='a' && LA19_28<='s')||(LA19_28>='u' && LA19_28<='z')) ) {s = 29;}

                        else if ( (LA19_28=='.') ) {s = 31;}

                        else if ( ((LA19_28>='\u0000' && LA19_28<='-')||LA19_28=='/'||(LA19_28>=':' && LA19_28<='@')||(LA19_28>='[' && LA19_28<='^')||LA19_28=='`'||(LA19_28>='{' && LA19_28<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA19_95 = input.LA(1);

                        s = -1;
                        if ( ((LA19_95>='0' && LA19_95<='9')||(LA19_95>='A' && LA19_95<='Z')||LA19_95=='_'||(LA19_95>='a' && LA19_95<='z')) ) {s = 29;}

                        else if ( (LA19_95=='.') ) {s = 31;}

                        else if ( ((LA19_95>='\u0000' && LA19_95<='-')||LA19_95=='/'||(LA19_95>=':' && LA19_95<='@')||(LA19_95>='[' && LA19_95<='^')||LA19_95=='`'||(LA19_95>='{' && LA19_95<='\uFFFF')) ) {s = 27;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA19_107 = input.LA(1);

                        s = -1;
                        if ( ((LA19_107>='\u0000' && LA19_107<='\uFFFF')) ) {s = 27;}

                        else s = 121;

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA19_120 = input.LA(1);

                        s = -1;
                        if ( (LA19_120=='\'') ) {s = 59;}

                        else if ( (LA19_120=='\\') ) {s = 57;}

                        else if ( (LA19_120=='\r') ) {s = 58;}

                        else if ( (LA19_120=='\n') ) {s = 60;}

                        else if ( ((LA19_120>='\u0000' && LA19_120<='\t')||(LA19_120>='\u000B' && LA19_120<='\f')||(LA19_120>='\u000E' && LA19_120<='&')||(LA19_120>='(' && LA19_120<='[')||(LA19_120>=']' && LA19_120<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA19_54 = input.LA(1);

                        s = -1;
                        if ( ((LA19_54>='\u0000' && LA19_54<='/')||(LA19_54>=':' && LA19_54<='D')||(LA19_54>='F' && LA19_54<='d')||(LA19_54>='f' && LA19_54<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA19_54>='0' && LA19_54<='9')) ) {s = 77;}

                        else if ( (LA19_54=='E'||LA19_54=='e') ) {s = 78;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA19_105 = input.LA(1);

                        s = -1;
                        if ( ((LA19_105>='0' && LA19_105<='7')) ) {s = 120;}

                        else if ( (LA19_105=='\'') ) {s = 59;}

                        else if ( (LA19_105=='\\') ) {s = 57;}

                        else if ( (LA19_105=='\r') ) {s = 58;}

                        else if ( (LA19_105=='\n') ) {s = 60;}

                        else if ( ((LA19_105>='\u0000' && LA19_105<='\t')||(LA19_105>='\u000B' && LA19_105<='\f')||(LA19_105>='\u000E' && LA19_105<='&')||(LA19_105>='(' && LA19_105<='/')||(LA19_105>='8' && LA19_105<='[')||(LA19_105>=']' && LA19_105<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA19_106 = input.LA(1);

                        s = -1;
                        if ( (LA19_106=='\'') ) {s = 59;}

                        else if ( (LA19_106=='\\') ) {s = 57;}

                        else if ( (LA19_106=='\r') ) {s = 58;}

                        else if ( (LA19_106=='\n') ) {s = 60;}

                        else if ( ((LA19_106>='\u0000' && LA19_106<='\t')||(LA19_106>='\u000B' && LA19_106<='\f')||(LA19_106>='\u000E' && LA19_106<='&')||(LA19_106>='(' && LA19_106<='[')||(LA19_106>=']' && LA19_106<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA19_132 = input.LA(1);

                        s = -1;
                        if ( (LA19_132=='\'') ) {s = 59;}

                        else if ( (LA19_132=='\\') ) {s = 57;}

                        else if ( (LA19_132=='\r') ) {s = 58;}

                        else if ( (LA19_132=='\n') ) {s = 60;}

                        else if ( ((LA19_132>='\u0000' && LA19_132<='\t')||(LA19_132>='\u000B' && LA19_132<='\f')||(LA19_132>='\u000E' && LA19_132<='&')||(LA19_132>='(' && LA19_132<='[')||(LA19_132>=']' && LA19_132<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA19_126 = input.LA(1);

                        s = -1;
                        if ( ((LA19_126>='0' && LA19_126<='9')||(LA19_126>='A' && LA19_126<='Z')||LA19_126=='_'||(LA19_126>='a' && LA19_126<='z')) ) {s = 29;}

                        else if ( (LA19_126=='.') ) {s = 31;}

                        else if ( ((LA19_126>='\u0000' && LA19_126<='-')||LA19_126=='/'||(LA19_126>=':' && LA19_126<='@')||(LA19_126>='[' && LA19_126<='^')||LA19_126=='`'||(LA19_126>='{' && LA19_126<='\uFFFF')) ) {s = 27;}

                        else s = 131;

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA19_20 = input.LA(1);

                        s = -1;
                        if ( ((LA19_20>='0' && LA19_20<='9')||(LA19_20>='A' && LA19_20<='Z')||LA19_20=='_'||(LA19_20>='a' && LA19_20<='z')) ) {s = 29;}

                        else if ( (LA19_20=='.') ) {s = 31;}

                        else if ( ((LA19_20>='\u0000' && LA19_20<='-')||LA19_20=='/'||(LA19_20>=':' && LA19_20<='@')||(LA19_20>='[' && LA19_20<='^')||LA19_20=='`'||(LA19_20>='{' && LA19_20<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA19_17 = input.LA(1);

                        s = -1;
                        if ( ((LA19_17>='\u0000' && LA19_17<='\uFFFF')) ) {s = 27;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA19_59 = input.LA(1);

                        s = -1;
                        if ( ((LA19_59>='\u0000' && LA19_59<='\uFFFF')) ) {s = 27;}

                        else s = 85;

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA19_77 = input.LA(1);

                        s = -1;
                        if ( ((LA19_77>='\u0000' && LA19_77<='/')||(LA19_77>=':' && LA19_77<='D')||(LA19_77>='F' && LA19_77<='d')||(LA19_77>='f' && LA19_77<='\uFFFF')) ) {s = 27;}

                        else if ( (LA19_77=='E'||LA19_77=='e') ) {s = 78;}

                        else if ( ((LA19_77>='0' && LA19_77<='9')) ) {s = 77;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA19_29 = input.LA(1);

                        s = -1;
                        if ( ((LA19_29>='0' && LA19_29<='9')||(LA19_29>='A' && LA19_29<='Z')||LA19_29=='_'||(LA19_29>='a' && LA19_29<='z')) ) {s = 29;}

                        else if ( (LA19_29=='.') ) {s = 31;}

                        else if ( ((LA19_29>='\u0000' && LA19_29<='-')||LA19_29=='/'||(LA19_29>=':' && LA19_29<='@')||(LA19_29>='[' && LA19_29<='^')||LA19_29=='`'||(LA19_29>='{' && LA19_29<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='d') ) {s = 1;}

                        else if ( (LA19_0=='m') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='l') ) {s = 4;}

                        else if ( (LA19_0=='p') ) {s = 5;}

                        else if ( (LA19_0=='o') ) {s = 6;}

                        else if ( (LA19_0=='e') ) {s = 7;}

                        else if ( (LA19_0=='{') ) {s = 8;}

                        else if ( (LA19_0=='}') ) {s = 9;}

                        else if ( (LA19_0==',') ) {s = 10;}

                        else if ( (LA19_0=='#') ) {s = 11;}

                        else if ( (LA19_0=='[') ) {s = 12;}

                        else if ( (LA19_0==']') ) {s = 13;}

                        else if ( (LA19_0=='(') ) {s = 14;}

                        else if ( (LA19_0==')') ) {s = 15;}

                        else if ( (LA19_0=='=') ) {s = 16;}

                        else if ( (LA19_0==';') ) {s = 17;}

                        else if ( (LA19_0=='>') ) {s = 18;}

                        else if ( (LA19_0=='<') ) {s = 19;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='c')||(LA19_0>='f' && LA19_0<='k')||LA19_0=='n'||(LA19_0>='q' && LA19_0<='r')||(LA19_0>='t' && LA19_0<='z')) ) {s = 20;}

                        else if ( (LA19_0=='\r') ) {s = 21;}

                        else if ( (LA19_0=='\n') ) {s = 22;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 23;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 24;}

                        else if ( (LA19_0=='.') ) {s = 25;}

                        else if ( (LA19_0=='\'') ) {s = 26;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='!' && LA19_0<='\"')||(LA19_0>='$' && LA19_0<='&')||(LA19_0>='*' && LA19_0<='+')||LA19_0=='-'||LA19_0=='/'||LA19_0==':'||(LA19_0>='?' && LA19_0<='@')||LA19_0=='\\'||(LA19_0>='^' && LA19_0<='`')||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA19_36 = input.LA(1);

                        s = -1;
                        if ( (LA19_36=='i') ) {s = 69;}

                        else if ( (LA19_36=='o') ) {s = 70;}

                        else if ( ((LA19_36>='0' && LA19_36<='9')||(LA19_36>='A' && LA19_36<='Z')||LA19_36=='_'||(LA19_36>='a' && LA19_36<='h')||(LA19_36>='j' && LA19_36<='n')||(LA19_36>='p' && LA19_36<='z')) ) {s = 29;}

                        else if ( (LA19_36=='.') ) {s = 31;}

                        else if ( ((LA19_36>='\u0000' && LA19_36<='-')||LA19_36=='/'||(LA19_36>=':' && LA19_36<='@')||(LA19_36>='[' && LA19_36<='^')||LA19_36=='`'||(LA19_36>='{' && LA19_36<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA19_35 = input.LA(1);

                        s = -1;
                        if ( (LA19_35=='r') ) {s = 67;}

                        else if ( (LA19_35=='i') ) {s = 68;}

                        else if ( ((LA19_35>='0' && LA19_35<='9')||(LA19_35>='A' && LA19_35<='Z')||LA19_35=='_'||(LA19_35>='a' && LA19_35<='h')||(LA19_35>='j' && LA19_35<='q')||(LA19_35>='s' && LA19_35<='z')) ) {s = 29;}

                        else if ( (LA19_35=='.') ) {s = 31;}

                        else if ( ((LA19_35>='\u0000' && LA19_35<='-')||LA19_35=='/'||(LA19_35>=':' && LA19_35<='@')||(LA19_35>='[' && LA19_35<='^')||LA19_35=='`'||(LA19_35>='{' && LA19_35<='\uFFFF')) ) {s = 27;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}