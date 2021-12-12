diff --git a/src/net/java/sip/communicator/impl/media/MediaControl.java b/src/net/java/sip/communicator/impl/media/MediaControl.java
index 7289f1b..64b2fc3 100644
--- a/src/net/java/sip/communicator/impl/media/MediaControl.java
+++ b/src/net/java/sip/communicator/impl/media/MediaControl.java
@@ -559,7 +559,7 @@
                     if (format instanceof AudioFormat)
                     {
 
-                        if (transmittableAudioEncodings.contains(sdp))
+                        if (!transmittableAudioEncodings.contains(sdp))
                         {
                             if (logger.isDebugEnabled())
                             {
