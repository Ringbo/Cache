diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
index dd2ab25..81be813 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
@@ -359,7 +359,7 @@
         finalReport.setApplicationId(appId);
         finalReport.setLogAggregationStatus(renameTemporaryLogFileFailed
             ? LogAggregationStatus.FAILED : LogAggregationStatus.SUCCEEDED);
-        this.context.getLogAggregationStatusForApps().add(report);
+        this.context.getLogAggregationStatusForApps().add(finalReport);
       }
     } finally {
       if (writer != null) {
