diff --git a/modules/core/src/main/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManager.java b/modules/core/src/main/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManager.java
index e731c52..7f844ea 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManager.java
@@ -1066,7 +1066,7 @@
                         Map<Integer, CacheMetrics> metrics = U.newHashMap(caches.size());
 
                         for (GridCacheAdapter<?, ?> cache : caches) {
-                            if (cache.context().isStatisticsEnabled() &&
+                            if (cache.context().statisticsEnabled() &&
                                 cache.context().started() &&
                                 cache.context().affinity().affinityTopologyVersion().topologyVersion() > 0) {
 
