diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ConvertJoinMapJoin.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ConvertJoinMapJoin.java
index 9412e5f..e24760b 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ConvertJoinMapJoin.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ConvertJoinMapJoin.java
@@ -1112,8 +1112,8 @@
     long max = HiveConf.getLongVar(context.parseContext.getConf(),
             HiveConf.ConfVars.HIVECONVERTJOINMAXSHUFFLESIZE);
     if (max < 1) {
-      // Max is disabled, we can safely return true
-      return true;
+      // Max is disabled, we can safely return false
+      return false;
     }
     // Evaluate
     ReduceSinkOperator rsOp = (ReduceSinkOperator) joinOp.getParentOperators().get(position);
