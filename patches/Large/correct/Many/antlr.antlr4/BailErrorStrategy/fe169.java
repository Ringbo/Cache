diff --git a/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java b/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
index c25e654..cf6d939 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/BailErrorStrategy.java
@@ -32,7 +32,7 @@
 /** Bail out of parser at first syntax error. Do this to use it:
  *      myparser.setErrorHandler(new BailErrorStrategy<Token>());
  */
-public class BailErrorStrategy<Symbol> extends DefaultErrorStrategy<Symbol> {
+public class BailErrorStrategy extends DefaultErrorStrategy<Token> {
     /** Instead of recovering from exception e, Re-throw wrote it wrapped
      *  in a generic RuntimeException so it is not caught by the
      *  rule function catches.  Exception e is the "cause" of the
@@ -47,7 +47,7 @@
      *  successfully recovers, it won't throw an exception.
      */
     @Override
-    public Symbol recoverInline(BaseRecognizer recognizer)
+    public Token recoverInline(BaseRecognizer recognizer)
         throws RecognitionException
     {
         throw new RuntimeException(new InputMismatchException(recognizer));
