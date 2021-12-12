diff --git a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketHandler.java b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketHandler.java
index 57231c0..cf44b3e 100644
--- a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketHandler.java
+++ b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketHandler.java
@@ -35,7 +35,7 @@
 class JettyWebSocketHandler extends JettyHTTPHandler {
     private WebSocketFactory webSocketFactory;;
 
-    public JettyWebSocketHandler(JettyHTTPDestination jhd, boolean cmExact,
+    JettyWebSocketHandler(JettyHTTPDestination jhd, boolean cmExact,
                                  WebSocketFactory webSocketFactory) {
         super(jhd, cmExact);
         this.webSocketFactory = webSocketFactory;
