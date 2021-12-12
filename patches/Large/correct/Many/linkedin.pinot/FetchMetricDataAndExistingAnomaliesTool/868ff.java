diff --git a/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/tools/FetchMetricDataAndExistingAnomaliesTool.java b/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/tools/FetchMetricDataAndExistingAnomaliesTool.java
index d0f4ad2..9302e67 100644
--- a/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/tools/FetchMetricDataAndExistingAnomaliesTool.java
+++ b/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/tools/FetchMetricDataAndExistingAnomaliesTool.java
@@ -283,10 +283,10 @@
     urlBuilder.append(TIME_START + EQUALS + Long.toString(startTime.getMillis()) + AND);
     urlBuilder.append(TIME_END + EQUALS + Long.toString(endTime.getMillis()) + AND);
     urlBuilder.append(GRANULARITY + EQUALS + timeGranularity.toString() + AND);
-    if (dimensions != null || !dimensions.isEmpty()) {
+    if (dimensions != null && !dimensions.isEmpty()) {
       urlBuilder.append(DIMENSIONS + EQUALS + dimensions + AND);
     }
-    if (filterJson != null || !filterJson.isEmpty()) {
+    if (filterJson != null && !filterJson.isEmpty()) {
       urlBuilder.append(FILTERS + EQUALS + URLEncoder.encode(filterJson, "UTF-8"));
     }
 
