diff --git a/src/org/traccar/protocol/Gt06ProtocolDecoder.java b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
index 4d8161a..0821de7 100644
--- a/src/org/traccar/protocol/Gt06ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
@@ -507,7 +507,7 @@
             buf.readUnsignedInt(); // offset
             buf.readBytes(photo, buf.readUnsignedShort());
 
-            if (buf.writableBytes() > 0) {
+            if (photo.writableBytes() > 0) {
                 sendPhotoRequest(channel, pictureId);
             } else {
                 Device device = Context.getDeviceManager().getDeviceById(deviceSession.getDeviceId());
