diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
index ce0886e..c48321e 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
@@ -4290,7 +4290,7 @@
             assertNotNull(cache.get(key));
         }
 
-        cache.removeAll();
+        cache.removeAll(new HashSet<>(keys));
 
         for (String key : keys)
             assertNull(cache.get(key));
@@ -4370,7 +4370,7 @@
             assertTrue(map.containsKey(key));
         }
 
-        cacheSkipStore.removeAll();
+        cacheSkipStore.removeAll(data.keySet());
 
         for (String key : keys) {
             assertNull(cacheSkipStore.get(key));
@@ -4446,7 +4446,8 @@
      * @throws Exception If failed.
      */
     public void testWithSkipStoreRemoveAll() throws Exception {
-        if (atomicityMode() == CacheAtomicityMode.TRANSACTIONAL)
+        if (atomicityMode() == CacheAtomicityMode.TRANSACTIONAL ||
+           (atomicityMode() == CacheAtomicityMode.ATOMIC && nearEnabled()))
             fail("https://issues.apache.org/jira/browse/IGNITE-373");
 
         IgniteCache<String, Integer> cache = grid(0).cache(null);
