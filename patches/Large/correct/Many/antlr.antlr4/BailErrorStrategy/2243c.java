diff --git a/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java b/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
index cf6d939..af29fbd 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
@@ -32,14 +32,14 @@
 /** Bail out of parser at first syntax error. Do this to use it:
  *      myparser.setErrorHandler(new BailErrorStrategy<Token>());
  */
-public class BailErrorStrategy extends DefaultErrorStrategy<Token> {
+public class BailErrorStrategy<Symbol> extends DefaultErrorStrategy<Symbol> {
     /** Instead of recovering from exception e, Re-throw wrote it wrapped
      *  in a generic RuntimeException so it is not caught by the
      *  rule function catches.  Exception e is the "cause" of the
      *  RuntimeException.
      */
     @Override
-    public void recover(BaseRecognizer recognizer, RecognitionException e) {
+    public void recover(BaseRecognizer<Symbol> recognizer, RecognitionException e) {
         throw new RuntimeException(e);
     }
 
@@ -47,7 +47,7 @@
      *  successfully recovers, it won't throw an exception.
      */
     @Override
-    public Token recoverInline(BaseRecognizer recognizer)
+    public Symbol recoverInline(BaseRecognizer<Symbol> recognizer)
         throws RecognitionException
     {
         throw new RuntimeException(new InputMismatchException(recognizer));
@@ -55,5 +55,5 @@
 
     /** Make sure we don't attempt to recover from problems in subrules. */
     @Override
-    public void sync(BaseRecognizer recognizer) { }
+    public void sync(BaseRecognizer<Symbol> recognizer) { }
 }
