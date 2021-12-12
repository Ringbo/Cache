diff --git a/test/org/traccar/protocol/AutoFonProtocolDecoderTest.java b/test/org/traccar/protocol/AutoFonProtocolDecoderTest.java
index e971216..f84873c 100644
--- a/test/org/traccar/protocol/AutoFonProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/AutoFonProtocolDecoderTest.java
@@ -11,7 +11,7 @@
 
         AutoFonProtocolDecoder decoder = new AutoFonProtocolDecoder(new AutoFonProtocol());
 
-        verifyNothing(decoder, binary(
+        verifyPosition(decoder, binary(
                 "02080000251848470afa010262daa690013aa4046da83745f8812560df010001126a"));
 
         verifyNothing(decoder, binary(
