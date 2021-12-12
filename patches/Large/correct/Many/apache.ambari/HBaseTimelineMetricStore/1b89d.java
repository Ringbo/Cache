diff --git a/ambari-metrics/ambari-metrics-timelineservice/src/main/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/HBaseTimelineMetricStore.java b/ambari-metrics/ambari-metrics-timelineservice/src/main/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/HBaseTimelineMetricStore.java
index 60ebdcf..a6f8e2f 100644
--- a/ambari-metrics/ambari-metrics-timelineservice/src/main/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/HBaseTimelineMetricStore.java
+++ b/ambari-metrics/ambari-metrics-timelineservice/src/main/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/HBaseTimelineMetricStore.java
@@ -228,7 +228,8 @@
       .grouped(groupedByHosts);
 
     if (topNConfig != null) {
-      if (TopNCondition.isTopNHostCondition(metricNames, hostnames) || TopNCondition.isTopNMetricCondition(metricNames, hostnames)) {
+      if (TopNCondition.isTopNHostCondition(metricNames, hostnames) ^ //Only 1 condition should be true.
+        TopNCondition.isTopNMetricCondition(metricNames, hostnames)) {
         conditionBuilder.topN(topNConfig.getTopN());
         conditionBuilder.isBottomN(topNConfig.getIsBottomN());
         Function.ReadFunction readFunction = Function.ReadFunction.getFunction(topNConfig.getTopNFunction());
