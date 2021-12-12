diff --git a/test/org/traccar/protocol/WatchProtocolDecoderTest.java b/test/org/traccar/protocol/WatchProtocolDecoderTest.java
index c344476..41af104 100644
--- a/test/org/traccar/protocol/WatchProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/WatchProtocolDecoderTest.java
@@ -16,7 +16,7 @@
         verifyNothing(decoder, text(
                 "[SG*8800000015*0002*LK"));
 
-        verifyNothing(decoder, text(
+        verifyAttributes(decoder, text(
                 "[3G*4700186508*000B*LK,0,10,100"));
 
         verifyPosition(decoder, text(
