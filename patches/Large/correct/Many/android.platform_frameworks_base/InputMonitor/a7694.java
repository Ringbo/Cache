diff --git a/services/core/java/com/android/server/wm/InputMonitor.java b/services/core/java/com/android/server/wm/InputMonitor.java
index be9fb26..4434730 100644
--- a/services/core/java/com/android/server/wm/InputMonitor.java
+++ b/services/core/java/com/android/server/wm/InputMonitor.java
@@ -306,8 +306,9 @@
                 }
 
                 if (addWallpaperInputConsumerHandle) {
-                    if (child.mAttrs.type == WindowManager.LayoutParams.TYPE_WALLPAPER) {
-                        // Add the wallpaper input consumer above the first wallpaper window.
+                    if (child.mAttrs.type == WindowManager.LayoutParams.TYPE_WALLPAPER &&
+                            child.isVisibleLw()) {
+                        // Add the wallpaper input consumer above the first visible wallpaper.
                         addInputWindowHandleLw(mService.mWallpaperInputConsumer.mWindowHandle);
                         addWallpaperInputConsumerHandle = false;
                     }
@@ -341,7 +342,7 @@
         }
 
         if (addWallpaperInputConsumerHandle) {
-            // No wallpaper found, add the wallpaper input consumer at the end.
+            // No visible wallpaper found, add the wallpaper input consumer at the end.
             addInputWindowHandleLw(mService.mWallpaperInputConsumer.mWindowHandle);
         }
 
