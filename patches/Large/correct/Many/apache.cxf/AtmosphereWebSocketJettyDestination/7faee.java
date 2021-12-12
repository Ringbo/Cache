diff --git a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/atmosphere/AtmosphereWebSocketJettyDestination.java b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/atmosphere/AtmosphereWebSocketJettyDestination.java
index 2abef6c..0e02923 100644
--- a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/atmosphere/AtmosphereWebSocketJettyDestination.java
+++ b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/atmosphere/AtmosphereWebSocketJettyDestination.java
@@ -112,7 +112,7 @@
     }
 
     private class AtmosphereJettyWebSocketHandler extends JettyHTTPHandler {
-        public AtmosphereJettyWebSocketHandler(JettyHTTPDestination jhd, boolean cmExact) {
+        AtmosphereJettyWebSocketHandler(JettyHTTPDestination jhd, boolean cmExact) {
             super(jhd, cmExact);
         }
         
