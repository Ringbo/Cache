diff --git a/marvel/src/test/java/org/elasticsearch/marvel/agent/renderer/indices/IndexStatsRendererTests.java b/marvel/src/test/java/org/elasticsearch/marvel/agent/renderer/indices/IndexStatsRendererTests.java
index c44c2e9..88af1ef 100644
--- a/marvel/src/test/java/org/elasticsearch/marvel/agent/renderer/indices/IndexStatsRendererTests.java
+++ b/marvel/src/test/java/org/elasticsearch/marvel/agent/renderer/indices/IndexStatsRendererTests.java
@@ -36,7 +36,7 @@
                         CommonStats stats = new CommonStats();
                         stats.docs = new DocsStats(345678L, 123L);
                         stats.store = new StoreStats(5761573L, 0L);
-                        stats.indexing = new IndexingStats(new IndexingStats.Stats(3L, 71L, 0L, 0L, 0L, 0L, 0L, true, 302L), null);
+                        stats.indexing = new IndexingStats(new IndexingStats.Stats(3L, 71L, 0L, 0L, 0L, 0L, 0L, 0L, true, 302L), null);
                         stats.search = new SearchStats(new SearchStats.Stats(1L, 7L, 0L, 0L, 0L, 0L, 0L, 0L, 0L), 0L, null);
                         stats.merge = new MergeStats();
                         stats.merge.add(0L, 0L, 0L, 42L, 0L, 0L, 0L, 0L, 0L, 0L);
@@ -52,7 +52,7 @@
                         CommonStats stats = new CommonStats();
                         stats.docs = new DocsStats(345678L, randomLong());
                         stats.store = new StoreStats(randomLong(), randomLong());
-                        stats.indexing = new IndexingStats(new IndexingStats.Stats(0L, 0L, 0L, 0L, 0L, 0L, 0L, true, randomLong()), null);
+                        stats.indexing = new IndexingStats(new IndexingStats.Stats(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, true, randomLong()), null);
                         return stats;
                     }
                 });
