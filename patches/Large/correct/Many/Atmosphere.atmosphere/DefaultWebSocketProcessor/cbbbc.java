diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index f79b782..38017eb 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -654,7 +654,7 @@
 
     // Highly bogus based on which I/O layer we are using.
     private boolean allowedCloseCode(int closeCode) {
-        return closeCode < 1001 || closeCode > 1004 ? true : false;
+        return closeCode <= 1001 || closeCode > 1004 ? true : false;
     }
 
     private void finish(WebSocket webSocket, AtmosphereResource resource, AtmosphereRequest r, AtmosphereResponse s, boolean closeWebSocket) {
