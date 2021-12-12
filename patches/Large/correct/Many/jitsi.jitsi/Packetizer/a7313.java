diff --git a/src/net/java/sip/communicator/impl/media/codec/audio/alaw/Packetizer.java b/src/net/java/sip/communicator/impl/media/codec/audio/alaw/Packetizer.java
index 3594c9f..6aa0be0 100644
--- a/src/net/java/sip/communicator/impl/media/codec/audio/alaw/Packetizer.java
+++ b/src/net/java/sip/communicator/impl/media/codec/audio/alaw/Packetizer.java
@@ -21,7 +21,7 @@
 {
     public Packetizer()
     {
-        packetSize = 480;
+        packetSize = 160;
         supportedInputFormats = new AudioFormat[]
             {
             new AudioFormat(
