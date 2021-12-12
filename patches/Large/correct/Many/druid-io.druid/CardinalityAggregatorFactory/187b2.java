diff --git a/processing/src/main/java/io/druid/query/aggregation/cardinality/CardinalityAggregatorFactory.java b/processing/src/main/java/io/druid/query/aggregation/cardinality/CardinalityAggregatorFactory.java
index eacfede..4c79b07 100644
--- a/processing/src/main/java/io/druid/query/aggregation/cardinality/CardinalityAggregatorFactory.java
+++ b/processing/src/main/java/io/druid/query/aggregation/cardinality/CardinalityAggregatorFactory.java
@@ -156,7 +156,7 @@
           @Override
           public AggregatorFactory apply(String input)
           {
-            return new CardinalityAggregatorFactory(name, Arrays.asList(input), byRow);
+            return new CardinalityAggregatorFactory(input, Arrays.asList(input), byRow);
           }
         }
     );
