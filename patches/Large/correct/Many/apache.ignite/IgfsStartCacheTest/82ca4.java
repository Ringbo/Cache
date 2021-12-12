diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStartCacheTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStartCacheTest.java
index f6a7a72..56559cb 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStartCacheTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStartCacheTest.java
@@ -157,7 +157,7 @@
     private void checkCache(GridCacheAdapter cache) {
         assertNotNull(cache);
         assertFalse(cache.context().userCache());
-        assertFalse(cache.context().systemTx());
+        assertTrue(cache.context().systemTx());
         assertEquals(SYSTEM_POOL, cache.context().ioPolicy());
     }
 }
\ No newline at end of file
