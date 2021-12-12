diff --git a/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java b/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
index 6254b48..95d1763 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
@@ -316,7 +316,7 @@
         }
 
         if (failed) {
-          LOG.warn("Operation completely failed, aborting request id: {}", stage.getRequestId());
+          LOG.error("Operation completely failed, aborting request id: {}", stage.getRequestId());
           cancelHostRoleCommands(stage.getOrderedHostRoleCommands(), FAILED_TASK_ABORT_REASONING);
           abortOperationsForStage(stage);
           return;
