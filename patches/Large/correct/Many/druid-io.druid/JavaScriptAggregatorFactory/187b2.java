diff --git a/processing/src/main/java/io/druid/query/aggregation/JavaScriptAggregatorFactory.java b/processing/src/main/java/io/druid/query/aggregation/JavaScriptAggregatorFactory.java
index ac85b75..90175c5 100644
--- a/processing/src/main/java/io/druid/query/aggregation/JavaScriptAggregatorFactory.java
+++ b/processing/src/main/java/io/druid/query/aggregation/JavaScriptAggregatorFactory.java
@@ -150,7 +150,7 @@
           @Override
           public AggregatorFactory apply(String input)
           {
-            return new JavaScriptAggregatorFactory(name, Arrays.asList(input), fnAggregate, fnReset, fnCombine);
+            return new JavaScriptAggregatorFactory(input, Arrays.asList(input), fnAggregate, fnReset, fnCombine);
           }
         }
     );
