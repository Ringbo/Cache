diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorTests.java
index 4aae114..05eaf26 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractorTests.java
@@ -59,7 +59,7 @@
 
         private SearchResponse nextResponse;
 
-        public TestDataExtractor(long start, long end) {
+        TestDataExtractor(long start, long end) {
             super(client, createContext(start, end));
         }
 
