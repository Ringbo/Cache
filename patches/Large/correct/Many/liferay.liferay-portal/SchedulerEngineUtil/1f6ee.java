diff --git a/portal-service/src/com/liferay/portal/kernel/scheduler/SchedulerEngineUtil.java b/portal-service/src/com/liferay/portal/kernel/scheduler/SchedulerEngineUtil.java
index 96c973a..3f30d09 100644
--- a/portal-service/src/com/liferay/portal/kernel/scheduler/SchedulerEngineUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/scheduler/SchedulerEngineUtil.java
@@ -305,7 +305,7 @@
 	public void setSchedulerEngine(SchedulerEngine schedulerEngine) {
 		_instance._schedulerEngine = schedulerEngine;
 
-		if (_schedulerEngine instanceof SchedulerEngineClusterManager) {
+		if (schedulerEngine instanceof SchedulerEngineClusterManager) {
 			_instance._schedulerEngineClusterManager =
 				(SchedulerEngineClusterManager)schedulerEngine;
 		}
