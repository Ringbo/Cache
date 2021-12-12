diff --git a/src/plugin/publish-rabbitmq/src/java/org/apache/nutch/publisher/rabbitmq/RabbitMQPublisherImpl.java b/src/plugin/publish-rabbitmq/src/java/org/apache/nutch/publisher/rabbitmq/RabbitMQPublisherImpl.java
index 437efc3..fac79db 100644
--- a/src/plugin/publish-rabbitmq/src/java/org/apache/nutch/publisher/rabbitmq/RabbitMQPublisherImpl.java
+++ b/src/plugin/publish-rabbitmq/src/java/org/apache/nutch/publisher/rabbitmq/RabbitMQPublisherImpl.java
@@ -55,7 +55,7 @@
       EXCHANGE_TYPE = conf.get("rabbitmq.exchange.type", "fanout");
 
       HOST = conf.get("rabbitmq.host", "localhost");
-      PORT = conf.getInt("rabbitmq.port", 15672);
+      PORT = conf.getInt("rabbitmq.port", 5672);
       VIRTUAL_HOST = conf.get("rabbitmq.virtualhost", null);
       USERNAME = conf.get("rabbitmq.username", null);
       PASSWORD = conf.get("rabbitmq.password", null);
