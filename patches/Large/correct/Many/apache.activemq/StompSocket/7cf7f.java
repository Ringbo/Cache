diff --git a/activemq-http/src/main/java/org/apache/activemq/transport/ws/jetty9/StompSocket.java b/activemq-http/src/main/java/org/apache/activemq/transport/ws/jetty9/StompSocket.java
index ee012db..76ac560 100644
--- a/activemq-http/src/main/java/org/apache/activemq/transport/ws/jetty9/StompSocket.java
+++ b/activemq-http/src/main/java/org/apache/activemq/transport/ws/jetty9/StompSocket.java
@@ -44,7 +44,8 @@
 
     @Override
     public void sendToStomp(StompFrame command) throws IOException {
-        session.getRemote().sendString(command.format());
+        //Send async - do we need to wait for the future to complete?
+        session.getRemote().sendStringByFuture(command.format());
     }
 
     @Override
