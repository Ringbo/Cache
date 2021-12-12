diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
index 12a8289..80beba9 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
@@ -128,7 +128,7 @@
         statsByShard.put(index, Collections.singletonList(new IndexShardStats(new ShardId(index, 0), randomShardStats())));
         return new NodeStats(new DiscoveryNode("node_0", DummyTransportAddress.INSTANCE, emptyMap(), emptySet(), Version.CURRENT), 0,
                 new NodeIndicesStats(new CommonStats(), statsByShard), null, null, null, null,
-                new FsInfo(0, pathInfo), null, null, null, null, null, null);
+                new FsInfo(0, null, pathInfo), null, null, null, null, null, null);
     }
 
     /**
