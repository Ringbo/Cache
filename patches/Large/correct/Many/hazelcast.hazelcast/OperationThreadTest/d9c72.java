diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/OperationThreadTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/OperationThreadTest.java
index 9fb462d..61c0258 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/OperationThreadTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/OperationThreadTest.java
@@ -29,7 +29,7 @@
         DummyOperation operation = new DummyOperation(Operation.GENERIC_PARTITION_ID);
         Data data = serializationService.toData(operation);
 
-        Packet packet = new Packet(data, operation.getPartitionId(), serializationService.getPortableContext());
+        Packet packet = new Packet(data, operation.getPartitionId());
         packet.setHeader(Packet.HEADER_OP);
 
         doThrow(new OutOfMemoryError()).when(handler).run(packet);
