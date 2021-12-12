diff --git a/test/org/traccar/protocol/Pt502ProtocolDecoderTest.java b/test/org/traccar/protocol/Pt502ProtocolDecoderTest.java
index efe540e..e8483fc 100644
--- a/test/org/traccar/protocol/Pt502ProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/Pt502ProtocolDecoderTest.java
@@ -29,7 +29,7 @@
         verifyPosition(decoder, text(
                 "$POS,6095,233344.000,V,0933.0451,N,06912.3360,W,,,151112,,,N/00000,00000/0/1677600/"));
 
-        verifyPosition(decoder, text(
+        verifyNothing(decoder, text(
                 "$PHO0,6091,233606.000,A,0902.9855,N,06944.3654,W,0.0,43.8,141112,,,A/00010,00000/0/224000//"));
         
         verifyPosition(decoder, text(
