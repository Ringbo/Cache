diff --git a/merger/src/main/java/com/metamx/druid/merger/coordinator/RemoteTaskRunner.java b/merger/src/main/java/com/metamx/druid/merger/coordinator/RemoteTaskRunner.java
index f8d7183..2542d82 100644
--- a/merger/src/main/java/com/metamx/druid/merger/coordinator/RemoteTaskRunner.java
+++ b/merger/src/main/java/com/metamx/druid/merger/coordinator/RemoteTaskRunner.java
@@ -687,7 +687,7 @@
       );
 
       if (workerQueue.isEmpty()) {
-        log.info("Worker nodes %s do not have capacity to run any more tasks!", zkWorkers.values());
+        log.debug("Worker nodes %s do not have capacity to run any more tasks!", zkWorkers.values());
         return null;
       }
 
