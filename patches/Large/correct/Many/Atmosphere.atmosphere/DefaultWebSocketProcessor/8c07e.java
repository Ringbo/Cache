diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index b54c5b7..7db4ad9 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -643,8 +643,9 @@
         }
     }
 
+    // Highly bogus nased on which I/O layer we are using.
     private boolean allowedCloseCode(int closeCode) {
-        return closeCode < 1002 || closeCode > 1004 ? true : false;
+        return closeCode < 1001 || closeCode > 1004 ? true : false;
     }
 
     private void finish(WebSocket webSocket, AtmosphereResource resource, AtmosphereRequest r, AtmosphereResponse s, boolean closeWebSocket) {
