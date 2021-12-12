diff --git a/library/src/main/java/com/google/android/exoplayer2/text/cea/Cea708Decoder.java b/library/src/main/java/com/google/android/exoplayer2/text/cea/Cea708Decoder.java
index 740fd17..8fd70f7 100644
--- a/library/src/main/java/com/google/android/exoplayer2/text/cea/Cea708Decoder.java
+++ b/library/src/main/java/com/google/android/exoplayer2/text/cea/Cea708Decoder.java
@@ -483,7 +483,7 @@
 
   private void handleC2Command(int command) {
     // C2 Table doesn't contain any commands in CEA-708-B, but we do need to skip bytes
-    if (command <= 0x0F) {
+    if (command <= 0x07) {
       // Do nothing.
     } else if (command <= 0x0F) {
       serviceBlockPacket.skipBits(8);
