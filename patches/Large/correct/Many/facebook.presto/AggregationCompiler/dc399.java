diff --git a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/AggregationCompiler.java b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/AggregationCompiler.java
index 736ec1a..00edd15 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/aggregation/AggregationCompiler.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/aggregation/AggregationCompiler.java
@@ -117,7 +117,7 @@
 
                         AccumulatorFactory factory = new AccumulatorCompiler().generateAccumulatorFactory(metadata, classLoader);
                         // TODO: support un-decomposable aggregations
-                        builder.add(new GenericAggregationFunction(name, inputTypes, intermediateType, outputType, false, aggregationAnnotation.approximate(), factory));
+                        builder.add(new GenericAggregationFunction(name, inputTypes, intermediateType, outputType, true, aggregationAnnotation.approximate(), factory));
                     }
                 }
             }
