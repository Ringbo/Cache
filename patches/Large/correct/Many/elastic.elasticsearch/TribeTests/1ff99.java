diff --git a/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java b/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
index ccefef5..84f4445 100644
--- a/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
+++ b/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
@@ -65,7 +65,7 @@
             String cluster2Name = clusterName(Scope.SUITE.name(), Integer.toString(CHILD_JVM_ID), randomLong());
             //no port conflicts as this test uses the global cluster and a suite cluster that gets manually created
             ShieldSettingsSource cluster2SettingsSource = new ShieldSettingsSource(2, sslTransportEnabled, systemKey, newTempDir(LifecycleScope.SUITE), Scope.SUITE);
-            cluster2 = new InternalTestCluster(randomLong(), 2, 2, cluster2Name, cluster2SettingsSource, 0, false, false, CHILD_JVM_ID, SECOND_CLUSTER_NODE_PREFIX);
+            cluster2 = new InternalTestCluster(randomLong(), 2, 2, cluster2Name, cluster2SettingsSource, 0, false, CHILD_JVM_ID, SECOND_CLUSTER_NODE_PREFIX);
 
             assert tribeSettingsSource == null;
             //given the low (2 and 1) number of nodes that the 2 SUITE clusters will have, we are not going to have port conflicts
@@ -143,7 +143,7 @@
 
         //we need to recreate the tribe node after each test otherwise ensureClusterSizeConsistency barfs
         String tribeClusterName = clusterName(Scope.SUITE.name(), Integer.toString(CHILD_JVM_ID), randomLong());
-        tribeNodeCluster = new InternalTestCluster(randomLong(), 1, 1, tribeClusterName, tribeSettingsSource, 0, false, false, CHILD_JVM_ID, TRIBE_CLUSTER_NODE_PREFIX);
+        tribeNodeCluster = new InternalTestCluster(randomLong(), 1, 1, tribeClusterName, tribeSettingsSource, 0, false, CHILD_JVM_ID, TRIBE_CLUSTER_NODE_PREFIX);
         tribeNodeCluster.beforeTest(getRandom(), 0.5);
         awaitSameNodeCounts();
     }
