diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedBasicStoreMultiNodeSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedBasicStoreMultiNodeSelfTest.java
index ed5c359..f6d66b8 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedBasicStoreMultiNodeSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedBasicStoreMultiNodeSelfTest.java
@@ -310,6 +310,7 @@
      */
     public void testMultipleOperations() throws Exception {
         IgniteCache<Integer, String> cache = jcache(0);
+        //GridCache<Integer, String> cache = cache(0);
 
         try (IgniteTx tx = grid(0).transactions().txStart(OPTIMISTIC, REPEATABLE_READ)) {
             cache.put(1, "val");
@@ -323,7 +324,7 @@
             tx.commit();
         }
 
-        checkStoreUsage(4, 0, 1, 1);
+        checkStoreUsage(1, 0, 1, 1);
     }
 
     /**
