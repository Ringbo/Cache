diff --git a/test/org/traccar/protocol/RuptelaProtocolDecoderTest.java b/test/org/traccar/protocol/RuptelaProtocolDecoderTest.java
index 50908ad..6fff0f6 100644
--- a/test/org/traccar/protocol/RuptelaProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/RuptelaProtocolDecoderTest.java
@@ -10,7 +10,7 @@
 
         RuptelaProtocolDecoder decoder = new RuptelaProtocolDecoder(new RuptelaProtocol());
 
-        verifyPosition(decoder, binary(
+        verifyAttributes(decoder, binary(
                 "0011000315A07F440B1D07534554494f20636f6e66696775726174696f6e2064617461206f6b341C"));
 
         verifyPositions(decoder, binary(
