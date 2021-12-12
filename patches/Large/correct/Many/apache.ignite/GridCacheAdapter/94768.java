diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
index 76e7061..4904e28 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
@@ -3400,7 +3400,7 @@
                 // Send job to all nodes.
                 Collection<ClusterNode> nodes = ctx.grid().forCache(name()).nodes();
 
-                IgniteFuture<Object> fut = null;
+                IgniteInternalFuture<Object> fut = null;
 
                 if (!nodes.isEmpty())
                     fut = ctx.closures().callAsyncNoFailover(BROADCAST, new GlobalRemoveAllCallable<>(name(), topVer, REMOVE_ALL_BATCH_SIZE), nodes, true);
@@ -3414,7 +3414,7 @@
             if (log.isDebugEnabled())
                 log.debug("All remote nodes left while cache remove [cacheName=" + name() + "]");
         }
-        catch (ComputeTaskTimeoutException e) {
+        catch (ComputeTaskTimeoutCheckedException e) {
             U.warn(log, "Timed out waiting for remote nodes to finish cache remove (consider increasing " +
                     "'networkTimeout' configuration property) [cacheName=" + name() + "]");
 
@@ -5250,7 +5250,7 @@
         @Override public Object call() throws Exception {
             Set<K> keys = new HashSet<>();
 
-            final GridKernal grid = (GridKernal) ignite;
+            final IgniteKernal grid = (IgniteKernal) ignite;
 
             final GridCache<K,V> cache = grid.cachex(cacheName);
 
