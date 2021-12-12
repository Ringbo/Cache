diff --git a/redisson/src/main/java/org/redisson/cluster/ClusterConnectionManager.java b/redisson/src/main/java/org/redisson/cluster/ClusterConnectionManager.java
index e6c5f7b..4c4ee58 100644
--- a/redisson/src/main/java/org/redisson/cluster/ClusterConnectionManager.java
+++ b/redisson/src/main/java/org/redisson/cluster/ClusterConnectionManager.java
@@ -671,7 +671,7 @@
     private Collection<ClusterPartition> parsePartitions(List<ClusterNodeInfo> nodes) {
         Map<String, ClusterPartition> partitions = new HashMap<String, ClusterPartition>();
         for (ClusterNodeInfo clusterNodeInfo : nodes) {
-            if (clusterNodeInfo.containsFlag(Flag.NOADDR)) {
+            if (clusterNodeInfo.containsFlag(Flag.NOADDR) || clusterNodeInfo.containsFlag(Flag.HANDSHAKE)) {
                 // skip it
                 continue;
             }
