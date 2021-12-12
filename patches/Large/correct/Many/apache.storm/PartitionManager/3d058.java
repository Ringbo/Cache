diff --git a/src/jvm/storm/kafka/PartitionManager.java b/src/jvm/storm/kafka/PartitionManager.java
index 9186953..b9cfd97 100644
--- a/src/jvm/storm/kafka/PartitionManager.java
+++ b/src/jvm/storm/kafka/PartitionManager.java
@@ -151,7 +151,7 @@
         for(MessageAndOffset msg: msgs) {
             _pending.add(_emittedToOffset);
             _waitingToEmit.add(new MessageAndRealOffset(msg.message(), _emittedToOffset));
-            _emittedToOffset = msg.offset();
+            _emittedToOffset = msg.nextOffset();
         }
         if(numMessages>0) {
           LOG.info("Added " + numMessages + " messages from Kafka: " + _consumer.host() + ":" + _partition.partition + " to internal buffers");
