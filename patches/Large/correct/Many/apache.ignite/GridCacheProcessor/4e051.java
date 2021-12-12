diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
index b5bf105..0cc5ee8 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
@@ -928,7 +928,7 @@
                 ctx.addNodeAttribute(ATTR_CACHE_INTERCEPTORS, interceptors);
         }
 
-        marshallerCache().context().preloader().syncFuture().listenAsync(new CI1<IgniteInternalFuture<?>>() {
+        marshallerCache().context().preloader().syncFuture().listen(new CI1<IgniteInternalFuture<?>>() {
             @Override public void apply(IgniteInternalFuture<?> f) {
                 ctx.marshallerContext().onMarshallerCacheReady(ctx);
             }
