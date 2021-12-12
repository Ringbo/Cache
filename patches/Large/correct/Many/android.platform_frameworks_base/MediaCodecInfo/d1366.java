diff --git a/media/java/android/media/MediaCodecInfo.java b/media/java/android/media/MediaCodecInfo.java
index c29300d..2cb58d0 100644
--- a/media/java/android/media/MediaCodecInfo.java
+++ b/media/java/android/media/MediaCodecInfo.java
@@ -909,7 +909,8 @@
             if (mMime.toLowerCase().startsWith("audio/")) {
                 mAudioCaps = AudioCapabilities.create(info, this);
                 mAudioCaps.getDefaultFormat(mDefaultFormat);
-            } else if (mMime.toLowerCase().startsWith("video/")) {
+            } else if (mMime.toLowerCase().startsWith("video/")
+                    || mMime.equalsIgnoreCase(MediaFormat.MIMETYPE_IMAGE_ANDROID_HEIC)) {
                 mVideoCaps = VideoCapabilities.create(info, this);
             }
             if (encoder) {
