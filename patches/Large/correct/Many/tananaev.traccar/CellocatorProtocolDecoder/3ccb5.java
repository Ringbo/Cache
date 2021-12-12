diff --git a/src/org/traccar/protocol/CellocatorProtocolDecoder.java b/src/org/traccar/protocol/CellocatorProtocolDecoder.java
index 59350da..178e175 100644
--- a/src/org/traccar/protocol/CellocatorProtocolDecoder.java
+++ b/src/org/traccar/protocol/CellocatorProtocolDecoder.java
@@ -71,7 +71,7 @@
         reply.writeInt(0); // authentication code
         reply.writeByte(0);
         reply.writeByte(packetNumber);
-        reply.writeZero(10);
+        reply.writeZero(11);
 
         byte checksum = 0;
         for (int i = 4; i < 27; i++) {
