diff --git a/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPongPacket.java b/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPongPacket.java
index 37d8aec..e87118c 100644
--- a/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPongPacket.java
+++ b/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPongPacket.java
@@ -53,7 +53,7 @@
     public static StreamPongPacket readBuffer(short packetType, ChannelBuffer buffer) {
         assert packetType == PACKET_TYPE;
 
-        if (buffer.readableBytes() < 4) {
+        if (buffer.readableBytes() < 8) {
             buffer.resetReaderIndex();
             return null;
         }
