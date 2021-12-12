diff --git a/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java b/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java
index d18efef..4a49f9d 100644
--- a/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java
+++ b/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java
@@ -380,7 +380,7 @@
      */
     @SuppressWarnings("unchecked")
     public int addRecords(final TopicPartition partition, final Iterable<ConsumerRecord<byte[], byte[]>> records) {
-        final int oldQueueSize = partitionGroup.numBuffered();
+        final int oldQueueSize = partitionGroup.numBuffered(partition);
         final int newQueueSize = partitionGroup.addRawRecords(partition, records);
 
         log.trace("{} Added records into the buffered queue of partition {}, new queue size is {}", logPrefix, partition, newQueueSize);
