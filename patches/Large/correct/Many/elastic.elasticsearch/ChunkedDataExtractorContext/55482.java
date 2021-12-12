diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorContext.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorContext.java
index e8a0bb9..67d1830 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorContext.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorContext.java
@@ -23,7 +23,7 @@
     final long end;
     final Long chunkSpan;
 
-    public ChunkedDataExtractorContext(String jobId, String timeField, List<String> indexes, List<String> types,
+    ChunkedDataExtractorContext(String jobId, String timeField, List<String> indexes, List<String> types,
                                        QueryBuilder query, int scrollSize, long start, long end, @Nullable Long chunkSpan) {
         this.jobId = Objects.requireNonNull(jobId);
         this.timeField = Objects.requireNonNull(timeField);
