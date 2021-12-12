diff --git a/portal-impl/src/com/liferay/portal/scheduler/job/MessageSenderJob.java b/portal-impl/src/com/liferay/portal/scheduler/job/MessageSenderJob.java
index cb20668..eb822e7 100644
--- a/portal-impl/src/com/liferay/portal/scheduler/job/MessageSenderJob.java
+++ b/portal-impl/src/com/liferay/portal/scheduler/job/MessageSenderJob.java
@@ -92,11 +92,11 @@
 
 				jobState.setTriggerState(TriggerState.COMPLETE);
 
-				jobState = (JobState)jobState.clone();
+				JobState jobStateClone = (JobState)jobState.clone();
 
-				jobState.clearExceptions();
+				jobStateClone.clearExceptions();
 
-				jobDataMap.put(SchedulerEngine.JOB_STATE, jobState);
+				jobDataMap.put(SchedulerEngine.JOB_STATE, jobStateClone);
 
 				scheduler.addJob(jobDetail, true);
 			}
