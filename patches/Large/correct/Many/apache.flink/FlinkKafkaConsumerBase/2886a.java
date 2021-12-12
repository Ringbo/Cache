diff --git a/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java b/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
index d126301..df35de6 100644
--- a/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
+++ b/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
@@ -601,7 +601,7 @@
 
 						while (running) {
 							if (LOG.isDebugEnabled()) {
-								LOG.debug("Consumer subtask {} is trying to discover new partitions ...");
+								LOG.debug("Consumer subtask {} is trying to discover new partitions ...", getRuntimeContext().getIndexOfThisSubtask());
 							}
 
 							try {
