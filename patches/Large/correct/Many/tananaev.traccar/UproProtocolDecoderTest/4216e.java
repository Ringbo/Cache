diff --git a/test/org/traccar/protocol/UproProtocolDecoderTest.java b/test/org/traccar/protocol/UproProtocolDecoderTest.java
index 82d159d..aab31ba 100644
--- a/test/org/traccar/protocol/UproProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/UproProtocolDecoderTest.java
@@ -10,7 +10,7 @@
 
         UproProtocolDecoder decoder = new UproProtocolDecoder(new UproProtocol());
 
-        verifyNothing(decoder, text(
+        verifyPosition(decoder, text(
                 "*AI2000905447674,BA&A2003064913201201845107561627121016&B0100000000&C05>8=961&F0333&K023101002154A7#"));
 
         verifyPosition(decoder, text(
