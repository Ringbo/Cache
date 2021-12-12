diff --git a/python/src/com/jetbrains/python/highlighting/PyHighlighter.java b/python/src/com/jetbrains/python/highlighting/PyHighlighter.java
index db3c7a0..0ad64b2 100644
--- a/python/src/com/jetbrains/python/highlighting/PyHighlighter.java
+++ b/python/src/com/jetbrains/python/highlighting/PyHighlighter.java
@@ -31,19 +31,19 @@
   public Lexer getHighlightingLexer() {
     LayeredLexer ret = new LayeredLexer(new PythonHighlightingLexer(myLanguageLevel));
     ret.registerSelfStoppingLayer(
-      new PyStringLiteralLexer(PyTokenTypes.SINGLE_QUOTED_STRING, myLanguageLevel.isPy3K()),
+      new PyStringLiteralLexer(PyTokenTypes.SINGLE_QUOTED_STRING),
       new IElementType[]{PyTokenTypes.SINGLE_QUOTED_STRING}, IElementType.EMPTY_ARRAY
     );
     ret.registerSelfStoppingLayer(
-      new PyStringLiteralLexer(PyTokenTypes.SINGLE_QUOTED_UNICODE, myLanguageLevel.isPy3K()),
+      new PyStringLiteralLexer(PyTokenTypes.SINGLE_QUOTED_UNICODE),
       new IElementType[]{PyTokenTypes.SINGLE_QUOTED_UNICODE}, IElementType.EMPTY_ARRAY
     );
     ret.registerSelfStoppingLayer(
-      new PyStringLiteralLexer(PyTokenTypes.TRIPLE_QUOTED_STRING, myLanguageLevel.isPy3K()),
+      new PyStringLiteralLexer(PyTokenTypes.TRIPLE_QUOTED_STRING),
       new IElementType[]{PyTokenTypes.TRIPLE_QUOTED_STRING}, IElementType.EMPTY_ARRAY
     );
     ret.registerSelfStoppingLayer(
-      new PyStringLiteralLexer(PyTokenTypes.TRIPLE_QUOTED_UNICODE, myLanguageLevel.isPy3K()),
+      new PyStringLiteralLexer(PyTokenTypes.TRIPLE_QUOTED_UNICODE),
       new IElementType[]{PyTokenTypes.TRIPLE_QUOTED_UNICODE}, IElementType.EMPTY_ARRAY
     );
 
