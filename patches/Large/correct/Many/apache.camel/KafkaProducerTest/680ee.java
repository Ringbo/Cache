diff --git a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
index 7c52629..68798f3 100644
--- a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
+++ b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerTest.java
@@ -57,7 +57,7 @@
         Future future = Mockito.mock(Future.class);
         Mockito.when(future.get()).thenReturn(rm);
         org.apache.kafka.clients.producer.KafkaProducer kp = Mockito.mock(org.apache.kafka.clients.producer.KafkaProducer.class);
-        Mockito.when(kp.send(Mockito.any())).thenReturn(future);
+        Mockito.when(kp.send(Mockito.any(ProducerRecord.class))).thenReturn(future);
 
         producer.setKafkaProducer(kp);
     }
