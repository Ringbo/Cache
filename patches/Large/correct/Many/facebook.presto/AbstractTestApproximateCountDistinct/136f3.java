diff --git a/presto-main/src/test/java/com/facebook/presto/operator/aggregation/AbstractTestApproximateCountDistinct.java b/presto-main/src/test/java/com/facebook/presto/operator/aggregation/AbstractTestApproximateCountDistinct.java
index 97c0e23..fb5fd47 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/aggregation/AbstractTestApproximateCountDistinct.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/aggregation/AbstractTestApproximateCountDistinct.java
@@ -167,7 +167,7 @@
     /**
      * Produce a block with the given values in the last field.
      */
-    private Block createBlock(Type type, List<Object> values)
+    private static Block createBlock(Type type, List<Object> values)
     {
         BlockBuilder blockBuilder = type.createBlockBuilder(new BlockBuilderStatus(), values.size());
 
