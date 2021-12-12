diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
index 29fa753..df00530 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
@@ -186,7 +186,7 @@
         TableDesc tt_desc;
         Operator<? extends Serializable> rootOp;
 
-        if (mjCtx.getOldMapJoin() == null) {
+        if (mjCtx.getOldMapJoin() == null || setReducer) {
           taskTmpDir = mjCtx.getTaskTmpDir();
           tt_desc = mjCtx.getTTDesc();
           rootOp = mjCtx.getRootMapJoinOp();
