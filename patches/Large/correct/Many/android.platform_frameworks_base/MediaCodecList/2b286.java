diff --git a/media/java/android/media/MediaCodecList.java b/media/java/android/media/MediaCodecList.java
index 0dcbd65..bb848d9 100644
--- a/media/java/android/media/MediaCodecList.java
+++ b/media/java/android/media/MediaCodecList.java
@@ -204,7 +204,7 @@
      *         requests, or {@code null} if no such codec has been found.
      */
     public final String findEncoderForFormat(MediaFormat format) {
-        return findCodecForFormat(false /* encoder */, format);
+        return findCodecForFormat(true /* encoder */, format);
     }
 
     private String findCodecForFormat(boolean encoder, MediaFormat format) {
