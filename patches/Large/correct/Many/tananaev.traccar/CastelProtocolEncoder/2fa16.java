diff --git a/src/org/traccar/protocol/CastelProtocolEncoder.java b/src/org/traccar/protocol/CastelProtocolEncoder.java
index 7ba33ca..806dac1 100644
--- a/src/org/traccar/protocol/CastelProtocolEncoder.java
+++ b/src/org/traccar/protocol/CastelProtocolEncoder.java
@@ -35,9 +35,9 @@
         buf.writeByte('@');
         buf.writeByte('@');
 
-        buf.writeShort(2 + 2 + 1 + 20 + content.readableBytes()); // length
+        buf.writeShort(2 + 2 + 1 + 20 + 2 + content.readableBytes() + 2 + 2); // length
 
-        buf.writeByte(4); // protocol version
+        buf.writeByte(1); // protocol version
 
         buf.writeBytes(uniqueId.getBytes(StandardCharsets.US_ASCII));
         buf.writeZero(20 - uniqueId.length());
