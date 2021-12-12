diff --git a/src/org/traccar/protocol/CastelProtocolDecoder.java b/src/org/traccar/protocol/CastelProtocolDecoder.java
index 75021d3..0b00c05 100644
--- a/src/org/traccar/protocol/CastelProtocolDecoder.java
+++ b/src/org/traccar/protocol/CastelProtocolDecoder.java
@@ -80,7 +80,7 @@
                 return null;
             } else if (type == MSG_LOGIN) {
 
-                if (channel == null) {
+                if (channel != null) {
                     ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 41);
                     response.writeByte(0x40); response.writeByte(0x40);
                     response.writeShort(response.capacity());
