diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/cache/impl/nearcache/invalidation/ClientCacheNearCacheSmokeTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/cache/impl/nearcache/invalidation/ClientCacheNearCacheSmokeTest.java
index 57b00fc..391c428 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/cache/impl/nearcache/invalidation/ClientCacheNearCacheSmokeTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/cache/impl/nearcache/invalidation/ClientCacheNearCacheSmokeTest.java
@@ -63,7 +63,7 @@
     HazelcastInstance server1;
 
     @Before
-    public void setUp() throws Exception {
+    public void setUp() {
         NearCacheConfig nearCacheConfig = newNearCacheConfig();
         nearCacheConfig.setInvalidateOnChange(true);
 
@@ -101,7 +101,7 @@
     }
 
     @Test
-    public void smoke_near_cache_population() throws Exception {
+    public void smoke_near_cache_population() {
         int cacheSize = 1000;
 
         // 1. populate server side cache
@@ -109,15 +109,15 @@
             serverCache1.put(i, i);
         }
 
-        // 2. add client with near cache
+        // 2. add client with Near Cache
         clientCache = createCacheFromNewClient();
 
-        // 3. populate client near cache
+        // 3. populate client Near Cache
         for (int i = 0; i < cacheSize; i++) {
             assertNotNull(clientCache.get(i));
         }
 
-        // 4. assert number of entries in client near cache
+        // 4. assert number of entries in client Near Cache
         assertEquals(cacheSize, ((NearCachedClientCacheProxy) clientCache).getNearCache().size());
     }
 
