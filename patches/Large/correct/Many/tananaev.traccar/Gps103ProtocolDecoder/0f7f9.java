diff --git a/src/org/traccar/protocol/Gps103ProtocolDecoder.java b/src/org/traccar/protocol/Gps103ProtocolDecoder.java
index b459f63..72e8430 100644
--- a/src/org/traccar/protocol/Gps103ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Gps103ProtocolDecoder.java
@@ -330,7 +330,7 @@
 
         String sentence = (String) msg;
 
-        if (sentence.contains("imei:") && sentence.length() <= 25) {
+        if (sentence.contains("imei:") && sentence.length() <= 30) {
             if (channel != null) {
                 channel.writeAndFlush(new NetworkMessage("LOAD", remoteAddress));
                 Matcher matcher = Pattern.compile("imei:(\\d+),").matcher(sentence);
