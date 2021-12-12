diff --git a/src/com/owncloud/android/datamodel/ThumbnailsCacheManager.java b/src/com/owncloud/android/datamodel/ThumbnailsCacheManager.java
index e7f0260..62eaae5 100644
--- a/src/com/owncloud/android/datamodel/ThumbnailsCacheManager.java
+++ b/src/com/owncloud/android/datamodel/ThumbnailsCacheManager.java
@@ -416,7 +416,7 @@
                         mImageKey = (String) params[1];
                     }
 
-                    if (BitmapUtils.isImage(mFile)) {
+                    if (MimeTypeUtil.isImage(mFile)) {
                         thumbnail = doFileInBackground(mFile);
                     }
                 }
@@ -448,10 +448,10 @@
                         if (mFile.isDirectory()) {
                             imageView.setImageResource(R.drawable.ic_menu_archive);
                         } else {
-                            if (BitmapUtils.isVideo(mFile)) {
+                            if (MimeTypeUtil.isVideo(mFile)) {
                                 imageView.setImageBitmap(ThumbnailsCacheManager.mDefaultVideo);
                             } else {
-                                imageView.setImageResource(MimetypeIconUtil.getFileTypeIconId(null, mFile.getName()));
+                                imageView.setImageResource(MimeTypeUtil.getFileTypeIconId(null, mFile.getName()));
                             }
                         }
                     }
