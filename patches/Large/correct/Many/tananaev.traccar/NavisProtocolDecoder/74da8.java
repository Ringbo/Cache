diff --git a/src/org/traccar/protocol/NavisProtocolDecoder.java b/src/org/traccar/protocol/NavisProtocolDecoder.java
index 6476d3d..83088e9 100644
--- a/src/org/traccar/protocol/NavisProtocolDecoder.java
+++ b/src/org/traccar/protocol/NavisProtocolDecoder.java
@@ -113,14 +113,13 @@
         position.set(Position.KEY_STATUS, buf.readUnsignedByte());
         position.set(Position.KEY_RSSI, buf.readUnsignedByte());
 
-        // NOTE: Needs testing
         if (isFormat(format, F10, F20, F30)) {
             position.set(Position.KEY_OUTPUT, buf.readUnsignedShortLE());
-        } else if (isFormat(format, F40, F50, F51, F52)) {
+        } else if (isFormat(format, F50, F51, F52)) {
             int extField = buf.readUnsignedByte();
             position.set(Position.KEY_OUTPUT, extField & 0x3);
             position.set(Position.KEY_SATELLITES, extField >> 2);
-        } else if (isFormat(format, F60)) {
+        } else if (isFormat(format, F40, F60)) {
             position.set(Position.KEY_OUTPUT, buf.readUnsignedByte() & 0xF);
         }
 
