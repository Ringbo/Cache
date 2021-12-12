diff --git a/core/client/src/test/java/alluxio/client/block/AlluxioBlockStoreTest.java b/core/client/src/test/java/alluxio/client/block/AlluxioBlockStoreTest.java
index 435233a..bdf87ac 100644
--- a/core/client/src/test/java/alluxio/client/block/AlluxioBlockStoreTest.java
+++ b/core/client/src/test/java/alluxio/client/block/AlluxioBlockStoreTest.java
@@ -92,7 +92,7 @@
 
     // Mock block store should return our mock clients
     sBlockWorkerClient = PowerMockito.mock(BlockWorkerClient.class);
-    Mockito.when(sBlockStoreContext.acquireWorkerClient(Mockito.anyString()))
+    Mockito.when(sBlockStoreContext.acquireWorkerClient(Mockito.any(WorkerNetAddress.class)))
         .thenReturn(sBlockWorkerClient);
     sMasterClient = PowerMockito.mock(BlockMasterClient.class);
     Mockito.when(sBlockStoreContext.acquireMasterClientResource()).thenReturn(
