diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCollectMetricsCacheTask.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCollectMetricsCacheTask.java
index 82ca972..5a672d7 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCollectMetricsCacheTask.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCollectMetricsCacheTask.java
@@ -64,7 +64,7 @@
         }
 
         @Override protected Collection<VisorCacheMetrics> run(VisorCollectMetricsCacheArg arg) throws GridException {
-            Collection<? extends GridCache<?, ?>> caches = arg.all ? g.cachesx(null) : F.asList(g.cachex(arg.cacheName));
+            Collection<? extends GridCache<?, ?>> caches = arg.all ? g.cachesx() : F.asList(g.cachex(arg.cacheName));
 
             if (caches != null) {
                 Collection<VisorCacheMetrics> res = new ArrayList<>(caches.size());
