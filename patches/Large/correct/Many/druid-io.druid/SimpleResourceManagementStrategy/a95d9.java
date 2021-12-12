diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/SimpleResourceManagementStrategy.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/SimpleResourceManagementStrategy.java
index 4451d68..2546d7e 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/SimpleResourceManagementStrategy.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/SimpleResourceManagementStrategy.java
@@ -72,7 +72,7 @@
   public boolean doProvision(Collection<RemoteTaskRunnerWorkItem> pendingTasks, Collection<ZkWorker> zkWorkers)
   {
     if (zkWorkers.size() >= workerSetupdDataRef.get().getMaxNumWorkers()) {
-      log.info(
+      log.debug(
           "Cannot scale anymore. Num workers = %d, Max num workers = %d",
           zkWorkers.size(),
           workerSetupdDataRef.get().getMaxNumWorkers()
