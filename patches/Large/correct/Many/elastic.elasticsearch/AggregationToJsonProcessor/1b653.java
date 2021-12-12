diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationToJsonProcessor.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationToJsonProcessor.java
index ecf6e29..03bc67e 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationToJsonProcessor.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationToJsonProcessor.java
@@ -30,7 +30,7 @@
     private final XContentBuilder jsonBuilder;
     private final Map<String, Object> keyValuePairs;
 
-    public AggregationToJsonProcessor(OutputStream outputStream) throws IOException {
+    AggregationToJsonProcessor(OutputStream outputStream) throws IOException {
         jsonBuilder = new XContentBuilder(JsonXContent.jsonXContent, outputStream);
         keyValuePairs = new LinkedHashMap<>();
     }
