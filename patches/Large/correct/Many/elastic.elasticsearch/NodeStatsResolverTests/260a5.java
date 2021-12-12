diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/node/NodeStatsResolverTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/node/NodeStatsResolverTests.java
index 8d56a77..d67d26e 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/node/NodeStatsResolverTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/node/NodeStatsResolverTests.java
@@ -134,7 +134,7 @@
         stats.indexing = new IndexingStats();
         stats.search = new SearchStats();
         stats.segments = new SegmentsStats();
-        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null);
+        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null, null);
         FsInfo.Path[] pathInfo = new FsInfo.Path[]{
                 new FsInfo.Path("/test", "/dev/sda", 10, -8, 0),
         };
