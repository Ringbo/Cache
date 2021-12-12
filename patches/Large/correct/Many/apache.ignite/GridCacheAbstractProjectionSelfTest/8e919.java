diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
index 6f2eb06..146a3dc 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractProjectionSelfTest.java
@@ -807,13 +807,13 @@
         cache.putx("1", "test string");
         cache.putx("2", 0);
 
-        final GridCacheProjection<UUID, String> prj = cache.projection(String.class, String.class);
+        final GridCacheProjection<String, String> prj = cache.projection(String.class, String.class);
 
         final CountDownLatch latch = new CountDownLatch(1);
 
-        prj.removeAll(new P1<GridCacheEntry<UUID, String>>() {
+        prj.removeAll(new P1<GridCacheEntry<String, String>>() {
             @Override
-            public boolean apply(GridCacheEntry<UUID, String> e) {
+            public boolean apply(GridCacheEntry<String, String> e) {
                 info(" --> " + e.peek().getClass());
 
                 latch.countDown();
