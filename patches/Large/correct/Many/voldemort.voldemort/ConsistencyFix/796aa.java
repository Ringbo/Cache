diff --git a/src/java/voldemort/utils/ConsistencyFix.java b/src/java/voldemort/utils/ConsistencyFix.java
index 57b5d9b..a9121e8 100644
--- a/src/java/voldemort/utils/ConsistencyFix.java
+++ b/src/java/voldemort/utils/ConsistencyFix.java
@@ -63,7 +63,7 @@
             System.out.println("Store definition determined.");
 
             System.out.println("Determining partition ID to node ID mapping.");
-            partitionIdToNodeIdMap = RebalanceUtils.getCurrentPartitionMapping(cluster);
+            partitionIdToNodeIdMap = ClusterUtils.getCurrentPartitionMapping(cluster);
         }
 
         public Cluster getCluster() {
