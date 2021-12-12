diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DetectionJobResource.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DetectionJobResource.java
index 99cd17a..5ef99db 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DetectionJobResource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DetectionJobResource.java
@@ -572,7 +572,7 @@
    * @param functionId
    * the id of the target anomaly function
    * @param  replayTimeIso
-   * the start time of the anomaly function replay in ISO format, e.g. 2017-02-27T00:00:00.000Z
+   * the end time of the anomaly function replay in ISO format, e.g. 2017-02-27T00:00:00.000Z
    * @param replayDuration
    * the duration of the replay ahead of the replayStartTimeIso
    * @param durationUnit
@@ -612,11 +612,11 @@
       TimeUnit timeUnit = TimeUnit.valueOf(durationUnit.toUpperCase());
 
       TimeGranularity timeGranularity = new TimeGranularity(replayDuration, timeUnit);
-      replayStart = DateTime.now();
+      replayEnd = DateTime.now();
       if (StringUtils.isNotEmpty(replayTimeIso)) {
-        replayStart = ISODateTimeFormat.dateTimeParser().parseDateTime(replayTimeIso);
+        replayEnd = ISODateTimeFormat.dateTimeParser().parseDateTime(replayTimeIso);
       }
-      replayEnd = replayStart.minus(timeGranularity.toPeriod());
+      replayStart = replayEnd.minus(timeGranularity.toPeriod());
     }
     catch (Exception e) {
       throw new WebApplicationException("Unable to parse strings, "+ replayTimeIso +
