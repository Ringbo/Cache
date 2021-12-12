diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
index a390b60..8bbe954 100755
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
@@ -64,7 +64,7 @@
     ProcessEngineConfiguration processEngineConfig = commandContext.getProcessEngineConfiguration();
    
     if (activity == null || activity.getFailedJobRetryTimeCycleValue() == null) {
-      log.error("activitiy or FailedJobRetryTimerCycleValue is null in job " + jobId + "'. only decrementing retries.");
+      log.info("activitiy or FailedJobRetryTimerCycleValue is null in job " + jobId + "'. only decrementing retries.");
       job.setRetries(job.getRetries() - 1);
       job.setLockOwner(null);
       job.setLockExpirationTime(null);
