diff --git a/src/test/java/org/elasticsearch/discovery/DiscoveryWithServiceDisruptionsTests.java b/src/test/java/org/elasticsearch/discovery/DiscoveryWithServiceDisruptionsTests.java
index 74762bd..e4d4fea 100644
--- a/src/test/java/org/elasticsearch/discovery/DiscoveryWithServiceDisruptionsTests.java
+++ b/src/test/java/org/elasticsearch/discovery/DiscoveryWithServiceDisruptionsTests.java
@@ -789,7 +789,7 @@
     @Test
     @TestLogging("discovery.zen:TRACE,cluster.service:TRACE")
     public void isolatedUnicastNodes() throws Exception {
-        List<String> nodes = startUnicastCluster(3, new int[]{0}, -1);
+        List<String> nodes = startUnicastCluster(4, new int[]{0}, -1);
         // Figure out what is the elected master node
         final String unicastTarget = nodes.get(0);
 
@@ -813,13 +813,13 @@
         setDisruptionScheme(networkDisconnect);
         networkDisconnect.startDisrupting();
         // Wait until elected master has removed that the unlucky node...
-        ensureStableCluster(2, nodes.get(1));
+        ensureStableCluster(3, nodes.get(1));
 
         // The isolate master node must report no master, so it starts with pinging
         assertNoMaster(unicastTarget);
         networkDisconnect.stopDisrupting();
         // Wait until the master node sees all 3 nodes again.
-        ensureStableCluster(3);
+        ensureStableCluster(4);
     }
 
 
