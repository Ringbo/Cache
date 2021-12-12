diff --git a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
index 6c7c511..60ffce0 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
@@ -2421,9 +2421,9 @@
     /**
      * @param cache Cache.
      */
-    private void checkNearCacheStarted(IgniteCacheProxy<?, ?> cache) {
+    private void checkNearCacheStarted(IgniteCacheProxy<?, ?> cache) throws IgniteCheckedException {
         if (!cache.context().isNear())
-            throw new IgniteException("Failed to start near cache " +
+            throw new IgniteCheckedException("Failed to start near cache " +
                 "(a cache with the same name without near cache is already started)");
     }
 
