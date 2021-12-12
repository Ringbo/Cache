diff --git a/src/org/traccar/protocol/MeiligaoProtocolDecoder.java b/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
index 7e2aa06..a63554f 100644
--- a/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
+++ b/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
@@ -112,7 +112,7 @@
     }
 
     private static void sendResponse(
-            Channel channel, ChannelBuffer id, int type, ChannelBuffer msg) {
+            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int type, ChannelBuffer msg) {
 
         if (channel != null) {
             ChannelBuffer buf = ChannelBuffers.buffer(
@@ -128,7 +128,7 @@
             buf.writeByte('\r');
             buf.writeByte('\n');
 
-            channel.write(buf);
+            channel.write(buf, remoteAddress);
         }
     }
 
@@ -157,20 +157,20 @@
             case MSG_LOGIN:
                 if (channel != null) {
                     response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
-                    sendResponse(channel, id, MSG_LOGIN_RESPONSE, response);
+                    sendResponse(channel, remoteAddress, id, MSG_LOGIN_RESPONSE, response);
                 }
                 return null;
             case MSG_HEARTBEAT:
                 if (channel != null) {
                     response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
-                    sendResponse(channel, id, MSG_HEARTBEAT, response);
+                    sendResponse(channel, remoteAddress, id, MSG_HEARTBEAT, response);
                 }
                 return null;
             case MSG_SERVER:
                 if (channel != null) {
                     response = ChannelBuffers.copiedBuffer(
                             getMeiligaoServer(channel), Charset.defaultCharset());
-                    sendResponse(channel, id, MSG_SERVER, response);
+                    sendResponse(channel, remoteAddress, id, MSG_SERVER, response);
                 }
                 return null;
             case MSG_POSITION:
