diff --git a/src/main/java/com/alibaba/druid/sql/parser/SQLExprParser.java b/src/main/java/com/alibaba/druid/sql/parser/SQLExprParser.java
index c0dd3d0..f599ac3 100644
--- a/src/main/java/com/alibaba/druid/sql/parser/SQLExprParser.java
+++ b/src/main/java/com/alibaba/druid/sql/parser/SQLExprParser.java
@@ -2956,7 +2956,7 @@
         }
 
         SQLSelectItem selectItem = new SQLSelectItem(expr, alias, connectByRoot);
-        if (lexer.token == Token.HINT) {
+        if (lexer.token == Token.HINT && !lexer.isEnabled(SQLParserFeature.StrictForWall)) {
             String comment = "/*" + lexer.stringVal() + "*/";
             selectItem.addAfterComment(comment);
             lexer.nextToken();
