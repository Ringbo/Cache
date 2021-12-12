diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPreloader.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPreloader.java
index c634ff5..8e56c2d 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPreloader.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtPreloader.java
@@ -207,7 +207,7 @@
             });
 
         supplier = new GridDhtPartitionSupplier(cctx);
-        demander = new GridDhtPartitionDemander(cctx, busyLock);
+        demander = new GridDhtPartitionDemander(cctx, demandLock);
 
         supplier.start();
         demander.start();
