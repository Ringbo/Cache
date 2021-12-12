diff --git a/streams/src/test/java/org/apache/kafka/test/ProcessorTopologyTestDriver.java b/streams/src/test/java/org/apache/kafka/test/ProcessorTopologyTestDriver.java
index 0db69be..83a9092 100644
--- a/streams/src/test/java/org/apache/kafka/test/ProcessorTopologyTestDriver.java
+++ b/streams/src/test/java/org/apache/kafka/test/ProcessorTopologyTestDriver.java
@@ -158,7 +158,7 @@
         producer = new MockProducer<byte[], byte[]>(true, bytesSerializer, bytesSerializer) {
             @Override
             public List<PartitionInfo> partitionsFor(String topic) {
-                return Collections.emptyList();
+                return Collections.singletonList(new PartitionInfo(topic, 0, null, null, null));
             }
         };
         restoreStateConsumer = createRestoreConsumer(id, storeNames);
