diff --git a/modules/cpr/src/main/java/org/atmosphere/container/Tomcat7AsyncSupportWithWebSocket.java b/modules/cpr/src/main/java/org/atmosphere/container/Tomcat7AsyncSupportWithWebSocket.java
index 5fedf8a..fe577c2 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/Tomcat7AsyncSupportWithWebSocket.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/Tomcat7AsyncSupportWithWebSocket.java
@@ -96,7 +96,7 @@
 
             if (!headerContainsToken(req, "sec-websocket-version", "13")) {
                 logger.debug("WebSocket version not supported. Downgrading to Comet");
-                res.sendError(202, "Websocket protocol not supported");
+                res.sendError(501, "Websocket protocol not supported");
                 return new AtmosphereFramework.Action(AtmosphereFramework.Action.TYPE.CANCELLED);
             }
 
