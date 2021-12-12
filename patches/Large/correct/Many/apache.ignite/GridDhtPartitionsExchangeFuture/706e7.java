diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
index dd4a571..af5acd6 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
@@ -2760,7 +2760,7 @@
                     || grpCtx.config().isReadThrough()
                     || grpCtx.config().isWriteThrough()
                     || grpCtx.config().getCacheStoreFactory() != null
-                    || grpCtx.config().getRebalanceDelay() != -1
+                    || grpCtx.config().getRebalanceDelay() == -1
                     || grpCtx.config().getRebalanceMode() == CacheRebalanceMode.NONE)
                 continue;
 
