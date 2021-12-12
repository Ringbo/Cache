diff --git a/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java b/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
index 3088b15..7cd1ae1 100644
--- a/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
+++ b/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java
@@ -534,7 +534,7 @@
 
 			@Override
 			public void onException(Throwable cause) {
-				LOG.error("Async Kafka commit failed.", cause);
+				LOG.warn("Async Kafka commit failed.", cause);
 				failedCommits.inc();
 			}
 		};
