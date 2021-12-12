diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProxyImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProxyImpl.java
index 3c4a3c5..4613be7 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProxyImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProxyImpl.java
@@ -59,7 +59,7 @@
 
     /** Delegate object. */
     @GridToStringExclude
-    private GridCacheAdapter<K, V> delegate;
+    private CacheProjection<K, V> delegate;
 
     /** Projection. */
     @GridToStringExclude
@@ -83,7 +83,7 @@
      * @param delegate Delegate object.
      * @param prj Optional projection which will be passed to gateway.
      */
-    public GridCacheProxyImpl(GridCacheContext<K, V> ctx, GridCacheAdapter<K, V> delegate,
+    public GridCacheProxyImpl(GridCacheContext<K, V> ctx, CacheProjection<K, V> delegate,
         @Nullable CacheProjectionContext prj) {
         assert ctx != null;
         assert delegate != null;
