diff --git a/src/main/java/net/sf/jsqlparser/util/deparser/StatementDeParser.java b/src/main/java/net/sf/jsqlparser/util/deparser/StatementDeParser.java
index bfa8776..69b3f9e 100644
--- a/src/main/java/net/sf/jsqlparser/util/deparser/StatementDeParser.java
+++ b/src/main/java/net/sf/jsqlparser/util/deparser/StatementDeParser.java
@@ -130,7 +130,7 @@
 		SelectDeParser selectDeParser = new SelectDeParser();
 		selectDeParser.setBuffer(buffer);
 		ExpressionDeParser expressionDeParser = new ExpressionDeParser(selectDeParser, buffer);
-		UpdateDeParser updateDeParser = new UpdateDeParser(expressionDeParser, buffer);
+        UpdateDeParser updateDeParser = new UpdateDeParser(expressionDeParser, selectDeParser, buffer);
 		selectDeParser.setExpressionVisitor(expressionDeParser);
 		updateDeParser.deParse(update);
 
