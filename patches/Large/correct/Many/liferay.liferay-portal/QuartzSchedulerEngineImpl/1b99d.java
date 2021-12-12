diff --git a/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngineImpl.java b/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngineImpl.java
index 9f9d0f5..5b36c07 100644
--- a/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngineImpl.java
+++ b/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngineImpl.java
@@ -493,11 +493,11 @@
 			String destinationName = jobDataMap.getString(DESTINATION_NAME);
 
 			if (!destinationName.equals(DestinationNames.SCHEDULER_DISPATCH)) {
-				jobState = (JobState)jobState.clone();
+				JobState jobStateClone = (JobState)jobState.clone();
 
-				jobState.clearExceptions();
+				jobStateClone.clearExceptions();
 
-				jobDataMap.put(SchedulerEngine.JOB_STATE, jobState);
+				jobDataMap.put(SchedulerEngine.JOB_STATE, jobStateClone);
 			}
 
 			_scheduler.unscheduleJob(jobName, groupName);
