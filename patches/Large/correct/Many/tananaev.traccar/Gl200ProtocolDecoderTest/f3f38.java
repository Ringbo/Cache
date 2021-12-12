diff --git a/test/org/traccar/protocol/Gl200ProtocolDecoderTest.java b/test/org/traccar/protocol/Gl200ProtocolDecoderTest.java
index e699bca..ee7bf84 100644
--- a/test/org/traccar/protocol/Gl200ProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/Gl200ProtocolDecoderTest.java
@@ -10,7 +10,7 @@
 
         Gl200ProtocolDecoder decoder = new Gl200ProtocolDecoder(new Gl200Protocol());
 
-        verifyAttributes(decoder, text(
+        verifyPositions(decoder, text(
                 "+RESP:GTFRI,210102,354524044925825,,1,1,1,29,2.8,0,133.7,-90.203063,32.265473,20170318005208,,,,,10800,4,20170318005208,0002$"));
 
         verifyAttributes(decoder, text(
