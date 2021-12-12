diff --git a/src/main/java/com/corundumstudio/socketio/SocketIOListener.java b/src/main/java/com/corundumstudio/socketio/SocketIOListener.java
index 7cab7b7..9d4f5ee 100644
--- a/src/main/java/com/corundumstudio/socketio/SocketIOListener.java
+++ b/src/main/java/com/corundumstudio/socketio/SocketIOListener.java
@@ -21,9 +21,9 @@
 
     void onConnect(SocketIOClient client);
 
-    void onJsonObject(SocketIOClient client, Packet packet);
+    void onJsonObject(SocketIOClient client, Object data);
 
-    void onMessage(SocketIOClient client, Packet packet);
+    void onMessage(SocketIOClient client, String message);
 
     void onDisconnect(SocketIOClient client);
 
