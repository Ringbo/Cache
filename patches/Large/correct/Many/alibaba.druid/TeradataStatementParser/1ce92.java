diff --git a/src/main/java/com/alibaba/druid/sql/dialect/teradata/parser/TeradataStatementParser.java b/src/main/java/com/alibaba/druid/sql/dialect/teradata/parser/TeradataStatementParser.java
index 5ca482b..5a8354e 100644
--- a/src/main/java/com/alibaba/druid/sql/dialect/teradata/parser/TeradataStatementParser.java
+++ b/src/main/java/com/alibaba/druid/sql/dialect/teradata/parser/TeradataStatementParser.java
@@ -118,7 +118,8 @@
                 break;
             }
 
-        } else if (lexer.token() == (Token.SELECT)) {
+        } else if (lexer.token() == (Token.SELECT) 
+        		|| lexer.token() == (Token.SEL)) {
             SQLSelect select = this.exprParser.createSelectParser().select();
             select.setParent(insertStatement);
             insertStatement.setQuery(select);
