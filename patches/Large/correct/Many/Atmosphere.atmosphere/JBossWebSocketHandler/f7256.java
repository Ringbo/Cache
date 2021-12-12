diff --git a/modules/cpr/src/main/java/org/atmosphere/container/JBossWebSocketHandler.java b/modules/cpr/src/main/java/org/atmosphere/container/JBossWebSocketHandler.java
index f03face..5d23bac 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/JBossWebSocketHandler.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/JBossWebSocketHandler.java
@@ -76,7 +76,7 @@
     @Override
     protected void onSocketClosed(WebSocket socket) throws IOException {
         logger.trace("WebSocket.onSocketClosed.");
-        webSocketProcessor.close(webSocket, 0);
+        webSocketProcessor.close(webSocket, 1000);
     }
 
     @Override
@@ -95,7 +95,7 @@
             } else if (frame instanceof CloseFrame) {
                 // TODO shall we call this here?
                 logger.trace("WebSocket.onReceivedFrame (CloseFrame)");
-                webSocketProcessor.close(webSocket, 0);
+                webSocketProcessor.close(webSocket, 1000);
             } else {
                 logger.trace("WebSocket.onReceivedFrame skipping: " + frame);
             }
