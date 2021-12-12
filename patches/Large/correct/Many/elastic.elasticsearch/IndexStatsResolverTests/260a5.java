diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndexStatsResolverTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndexStatsResolverTests.java
index 866f9c0..77da658 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndexStatsResolverTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndexStatsResolverTests.java
@@ -97,7 +97,7 @@
         stats.segments = new SegmentsStats();
         stats.merge = new MergeStats();
         stats.refresh = new RefreshStats();
-        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null);
+        ShardStats shardStats = new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null, null);
         return new IndexStats(index.getName(), new ShardStats[]{shardStats});
     }
 }
