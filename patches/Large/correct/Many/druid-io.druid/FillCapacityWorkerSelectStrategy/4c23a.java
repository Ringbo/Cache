diff --git a/indexing-service/src/main/java/io/druid/indexing/overlord/setup/FillCapacityWorkerSelectStrategy.java b/indexing-service/src/main/java/io/druid/indexing/overlord/setup/FillCapacityWorkerSelectStrategy.java
index a72da10..7458030 100644
--- a/indexing-service/src/main/java/io/druid/indexing/overlord/setup/FillCapacityWorkerSelectStrategy.java
+++ b/indexing-service/src/main/java/io/druid/indexing/overlord/setup/FillCapacityWorkerSelectStrategy.java
@@ -47,7 +47,7 @@
     this.config = config;
   }
 
-  public Optional<ZkWorker> findWorkerForTask(
+  public Optional<ImmutableZkWorker> findWorkerForTask(
       final ImmutableMap<String, ImmutableZkWorker> zkWorkers,
       final Task task
   )
