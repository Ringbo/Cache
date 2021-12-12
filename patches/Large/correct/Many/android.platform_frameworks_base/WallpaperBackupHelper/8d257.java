diff --git a/core/java/android/app/backup/WallpaperBackupHelper.java b/core/java/android/app/backup/WallpaperBackupHelper.java
index 6539711..55368d6 100644
--- a/core/java/android/app/backup/WallpaperBackupHelper.java
+++ b/core/java/android/app/backup/WallpaperBackupHelper.java
@@ -110,11 +110,16 @@
                     if (DEBUG) Slog.d(TAG, "Restoring wallpaper image w=" + options.outWidth
                             + " h=" + options.outHeight);
 
-                    // how much does the image differ from our preference?
+                    // How much does the image differ from our preference?  The threshold
+                    // here is set to accept any image larger than our target, because
+                    // scaling down is acceptable; but to reject images that are deemed
+                    // "too small" to scale up attractively.  The value 1.33 is just barely
+                    // too low to pass Nexus 1 or Droid wallpapers for use on a Xoom, but
+                    // will pass anything relatively larger.
                     double widthRatio = mDesiredMinWidth / options.outWidth;
                     double heightRatio = mDesiredMinHeight / options.outHeight;
-                    if (widthRatio > 0.8 && widthRatio < 1.25
-                            && heightRatio > 0.8 && heightRatio < 1.25) {
+                    if (widthRatio > 0 && widthRatio < 1.33
+                            && heightRatio > 0 && heightRatio < 1.33) {
                         // sufficiently close to our resolution; go ahead and use it
                         if (DEBUG) Slog.d(TAG, "wallpaper dimension match; using");
                         f.renameTo(new File(WALLPAPER_IMAGE));
