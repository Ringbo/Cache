diff --git a/activemq-http/src/main/java/org/apache/activemq/transport/ws/StompWSConnection.java b/activemq-http/src/main/java/org/apache/activemq/transport/ws/StompWSConnection.java
index 8531c73..af7f860 100644
--- a/activemq-http/src/main/java/org/apache/activemq/transport/ws/StompWSConnection.java
+++ b/activemq-http/src/main/java/org/apache/activemq/transport/ws/StompWSConnection.java
@@ -57,17 +57,17 @@
 
     //---- Send methods ------------------------------------------------------//
 
-    public void sendRawFrame(String rawFrame) throws Exception {
+    public synchronized void sendRawFrame(String rawFrame) throws Exception {
         checkConnected();
         connection.getRemote().sendString(rawFrame);
     }
 
-    public void sendFrame(StompFrame frame) throws Exception {
+    public synchronized void sendFrame(StompFrame frame) throws Exception {
         checkConnected();
         connection.getRemote().sendString(frame.format());
     }
 
-    public void keepAlive() throws Exception {
+    public synchronized void keepAlive() throws Exception {
         checkConnected();
         connection.getRemote().sendString("\n");
     }
