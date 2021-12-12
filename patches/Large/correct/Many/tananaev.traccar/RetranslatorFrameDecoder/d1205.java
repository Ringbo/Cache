diff --git a/src/org/traccar/protocol/RetranslatorFrameDecoder.java b/src/org/traccar/protocol/RetranslatorFrameDecoder.java
index 1ad07b8..4edd094 100644
--- a/src/org/traccar/protocol/RetranslatorFrameDecoder.java
+++ b/src/org/traccar/protocol/RetranslatorFrameDecoder.java
@@ -28,7 +28,7 @@
 
         int length = 4 + buf.getIntLE(buf.readerIndex());
         if (buf.readableBytes() >= length) {
-            return buf.readBytes(length);
+            return buf.readRetainedSlice(length);
         } else {
             return null;
         }
