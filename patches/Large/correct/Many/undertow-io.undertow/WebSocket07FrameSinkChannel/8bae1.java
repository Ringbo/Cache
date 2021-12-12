diff --git a/websockets/src/main/java/io/undertow/websockets/protocol/version07/WebSocket07FrameSinkChannel.java b/websockets/src/main/java/io/undertow/websockets/protocol/version07/WebSocket07FrameSinkChannel.java
index a57eac2..9363db1 100644
--- a/websockets/src/main/java/io/undertow/websockets/protocol/version07/WebSocket07FrameSinkChannel.java
+++ b/websockets/src/main/java/io/undertow/websockets/protocol/version07/WebSocket07FrameSinkChannel.java
@@ -75,7 +75,7 @@
             header.put((byte) b0);
             header.put((byte)payloadSize);
         } else if (payloadSize <= 0xFFFF) {
-            header = ByteBuffer.allocate(3 + maskLength);
+            header = ByteBuffer.allocate(4 + maskLength);
             header.put((byte) b0);
             header.put((byte) 126);
             header.put((byte) (payloadSize >>> 8 & 0xFF));
