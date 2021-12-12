diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
index 0a40a0b..b6f21ea 100755
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/JobRetryCmd.java
@@ -68,7 +68,7 @@
     ProcessEngineConfiguration processEngineConfig = commandContext.getProcessEngineConfiguration();
    
     if (activity == null || activity.getFailedJobRetryTimeCycleValue() == null) {
-      log.error("activitiy or FailedJobRetryTimerCycleValue is null in job " + jobId + "'. only decrementing retries.");
+      log.info("activitiy or FailedJobRetryTimerCycleValue is null in job " + jobId + "'. only decrementing retries.");
       job.setRetries(job.getRetries() - 1);
       job.setLockOwner(null);
       job.setLockExpirationTime(null);
