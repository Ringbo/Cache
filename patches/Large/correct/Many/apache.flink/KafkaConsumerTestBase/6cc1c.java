diff --git a/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java b/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
index 3ba8cff..660f24c 100644
--- a/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
+++ b/flink-streaming-connectors/flink-connector-kafka-base/src/test/java/org/apache/flink/streaming/connectors/kafka/KafkaConsumerTestBase.java
@@ -357,7 +357,7 @@
 		StreamExecutionEnvironment env = StreamExecutionEnvironment.createRemoteEnvironment("localhost", flinkPort);
 		env.enableCheckpointing(500);
 		env.setParallelism(parallelism);
-		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(3, 0));
+		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(1, 0));
 		env.getConfig().disableSysoutLogging();
 
 		FlinkKafkaConsumerBase<Integer> kafkaSource = kafkaServer.getConsumer(topic, schema, standardProps);
@@ -402,7 +402,7 @@
 		StreamExecutionEnvironment env = StreamExecutionEnvironment.createRemoteEnvironment("localhost", flinkPort);
 		env.enableCheckpointing(500);
 		env.setParallelism(parallelism);
-		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(3, 0));
+		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(1, 0));
 		env.getConfig().disableSysoutLogging();
 
 		FlinkKafkaConsumerBase<Integer> kafkaSource = kafkaServer.getConsumer(topic, schema, standardProps);
@@ -447,7 +447,8 @@
 		StreamExecutionEnvironment env = StreamExecutionEnvironment.createRemoteEnvironment("localhost", flinkPort);
 		env.enableCheckpointing(500);
 		env.setParallelism(parallelism);
-		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(3, 0));
+		// set the number of restarts to one. The failing mapper will fail once, then it's only success exceptions.
+		env.setRestartStrategy(RestartStrategies.fixedDelayRestart(1, 0));
 		env.getConfig().disableSysoutLogging();
 		env.setBufferTimeout(0);
 
