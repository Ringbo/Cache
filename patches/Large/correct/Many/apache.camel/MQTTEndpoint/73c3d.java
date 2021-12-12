diff --git a/components/camel-mqtt/src/main/java/org/apache/camel/component/mqtt/MQTTEndpoint.java b/components/camel-mqtt/src/main/java/org/apache/camel/component/mqtt/MQTTEndpoint.java
index 98951a3..2d3647e 100644
--- a/components/camel-mqtt/src/main/java/org/apache/camel/component/mqtt/MQTTEndpoint.java
+++ b/components/camel-mqtt/src/main/java/org/apache/camel/component/mqtt/MQTTEndpoint.java
@@ -85,7 +85,7 @@
 
                 if (!consumers.isEmpty()) {
                     Exchange exchange = createExchange();
-                    exchange.getIn().setBody(body.getData());
+                    exchange.getIn().setBody(body.toByteArray());
                     exchange.setProperty(configuration.getMqttTopicPropertyName(), topic.toString());
                     for (MQTTConsumer consumer : consumers) {
                         try {
