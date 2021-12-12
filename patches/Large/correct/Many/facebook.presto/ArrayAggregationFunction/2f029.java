diff --git a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/ArrayAggregationFunction.java b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/ArrayAggregationFunction.java
index 3a23b4a..918ce40 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/ArrayAggregationFunction.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/ArrayAggregationFunction.java
@@ -113,7 +113,7 @@
     {
         BlockBuilder blockBuilder = state.getBlockBuilder();
         if (blockBuilder == null) {
-            blockBuilder = type.createBlockBuilder(new BlockBuilderStatus(), 100);
+            blockBuilder = type.createBlockBuilder(new BlockBuilderStatus(), 4);
             state.setBlockBuilder(blockBuilder);
         }
         long startSize = blockBuilder.getRetainedSizeInBytes();
