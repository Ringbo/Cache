diff --git a/presto-main/src/test/java/com/facebook/presto/sql/analyzer/TestFeaturesConfig.java b/presto-main/src/test/java/com/facebook/presto/sql/analyzer/TestFeaturesConfig.java
index 5bb6fae..0195d70 100644
--- a/presto-main/src/test/java/com/facebook/presto/sql/analyzer/TestFeaturesConfig.java
+++ b/presto-main/src/test/java/com/facebook/presto/sql/analyzer/TestFeaturesConfig.java
@@ -36,7 +36,7 @@
                 .setOptimizeMetadataQueries(false)
                 .setOptimizeHashGeneration(true)
                 .setOptimizeSingleDistinct(true)
-                .setPushTableWriteThroughUnion(false)
+                .setPushTableWriteThroughUnion(true)
                 .setIntermediateAggregationsEnabled(false)
                 .setColumnarProcessing(false)
                 .setColumnarProcessingDictionary(false));
@@ -53,7 +53,7 @@
                 .put("optimizer.optimize-metadata-queries", "true")
                 .put("optimizer.optimize-hash-generation", "false")
                 .put("optimizer.optimize-single-distinct", "false")
-                .put("optimizer.push-table-write-through-union", "true")
+                .put("optimizer.push-table-write-through-union", "false")
                 .put("optimizer.use-intermediate-aggregations", "true")
                 .put("optimizer.columnar-processing", "true")
                 .put("optimizer.columnar-processing-dictionary", "true")
@@ -66,7 +66,7 @@
                 .put("optimizer.optimize-metadata-queries", "true")
                 .put("optimizer.optimize-hash-generation", "false")
                 .put("optimizer.optimize-single-distinct", "false")
-                .put("optimizer.push-table-write-through-union", "true")
+                .put("optimizer.push-table-write-through-union", "false")
                 .put("optimizer.use-intermediate-aggregations", "true")
                 .put("optimizer.columnar-processing", "true")
                 .put("optimizer.columnar-processing-dictionary", "true")
@@ -80,7 +80,7 @@
                 .setOptimizeMetadataQueries(true)
                 .setOptimizeHashGeneration(false)
                 .setOptimizeSingleDistinct(false)
-                .setPushTableWriteThroughUnion(true)
+                .setPushTableWriteThroughUnion(false)
                 .setIntermediateAggregationsEnabled(true)
                 .setColumnarProcessing(true)
                 .setColumnarProcessingDictionary(true);
