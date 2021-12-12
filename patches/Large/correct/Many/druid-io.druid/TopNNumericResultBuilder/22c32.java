diff --git a/processing/src/main/java/io/druid/query/topn/TopNNumericResultBuilder.java b/processing/src/main/java/io/druid/query/topn/TopNNumericResultBuilder.java
index a806c79..bfe142e 100644
--- a/processing/src/main/java/io/druid/query/topn/TopNNumericResultBuilder.java
+++ b/processing/src/main/java/io/druid/query/topn/TopNNumericResultBuilder.java
@@ -76,7 +76,7 @@
     }
 
     for (PostAggregator postAgg : postAggs) {
-      if (postAgg.getName().equals(metricName)) {
+      if (postAgg.getName().equalsIgnoreCase(metricName)) {
         metricValues.put(postAgg.getName(), postAgg.compute(metricValues));
         break;
       }
