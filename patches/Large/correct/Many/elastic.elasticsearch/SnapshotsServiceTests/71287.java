diff --git a/server/src/test/java/org/elasticsearch/snapshots/SnapshotsServiceTests.java b/server/src/test/java/org/elasticsearch/snapshots/SnapshotsServiceTests.java
index 291d6bf..34160e9 100644
--- a/server/src/test/java/org/elasticsearch/snapshots/SnapshotsServiceTests.java
+++ b/server/src/test/java/org/elasticsearch/snapshots/SnapshotsServiceTests.java
@@ -539,7 +539,7 @@
                 allocationService, masterService, () -> persistedState,
                 hostsResolver -> testClusterNodes.nodes.values().stream().filter(n -> n.node.isMasterNode())
                     .map(n -> n.node.getAddress()).collect(Collectors.toList()),
-                clusterService.getClusterApplierService(), random());
+                clusterService.getClusterApplierService(), Collections.emptyList(), random());
             masterService.setClusterStatePublisher(coordinator);
             coordinator.start();
             masterService.start();
