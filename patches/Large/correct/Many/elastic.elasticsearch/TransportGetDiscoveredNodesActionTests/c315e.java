diff --git a/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportGetDiscoveredNodesActionTests.java b/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportGetDiscoveredNodesActionTests.java
index 0545728..47f1355 100644
--- a/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportGetDiscoveredNodesActionTests.java
+++ b/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportGetDiscoveredNodesActionTests.java
@@ -97,7 +97,7 @@
             TransportService.NOOP_TRANSPORT_INTERCEPTOR, boundTransportAddress -> localNode, null, emptySet());
 
         final ClusterSettings clusterSettings = new ClusterSettings(Settings.EMPTY, ClusterSettings.BUILT_IN_CLUSTER_SETTINGS);
-        coordinator = new Coordinator("local", Settings.EMPTY, clusterSettings, transportService,
+        coordinator = new Coordinator("local", Settings.EMPTY, clusterSettings, transportService, writableRegistry(),
             ESAllocationTestCase.createAllocationService(Settings.EMPTY),
             new MasterService("local", Settings.EMPTY, threadPool),
             () -> new InMemoryPersistedState(0, ClusterState.builder(new ClusterName(clusterName)).build()), r -> emptyList(),
