diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
index 7858b84..a8cc921 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPartitionsExchangeFuture.java
@@ -519,7 +519,7 @@
 
                 throw e;
             }
-            catch (IgniteCheckedException e) {
+            catch (Throwable e) {
                 U.error(log, "Failed to reinitialize local partitions (preloading will be stopped): " + exchId, e);
 
                 onDone(e);
