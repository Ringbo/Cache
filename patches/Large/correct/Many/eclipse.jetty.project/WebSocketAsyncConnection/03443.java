diff --git a/jetty-websocket/websocket-core/src/main/java/org/eclipse/jetty/websocket/io/WebSocketAsyncConnection.java b/jetty-websocket/websocket-core/src/main/java/org/eclipse/jetty/websocket/io/WebSocketAsyncConnection.java
index 45df8ec..dffbb10 100644
--- a/jetty-websocket/websocket-core/src/main/java/org/eclipse/jetty/websocket/io/WebSocketAsyncConnection.java
+++ b/jetty-websocket/websocket-core/src/main/java/org/eclipse/jetty/websocket/io/WebSocketAsyncConnection.java
@@ -283,7 +283,7 @@
             TextFrame frame = new TextFrame(messages[i]);
             frame.setFin(true);
             raw[i] = bufferPool.acquire(policy.getBufferSize(),false);
-            BufferUtil.clear(raw[i]);
+            BufferUtil.clearToFill(raw[i]);
             generator.generate(raw[i],frame);
             BufferUtil.flipToFlush(raw[i],0);
         }
