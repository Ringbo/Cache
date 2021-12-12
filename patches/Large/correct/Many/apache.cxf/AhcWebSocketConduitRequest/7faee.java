diff --git a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/ahc/AhcWebSocketConduitRequest.java b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/ahc/AhcWebSocketConduitRequest.java
index e4396b3..7d8ff2b 100644
--- a/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/ahc/AhcWebSocketConduitRequest.java
+++ b/rt/transports/websocket/src/main/java/org/apache/cxf/transport/websocket/ahc/AhcWebSocketConduitRequest.java
@@ -32,7 +32,7 @@
     private String id;
     private int receiveTimeout;
     
-    public AhcWebSocketConduitRequest(URI uri, String method) {
+    AhcWebSocketConduitRequest(URI uri, String method) {
         this.uri = uri;
         this.method = method;
     }
