diff --git a/services/core/java/com/android/server/wallpaper/WallpaperManagerService.java b/services/core/java/com/android/server/wallpaper/WallpaperManagerService.java
index 4c7f9eb..0949d1a 100644
--- a/services/core/java/com/android/server/wallpaper/WallpaperManagerService.java
+++ b/services/core/java/com/android/server/wallpaper/WallpaperManagerService.java
@@ -332,7 +332,7 @@
         options.inJustDecodeBounds = true;
         BitmapFactory.decodeFile(wallpaper.wallpaperFile.getAbsolutePath(), options);
         if (options.outWidth <= 0 || options.outHeight <= 0) {
-            Slog.e(TAG, "Invalid wallpaper data");
+            Slog.w(TAG, "Invalid wallpaper data");
             success = false;
         } else {
             boolean needCrop = false;
