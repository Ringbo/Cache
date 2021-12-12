diff --git a/java/org/apache/tomcat/websocket/WsSession.java b/java/org/apache/tomcat/websocket/WsSession.java
index 7994cef..aec20f3 100644
--- a/java/org/apache/tomcat/websocket/WsSession.java
+++ b/java/org/apache/tomcat/websocket/WsSession.java
@@ -315,13 +315,13 @@
             removed = true;
         }
 
-        if (listener.equals(binaryMessageHandler) ||
+        if (wrapped.equals(binaryMessageHandler) ||
                 listener.equals(binaryMessageHandler)) {
             binaryMessageHandler = null;
             removed = true;
         }
 
-        if (listener.equals(pongMessageHandler) ||
+        if (wrapped.equals(pongMessageHandler) ||
                 listener.equals(pongMessageHandler)) {
             pongMessageHandler = null;
             removed = true;
