diff --git a/streams/src/test/java/org/apache/kafka/streams/smoketest/SmokeTestClient.java b/streams/src/test/java/org/apache/kafka/streams/smoketest/SmokeTestClient.java
index ba71e05..5302900 100644
--- a/streams/src/test/java/org/apache/kafka/streams/smoketest/SmokeTestClient.java
+++ b/streams/src/test/java/org/apache/kafka/streams/smoketest/SmokeTestClient.java
@@ -85,7 +85,7 @@
         props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, kafka);
         props.put(StreamsConfig.ZOOKEEPER_CONNECT_CONFIG, zookeeper);
         props.put(StreamsConfig.TIMESTAMP_EXTRACTOR_CLASS_CONFIG, TestTimestampExtractor.class.getName());
-        props.put(StreamsConfig.NUM_STREAM_THREADS_CONFIG, 3);
+        props.put(StreamsConfig.NUM_STREAM_THREADS_CONFIG, 1);
         props.put(StreamsConfig.NUM_STANDBY_REPLICAS_CONFIG, 2);
         props.put(StreamsConfig.BUFFERED_RECORDS_PER_PARTITION_CONFIG, 100);
         props.put(StreamsConfig.REPLICATION_FACTOR_CONFIG, 2);
