diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/MapJoinOperator.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/MapJoinOperator.java
index c39c46b..d5b35d0 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/MapJoinOperator.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/MapJoinOperator.java
@@ -227,7 +227,9 @@
 
   @Override
   public void closeOp(boolean abort) throws HiveException {
-    if (mapJoinTables != null) {
+    if ((this.getExecContext().getLocalWork() != null
+        && this.getExecContext().getLocalWork().getInputFileChangeSensitive())
+        && mapJoinTables != null) {
       for (MapJoinTableContainer tableContainer : mapJoinTables) {
         if (tableContainer != null) {
           tableContainer.clear();
