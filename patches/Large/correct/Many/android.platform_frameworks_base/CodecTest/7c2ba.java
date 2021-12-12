diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/CodecTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/CodecTest.java
index 0c0974c..2eea206 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/CodecTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/functional/CodecTest.java
@@ -532,7 +532,7 @@
                 e.printStackTrace();
                 return false;
             }
-            Bitmap outThumbnail = mMediaMetadataRetriever.captureFrame();
+            Bitmap outThumbnail = mMediaMetadataRetriever.getFrameAtTime(-1);
 
             //Verify the thumbnail 
             Bitmap goldenBitmap = mBitmapFactory.decodeFile(goldenPath);
