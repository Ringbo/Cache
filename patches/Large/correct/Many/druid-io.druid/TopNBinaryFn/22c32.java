diff --git a/processing/src/main/java/io/druid/query/topn/TopNBinaryFn.java b/processing/src/main/java/io/druid/query/topn/TopNBinaryFn.java
index f848f3c..8c91b8f 100644
--- a/processing/src/main/java/io/druid/query/topn/TopNBinaryFn.java
+++ b/processing/src/main/java/io/druid/query/topn/TopNBinaryFn.java
@@ -94,6 +94,7 @@
       DimensionAndMetricValueExtractor arg1Val = retVals.get(dimensionValue);
 
       if (arg1Val != null) {
+        // size of map = aggregattor + topNDim + postAgg (If sorting is done on post agg field)
         Map<String, Object> retVal = new LinkedHashMap<String, Object>(aggregations.size() + 2);
 
         retVal.put(dimension, dimensionValue);
@@ -102,7 +103,7 @@
           retVal.put(metricName, factory.combine(arg1Val.getMetric(metricName), arg2Val.getMetric(metricName)));
         }
         for (PostAggregator postAgg : postAggregations) {
-          if (postAgg.getName().equals(topNMetricName)) {
+          if (postAgg.getName().equalsIgnoreCase(topNMetricName)) {
             retVal.put(postAgg.getName(), postAgg.compute(retVal));
           }
         }
