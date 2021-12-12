diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ5914Test.java b/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ5914Test.java
index 0d5a567..0cc3130 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ5914Test.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ5914Test.java
@@ -78,7 +78,7 @@
         MessageProducer producer = session.createProducer(queue);
         TextMessage expiredMessage = session.createTextMessage("expired message");
         TextMessage validMessage = session.createTextMessage("valid message");
-        producer.send(expiredMessage, Message.DEFAULT_DELIVERY_MODE, Message.DEFAULT_PRIORITY, 50);
+        producer.send(expiredMessage, Message.DEFAULT_DELIVERY_MODE, Message.DEFAULT_PRIORITY, 1000);
         producer.send(validMessage);
         session.close();
 
@@ -91,7 +91,7 @@
 
         // Rollback allow the first message to expire.
         session.rollback();
-        Thread.sleep(75);
+        Thread.sleep(1500);
 
         // Consume again, this should fetch the second valid message via a pull.
         message = consumer.receive(3000);
