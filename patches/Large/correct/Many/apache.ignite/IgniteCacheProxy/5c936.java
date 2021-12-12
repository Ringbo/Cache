diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxy.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxy.java
index 40afa26..6efd5c7 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxy.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxy.java
@@ -69,7 +69,7 @@
 
     /** Delegate. */
     @GridToStringInclude
-    private GridCacheAdapter<K, V> delegate;
+    private CacheProjection<K, V> delegate;
 
     /** Projection. */
     private CacheProjectionContext prjCtx;
@@ -97,7 +97,7 @@
      */
     public IgniteCacheProxy(
         GridCacheContext<K, V> ctx,
-        GridCacheAdapter<K, V> delegate,
+        CacheProjection<K, V> delegate,
         CacheProjectionContext prjCtx,
         boolean async
     ) {
@@ -1491,7 +1491,7 @@
     @Override public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         ctx = (GridCacheContext<K, V>)in.readObject();
 
-        delegate = (GridCacheAdapter<K, V>)in.readObject();
+        delegate = (CacheProjection<K, V>)in.readObject();
 
         prjCtx = (CacheProjectionContext)in.readObject();
 
