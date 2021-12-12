diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/DestinationGCStressTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/DestinationGCStressTest.java
index 90d9128..80cd4be 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/DestinationGCStressTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/DestinationGCStressTest.java
@@ -123,7 +123,7 @@
                             c.start();
                             Session s = c.createSession(false, Session.AUTO_ACKNOWLEDGE);
                             MessageProducer producer = s.createProducer(null);
-                            Message message = session.createTextMessage();
+                            Message message = s.createTextMessage();
                             int j;
                             while ((j = max.decrementAndGet()) > 0) {
                                 producer.send(new ActiveMQTopic("A." + j), message);
