diff --git a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/WebSocketFrame.java b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/WebSocketFrame.java
index 750e07e..1d8bd1a 100644
--- a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/WebSocketFrame.java
+++ b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/WebSocketFrame.java
@@ -595,7 +595,7 @@
 
         data = BufferUtil.toBuffer(buf);
         payloadStart = data.position();
-        payloadLength = data.limit();
+        payloadLength = data.remaining();
         return this;
     }
 
