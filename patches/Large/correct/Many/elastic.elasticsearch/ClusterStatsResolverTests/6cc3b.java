diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
index 44ee1ff..4948b53 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
@@ -132,14 +132,14 @@
      */
     private ShardStats[] randomShardStats() {
         Index index = new Index("test", UUID.randomUUID().toString());
-        Path shardPath = createTempDir().resolve("indices").resolve("test").resolve("0");
+        Path shardPath = createTempDir().resolve("indices").resolve(index.getUUID()).resolve("0");
         ShardRouting shardRouting = ShardRouting.newUnassigned(index, 0, null, false,
                 new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "foo"));
         CommonStats shardCommonStats = new CommonStats();
         shardCommonStats.fieldData = new FieldDataStats();
         shardCommonStats.queryCache = new QueryCacheStats();
         return new ShardStats[]{
-                new ShardStats(shardRouting, new ShardPath(false, shardPath, shardPath, "", new ShardId(index, 0)), shardCommonStats, null)
+                new ShardStats(shardRouting, new ShardPath(false, shardPath, shardPath, new ShardId(index, 0)), shardCommonStats, null)
         };
     }
 }
