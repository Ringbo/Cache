diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/alert/util/AnomalyReportGenerator.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/alert/util/AnomalyReportGenerator.java
index 93dd54d..4830b79 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/alert/util/AnomalyReportGenerator.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/alert/util/AnomalyReportGenerator.java
@@ -210,7 +210,7 @@
 
       // holidays
       final long eventStart = startTime - EVENT_TIME_TOLERANCE;
-      final long eventEnd = endTime - EVENT_TIME_TOLERANCE;
+      final long eventEnd = endTime + EVENT_TIME_TOLERANCE;
       List<EventDTO> holidays = eventDAO.findEventsBetweenTimeRange(EventType.HOLIDAY.toString(), eventStart, eventEnd);
 
       Collections.sort(holidays, new Comparator<EventDTO>() {
