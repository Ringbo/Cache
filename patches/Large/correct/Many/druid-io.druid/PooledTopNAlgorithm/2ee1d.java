diff --git a/processing/src/main/java/io/druid/query/topn/PooledTopNAlgorithm.java b/processing/src/main/java/io/druid/query/topn/PooledTopNAlgorithm.java
index 437b056..ea4fd37 100644
--- a/processing/src/main/java/io/druid/query/topn/PooledTopNAlgorithm.java
+++ b/processing/src/main/java/io/druid/query/topn/PooledTopNAlgorithm.java
@@ -116,7 +116,7 @@
   {
     final TopNMetricSpecBuilder<int[]> arrayProvider = params.getArrayProvider();
 
-    if (query.getDimensionSpec().preservesOrdering()) {
+    if (!query.getDimensionSpec().preservesOrdering()) {
       return arrayProvider.build();
     }
 
