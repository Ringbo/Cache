diff --git a/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java b/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
index a7702b9..0a0447a 100644
--- a/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
@@ -16,7 +16,7 @@
         verifyNull(decoder, binary(
                 "78780D01086471700328358100093F040D0A"));
 
-        verifyPosition(decoder, binary(
+        verifyAttributes(decoder, binary(
                 "79790020940A035985708053908307060104900402788950301217070401538F0003E8210D0A"));
 
         verifyPosition(decoder, binary(
