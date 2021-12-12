diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndicesStatsResolverTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndicesStatsResolverTests.java
index 7d05b38..062b9b8 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndicesStatsResolverTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/indices/IndicesStatsResolverTests.java
@@ -98,7 +98,7 @@
             stats.segments = new SegmentsStats();
             stats.merge = new MergeStats();
             stats.refresh = new RefreshStats();
-            shardStats.add(new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null));
+            shardStats.add(new ShardStats(shardRouting, new ShardPath(false, path, path, shardId), stats, null, null));
         }
         return IndicesStatsResponseTestUtils.newIndicesStatsResponse(shardStats.toArray(new ShardStats[shardStats.size()]),
                 shardStats.size(), shardStats.size(), 0, emptyList());
