diff --git a/src/org/traccar/protocol/GatorProtocolDecoder.java b/src/org/traccar/protocol/GatorProtocolDecoder.java
index 9cd746f..b382144 100644
--- a/src/org/traccar/protocol/GatorProtocolDecoder.java
+++ b/src/org/traccar/protocol/GatorProtocolDecoder.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
+ * Copyright 2013 - 2018 Anton Tananaev (anton@traccar.org)
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -56,7 +56,7 @@
         return String.format("%02d%02d%02d%02d%02d", d1, d2, d3, d4, d5);
     }
 
-    private void sendResponse(Channel channel, byte calibration) {
+    private void sendResponse(Channel channel, SocketAddress remoteAddress, byte calibration) {
         if (channel != null) {
             ChannelBuffer response = ChannelBuffers.dynamicBuffer();
             response.writeByte(0x24); response.writeByte(0x24); // header
@@ -67,7 +67,7 @@
             response.writeByte(0); // slave order
             response.writeByte(1); // calibration
             response.writeByte(0x0D);
-            channel.write(response);
+            channel.write(response, remoteAddress);
         }
     }
 
@@ -85,7 +85,7 @@
                 buf.readUnsignedByte(), buf.readUnsignedByte(),
                 buf.readUnsignedByte(), buf.readUnsignedByte());
 
-        sendResponse(channel, buf.getByte(buf.writerIndex() - 2));
+        sendResponse(channel, remoteAddress, buf.getByte(buf.writerIndex() - 2));
 
         if (type == MSG_POSITION_DATA || type == MSG_ROLLCALL_RESPONSE
                 || type == MSG_ALARM_DATA || type == MSG_BLIND_AREA) {
