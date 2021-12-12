diff --git a/python/testSrc/com/jetbrains/python/PyStringLiteralLexerTest.java b/python/testSrc/com/jetbrains/python/PyStringLiteralLexerTest.java
index e2a08cd..4af6a11 100644
--- a/python/testSrc/com/jetbrains/python/PyStringLiteralLexerTest.java
+++ b/python/testSrc/com/jetbrains/python/PyStringLiteralLexerTest.java
@@ -8,7 +8,7 @@
  */
 public class PyStringLiteralLexerTest extends PyLexerTestCase {
   public void testBackslashN() {  // PY-1313
-    doLexerTest("u\"\\N{LATIN SMALL LETTER B}\"", new PyStringLiteralLexer(PyElementTypes.STRING_LITERAL_EXPRESSION, false),
+    doLexerTest("u\"\\N{LATIN SMALL LETTER B}\"", new PyStringLiteralLexer(PyElementTypes.STRING_LITERAL_EXPRESSION),
                 "Py:STRING_LITERAL_EXPRESSION", "VALID_STRING_ESCAPE_TOKEN", "Py:STRING_LITERAL_EXPRESSION");    
   }
 }
