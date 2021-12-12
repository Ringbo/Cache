diff --git a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapTieredMultithreadedSelfTest.java b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapTieredMultithreadedSelfTest.java
index b1f9701..dd48f95 100644
--- a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapTieredMultithreadedSelfTest.java
+++ b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapTieredMultithreadedSelfTest.java
@@ -80,7 +80,7 @@
     @Override protected void beforeTestsStarted() throws Exception {
         startGridsMultiThreaded(3);
 
-        cache = grid(0).jcache(null);
+        cache = grid(0).cache(null);
     }
 
     /** {@inheritDoc} */
