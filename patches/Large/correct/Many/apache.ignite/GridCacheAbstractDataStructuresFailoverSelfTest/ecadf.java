diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
index f918acd..cb4f6fc 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
@@ -419,7 +419,7 @@
 
             stopGrid(NEW_IGNITE_INSTANCE_NAME);
 
-            assertEquals(10, semaphore.availablePermits());
+            assertEquals(20, semaphore.availablePermits());
         }
     }
 
