diff --git a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
index 62ab51f..7c52629 100644
--- a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
+++ b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
@@ -85,7 +85,7 @@
         endpoint.setTopic("sometopic");
         // setup the exception here
         org.apache.kafka.clients.producer.KafkaProducer kp = producer.getKafkaProducer();
-        Mockito.when(kp.send(Mockito.any())).thenThrow(new ApiException());
+        Mockito.when(kp.send(Mockito.any(ProducerRecord.class))).thenThrow(new ApiException());
         Mockito.when(exchange.getIn()).thenReturn(in);
         in.setHeader(KafkaConstants.PARTITION_KEY, "4");
 
@@ -115,7 +115,7 @@
 
         // setup the exception here
         org.apache.kafka.clients.producer.KafkaProducer kp = producer.getKafkaProducer();
-        Mockito.when(kp.send(Mockito.any(), Mockito.any())).thenThrow(new ApiException());
+        Mockito.when(kp.send(Mockito.any(ProducerRecord.class), Mockito.any(Callback.class))).thenThrow(new ApiException());
 
         in.setHeader(KafkaConstants.PARTITION_KEY, "4");
 
