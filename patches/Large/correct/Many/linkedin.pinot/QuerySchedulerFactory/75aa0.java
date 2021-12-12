diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/QuerySchedulerFactory.java b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/QuerySchedulerFactory.java
index e33fd38..fb60106 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/QuerySchedulerFactory.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/QuerySchedulerFactory.java
@@ -62,7 +62,7 @@
     } else if (schedulerName.equals(TOKEN_BUCKET_ALGORITHM)) {
       LOGGER.info("Using Priority Token Bucket scheduler");
       return TokenPriorityScheduler.create(schedulerConfig, queryExecutor, serverMetrics, latestQueryTime);
-    } else if (schedulerConfig.equals(BOUNDED_FCFS_ALGORITHM)) {
+    } else if (schedulerName.equals(BOUNDED_FCFS_ALGORITHM)) {
       return BoundedFCFSScheduler.create(schedulerConfig, queryExecutor, serverMetrics, latestQueryTime);
     }
 
