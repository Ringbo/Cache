diff --git a/src/org/traccar/protocol/WondexFrameDecoder.java b/src/org/traccar/protocol/WondexFrameDecoder.java
index ba1d41c..09971c0 100644
--- a/src/org/traccar/protocol/WondexFrameDecoder.java
+++ b/src/org/traccar/protocol/WondexFrameDecoder.java
@@ -45,7 +45,7 @@
 
         } else {
 
-            Integer index = ChannelBufferTools.find(buf, buf.readerIndex(), buf.readableBytes(), "\r\n");
+            Integer index = ChannelBufferTools.find(buf, buf.readerIndex(), buf.writerIndex(), "\r\n");
             if (index != null) {
                 ChannelBuffer frame = buf.readBytes(index - buf.readerIndex());
                 buf.skipBytes(2);
