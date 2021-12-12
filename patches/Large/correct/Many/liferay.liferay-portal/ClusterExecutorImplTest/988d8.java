diff --git a/portal-impl/test/unit/com/liferay/portal/cluster/ClusterExecutorImplTest.java b/portal-impl/test/unit/com/liferay/portal/cluster/ClusterExecutorImplTest.java
index 66b9d13..249ffa2 100644
--- a/portal-impl/test/unit/com/liferay/portal/cluster/ClusterExecutorImplTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/cluster/ClusterExecutorImplTest.java
@@ -64,7 +64,7 @@
 		adviceClasses = {
 			DisableAutodetectedAddressAdvice.class,
 			EnableClusterLinkAdvice.class,
-			EnableClusterExecutorDebugAdvice.class, EnableLiveUsersAdvice.class
+			EnableClusterExecutorDebugAdvice.class
 		})
 	@Test
 	public void testClusterEventListener() throws Exception {
@@ -74,7 +74,7 @@
 			List<ClusterEventListener> clusterEventListeners =
 				clusterExecutorImpl.getClusterEventListeners();
 
-			Assert.assertEquals(2, clusterEventListeners.size());
+			Assert.assertEquals(1, clusterEventListeners.size());
 
 			// Test 1, add cluster event listener
 
@@ -86,7 +86,7 @@
 			clusterEventListeners =
 				clusterExecutorImpl.getClusterEventListeners();
 
-			Assert.assertEquals(3, clusterEventListeners.size());
+			Assert.assertEquals(2, clusterEventListeners.size());
 
 			// Test 2, remove cluster event listener
 
@@ -96,7 +96,7 @@
 			clusterEventListeners =
 				clusterExecutorImpl.getClusterEventListeners();
 
-			Assert.assertEquals(2, clusterEventListeners.size());
+			Assert.assertEquals(1, clusterEventListeners.size());
 
 			// Test 3, set cluster event listener
 
@@ -109,7 +109,7 @@
 			clusterEventListeners =
 				clusterExecutorImpl.getClusterEventListeners();
 
-			Assert.assertEquals(3, clusterEventListeners.size());
+			Assert.assertEquals(2, clusterEventListeners.size());
 		}
 		finally {
 			clusterExecutorImpl.destroy();
