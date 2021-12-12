diff --git a/media/java/android/media/ThumbnailUtils.java b/media/java/android/media/ThumbnailUtils.java
index 3d85e31..0edd449 100644
--- a/media/java/android/media/ThumbnailUtils.java
+++ b/media/java/android/media/ThumbnailUtils.java
@@ -148,7 +148,7 @@
         try {
             retriever.setMode(MediaMetadataRetriever.MODE_CAPTURE_FRAME_ONLY);
             retriever.setDataSource(filePath);
-            bitmap = retriever.captureFrame();
+            bitmap = retriever.getFrameAtTime(-1);
         } catch (IllegalArgumentException ex) {
             // Assume this is a corrupt video file
         } catch (RuntimeException ex) {
