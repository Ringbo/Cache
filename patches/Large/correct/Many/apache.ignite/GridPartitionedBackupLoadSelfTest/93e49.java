diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridPartitionedBackupLoadSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridPartitionedBackupLoadSelfTest.java
index 5c3eacf..af0e062 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridPartitionedBackupLoadSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridPartitionedBackupLoadSelfTest.java
@@ -111,11 +111,11 @@
             IgniteCache<Integer, Integer> cache = jcache(i);
 
             if (grid(i).affinity(null).isBackup(grid(i).localNode(), 1)) {
-                assert cache.localPeek(1, CachePeekMode.ONHEAP) == 1;
+                assert cache.localPeek(1) == 1;
 
                 jcache(i).localClear(1);
 
-                assert cache.localPeek(1, CachePeekMode.ONHEAP) == null;
+                assert cache.localPeek(1) == null;
 
                 // Store is called in putx method, so we reset counter here.
                 cnt.set(0);
