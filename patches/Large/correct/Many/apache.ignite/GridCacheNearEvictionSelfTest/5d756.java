diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCacheNearEvictionSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCacheNearEvictionSelfTest.java
index b8dafc6..4b1c933 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCacheNearEvictionSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCacheNearEvictionSelfTest.java
@@ -164,7 +164,7 @@
             });
 
             for (int i = 0; i < gridCnt; i++) {
-                final GridCache cache = internalCache(i);
+                final GridCacheAdapter cache = internalCache(i);
 
                 // Repeatedly check cache sizes because of concurrent cache updates.
                 assertTrue(GridTestUtils.waitForCondition(new PA() {
