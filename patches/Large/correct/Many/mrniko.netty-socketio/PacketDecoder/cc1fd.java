diff --git a/src/main/java/com/corundumstudio/socketio/protocol/PacketDecoder.java b/src/main/java/com/corundumstudio/socketio/protocol/PacketDecoder.java
index 5326506..ea261e6 100644
--- a/src/main/java/com/corundumstudio/socketio/protocol/PacketDecoder.java
+++ b/src/main/java/com/corundumstudio/socketio/protocol/PacketDecoder.java
@@ -151,7 +151,7 @@
 
     private void parseHeader(ByteBuf frame, Packet packet, PacketType innerType) {
         int endIndex = frame.bytesBefore((byte)'[');
-        if (endIndex == 0) {
+        if (endIndex <= 0) {
             return;
         }
 
