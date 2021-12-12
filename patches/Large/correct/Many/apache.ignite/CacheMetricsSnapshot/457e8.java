diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CacheMetricsSnapshot.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CacheMetricsSnapshot.java
index fc7e9a7..1971d5b 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CacheMetricsSnapshot.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CacheMetricsSnapshot.java
@@ -353,7 +353,7 @@
             reads += e.getCacheGets();
             puts += e.getCachePuts();
             hits += e.getCacheHits();
-            misses += e.getCacheHits();
+            misses += e.getCacheMisses();
             txCommits += e.getCacheTxCommits();
             txRollbacks += e.getCacheTxRollbacks();
             evicts += e.getCacheEvictions();
