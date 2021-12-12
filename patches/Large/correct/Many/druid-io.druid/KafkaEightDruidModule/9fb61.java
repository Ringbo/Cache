diff --git a/kafka-eight/src/main/java/io/druid/firehose/kafka/KafkaEightDruidModule.java b/kafka-eight/src/main/java/io/druid/firehose/kafka/KafkaEightDruidModule.java
index b8ccc93..658b64b 100644
--- a/kafka-eight/src/main/java/io/druid/firehose/kafka/KafkaEightDruidModule.java
+++ b/kafka-eight/src/main/java/io/druid/firehose/kafka/KafkaEightDruidModule.java
@@ -38,7 +38,7 @@
     return Arrays.<Module>asList(
         new SimpleModule("KafkaEightFirehoseModule")
             .registerSubtypes(
-                new NamedType(KafkaEightDruidModule.class, "kafka-0.8")
+                new NamedType(KafkaEightFirehoseFactory.class, "kafka-0.8")
             )
     );
   }
