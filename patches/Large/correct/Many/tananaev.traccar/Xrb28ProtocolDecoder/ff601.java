diff --git a/src/org/traccar/protocol/Xrb28ProtocolDecoder.java b/src/org/traccar/protocol/Xrb28ProtocolDecoder.java
index 7c38290..c1854e4 100644
--- a/src/org/traccar/protocol/Xrb28ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Xrb28ProtocolDecoder.java
@@ -68,7 +68,7 @@
 
         String sentence = (String) msg;
 
-        DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, sentence.substring(8, 24));
+        DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, sentence.substring(9, 24));
         if (deviceSession == null) {
             return null;
         }
