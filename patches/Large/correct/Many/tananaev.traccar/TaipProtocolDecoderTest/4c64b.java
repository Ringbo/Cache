diff --git a/test/org/traccar/protocol/TaipProtocolDecoderTest.java b/test/org/traccar/protocol/TaipProtocolDecoderTest.java
index a088cff..2251763 100644
--- a/test/org/traccar/protocol/TaipProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/TaipProtocolDecoderTest.java
@@ -8,7 +8,7 @@
     @Test
     public void testDecode() throws Exception {
 
-        TaipProtocolDecoder decoder = new TaipProtocolDecoder(new TaipProtocol(), false);
+        TaipProtocolDecoder decoder = new TaipProtocolDecoder(new TaipProtocol());
 
         verifyPosition(decoder, text(
                 ">REV421942237017+1170957-0701880200000032;ID=356612022463055<"));
