diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedMultiNodeFullApiSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedMultiNodeFullApiSelfTest.java
index 7f29194..173dff3 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedMultiNodeFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/near/GridCachePartitionedMultiNodeFullApiSelfTest.java
@@ -160,7 +160,7 @@
         for (int i = 0; i < size; i++) {
             info("Putting value 2 [i=" + i + ']');
 
-            assertEquals(i, prj0.putIfAbsent(i, i * i));
+            assertEquals(i, prj0.getAndPutIfAbsent(i, i * i));
 
             info("Finished putting value 2 [i=" + i + ']');
         }
