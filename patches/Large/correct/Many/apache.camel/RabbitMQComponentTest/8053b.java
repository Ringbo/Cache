diff --git a/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQComponentTest.java b/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQComponentTest.java
index 0463080..8407769 100644
--- a/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQComponentTest.java
+++ b/components/camel-rabbitmq/src/test/java/org/apache/camel/component/rabbitmq/RabbitMQComponentTest.java
@@ -106,7 +106,7 @@
     public void testConnectionFactoryRef() throws Exception {
         SimpleRegistry registry = new SimpleRegistry();
         ConnectionFactory connectionFactoryMock = Mockito.mock(ConnectionFactory.class);
-        registry.put("connectionFactoryMock", connectionFactoryMock);
+        registry.bind("connectionFactoryMock", connectionFactoryMock);
 
         CamelContext defaultContext = new DefaultCamelContext(registry);
 
