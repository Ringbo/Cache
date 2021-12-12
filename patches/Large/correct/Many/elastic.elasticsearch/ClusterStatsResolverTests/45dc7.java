diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
index 6a481ee..8599ff0 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/cluster/ClusterStatsResolverTests.java
@@ -113,7 +113,7 @@
                 Settings.EMPTY, DummyOsInfo.INSTANCE, new ProcessInfo(randomInt(), randomBoolean()), JvmInfo.jvmInfo(),
                 new ThreadPoolInfo(Collections.singletonList(new ThreadPool.Info("test_threadpool", ThreadPool.ThreadPoolType.FIXED, 5))),
                 new TransportInfo(transportAddress, Collections.emptyMap()), new HttpInfo(transportAddress, randomLong()),
-                new PluginsAndModules(), new IngestInfo());
+                new PluginsAndModules(), new IngestInfo(Collections.emptyList()));
 
     }
 
