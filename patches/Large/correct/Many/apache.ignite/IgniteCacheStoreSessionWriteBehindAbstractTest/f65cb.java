diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/integration/IgniteCacheStoreSessionWriteBehindAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/integration/IgniteCacheStoreSessionWriteBehindAbstractTest.java
index 5e68a34..408bd93 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/integration/IgniteCacheStoreSessionWriteBehindAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/integration/IgniteCacheStoreSessionWriteBehindAbstractTest.java
@@ -76,7 +76,7 @@
         ccfg0.setWriteThrough(true);
         ccfg0.setWriteBehindBatchSize(10);
         ccfg0.setWriteBehindFlushSize(10);
-        ccfg0.setWriteBehindFlushFrequency(5000);
+        ccfg0.setWriteBehindFlushFrequency(60_000);
         ccfg0.setWriteBehindEnabled(true);
 
         ccfg0.setCacheStoreFactory(new FactoryBuilder.SingletonFactory(new TestStore()));
@@ -87,7 +87,7 @@
         ccfg1.setWriteThrough(true);
         ccfg1.setWriteBehindBatchSize(10);
         ccfg1.setWriteBehindFlushSize(10);
-        ccfg1.setWriteBehindFlushFrequency(5000);
+        ccfg1.setWriteBehindFlushFrequency(60_000);
         ccfg1.setWriteBehindEnabled(true);
 
         ccfg1.setName(CACHE_NAME1);
@@ -116,11 +116,11 @@
         IgniteCache<Integer, Integer> cache = ignite(0).jcache(cacheName);
 
         try {
-            latch = new CountDownLatch(1);
+            latch = new CountDownLatch(2);
 
             expData = new ExpectedData("writeAll", cacheName);
 
-            for (int i = 0; i < 10; i++)
+            for (int i = 0; i < 11; i++)
                 cache.put(i, i);
 
             assertTrue(latch.await(10_000, TimeUnit.MILLISECONDS));
@@ -130,11 +130,11 @@
         }
 
         try {
-            latch = new CountDownLatch(1);
+            latch = new CountDownLatch(2);
 
             expData = new ExpectedData("deleteAll", cacheName);
 
-            for (int i = 0; i < 10; i++)
+            for (int i = 0; i < 11; i++)
                 cache.remove(i);
 
             assertTrue(latch.await(10_000, TimeUnit.MILLISECONDS));
@@ -189,7 +189,7 @@
         @Override public void writeAll(Collection<Cache.Entry<?, ?>> entries) throws CacheWriterException {
             log.info("writeAll: " + entries);
 
-            assertEquals(10, entries.size());
+            assertTrue("Unexpected entries: " + entries, entries.size() == 10 || entries.size() == 1);
 
             checkSession("writeAll");
         }
@@ -203,7 +203,7 @@
         @Override public void deleteAll(Collection<?> keys) throws CacheWriterException {
             log.info("deleteAll: " + keys);
 
-            assertEquals(10, keys.size());
+            assertTrue("Unexpected keys: " + keys, keys.size() == 10 || keys.size() == 1);
 
             checkSession("deleteAll");
         }
