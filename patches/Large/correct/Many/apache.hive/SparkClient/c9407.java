diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/spark/SparkClient.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/spark/SparkClient.java
index 94db145..8043686 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/spark/SparkClient.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/spark/SparkClient.java
@@ -162,7 +162,7 @@
 
     List<Path> inputPaths;
     try {
-      inputPaths = Utilities.getInputPaths(jobConf, mapWork, emptyScratchDir, ctx);
+      inputPaths = Utilities.getInputPaths(jobConf, mapWork, emptyScratchDir, ctx, false);
     } catch (Exception e2) {
       e2.printStackTrace();
       return -1;
