/* Generated By:JJTree&JavaCC: Do not edit this line. RelaxWizParserTokenManager.java */
package com.google.code.p.relaxws.parser;
import java.io.*;
import java.util.*;

/** Token Manager. */
public class RelaxWizParserTokenManager implements RelaxWizParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 17;
            return 11;
         }
         if ((active0 & 0x75c0L) != 0L)
         {
            jjmatchedKind = 17;
            return 14;
         }
         return -1;
      case 1:
         if ((active0 & 0x800L) != 0L)
            return 10;
         if ((active0 & 0x75c0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
            return 14;
         }
         return -1;
      case 2:
         if ((active0 & 0x1080L) != 0L)
            return 14;
         if ((active0 & 0x6540L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
            return 14;
         }
         return -1;
      case 3:
         if ((active0 & 0x6540L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 3;
            return 14;
         }
         return -1;
      case 4:
         if ((active0 & 0x540L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
            return 14;
         }
         if ((active0 & 0x6000L) != 0L)
            return 14;
         return -1;
      case 5:
         if ((active0 & 0x540L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
            return 14;
         }
         return -1;
      case 6:
         if ((active0 & 0x100L) != 0L)
            return 14;
         if ((active0 & 0x440L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 6;
            return 14;
         }
         return -1;
      case 7:
         if ((active0 & 0x440L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 7;
            return 14;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 34:
         return jjStopAtPos(0, 23);
      case 61:
         return jjStopAtPos(0, 22);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x1400L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x180L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 123:
         return jjStopAtPos(0, 15);
      case 125:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2040L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x180L);
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 10);
         break;
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 14);
         else if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 14);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x4040L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 14);
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(6, 8, 14);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x40L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(8, 6, 14);
         break;
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(8, 10, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 17;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (curChar == 35)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(16);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(14);
                  }
                  break;
               case 11:
               case 14:
                  if ((0x7ffe01000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(14);
                  break;
               case 10:
                  if ((0x7ffe01000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(14);
                  break;
               case 13:
                  if (curChar != 36)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if (curChar != 35)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(16);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(14);
                  }
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 11:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(14);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(14);
                  }
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 0:
                  if (curChar == 116 && kind > 9)
                     kind = 9;
                  break;
               case 1:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  if (curChar == 101 && kind > 9)
                     kind = 9;
                  break;
               case 5:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 12:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(14);
                  break;
               case 16:
                  if (kind > 21)
                     kind = 21;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\156\141\155\145\163\160\141\143\145", 
"\163\145\164", "\163\145\162\166\151\143\145", null, "\157\160\145\162\141\164\151\157\156", 
"\151\156", "\157\165\164", "\146\141\165\154\164", "\164\171\160\145\163", "\173", 
"\175", null, null, null, null, null, "\75", "\42", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xc3ffc1L, 
};
static final long[] jjtoSkip = {
   0x20003eL, 
};
static final long[] jjtoSpecial = {
   0x200000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[17];
private final int[] jjstateSet = new int[34];
protected char curChar;
/** Constructor. */
public RelaxWizParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RelaxWizParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
