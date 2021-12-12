diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocket.java b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocket.java
index 20cda57..a2c4087 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocket.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocket.java
@@ -61,7 +61,7 @@
     public WebSocket resource(AtmosphereResource r) {
 
         // Make sure we carry what was set at the onOpen stage.
-        if (this.r != null) {
+        if (this.r != null && r != null) {
             // TODO: This is all over the place and quite ugly (the cast). Need to fix this in 1.1
             AtmosphereResourceImpl.class.cast(r).cloneState(this.r);
         }
