diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
index bac23b4..4fe42ee 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
@@ -103,7 +103,7 @@
     private NodeStats randomNodeStats() {
         Index index = new Index("test-" + randomIntBetween(0, 5), UUID.randomUUID().toString());
         ShardId shardId = new ShardId(index, 0);
-        Path path = createTempDir().resolve("indices").resolve(index.getName()).resolve("0");
+        Path path = createTempDir().resolve("indices").resolve(index.getUUID()).resolve("0");
         ShardRouting shardRouting = ShardRouting.newUnassigned(index, 0, null, true,
                 new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, null));
         ShardRoutingTestUtils.initialize(shardRouting, "node-0");
@@ -116,7 +116,7 @@
         stats.indexing = new IndexingStats();
         stats.search = new SearchStats();
         stats.segments = new SegmentsStats();
-        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, null, shardId), stats, null);
+        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null);
         FsInfo.Path[] pathInfo = new FsInfo.Path[]{
                 new FsInfo.Path("/test", "/dev/sda", 10, -8, 0),
         };
