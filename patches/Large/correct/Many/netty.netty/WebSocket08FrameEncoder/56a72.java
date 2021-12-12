diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocket08FrameEncoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocket08FrameEncoder.java
index 715123a..1d77385 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocket08FrameEncoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocket08FrameEncoder.java
@@ -166,7 +166,7 @@
         if (maskPayload) {
             int random = (int) (Math.random() * Integer.MAX_VALUE);
             mask = ByteBuffer.allocate(4).putInt(random).array();
-            header.writeBytes(mask);
+            out.writeBytes(mask);
 
             int counter = 0;
             for (int i = data.readerIndex(); i < data.writerIndex(); i ++) {
