diff --git a/extensions/ima/src/main/java/com/google/android/exoplayer2/ext/ima/ImaAdsLoader.java b/extensions/ima/src/main/java/com/google/android/exoplayer2/ext/ima/ImaAdsLoader.java
index 2d9ddfb..3256da2 100644
--- a/extensions/ima/src/main/java/com/google/android/exoplayer2/ext/ima/ImaAdsLoader.java
+++ b/extensions/ima/src/main/java/com/google/android/exoplayer2/ext/ima/ImaAdsLoader.java
@@ -447,9 +447,13 @@
       } else if (contentType == C.TYPE_HLS) {
         supportedMimeTypes.add(MimeTypes.APPLICATION_M3U8);
       } else if (contentType == C.TYPE_OTHER) {
-        supportedMimeTypes.addAll(Arrays.asList(
-            MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_WEBM, MimeTypes.VIDEO_H263, MimeTypes.VIDEO_MPEG,
-            MimeTypes.AUDIO_MP4, MimeTypes.AUDIO_MPEG));
+        supportedMimeTypes.addAll(
+            Arrays.asList(
+                MimeTypes.VIDEO_MP4,
+                MimeTypes.VIDEO_WEBM,
+                MimeTypes.VIDEO_H263,
+                MimeTypes.AUDIO_MP4,
+                MimeTypes.AUDIO_MPEG));
       } else if (contentType == C.TYPE_SS) {
         // IMA does not support Smooth Streaming ad media.
       }
