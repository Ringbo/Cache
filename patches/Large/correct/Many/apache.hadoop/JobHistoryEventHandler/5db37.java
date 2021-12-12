diff --git a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/jobhistory/JobHistoryEventHandler.java b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/jobhistory/JobHistoryEventHandler.java
index b0bcfcd..dd0de2a 100644
--- a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/jobhistory/JobHistoryEventHandler.java
+++ b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/jobhistory/JobHistoryEventHandler.java
@@ -825,7 +825,7 @@
         tEvent.addEventInfo("FINISHED_MAPS", jfe.getFinishedMaps());
         tEvent.addEventInfo("FINISHED_REDUCES", jfe.getFinishedReduces());
         tEvent.addEventInfo("MAP_COUNTERS_GROUPS",
-                countersToJSON(jfe.getTotalCounters()));
+                countersToJSON(jfe.getMapCounters()));
         tEvent.addEventInfo("REDUCE_COUNTERS_GROUPS",
                 countersToJSON(jfe.getReduceCounters()));
         tEvent.addEventInfo("TOTAL_COUNTERS_GROUPS",
