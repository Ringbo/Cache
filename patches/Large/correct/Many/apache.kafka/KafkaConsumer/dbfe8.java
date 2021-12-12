diff --git a/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java b/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java
index 09ecb42..d301be4 100644
--- a/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java
+++ b/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java
@@ -495,7 +495,7 @@
             if (keyDeserializer == null) {
                 this.keyDeserializer = config.getConfiguredInstance(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                         Deserializer.class);
-                this.keyDeserializer.configure(config.originals(), false);
+                this.keyDeserializer.configure(config.originals(), true);
             } else {
                 this.keyDeserializer = keyDeserializer;
             }
