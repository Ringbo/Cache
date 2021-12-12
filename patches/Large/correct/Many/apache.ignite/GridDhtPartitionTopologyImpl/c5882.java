diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtPartitionTopologyImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtPartitionTopologyImpl.java
index 0e78032..93c99c3 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtPartitionTopologyImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtPartitionTopologyImpl.java
@@ -1135,7 +1135,7 @@
 
             AffinityTopologyVersion affVer = grp.affinity().lastVersion();
 
-            if (diffFromAffinityVer.compareTo(affVer) <= 0) {
+            if (affVer.topologyVersion() > 0 && diffFromAffinityVer.compareTo(affVer) <= 0) {
                 AffinityAssignment affAssignment = grp.affinity().cachedAffinity(affVer);
 
                 for (Map.Entry<UUID, GridDhtPartitionMap> e : partMap.entrySet()) {
