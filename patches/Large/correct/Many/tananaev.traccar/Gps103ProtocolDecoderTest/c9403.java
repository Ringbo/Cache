diff --git a/test/org/traccar/protocol/Gps103ProtocolDecoderTest.java b/test/org/traccar/protocol/Gps103ProtocolDecoderTest.java
index 6e7f19e..ab59ba3 100644
--- a/test/org/traccar/protocol/Gps103ProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/Gps103ProtocolDecoderTest.java
@@ -10,7 +10,7 @@
 
         Gps103ProtocolDecoder decoder = new Gps103ProtocolDecoder(new Gps103Protocol());
 
-        verifyNothing(decoder, text(
+        verifyPosition(decoder, text(
                 "359769031878322imei:359769031878322,tracker,1602160718,2,F,221811.000,A,1655.2193,S,14546.6722,E,0.00,,"));
 
         verifyNothing(decoder, text(
