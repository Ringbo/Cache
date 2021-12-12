diff --git a/src/org/traccar/protocol/CellocatorProtocolDecoder.java b/src/org/traccar/protocol/CellocatorProtocolDecoder.java
index 2b4fa9f..7ef013e 100644
--- a/src/org/traccar/protocol/CellocatorProtocolDecoder.java
+++ b/src/org/traccar/protocol/CellocatorProtocolDecoder.java
@@ -43,7 +43,7 @@
 
     private byte commandCount;
 
-    private void sendReply(Channel channel, long deviceId, byte packetNumber) {
+    private void sendReply(Channel channel, SocketAddress remoteAddress, long deviceId, byte packetNumber) {
         ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
         reply.writeByte('M');
         reply.writeByte('C');
@@ -64,7 +64,7 @@
         reply.writeByte(checksum);
 
         if (channel != null) {
-            channel.write(reply);
+            channel.write(reply, remoteAddress);
         }
     }
 
@@ -96,7 +96,7 @@
         }
         byte packetNumber = buf.readByte();
 
-        sendReply(channel, deviceUniqueId, packetNumber);
+        sendReply(channel, remoteAddress, deviceUniqueId, packetNumber);
 
         if (type == MSG_CLIENT_STATUS) {
 
