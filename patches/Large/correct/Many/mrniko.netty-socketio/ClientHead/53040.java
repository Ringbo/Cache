diff --git a/src/main/java/com/corundumstudio/socketio/handler/ClientHead.java b/src/main/java/com/corundumstudio/socketio/handler/ClientHead.java
index 82cd860..662624b 100644
--- a/src/main/java/com/corundumstudio/socketio/handler/ClientHead.java
+++ b/src/main/java/com/corundumstudio/socketio/handler/ClientHead.java
@@ -125,7 +125,7 @@
             public void run() {
                 ClientHead client = clientsBox.get(sessionId);
                 if (client != null) {
-                    client.onChannelDisconnect();
+                    client.disconnect();
                     log.debug("{} removed due to ping timeout", sessionId);
                 }
             }
