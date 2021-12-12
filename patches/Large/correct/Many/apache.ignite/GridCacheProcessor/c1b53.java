diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
index f13af23..c08f1d4 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
@@ -2875,7 +2875,7 @@
      * Cancel all user operations.
      */
     public void cancelUserOperations() {
-        for (GridCacheAdapter<?, ?> cache : caches.values())
+        for (GridCacheAdapter<?, ?> cache : stoppedCaches.values())
             cache.ctx.mvcc().cancelClientFutures();
     }
 
