diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorContext.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorContext.java
index 4a814b6..860ce25 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorContext.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorContext.java
@@ -22,7 +22,7 @@
     final long start;
     final long end;
 
-    public AggregationDataExtractorContext(String jobId, String timeField, List<String> indexes, List<String> types, QueryBuilder query,
+    AggregationDataExtractorContext(String jobId, String timeField, List<String> indexes, List<String> types, QueryBuilder query,
                                            AggregatorFactories.Builder aggs, long start, long end) {
         this.jobId = Objects.requireNonNull(jobId);
         this.timeField = Objects.requireNonNull(timeField);
