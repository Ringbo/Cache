diff --git a/media/java/android/media/ExifInterface.java b/media/java/android/media/ExifInterface.java
index 5e00dc1..6f24f76 100644
--- a/media/java/android/media/ExifInterface.java
+++ b/media/java/android/media/ExifInterface.java
@@ -1557,16 +1557,13 @@
      * <p>
      * This method is only supported for JPEG files.
      * </p>
-     *
-     * @throws UnsupportedOperationException If this method is called with unsupported files.
      */
     public void saveAttributes() throws IOException {
         if (!mIsSupportedFile || mIsRaw) {
-            throw new UnsupportedOperationException(
-                    "ExifInterface only supports saving attributes on JPEG formats.");
+            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
         }
         if (mIsInputStream || (mSeekableFileDescriptor == null && mFilename == null)) {
-            throw new UnsupportedOperationException(
+            throw new IOException(
                     "ExifInterface does not support saving attributes for the current input.");
         }
 
