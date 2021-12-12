diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/PartitionPruner.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/PartitionPruner.java
index 45f0d38..aeb9cc3 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/PartitionPruner.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/PartitionPruner.java
@@ -213,7 +213,7 @@
         assert(expr.getChildCount() == 2);
         String tabAlias = BaseSemanticAnalyzer.unescapeIdentifier(expr.getChild(0).getText());
         String colName = BaseSemanticAnalyzer.unescapeIdentifier(expr.getChild(1).getText());
-        if (tabAlias.equals(tableAlias) && tab.isPartitionKey(colName)) {
+        if (tabAlias.equalsIgnoreCase(tableAlias) && tab.isPartitionKey(colName)) {
           hasPPred = true;
         }
         break;
