diff --git a/src/org/traccar/protocol/UlbotechProtocolDecoder.java b/src/org/traccar/protocol/UlbotechProtocolDecoder.java
index 3dc5b36..bf0a9cc 100644
--- a/src/org/traccar/protocol/UlbotechProtocolDecoder.java
+++ b/src/org/traccar/protocol/UlbotechProtocolDecoder.java
@@ -151,7 +151,7 @@
 
                 case DATA_STATUS:
                     int status = buf.readUnsignedShort();
-                    position.set(Event.KEY_IGNITION, BitUtil.check(status, 6));
+                    position.set(Event.KEY_IGNITION, BitUtil.check(status, 9));
                     position.set(Event.KEY_STATUS, status);
                     position.set(Event.KEY_ALARM, buf.readUnsignedShort());
                     break;
