diff --git a/portal-impl/test/unit/com/liferay/portal/scheduler/ClusterSchedulerEngineTest.java b/portal-impl/test/unit/com/liferay/portal/scheduler/ClusterSchedulerEngineTest.java
index 086323d..0c94c1f 100644
--- a/portal-impl/test/unit/com/liferay/portal/scheduler/ClusterSchedulerEngineTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/scheduler/ClusterSchedulerEngineTest.java
@@ -625,7 +625,7 @@
 
 		Map<String, Serializable> context = _collectThreadLocalContext();
 
-		Assert.assertTrue(_clusterInvokeAcceptor.accept(context));
+		Assert.assertFalse(_clusterInvokeAcceptor.accept(context));
 
 		_clusterSchedulerEngine.delete(
 			_MEMORY_CLUSTER_TEST_GROUP_NAME, StorageType.MEMORY_CLUSTERED);
@@ -634,7 +634,7 @@
 
 		ClusterInvokeThreadLocal.setEnabled(false);
 
-		Assert.assertTrue(_clusterInvokeAcceptor.accept(context));
+		Assert.assertFalse(_clusterInvokeAcceptor.accept(context));
 
 		ClusterInvokeThreadLocal.setEnabled(true);
 	}
