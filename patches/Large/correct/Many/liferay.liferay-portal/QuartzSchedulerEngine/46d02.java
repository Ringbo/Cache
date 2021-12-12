diff --git a/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngine.java b/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngine.java
index 5fe5972..098e991 100644
--- a/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngine.java
+++ b/portal-impl/src/com/liferay/portal/scheduler/quartz/QuartzSchedulerEngine.java
@@ -920,7 +920,7 @@
 		groupName = fixMaxLength(
 			getOriginalGroupName(groupName), GROUP_NAME_MAX_LENGTH);
 
-		String[] jobNames = _persistedScheduler.getJobNames(groupName);
+		String[] jobNames = scheduler.getJobNames(groupName);
 
 		for (String jobName : jobNames) {
 			JobState jobState = getJobState(scheduler, jobName, groupName);
