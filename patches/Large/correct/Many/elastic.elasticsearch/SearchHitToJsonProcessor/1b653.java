diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/SearchHitToJsonProcessor.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/SearchHitToJsonProcessor.java
index da2d4f6..193d92a 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/SearchHitToJsonProcessor.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/SearchHitToJsonProcessor.java
@@ -19,7 +19,7 @@
     private final ExtractedFields fields;
     private final XContentBuilder jsonBuilder;
 
-    public SearchHitToJsonProcessor(ExtractedFields fields, OutputStream outputStream) throws IOException {
+    SearchHitToJsonProcessor(ExtractedFields fields, OutputStream outputStream) throws IOException {
         this.fields = Objects.requireNonNull(fields);
         this.jsonBuilder = new XContentBuilder(JsonXContent.jsonXContent, outputStream);
     }
