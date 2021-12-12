diff --git a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/UpgradeResourceProviderTest.java b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/UpgradeResourceProviderTest.java
index 976eb53..00ba387 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/UpgradeResourceProviderTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/UpgradeResourceProviderTest.java
@@ -231,11 +231,11 @@
 
     List<Stage> stages = am.getRequestStatus(requests.get(0).longValue());
 
-    assertEquals(10, stages.size());
+    assertEquals(9, stages.size());
 
     List<HostRoleCommand> tasks = am.getRequestTasks(requests.get(0).longValue());
     // same number of tasks as stages here
-    assertEquals(10, tasks.size());
+    assertEquals(9, tasks.size());
 
     Set<Long> slaveStageIds = new HashSet<Long>();
 
@@ -322,7 +322,7 @@
     ResourceProvider upgradeItemResourceProvider = new UpgradeItemResourceProvider(amc);
     resources = upgradeItemResourceProvider.getResources(request, predicate);
 
-    assertEquals(3, resources.size());
+    assertEquals(2, resources.size());
 
     res = resources.iterator().next();
     assertNotNull(res.getPropertyValue("UpgradeItem/status"));
