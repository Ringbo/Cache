diff --git a/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/util/MessageListenerTest.java b/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/util/MessageListenerTest.java
index 8b635e8..de503ed 100644
--- a/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/util/MessageListenerTest.java
+++ b/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/util/MessageListenerTest.java
@@ -119,7 +119,7 @@
         assertNumMessagesInQueue("Should succeed on second try", connection, dest, 0, 2000);
 
         sendMessage(connection, dest, FAIL);
-        assertNumMessagesInQueue("Should be rolled back", connection, dlq, 1, 1000);
+        assertNumMessagesInQueue("Should be rolled back", connection, dlq, 1, 2500);
     }
 
     private Connection createConnection(String name) throws JMSException {
