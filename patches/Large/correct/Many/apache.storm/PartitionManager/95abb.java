diff --git a/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java b/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
index c228c19..fa5f7e5 100644
--- a/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
+++ b/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
@@ -161,7 +161,7 @@
         try {
             msgs = KafkaUtils.fetchMessages(_spoutConfig, _consumer, _partition, offset);
         } catch (UpdateOffsetException e) {
-            offset = e.startOffset;
+            _emittedToOffset = e.startOffset;
         }
         long end = System.nanoTime();
         long millis = (end - start) / 1000000;
