diff --git a/test/unit/voldemort/client/rebalance/ZonedRebalanceNonContiguousZonesTest.java b/test/unit/voldemort/client/rebalance/ZonedRebalanceNonContiguousZonesTest.java
index f92b7c1..0932865 100644
--- a/test/unit/voldemort/client/rebalance/ZonedRebalanceNonContiguousZonesTest.java
+++ b/test/unit/voldemort/client/rebalance/ZonedRebalanceNonContiguousZonesTest.java
@@ -270,7 +270,7 @@
         logger.info("Starting " + testTag);
         // Hacky work around of TOCTOU bind Exception issues. Each test that invokes this method brings 
         // servers up & down on the same ports. The OS seems to need a rest between subsequent tests...
-        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
+        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
         try {
             Cluster interimCluster = RebalanceUtils.getInterimCluster(cCluster, fCluster);
             List<Integer> serverList = new ArrayList<Integer>(interimCluster.getNodeIds());
@@ -319,7 +319,7 @@
         logger.info("Starting testShuffleZZAndShuffleAgain");
         // Hacky work around of TOCTOU bind Exception issues. Each test that invokes this method brings servers 
         // up & down on the same ports. The OS seems to need a rest between subsequent tests...
-        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
+        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
 
         Cluster interimCluster = RebalanceUtils.getInterimCluster(z1z3Current, z1z3Shuffle);
 
