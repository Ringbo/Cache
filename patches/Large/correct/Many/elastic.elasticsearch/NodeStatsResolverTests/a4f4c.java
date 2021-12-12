diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
index a2a6c7a..f9ff1b1 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
@@ -137,6 +137,6 @@
                 new NodeIndicesStats(new CommonStats(), statsByShard), OsProbe.getInstance().osStats(),
                 ProcessProbe.getInstance().processStats(), JvmStats.jvmStats(),
                 new ThreadPoolStats(threadPoolStats),
-                new FsInfo(0, pathInfo), null, null, null, null, null, null);
+                new FsInfo(0, null, pathInfo), null, null, null, null, null, null);
     }
 }
