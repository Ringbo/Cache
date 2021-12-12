diff --git a/src/net/java/sip/communicator/impl/media/codec/EncodingConfiguration.java b/src/net/java/sip/communicator/impl/media/codec/EncodingConfiguration.java
index 8748c63..6177c92 100644
--- a/src/net/java/sip/communicator/impl/media/codec/EncodingConfiguration.java
+++ b/src/net/java/sip/communicator/impl/media/codec/EncodingConfiguration.java
@@ -361,12 +361,12 @@
 
     public String[] getAvailableVideoEncodings()
     {
-        return availableAudioEncodings;
+        return availableVideoEncodings;
     }
 
     public String[] getAvailableAudioEncodings()
     {
-        return availableVideoEncodings;
+        return availableAudioEncodings;
     }
 
     public String[] getSupportedVideoEncodings()
