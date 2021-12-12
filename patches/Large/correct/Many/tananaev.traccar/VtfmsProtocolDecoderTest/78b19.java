diff --git a/test/org/traccar/protocol/VtfmsProtocolDecoderTest.java b/test/org/traccar/protocol/VtfmsProtocolDecoderTest.java
index c2d01ad..57603de 100644
--- a/test/org/traccar/protocol/VtfmsProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/VtfmsProtocolDecoderTest.java
@@ -10,7 +10,7 @@
 
         VtfmsProtocolDecoder decoder = new VtfmsProtocolDecoder(new VtfmsProtocol());
 
-        verifyNull(decoder, text(
+        verifyPosition(decoder, text(
                 "(865733028143493,00I76,00,000,,,,,A,133755,210617,10.57354,077.24912,SW,000,00598,00000,K,0017368,1,12.7,,,0.000,,,0,0,0,0,1,1,0,,)074"));
 
         verifyPosition(decoder, text(
