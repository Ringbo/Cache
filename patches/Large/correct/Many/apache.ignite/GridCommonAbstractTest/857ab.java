diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/junits/common/GridCommonAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/testframework/junits/common/GridCommonAbstractTest.java
index 44ca051..4bcf51e 100644
--- a/modules/core/src/test/java/org/apache/ignite/testframework/junits/common/GridCommonAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/junits/common/GridCommonAbstractTest.java
@@ -430,7 +430,7 @@
 
                             AffinityTopologyVersion readyVer = dht.context().shared().exchange().readyAffinityVersion();
 
-                            if (readyVer.topologyVersion() > 0 && dht.context().started()) {
+                            if (readyVer.topologyVersion() > 0 && c.context().started()) {
                                 // Must map on updated version of topology.
                                 Collection<ClusterNode> affNodes =
                                     g0.affinity(cfg.getName()).mapPartitionToPrimaryAndBackups(p);
