diff --git a/components/camel-rabbitmq/src/main/java/org/apache/camel/component/rabbitmq/RabbitMQConsumer.java b/components/camel-rabbitmq/src/main/java/org/apache/camel/component/rabbitmq/RabbitMQConsumer.java
index 468e728..acc95d7 100644
--- a/components/camel-rabbitmq/src/main/java/org/apache/camel/component/rabbitmq/RabbitMQConsumer.java
+++ b/components/camel-rabbitmq/src/main/java/org/apache/camel/component/rabbitmq/RabbitMQConsumer.java
@@ -122,7 +122,7 @@
                 consumer.getProcessor().process(exchange);
 
                 long deliveryTag = envelope.getDeliveryTag();
-                if (consumer.endpoint.isAutoAck()) {
+                if (!consumer.endpoint.isAutoAck()) {
                     log.trace("Acknowledging receipt [delivery_tag={}]", deliveryTag);
                     channel.basicAck(deliveryTag, false);
                 }
