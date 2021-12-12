diff --git a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/CountColumn.java b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/CountColumn.java
index df30b5b..557a8f4 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/CountColumn.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/CountColumn.java
@@ -104,7 +104,7 @@
                 false);
 
         GenericAccumulatorFactoryBinder factory = new AccumulatorCompiler().generateAccumulatorFactoryBinder(metadata, classLoader);
-        return new GenericAggregationFunction(NAME, inputTypes, intermediateType, BIGINT, false, false, factory);
+        return new GenericAggregationFunction(NAME, inputTypes, intermediateType, BIGINT, true, false, factory);
     }
 
     private static List<ParameterMetadata> createInputParameterMetadata(Type type)
