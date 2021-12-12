diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxyImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxyImpl.java
index b94afa1..0bc3ba2 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxyImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheProxyImpl.java
@@ -677,7 +677,8 @@
      */
     private void validate(Query qry) {
         if (!QueryUtils.isEnabled(ctx.config()) && !(qry instanceof ScanQuery) &&
-            !(qry instanceof ContinuousQuery) && !(qry instanceof SpiQuery))
+            !(qry instanceof ContinuousQuery) && !(qry instanceof SpiQuery) && !(qry instanceof SqlQuery) &&
+            !(qry instanceof SqlFieldsQuery))
             throw new CacheException("Indexing is disabled for cache: " + ctx.cache().name() +
                 ". Use setIndexedTypes or setTypeMetadata methods on CacheConfiguration to enable.");
 
