diff --git a/media/java/android/media/ExifInterface.java b/media/java/android/media/ExifInterface.java
index a2ccdc8..e3beb4a 100644
--- a/media/java/android/media/ExifInterface.java
+++ b/media/java/android/media/ExifInterface.java
@@ -1372,8 +1372,7 @@
      */
     public void saveAttributes() throws IOException {
         if (!mIsSupportedFile) {
-            throw new UnsupportedOperationException(
-                    "ExifInterface only supports saving attributes on JPEG formats.");
+            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
         }
         // Keep the thumbnail in memory
         mThumbnailBytes = getThumbnail();
