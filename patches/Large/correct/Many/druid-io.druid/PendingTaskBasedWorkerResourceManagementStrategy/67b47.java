diff --git a/indexing-service/src/main/java/io/druid/indexing/overlord/autoscaling/PendingTaskBasedWorkerResourceManagementStrategy.java b/indexing-service/src/main/java/io/druid/indexing/overlord/autoscaling/PendingTaskBasedWorkerResourceManagementStrategy.java
index fe5fd8e..50b3e7e 100644
--- a/indexing-service/src/main/java/io/druid/indexing/overlord/autoscaling/PendingTaskBasedWorkerResourceManagementStrategy.java
+++ b/indexing-service/src/main/java/io/druid/indexing/overlord/autoscaling/PendingTaskBasedWorkerResourceManagementStrategy.java
@@ -211,7 +211,7 @@
     );
 
     if (want > 0 && currValidWorkers >= maxWorkerCount) {
-      log.warn("Unable to provision more workers. Current workerCount[%d] maximum workerCount[%d].");
+      log.warn("Unable to provision more workers. Current workerCount[%d] maximum workerCount[%d].", currValidWorkers, maxWorkerCount);
       return 0;
     }
     want = Math.min(want, maxWorkerCount - currValidWorkers);
