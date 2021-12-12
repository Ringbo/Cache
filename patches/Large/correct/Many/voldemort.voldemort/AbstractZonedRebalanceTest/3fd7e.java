diff --git a/test/unit/voldemort/client/rebalance/AbstractZonedRebalanceTest.java b/test/unit/voldemort/client/rebalance/AbstractZonedRebalanceTest.java
index cee2f6a..e0a7d2d 100644
--- a/test/unit/voldemort/client/rebalance/AbstractZonedRebalanceTest.java
+++ b/test/unit/voldemort/client/rebalance/AbstractZonedRebalanceTest.java
@@ -329,7 +329,7 @@
         // Hacky work around of TOCTOU bind Exception issues. Each test that
         // invokes this method brings servers up & down on the same ports. The
         // OS seems to need a rest between subsequent tests...
-        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
+        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
 
         Cluster interimCluster = RebalanceUtils.getInterimCluster(zzCurrent, zzShuffle);
 
