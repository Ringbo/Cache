diff --git a/media/java/android/media/MediaScanner.java b/media/java/android/media/MediaScanner.java
index 2eed70f..7ced3e4 100644
--- a/media/java/android/media/MediaScanner.java
+++ b/media/java/android/media/MediaScanner.java
@@ -989,7 +989,7 @@
                 ExifInterface exif = null;
                 try {
                     exif = new ExifInterface(entry.mPath);
-                } catch (IOException ex) {
+                } catch (Exception ex) {
                     // exif is null
                 }
                 if (exif != null) {
