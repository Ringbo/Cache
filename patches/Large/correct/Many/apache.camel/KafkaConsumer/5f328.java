diff --git a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConsumer.java b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConsumer.java
index e6913f3..df3b4b5 100644
--- a/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConsumer.java
+++ b/components/camel-kafka/src/main/java/org/apache/camel/component/kafka/KafkaConsumer.java
@@ -399,7 +399,7 @@
 
         private void commitOffset(StateRepository<String, String> offsetRepository, TopicPartition partition, long partitionLastOffset, boolean forceCommit) {
             if (partitionLastOffset != -1) {
-                if (offsetRepository != null) {
+                if (!endpoint.getConfiguration().isAllowManualCommit() && offsetRepository != null) {
                     log.debug("Saving offset repository state {} from topic {} with offset: {}", threadId, topicName, partitionLastOffset);
                     offsetRepository.setState(serializeOffsetKey(partition), serializeOffsetValue(partitionLastOffset));
                 } else if (forceCommit) {
