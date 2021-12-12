diff --git a/test/org/traccar/protocol/T800xProtocolDecoderTest.java b/test/org/traccar/protocol/T800xProtocolDecoderTest.java
index 05e9365..f176234 100644
--- a/test/org/traccar/protocol/T800xProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/T800xProtocolDecoderTest.java
@@ -16,7 +16,7 @@
         verifyNothing(decoder, binary(
                 "232303000f00000880316890202968"));
 
-        verifyPosition(decoder, binary(
+        verifyAttributes(decoder, binary(
                 "232302004200000880316890202968001e02582d00000000000000050000320000018901920000001dc1e2001601081154255d0202005a0053875a00a57e5a00af80"));
 
         verifyNothing(decoder, binary(
