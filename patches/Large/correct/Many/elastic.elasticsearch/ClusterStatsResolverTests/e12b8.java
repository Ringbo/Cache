diff --git a/elasticsearch/x-pack/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/agent/resolver/cluster/ClusterStatsResolverTests.java b/elasticsearch/x-pack/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/agent/resolver/cluster/ClusterStatsResolverTests.java
index f9ac50c..8a0be5b 100644
--- a/elasticsearch/x-pack/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/agent/resolver/cluster/ClusterStatsResolverTests.java
+++ b/elasticsearch/x-pack/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/agent/resolver/cluster/ClusterStatsResolverTests.java
@@ -109,7 +109,7 @@
         BoundTransportAddress transportAddress = new BoundTransportAddress(new TransportAddress[]{DummyTransportAddress.INSTANCE},
                 DummyTransportAddress.INSTANCE);
         return new NodeInfo(Version.CURRENT, org.elasticsearch.Build.CURRENT,
-                new DiscoveryNode("node_0", DummyTransportAddress.INSTANCE, emptyMap(), emptySet(), Version.CURRENT), emptyMap(),
+                new DiscoveryNode("node_0", DummyTransportAddress.INSTANCE, emptyMap(), emptySet(), Version.CURRENT),
                 Settings.EMPTY, DummyOsInfo.INSTANCE, new ProcessInfo(randomInt(), randomBoolean()), JvmInfo.jvmInfo(),
                 new ThreadPoolInfo(Collections.singletonList(new ThreadPool.Info("test_threadpool", ThreadPool.ThreadPoolType.FIXED, 5))),
                 new TransportInfo(transportAddress, Collections.emptyMap()), new HttpInfo(transportAddress, randomLong()),
