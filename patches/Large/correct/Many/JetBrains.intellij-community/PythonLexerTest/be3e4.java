diff --git a/python/testSrc/com/jetbrains/python/PythonLexerTest.java b/python/testSrc/com/jetbrains/python/PythonLexerTest.java
index d346736..b180912 100644
--- a/python/testSrc/com/jetbrains/python/PythonLexerTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonLexerTest.java
@@ -211,8 +211,8 @@
            "def foo(sender):\n" +
            "    pass",
            "Py:CLASS_KEYWORD", "Py:SPACE", "Py:IDENTIFIER", "Py:COLON", "Py:STATEMENT_BREAK", "Py:LINE_BREAK",
-           "Py:INDENT", "Py:PASS_KEYWORD", "Py:STATEMENT_BREAK", "Py:LINE_BREAK",
-           "Py:DEDENT", "Py:END_OF_LINE_COMMENT", "Py:LINE_BREAK",
+           "Py:INDENT", "Py:PASS_KEYWORD", "Py:STATEMENT_BREAK",
+           "Py:DEDENT", "Py:LINE_BREAK", "Py:END_OF_LINE_COMMENT", "Py:LINE_BREAK",
            "Py:DEF_KEYWORD", "Py:SPACE", "Py:IDENTIFIER", "Py:LPAR", "Py:IDENTIFIER", "Py:RPAR", "Py:COLON", "Py:STATEMENT_BREAK", "Py:LINE_BREAK",
            "Py:INDENT", "Py:PASS_KEYWORD", "Py:STATEMENT_BREAK");
   }
