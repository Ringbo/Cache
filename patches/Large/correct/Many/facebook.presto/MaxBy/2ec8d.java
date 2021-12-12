diff --git a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/MaxBy.java b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/MaxBy.java
index 63acfab..a4f5666 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/MaxBy.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/MaxBy.java
@@ -106,7 +106,7 @@
                 false);
 
         GenericAccumulatorFactoryBinder factory = new AccumulatorCompiler().generateAccumulatorFactoryBinder(metadata, classLoader);
-        return new GenericAggregationFunction(NAME, inputTypes, intermediateType, valueType, false, false, factory);
+        return new GenericAggregationFunction(NAME, inputTypes, intermediateType, valueType, true, false, factory);
     }
 
     private static List<ParameterMetadata> createInputParameterMetadata(Type value, Type key)
