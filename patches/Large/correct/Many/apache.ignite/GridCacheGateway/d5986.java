diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheGateway.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheGateway.java
index a3c8da6..93c5858 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheGateway.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheGateway.java
@@ -156,8 +156,7 @@
             GridCachePreloader preldr = cache != null ? cache.preloader() : null;
 
             if (preldr == null)
-                throw new IllegalStateException("Grid is in invalid state to perform this operation. " +
-                    "It either not started yet or has already being or have stopped [gridName=" + ctx.gridName() + ']');
+                throw new IllegalStateException("Cache has been closed: " + ctx.name());
 
             preldr.startFuture().get();
         }
@@ -177,7 +176,7 @@
         try {
             return setOperationContextPerCall(opCtx);
         }
-        catch (RuntimeException e) {
+        catch (Throwable e) {
             rwLock.readUnlock();
 
             throw e;
