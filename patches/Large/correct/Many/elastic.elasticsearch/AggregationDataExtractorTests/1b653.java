diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorTests.java
index 7466978..64054b2 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractorTests.java
@@ -57,7 +57,7 @@
 
         private SearchResponse nextResponse;
 
-        public TestDataExtractor(long start, long end) {
+        TestDataExtractor(long start, long end) {
             super(client, createContext(start, end));
         }
 
