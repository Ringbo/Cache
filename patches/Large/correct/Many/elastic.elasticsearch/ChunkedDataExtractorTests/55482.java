diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorTests.java
index e5ea166..8c13f3c 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/chunked/ChunkedDataExtractorTests.java
@@ -52,7 +52,7 @@
 
         private SearchResponse nextResponse;
 
-        public TestDataExtractor(long start, long end) {
+        TestDataExtractor(long start, long end) {
             super(client, dataExtractorFactory, createContext(start, end));
         }
 
