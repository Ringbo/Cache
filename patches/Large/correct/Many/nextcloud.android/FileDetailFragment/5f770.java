diff --git a/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java b/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
index a01ce79..3e3082c 100644
--- a/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
+++ b/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
@@ -127,7 +127,7 @@
             VideoView videoView = (VideoView) mView
                     .findViewById(R.id.videoView1);
             videoView.setVisibility(View.INVISIBLE);
-            if (mFile.getPath() == null) {
+            if (mFile.getStoragePath() == null) {
                 ImageView imageView = (ImageView) getView().findViewById(
                         R.id.imageView2);
                 imageView.setImageResource(R.drawable.download);
@@ -136,11 +136,11 @@
                 if (mFile.getMimetype().startsWith("image/")) {
                     ImageView imageView = (ImageView) mView
                             .findViewById(R.id.imageView2);
-                    Bitmap bmp = BitmapFactory.decodeFile(mFile.getPath());
+                    Bitmap bmp = BitmapFactory.decodeFile(mFile.getStoragePath());
                     imageView.setImageBitmap(bmp);
                 } else if (mFile.getMimetype().startsWith("video/")) {
                     videoView.setVisibility(View.VISIBLE);
-                    videoView.setVideoPath(mFile.getPath());
+                    videoView.setVideoPath(mFile.getStoragePath());
                     videoView.start();
                 }
             }
