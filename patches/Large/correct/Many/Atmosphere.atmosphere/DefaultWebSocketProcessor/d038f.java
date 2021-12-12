diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index 7db4ad9..9148579 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -609,7 +609,7 @@
                 }
 
                 logger.trace("About to close AtmosphereResource for {} with code {}", resource, closeCode);
-                if (!resource.getAtmosphereResourceEvent().isClosedByApplication() && !resource.isCancelled()) {
+                if (!resource.getAtmosphereResourceEvent().isClosedByClient() && !resource.getAtmosphereResourceEvent().isClosedByApplication() && !resource.isCancelled()) {
                     // See https://github.com/Atmosphere/atmosphere/issues/1590
                     // Better to call onDisconnect that onResume.
                     if (allowedToClose) {
