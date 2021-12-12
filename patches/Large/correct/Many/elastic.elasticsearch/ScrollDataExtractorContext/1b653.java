diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorContext.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorContext.java
index 6acde5e..80fe092 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorContext.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorContext.java
@@ -23,7 +23,7 @@
     final long start;
     final long end;
 
-    public ScrollDataExtractorContext(String jobId, ExtractedFields extractedFields, List<String> indexes, List<String> types,
+    ScrollDataExtractorContext(String jobId, ExtractedFields extractedFields, List<String> indexes, List<String> types,
                                       QueryBuilder query, List<SearchSourceBuilder.ScriptField> scriptFields, int scrollSize,
                                       long start, long end) {
         this.jobId = Objects.requireNonNull(jobId);
