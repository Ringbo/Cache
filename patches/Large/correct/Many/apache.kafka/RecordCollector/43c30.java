diff --git a/streams/src/main/java/org/apache/kafka/streams/processor/internals/RecordCollector.java b/streams/src/main/java/org/apache/kafka/streams/processor/internals/RecordCollector.java
index 45687c8..cd5ee1c 100644
--- a/streams/src/main/java/org/apache/kafka/streams/processor/internals/RecordCollector.java
+++ b/streams/src/main/java/org/apache/kafka/streams/processor/internals/RecordCollector.java
@@ -73,7 +73,7 @@
         Integer partition = record.partition();
         if (partition == null && partitioner != null) {
             List<PartitionInfo> partitions = this.producer.partitionsFor(record.topic());
-            if (partitions != null)
+            if (partitions != null && partitions.size() > 0)
                 partition = partitioner.partition(record.key(), record.value(), partitions.size());
         }
 
