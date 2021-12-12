diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionMessageMarshallingTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionMessageMarshallingTest.java
index dd7c3b3..9126053 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionMessageMarshallingTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionMessageMarshallingTest.java
@@ -61,7 +61,7 @@
         try {
             Ignite ignite = startGrid(0);
 
-            CacheConfiguration<Integer, Integer> ccfg = new CacheConfiguration<>();
+            CacheConfiguration<Integer, Integer> ccfg = new CacheConfiguration<>(DEFAULT_CACHE_NAME);
 
             IgniteCache<Integer, Integer> cache = ignite.getOrCreateCache(ccfg);
 
