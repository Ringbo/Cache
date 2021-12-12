diff --git a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/IgniteCacheQueryNodeRestartSelfTest.java b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/IgniteCacheQueryNodeRestartSelfTest.java
index 0333cb9..11ada41 100644
--- a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/IgniteCacheQueryNodeRestartSelfTest.java
+++ b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/IgniteCacheQueryNodeRestartSelfTest.java
@@ -111,7 +111,7 @@
         for (int i = 0; i < KEY_CNT; i++)
             cache.put(i, i);
 
-        assertEquals(KEY_CNT, cache.size());
+        assertEquals(KEY_CNT, cache.localSize());
 
         final AtomicInteger qryCnt = new AtomicInteger();
 
