diff --git a/openapi/src/com/intellij/lexer/JavaDocLexer.java b/openapi/src/com/intellij/lexer/JavaDocLexer.java
index 2f5cf0c..25faa44 100644
--- a/openapi/src/com/intellij/lexer/JavaDocLexer.java
+++ b/openapi/src/com/intellij/lexer/JavaDocLexer.java
@@ -141,7 +141,8 @@
         }
 
         final int state = myFlex.yystate();
-        if (state == _JavaDocLexer.COMMENT_DATA) {
+        if (state == _JavaDocLexer.COMMENT_DATA
+            || myTokenEndOffset < myBufferEndOffset && (myBuffer[myTokenEndOffset] == '@' || myBuffer[myTokenEndOffset] == '{')) {
           myFlex.yybegin(_JavaDocLexer.COMMENT_DATA_START);
         }
 
