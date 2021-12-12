diff --git a/core/client/src/test/java/alluxio/client/block/BlockStoreContextTest.java b/core/client/src/test/java/alluxio/client/block/BlockStoreContextTest.java
index 9ede102..f8ceea1 100644
--- a/core/client/src/test/java/alluxio/client/block/BlockStoreContextTest.java
+++ b/core/client/src/test/java/alluxio/client/block/BlockStoreContextTest.java
@@ -35,8 +35,8 @@
  * Tests {@link BlockStoreContext}.
  */
 @RunWith(PowerMockRunner.class)
-@PrepareForTest({BlockMasterClient.class, BlockMasterClientPool.class, BlockStoreContext.class,
-    DefaultBlockWorkerClient.class, BlockWorkerClientPool.class})
+@PrepareForTest({RetryHandlingBlockMasterClient.class, BlockMasterClientPool.class,
+    BlockStoreContext.class, DefaultBlockWorkerClient.class, BlockWorkerClientPool.class})
 public final class BlockStoreContextTest {
 
   /**
@@ -110,11 +110,12 @@
     // Use mocks for the master client to make sure the pool of local block worker clients is
     // initialized properly.
     Whitebox.setInternalState(NetworkAddressUtils.class, "sLocalHost", "localhost");
-    BlockMasterClient masterClientMock = PowerMockito.mock(BlockMasterClient.class);
+    RetryHandlingBlockMasterClient masterClientMock =
+        PowerMockito.mock(RetryHandlingBlockMasterClient.class);
     List<WorkerInfo> list = new ArrayList<>();
     list.add(new WorkerInfo().setAddress(new WorkerNetAddress().setHost("localhost")));
     PowerMockito.doReturn(list).when(masterClientMock).getWorkerInfoList();
-    PowerMockito.whenNew(BlockMasterClient.class).withArguments(Mockito.any())
+    PowerMockito.whenNew(RetryHandlingBlockMasterClient.class).withArguments(Mockito.any())
         .thenReturn(masterClientMock);
 
     // Use mocks for the block worker client to prevent it from trying to invoke the session
@@ -175,11 +176,12 @@
     // Use mocks for the master client to make sure the pool of local block worker clients is
     // initialized properly.
     Whitebox.setInternalState(NetworkAddressUtils.class, "sLocalHost", "localhost");
-    BlockMasterClient masterClientMock = PowerMockito.mock(BlockMasterClient.class);
+    RetryHandlingBlockMasterClient masterClientMock =
+        PowerMockito.mock(RetryHandlingBlockMasterClient.class);
     List<WorkerInfo> list = new ArrayList<>();
     list.add(new WorkerInfo().setAddress(new WorkerNetAddress().setHost("localhost")));
     PowerMockito.doReturn(list).when(masterClientMock).getWorkerInfoList();
-    PowerMockito.whenNew(BlockMasterClient.class).withArguments(Mockito.any())
+    PowerMockito.whenNew(RetryHandlingBlockMasterClient.class).withArguments(Mockito.any())
         .thenReturn(masterClientMock);
 
     Assert.assertTrue(BlockStoreContext.INSTANCE.hasLocalWorker());
@@ -193,12 +195,13 @@
     // Use mocks for the master client to make sure the pool of local block worker clients is
     // initialized properly.
     Whitebox.setInternalState(NetworkAddressUtils.class, "sLocalHost", "localhost");
-    BlockMasterClient masterClientMock = PowerMockito.mock(BlockMasterClient.class);
+    RetryHandlingBlockMasterClient masterClientMock =
+        PowerMockito.mock(RetryHandlingBlockMasterClient.class);
     List<WorkerInfo> list = new ArrayList<>();
     list.add(new WorkerInfo().setAddress(new WorkerNetAddress().setHost("foo")));
     list.add(new WorkerInfo().setAddress(new WorkerNetAddress().setHost("bar")));
     PowerMockito.doReturn(list).when(masterClientMock).getWorkerInfoList();
-    PowerMockito.whenNew(BlockMasterClient.class).withArguments(Mockito.any())
+    PowerMockito.whenNew(RetryHandlingBlockMasterClient.class).withArguments(Mockito.any())
         .thenReturn(masterClientMock);
 
     Assert.assertFalse(BlockStoreContext.INSTANCE.hasLocalWorker());
