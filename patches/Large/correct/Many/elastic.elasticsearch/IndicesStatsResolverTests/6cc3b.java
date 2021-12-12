diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndicesStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndicesStatsResolverTests.java
index d94307c..a702eab 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndicesStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/indices/IndicesStatsResolverTests.java
@@ -85,7 +85,7 @@
         List<ShardStats> shardStats = new ArrayList<>();
         for (int i=0; i < randomIntBetween(2, 5); i++) {
             ShardId shardId = new ShardId(index, i);
-            Path path = createTempDir().resolve("indices").resolve(index.getName()).resolve(String.valueOf(i));
+            Path path = createTempDir().resolve("indices").resolve(index.getUUID()).resolve(String.valueOf(i));
             ShardRouting shardRouting = ShardRouting.newUnassigned(index, i, null, true,
                     new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, null));
             ShardRoutingTestUtils.initialize(shardRouting, "node-0");
@@ -100,7 +100,7 @@
             stats.segments = new SegmentsStats();
             stats.merge = new MergeStats();
             stats.refresh = new RefreshStats();
-            shardStats.add(new ShardStats(shardRouting, new ShardPath(false, path, path, null, shardId), stats, null));
+            shardStats.add(new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null));
         }
         return IndicesStatsResponseTestUtils.newIndicesStatsResponse(shardStats.toArray(new ShardStats[shardStats.size()]),
                 shardStats.size(), shardStats.size(), 0, emptyList());
