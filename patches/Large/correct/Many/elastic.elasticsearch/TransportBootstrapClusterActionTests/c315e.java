diff --git a/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportBootstrapClusterActionTests.java b/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportBootstrapClusterActionTests.java
index 743bc53..8aba67e 100644
--- a/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportBootstrapClusterActionTests.java
+++ b/server/src/test/java/org/elasticsearch/action/admin/cluster/bootstrap/TransportBootstrapClusterActionTests.java
@@ -90,7 +90,7 @@
             TransportService.NOOP_TRANSPORT_INTERCEPTOR, boundTransportAddress -> discoveryNode, null, emptySet());
 
         final ClusterSettings clusterSettings = new ClusterSettings(Settings.EMPTY, ClusterSettings.BUILT_IN_CLUSTER_SETTINGS);
-        coordinator = new Coordinator("local", Settings.EMPTY, clusterSettings, transportService,
+        coordinator = new Coordinator("local", Settings.EMPTY, clusterSettings, transportService, writableRegistry(),
             ESAllocationTestCase.createAllocationService(Settings.EMPTY),
             new MasterService("local", Settings.EMPTY, threadPool),
             () -> new InMemoryPersistedState(0, ClusterState.builder(new ClusterName("cluster")).build()), r -> emptyList(),
