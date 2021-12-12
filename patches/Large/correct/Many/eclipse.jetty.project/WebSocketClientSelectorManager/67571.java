diff --git a/jetty-websocket/websocket-client/src/main/java/org/eclipse/jetty/websocket/client/io/WebSocketClientSelectorManager.java b/jetty-websocket/websocket-client/src/main/java/org/eclipse/jetty/websocket/client/io/WebSocketClientSelectorManager.java
index abacfcf..783874b 100644
--- a/jetty-websocket/websocket-client/src/main/java/org/eclipse/jetty/websocket/client/io/WebSocketClientSelectorManager.java
+++ b/jetty-websocket/websocket-client/src/main/java/org/eclipse/jetty/websocket/client/io/WebSocketClientSelectorManager.java
@@ -84,7 +84,7 @@
 
         WebSocketAsyncConnection connection = new WebSocketAsyncConnection(endPoint,executor,scheduler,policy,bufferPool);
         endPoint.setAsyncConnection(connection);
-        connection.getParser().addListener(websocket);
+        connection.getParser().setListener(websocket);
 
         // TODO: track open websockets? bind open websocket to connection?
 
