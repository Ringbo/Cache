diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractor.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractor.java
index fbecf55..d8c7f16 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractor.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ScrollDataExtractor.java
@@ -47,7 +47,7 @@
     private boolean hasNext;
     private Long timestampOnCancel;
 
-    public ScrollDataExtractor(Client client, ScrollDataExtractorContext dataExtractorContext) {
+    ScrollDataExtractor(Client client, ScrollDataExtractorContext dataExtractorContext) {
         this.client = Objects.requireNonNull(client);
         this.context = Objects.requireNonNull(dataExtractorContext);
         this.hasNext = true;
