diff --git a/modules/indexing/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheQueryMultiThreadedSelfTest.java b/modules/indexing/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheQueryMultiThreadedSelfTest.java
index 20db5a5..6134a63 100644
--- a/modules/indexing/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheQueryMultiThreadedSelfTest.java
+++ b/modules/indexing/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheQueryMultiThreadedSelfTest.java
@@ -762,7 +762,7 @@
     @SuppressWarnings({"TooBroadScope"})
     public void testMultiThreadedScanQuery() throws Exception {
         int threadCnt = 50;
-        final int keyCnt = 100;
+        final int keyCnt = 500;
         final int logMod = 5000;
 
         final Grid g = grid(0);
