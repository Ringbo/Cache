diff --git a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestination.java b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestination.java
index 5169160..8522274 100644
--- a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestination.java
+++ b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestination.java
@@ -135,7 +135,7 @@
         private WebSocketServletHolder webSocketHolder;
 //        private String protocol;
 
-        public JettyWebSocket(HttpServletRequest request, String protocol) {
+        JettyWebSocket(HttpServletRequest request, String protocol) {
 //            this.protocol = protocol;
             this.webSocketHolder = new JettyWebSocketServletHolder(this, request);
         }
@@ -260,7 +260,7 @@
         private Map<String, Object> requestProperties;
         private Map<String, Object> requestAttributes;
         
-        public JettyWebSocketServletHolder(JettyWebSocket webSocket, HttpServletRequest request) {
+        JettyWebSocketServletHolder(JettyWebSocket webSocket, HttpServletRequest request) {
             this.webSocket = webSocket;
             this.requestProperties = readProperties(request);
             this.requestAttributes = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
