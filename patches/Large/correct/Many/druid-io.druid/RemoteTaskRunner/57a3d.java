diff --git a/indexing-service/src/main/java/io/druid/indexing/overlord/RemoteTaskRunner.java b/indexing-service/src/main/java/io/druid/indexing/overlord/RemoteTaskRunner.java
index 621c7fe..d022a43 100644
--- a/indexing-service/src/main/java/io/druid/indexing/overlord/RemoteTaskRunner.java
+++ b/indexing-service/src/main/java/io/druid/indexing/overlord/RemoteTaskRunner.java
@@ -351,7 +351,7 @@
   @Override
   public Optional<ScalingStats> getScalingStats()
   {
-    return Optional.of(resourceManagement.getStats());
+    return Optional.fromNullable(resourceManagement.getStats());
   }
 
   public ZkWorker findWorkerRunningTask(String taskId)
