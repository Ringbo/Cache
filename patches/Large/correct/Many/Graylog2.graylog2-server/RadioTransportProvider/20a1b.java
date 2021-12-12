diff --git a/graylog2-radio/src/main/java/org/graylog2/radio/bindings/providers/RadioTransportProvider.java b/graylog2-radio/src/main/java/org/graylog2/radio/bindings/providers/RadioTransportProvider.java
index a467d6e..e15d06c 100644
--- a/graylog2-radio/src/main/java/org/graylog2/radio/bindings/providers/RadioTransportProvider.java
+++ b/graylog2-radio/src/main/java/org/graylog2/radio/bindings/providers/RadioTransportProvider.java
@@ -45,7 +45,7 @@
     public RadioTransport get() {
         switch (configuration.getTransportType()) {
             case AMQP:
-                return new AMQPProducer(configuration, metricRegistry);
+                return new AMQPProducer(metricRegistry, configuration, serverStatus);
             case KAFKA:
                 return new KafkaProducer(serverStatus, configuration, metricRegistry);
             default:
