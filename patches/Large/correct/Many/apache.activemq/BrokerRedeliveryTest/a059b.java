diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/BrokerRedeliveryTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/BrokerRedeliveryTest.java
index a07f6df..c61a5ee 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/BrokerRedeliveryTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/BrokerRedeliveryTest.java
@@ -107,7 +107,7 @@
         consumerConnection.start();
         Session consumerSession = consumerConnection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
         MessageConsumer consumer = consumerSession.createConsumer(destination);
-        sendMessage(1000);
+        sendMessage(1500);
         Message message = consumer.receive(1000);
         assertNotNull("got message", message);
 
