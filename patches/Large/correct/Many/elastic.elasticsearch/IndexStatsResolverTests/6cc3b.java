diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndexStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndexStatsResolverTests.java
index 5a6542c..01acb74 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndexStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndexStatsResolverTests.java
@@ -77,7 +77,7 @@
     private IndexStats randomIndexStats() {
         Index index = new Index("test-" + randomIntBetween(0, 5), UUID.randomUUID().toString());
         ShardId shardId = new ShardId(index, 0);
-        Path path = createTempDir().resolve("indices").resolve(index.getName()).resolve("0");
+        Path path = createTempDir().resolve("indices").resolve(index.getUUID()).resolve("0");
         ShardRouting shardRouting = ShardRouting.newUnassigned(index, 0, null, true,
                 new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, null));
         ShardRoutingTestUtils.initialize(shardRouting, "node-0");
@@ -92,7 +92,7 @@
         stats.segments = new SegmentsStats();
         stats.merge = new MergeStats();
         stats.refresh = new RefreshStats();
-        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, null, shardId), stats, null);
+        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null);
         return new IndexStats(index.getName(), new ShardStats[]{shardStats});
     }
 }
