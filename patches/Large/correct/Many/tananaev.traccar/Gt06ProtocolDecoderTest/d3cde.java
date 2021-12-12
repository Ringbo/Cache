diff --git a/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java b/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
index 0a0447a..10a8517 100644
--- a/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/Gt06ProtocolDecoderTest.java
@@ -160,7 +160,7 @@
         verifyAttributes(decoder, binary(
                 "7979000894000000000338ba0d0a"));
 
-        verifyNull(decoder, binary(
+        verifyAttributes(decoder, binary(
                 "79790020940a03516080825457290502194200448892980691312079088572f50004d4350d0a"));
 
         verifyPosition(decoder, binary(
