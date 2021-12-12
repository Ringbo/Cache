diff --git a/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java b/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
index 6571294..907a79e 100644
--- a/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
+++ b/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
@@ -199,7 +199,7 @@
             // Load background image dimensions, if we haven't saved them yet
             if (mBackgroundWidth <= 0 || mBackgroundHeight <= 0) {
                 // Need to load the image to get dimensions
-                loadWallpaper(forDraw, true /* needsReset */);
+                loadWallpaper(forDraw, false /* needsReset */);
                 if (DEBUG) {
                     Log.d(TAG, "Reloading, redoing updateSurfaceSize later.");
                 }
