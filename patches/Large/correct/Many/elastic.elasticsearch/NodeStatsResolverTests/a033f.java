diff --git a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
index e41cba2..11216f1 100644
--- a/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
+++ b/elasticsearch/x-pack/marvel/src/test/java/org/elasticsearch/marvel/agent/resolver/node/NodeStatsResolverTests.java
@@ -136,6 +136,6 @@
                 new NodeIndicesStats(new CommonStats(), statsByShard), OsProbe.getInstance().osStats(),
                 ProcessProbe.getInstance().processStats(), JvmStats.jvmStats(),
                 new ThreadPoolStats(threadPoolStats),
-                new FsInfo(0, pathInfo), null, null, null, null, null);
+                new FsInfo(0, pathInfo), null, null, null, null, null, null);
     }
 }
