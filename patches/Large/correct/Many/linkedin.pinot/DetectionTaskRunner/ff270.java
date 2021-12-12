diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/detection/DetectionTaskRunner.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/detection/DetectionTaskRunner.java
index 498cc03..ff93485 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/detection/DetectionTaskRunner.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/detection/DetectionTaskRunner.java
@@ -86,7 +86,7 @@
     Map<DimensionKey, MetricTimeSeries> res =
         timeSeriesResponseConverter.toMap(finalResponse, collectionDimensions);
     for (Map.Entry<DimensionKey, MetricTimeSeries> entry : res.entrySet()) {
-      if (entry.getValue().getTimeWindowSet().size() < 2) {
+      if (entry.getValue().getTimeWindowSet().size() < 1) {
         LOG.warn("Insufficient data for {} to run anomaly detection function", entry.getKey());
         continue;
       }
