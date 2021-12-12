diff --git a/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQEndpointTest.java b/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQEndpointTest.java
index 11b3675..86a7bcc 100644
--- a/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQEndpointTest.java
+++ b/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQEndpointTest.java
@@ -133,7 +133,7 @@
 
     private ConnectionFactory createConnectionFactory(String uri) {
         RabbitMQEndpoint endpoint = context.getEndpoint(uri, RabbitMQEndpoint.class); 
-        return endpoint.getConnectionFactory();
+        return endpoint.getOrCreateConnectionFactory();
     }
 
     @Test
