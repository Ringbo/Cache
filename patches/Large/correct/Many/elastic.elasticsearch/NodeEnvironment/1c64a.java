diff --git a/src/main/java/org/elasticsearch/env/NodeEnvironment.java b/src/main/java/org/elasticsearch/env/NodeEnvironment.java
index d61c6cb..6a97156 100644
--- a/src/main/java/org/elasticsearch/env/NodeEnvironment.java
+++ b/src/main/java/org/elasticsearch/env/NodeEnvironment.java
@@ -270,7 +270,7 @@
      * Returns all currently lock shards
      */
     public Set<ShardId> lockedShards() {
-        synchronized (this) {
+        synchronized (shardLocks) {
             ImmutableSet.Builder<ShardId> builder = ImmutableSet.builder();
             return builder.addAll(shardLocks.keySet()).build();
         }
