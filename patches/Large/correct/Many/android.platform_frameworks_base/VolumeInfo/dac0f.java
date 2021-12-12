diff --git a/core/java/android/os/storage/VolumeInfo.java b/core/java/android/os/storage/VolumeInfo.java
index 5c99f6c..9e3e386 100644
--- a/core/java/android/os/storage/VolumeInfo.java
+++ b/core/java/android/os/storage/VolumeInfo.java
@@ -312,7 +312,7 @@
      * {@link android.Manifest.permission#WRITE_MEDIA_STORAGE}.
      */
     public File getInternalPathForUser(int userId) {
-        if (type == TYPE_PUBLIC) {
+        if (type == TYPE_PUBLIC && !isVisible()) {
             // TODO: plumb through cleaner path from vold
             return new File(path.replace("/storage/", "/mnt/media_rw/"));
         } else {
