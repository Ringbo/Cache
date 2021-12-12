diff --git a/ql/src/java/org/apache/hadoop/hive/ql/plan/ExprNodeDescUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/plan/ExprNodeDescUtils.java
index 596640e..7b23240 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/plan/ExprNodeDescUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/plan/ExprNodeDescUtils.java
@@ -432,7 +432,7 @@
     // Find the key/value where the ExprNodeDesc value matches the column we are searching for.
     // The key portion of the entry will be the internal column name for the join key expression.
     for (Map.Entry<String, ExprNodeDesc> mapEntry : reduceSinkOp.getColumnExprMap().entrySet()) {
-      if (mapEntry.getValue().isSame(source)) {
+      if (mapEntry.getValue().equals(source)) {
         String columnInternalName = mapEntry.getKey();
         if (source instanceof ExprNodeColumnDesc) {
           // The join key is a table column. Create the ExprNodeDesc based on this column.
