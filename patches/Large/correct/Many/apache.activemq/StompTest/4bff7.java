diff --git a/activemq-core/src/test/java/org/apache/activemq/transport/stomp/StompTest.java b/activemq-core/src/test/java/org/apache/activemq/transport/stomp/StompTest.java
index 1ba6690..b55f1ac 100644
--- a/activemq-core/src/test/java/org/apache/activemq/transport/stomp/StompTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/transport/stomp/StompTest.java
@@ -1115,7 +1115,7 @@
 
         stompConnection.sendFrame(frame);
 
-        TextMessage message = (TextMessage)consumer.receive(1000);
+        TextMessage message = (TextMessage)consumer.receive(5000);
         assertNotNull(message);
         assertEquals("system", message.getStringProperty(Stomp.Headers.Message.USERID));
 
@@ -1135,7 +1135,7 @@
         frame = "SEND\n" + "destination:/queue/" + getQueueName() + "\n\n" + "Hello World" + Stomp.NULL;
         stompConnection.sendFrame(frame);
 
-        StompFrame message = stompConnection.receive(1000);
+        StompFrame message = stompConnection.receive(5000);
         assertEquals("system", message.getHeaders().get(Stomp.Headers.Message.USERID));
     }
 
