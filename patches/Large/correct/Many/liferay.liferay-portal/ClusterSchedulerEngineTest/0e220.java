diff --git a/modules/apps/foundation/portal-scheduler/portal-scheduler-multiple/src/test/java/com/liferay/portal/scheduler/multiple/internal/ClusterSchedulerEngineTest.java b/modules/apps/foundation/portal-scheduler/portal-scheduler-multiple/src/test/java/com/liferay/portal/scheduler/multiple/internal/ClusterSchedulerEngineTest.java
index 2519cf8..98e79d4 100644
--- a/modules/apps/foundation/portal-scheduler/portal-scheduler-multiple/src/test/java/com/liferay/portal/scheduler/multiple/internal/ClusterSchedulerEngineTest.java
+++ b/modules/apps/foundation/portal-scheduler/portal-scheduler-multiple/src/test/java/com/liferay/portal/scheduler/multiple/internal/ClusterSchedulerEngineTest.java
@@ -925,7 +925,7 @@
 		Assert.assertTrue(schedulerResponses.isEmpty());
 
 		Assert.assertEquals(
-			_memoryClusteredJobs.toString(), 1, _memoryClusteredJobs.size());
+			_memoryClusteredJobs.toString(), 2, _memoryClusteredJobs.size());
 
 		ClusterInvokeThreadLocal.setEnabled(false);
 
