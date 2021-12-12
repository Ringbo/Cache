diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheSwapPreloadSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheSwapPreloadSelfTest.java
index d98f2db..051a2a9 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheSwapPreloadSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheSwapPreloadSelfTest.java
@@ -201,7 +201,7 @@
 
             fut = null;
 
-            int size = grid(1).cache(null).localSize();
+            int size = grid(1).cache(null).localSize(CachePeekMode.ONHEAP);
 
             info("New node cache size: " + size);
 
