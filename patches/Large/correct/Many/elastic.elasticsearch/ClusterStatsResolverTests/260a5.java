diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/cluster/ClusterStatsResolverTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/cluster/ClusterStatsResolverTests.java
index bb37b85..f2c2d44 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/cluster/ClusterStatsResolverTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/monitoring/resolver/cluster/ClusterStatsResolverTests.java
@@ -150,7 +150,11 @@
         shardCommonStats.fieldData = new FieldDataStats();
         shardCommonStats.queryCache = new QueryCacheStats();
         return new ShardStats[]{
-                new ShardStats(shardRouting, new ShardPath(false, shardPath, shardPath, new ShardId(index, 0)), shardCommonStats, null)
-        };
+                new ShardStats(
+                        shardRouting,
+                        new ShardPath(false, shardPath, shardPath, new ShardId(index, 0)),
+                        shardCommonStats,
+                        null,
+                        null)};
     }
 }
