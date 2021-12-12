diff --git a/watcher/src/test/java/org/elasticsearch/cluster/routing/TestShardRouting.java b/watcher/src/test/java/org/elasticsearch/cluster/routing/TestShardRouting.java
index 84bc34d..8b331b1 100644
--- a/watcher/src/test/java/org/elasticsearch/cluster/routing/TestShardRouting.java
+++ b/watcher/src/test/java/org/elasticsearch/cluster/routing/TestShardRouting.java
@@ -12,20 +12,20 @@
 public class TestShardRouting {
 
     public static ShardRouting newShardRouting(String index, int shardId, String currentNodeId, boolean primary, ShardRoutingState state, long version) {
-        return new ShardRouting(index, shardId, currentNodeId, null, null, primary, state, version, null, true);
+        return new ShardRouting(index, shardId, currentNodeId, null, null, primary, state, version, null, AllocationId.newInitializing(), true);
     }
 
     public static ShardRouting newShardRouting(String index, int shardId, String currentNodeId, String relocatingNodeId, boolean primary, ShardRoutingState state, long version) {
-        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, null, primary, state, version, null, true);
+        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, null, primary, state, version, null, AllocationId.newInitializing(), true);
     }
 
     public static ShardRouting newShardRouting(String index, int shardId, String currentNodeId, String relocatingNodeId, RestoreSource restoreSource, boolean primary, ShardRoutingState state, long version) {
-        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, restoreSource, primary, state, version, null, true);
+        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, restoreSource, primary, state, version, null, AllocationId.newInitializing(), true);
     }
 
     public static ShardRouting newShardRouting(String index, int shardId, String currentNodeId,
                                                String relocatingNodeId, RestoreSource restoreSource, boolean primary, ShardRoutingState state, long version,
                                                UnassignedInfo unassignedInfo) {
-        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, restoreSource, primary, state, version, unassignedInfo, true);
+        return new ShardRouting(index, shardId, currentNodeId, relocatingNodeId, restoreSource, primary, state, version, unassignedInfo, AllocationId.newInitializing(), true);
     }
 }
