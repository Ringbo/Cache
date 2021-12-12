diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/ExecutePacketTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/ExecutePacketTest.java
index 2de2c45..1ef72c9 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/ExecutePacketTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationexecutor/classic/ExecutePacketTest.java
@@ -35,7 +35,7 @@
 
         final NormalResponse normalResponse = new NormalResponse(null, 1, 0, false);
         Data data = serializationService.toData(normalResponse);
-        final Packet packet = new Packet(data, 0, serializationService.getPortableContext());
+        final Packet packet = new Packet(data, 0);
         packet.setHeader(Packet.HEADER_RESPONSE);
         packet.setHeader(Packet.HEADER_OP);
         executor.execute(packet);
@@ -56,7 +56,7 @@
 
         final DummyOperation operation = new DummyOperation(0);
         Data data = serializationService.toData(operation);
-        final Packet packet = new Packet(data, operation.getPartitionId(), serializationService.getPortableContext());
+        final Packet packet = new Packet(data, operation.getPartitionId());
         packet.setHeader(Packet.HEADER_OP);
         executor.execute(packet);
 
@@ -76,7 +76,7 @@
 
         final DummyOperation operation = new DummyOperation(Operation.GENERIC_PARTITION_ID);
         Data data = serializationService.toData(operation);
-        final Packet packet = new Packet(data, operation.getPartitionId(), serializationService.getPortableContext());
+        final Packet packet = new Packet(data, operation.getPartitionId());
         packet.setHeader(Packet.HEADER_OP);
         executor.execute(packet);
 
