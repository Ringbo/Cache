diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
index 9465291..e85468e 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/datastructures/GridCacheAbstractDataStructuresFailoverSelfTest.java
@@ -455,28 +455,28 @@
      * @throws Exception If failed.
      */
     public void testSemaphoreConstantTopologyChangeFailoverSafe() throws Exception {
-        doTestSemaphore(new ConstantTopologyChangeWorker(), true);
+        doTestSemaphore(new ConstantTopologyChangeWorker(TOP_CHANGE_THREAD_CNT), true);
     }
 
     /**
      * @throws Exception If failed.
      */
     public void testSemaphoreConstantTopologyChangeNonFailoverSafe() throws Exception {
-        doTestSemaphore(new ConstantTopologyChangeWorker(), false);
+        doTestSemaphore(new ConstantTopologyChangeWorker(TOP_CHANGE_THREAD_CNT), false);
     }
 
     /**
      * @throws Exception If failed.
      */
     public void testSemaphoreMultipleTopologyChangeFailoverSafe() throws Exception {
-        doTestSemaphore(multipleTopologyChangeWorker(), true);
+        doTestSemaphore(multipleTopologyChangeWorker(TOP_CHANGE_THREAD_CNT), true);
     }
 
     /**
      * @throws Exception If failed.
      */
     public void testSemaphoreMultipleTopologyChangeNonFailoverSafe() throws Exception {
-        doTestSemaphore(multipleTopologyChangeWorker(), false);
+        doTestSemaphore(multipleTopologyChangeWorker(TOP_CHANGE_THREAD_CNT), false);
     }
 
     /**
