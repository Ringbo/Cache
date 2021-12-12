diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/stress/VideoEditorStressTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/stress/VideoEditorStressTest.java
index 0e70dd3..432fb43 100755
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/stress/VideoEditorStressTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/stress/VideoEditorStressTest.java
@@ -597,7 +597,7 @@
             if (i % 4 == 0) {
                 final Bitmap[] thumbNails =
                     mediaVideoItem.getThumbnailList(mediaVideoItem.getWidth()*3,
-                        mediaVideoItem.getHeight()*2, i, 5000, 2);
+                        mediaVideoItem.getHeight()/2, i, 5000, 2);
                 // Recycle this Bitmap array
                 for (int i1 = 0; i1 < thumbNails.length; i1++) {
                     thumbNails[i1].recycle();
