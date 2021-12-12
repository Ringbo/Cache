diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
index 6f2eb06..f45e82a 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
@@ -807,7 +807,7 @@
         cache.putx("1", "test string");
         cache.putx("2", 0);
 
-        final GridCacheProjection<UUID, String> prj = cache.projection(String.class, String.class);
+        final GridCacheProjection<UUID, String> prj = cache.projection(UUID.class, String.class);
 
         final CountDownLatch latch = new CountDownLatch(1);
 
