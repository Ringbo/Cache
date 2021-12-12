diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractor.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractor.java
index 78e4caf..0dd0a28 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractor.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/aggregation/AggregationDataExtractor.java
@@ -38,7 +38,7 @@
     private boolean hasNext;
     private boolean isCancelled;
 
-    public AggregationDataExtractor(Client client, AggregationDataExtractorContext dataExtractorContext) {
+    AggregationDataExtractor(Client client, AggregationDataExtractorContext dataExtractorContext) {
         this.client = Objects.requireNonNull(client);
         this.context = Objects.requireNonNull(dataExtractorContext);
         this.hasNext = true;
