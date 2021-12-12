diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
index 40998ca..e08d13a 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
@@ -5368,7 +5368,7 @@
         /** {@inheritDoc} */
         @Nullable @Override public Object localExecute(@Nullable IgniteInternalCache cache) {
             if (cache == null)
-                return 0;
+                return 0L;
 
             try {
                 return cache.localSizeLong(peekModes);
