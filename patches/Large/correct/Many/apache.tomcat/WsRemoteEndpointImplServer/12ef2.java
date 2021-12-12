diff --git a/java/org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer.java b/java/org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer.java
index 42f2508..a473126 100644
--- a/java/org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer.java
+++ b/java/org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer.java
@@ -76,7 +76,7 @@
             // Blocking
             for (ByteBuffer buffer : buffers) {
                 long timeout = blockingWriteTimeoutExpiry - System.currentTimeMillis();
-                if (timeout < 0) {
+                if (timeout <= 0) {
                     SendResult sr = new SendResult(new SocketTimeoutException());
                     handler.onResult(sr);
                     return;
@@ -85,7 +85,7 @@
                 try {
                     socketWrapper.write(true, buffer);
                     timeout = blockingWriteTimeoutExpiry - System.currentTimeMillis();
-                    if (timeout < 0) {
+                    if (timeout <= 0) {
                         SendResult sr = new SendResult(new SocketTimeoutException());
                         handler.onResult(sr);
                         return;
