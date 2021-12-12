diff --git a/src/org/traccar/protocol/Gt06FrameDecoder.java b/src/org/traccar/protocol/Gt06FrameDecoder.java
index bf487dc..e0bb3b3 100644
--- a/src/org/traccar/protocol/Gt06FrameDecoder.java
+++ b/src/org/traccar/protocol/Gt06FrameDecoder.java
@@ -36,9 +36,9 @@
         int length = 2 + 2; // head and tail
         
         if (buf.getByte(buf.readerIndex()) == 0x78) {
-            length += 1 + buf.getByte(buf.readerIndex() + 2);
+            length += 1 + buf.getUnsignedByte(buf.readerIndex() + 2);
         } else {
-            length += 2 + buf.getShort(buf.readerIndex() + 2);
+            length += 2 + buf.getUnsignedShort(buf.readerIndex() + 2);
         }
         
         // Check length and return buffer
