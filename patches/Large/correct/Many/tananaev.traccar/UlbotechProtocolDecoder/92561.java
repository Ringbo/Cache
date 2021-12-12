diff --git a/src/org/traccar/protocol/UlbotechProtocolDecoder.java b/src/org/traccar/protocol/UlbotechProtocolDecoder.java
index f2cedf3..8a9df59 100644
--- a/src/org/traccar/protocol/UlbotechProtocolDecoder.java
+++ b/src/org/traccar/protocol/UlbotechProtocolDecoder.java
@@ -28,11 +28,11 @@
 
 public class UlbotechProtocolDecoder extends BaseProtocolDecoder {
 
-    private long timeZone;
+    private final long timeZone;
 
     public UlbotechProtocolDecoder(UlbotechProtocol protocol) {
         super(protocol);
-        timeZone = Context.getConfig().getInteger(protocol + ".timezone", 0);
+        timeZone = Context.getConfig().getInteger(getProtocolName() + ".timezone", 0);
     }
 
     private static final short DATA_GPS = 0x01;
