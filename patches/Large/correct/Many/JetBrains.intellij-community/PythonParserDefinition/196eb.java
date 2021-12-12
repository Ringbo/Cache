diff --git a/python/src/com/jetbrains/python/PythonParserDefinition.java b/python/src/com/jetbrains/python/PythonParserDefinition.java
index 6644cd7..2d15794 100644
--- a/python/src/com/jetbrains/python/PythonParserDefinition.java
+++ b/python/src/com/jetbrains/python/PythonParserDefinition.java
@@ -35,7 +35,7 @@
 
     myWhitespaceTokens = TokenSet.create(PyTokenTypes.LINE_BREAK, PyTokenTypes.SPACE, PyTokenTypes.TAB, PyTokenTypes.FORMFEED);
     myCommentTokens = TokenSet.create(PyTokenTypes.END_OF_LINE_COMMENT);
-    myStringLiteralTokens = TokenSet.create(PyTokenTypes.STRING_LITERAL);
+    myStringLiteralTokens = TokenSet.create(PyTokenTypes.STRING_LITERAL, PyElementTypes.STRING_LITERAL_EXPRESSION);
   }
 
   @NotNull
