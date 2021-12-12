diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_TimeoutTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_TimeoutTest.java
index 97106e4..17dca90 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_TimeoutTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_TimeoutTest.java
@@ -298,7 +298,7 @@
 
     @Test
     public void sync_whenCallTimeout_thenOperationTimeoutException() throws Exception {
-        long callTimeoutMs = 5000;
+        long callTimeoutMs = 10000;
         Config config = new Config().setProperty(GroupProperty.OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeoutMs);
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
         HazelcastInstance local = factory.newHazelcastInstance(config);
@@ -308,9 +308,9 @@
         OperationService opService = getOperationService(local);
 
         int partitionId = getPartitionId(remote);
-        opService.invokeOnPartition(null, new SlowOperation(callTimeoutMs * 2), partitionId);
+        opService.invokeOnPartition(new SlowOperation(callTimeoutMs * 2).setPartitionId(partitionId));
 
-        Future f = opService.invokeOnPartition(null, new DummyOperation(), partitionId);
+        Future f = opService.invokeOnPartition(new DummyOperation().setPartitionId(partitionId));
 
         try {
             f.get(3 * callTimeoutMs, MILLISECONDS);
@@ -324,7 +324,7 @@
 
     @Test
     public void async_whenCallTimeout_thenOperationTimeoutException() throws Exception {
-        long callTimeoutMs = 5000;
+        long callTimeoutMs = 10000;
         Config config = new Config().setProperty(GroupProperty.OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeoutMs);
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
         HazelcastInstance local = factory.newHazelcastInstance(config);
@@ -334,9 +334,9 @@
         OperationService opService = getOperationService(local);
 
         int partitionId = getPartitionId(remote);
-        opService.invokeOnPartition(null, new SlowOperation(callTimeoutMs * 2), partitionId);
+        opService.invokeOnPartition(new SlowOperation(callTimeoutMs * 2).setPartitionId(partitionId));
 
-        ICompletableFuture f = opService.invokeOnPartition(null, new DummyOperation(), partitionId);
+        ICompletableFuture f = opService.invokeOnPartition(new DummyOperation().setPartitionId(partitionId));
 
         ExecutionCallback callback = mock(ExecutionCallback.class);
         f.andThen(callback);
