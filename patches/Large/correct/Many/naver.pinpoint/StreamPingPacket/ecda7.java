diff --git a/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPingPacket.java b/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPingPacket.java
index 4bec6e6..bb2a7d1 100644
--- a/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPingPacket.java
+++ b/rpc/src/main/java/com/navercorp/pinpoint/rpc/packet/stream/StreamPingPacket.java
@@ -53,7 +53,7 @@
     public static StreamPingPacket readBuffer(short packetType, ChannelBuffer buffer) {
         assert packetType == PACKET_TYPE;
 
-        if (buffer.readableBytes() < 4) {
+        if (buffer.readableBytes() < 8) {
             buffer.resetReaderIndex();
             return null;
         }
