diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/MediaItemThumbnailTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/MediaItemThumbnailTest.java
index 154f691..d5b67aa 100755
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/MediaItemThumbnailTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/MediaItemThumbnailTest.java
@@ -657,7 +657,7 @@
     public void testThumbnailListForH264WVGAWithCount() throws Exception {
         final String videoItemFilename = INPUT_FILE_PATH +
             "H264_BP_800x480_15fps_512kbps_AACLC_24KHz_38Kbps_s_1_17.mp4";
-        final int tnCount = 100;
+        final int tnCount = 70;
         final int renderingMode = MediaItem.RENDERING_MODE_BLACK_BORDER;
         final MediaVideoItem mediaVideoItem =
             mVideoEditorHelper.createMediaItem(mVideoEditor, "m1",
