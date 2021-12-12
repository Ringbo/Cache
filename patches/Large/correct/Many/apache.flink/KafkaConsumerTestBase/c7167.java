diff --git a/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java b/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
index cc9205c..3ba8cff 100644
--- a/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
+++ b/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
@@ -840,7 +840,7 @@
 
 		// add producing topology
 		Properties producerProps = new Properties();
-		producerProps.setProperty("max.request.size", Integer.toString(1024 * 1024 * 14));
+		producerProps.setProperty("max.request.size", Integer.toString(1024 * 1024 * 15));
 		producerProps.setProperty("retries", "3");
 		producerProps.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerConnectionStrings);
 
