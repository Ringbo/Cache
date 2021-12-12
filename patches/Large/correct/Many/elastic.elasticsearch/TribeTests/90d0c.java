diff --git a/shield/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java b/shield/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
index 1e7621e..39c3496 100644
--- a/shield/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/tribe/TribeTests.java
@@ -64,7 +64,7 @@
             String cluster2Name = clusterName(Scope.SUITE.name(), randomLong());
             //no port conflicts as this test uses the global cluster and a suite cluster that gets manually created
             ShieldSettingsSource cluster2SettingsSource = new ShieldSettingsSource(2, sslTransportEnabled, systemKey(), createTempDir(), Scope.SUITE);
-            cluster2 = new InternalTestCluster("network", randomLong(), createTempDir(), 2, 2, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX);
+            cluster2 = new InternalTestCluster("network", randomLong(), createTempDir(), 2, 2, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX, true);
 
             assert tribeSettingsSource == null;
             //given the low (2 and 1) number of nodes that the 2 SUITE clusters will have, we are not going to have port conflicts
@@ -142,7 +142,7 @@
 
         //we need to recreate the tribe node after each test otherwise ensureClusterSizeConsistency barfs
         String tribeClusterName = clusterName(Scope.SUITE.name(), randomLong());
-        tribeNodeCluster = new InternalTestCluster("network", randomLong(), createTempDir(), 1, 1, tribeClusterName, tribeSettingsSource, 0, false, TRIBE_CLUSTER_NODE_PREFIX);
+        tribeNodeCluster = new InternalTestCluster("network", randomLong(), createTempDir(), 1, 1, tribeClusterName, tribeSettingsSource, 0, false, TRIBE_CLUSTER_NODE_PREFIX, true);
         tribeNodeCluster.beforeTest(getRandom(), 0.5);
         awaitSameNodeCounts();
     }
