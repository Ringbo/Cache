diff --git a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/WebSocketSessionRemoteEndpoint.java b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/WebSocketSessionRemoteEndpoint.java
index 6aa3563..7f1cc00 100644
--- a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/WebSocketSessionRemoteEndpoint.java
+++ b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/WebSocketSessionRemoteEndpoint.java
@@ -308,7 +308,7 @@
 
         @Override
         public void sendPong(final ByteBuffer applicationData) throws IOException, IllegalArgumentException {
-            WebSockets.sendPingBlocking(applicationData, webSocketChannel);
+            WebSockets.sendPongBlocking(applicationData, webSocketChannel);
         }
     }
 }
