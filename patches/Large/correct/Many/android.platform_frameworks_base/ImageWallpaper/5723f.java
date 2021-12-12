diff --git a/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java b/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
index e963a0a..45d2219 100644
--- a/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
+++ b/packages/SystemUI/src/com/android/systemui/ImageWallpaper.java
@@ -327,7 +327,7 @@
             mLastRotation = newRotation;
 
             // Load bitmap if it is not yet loaded or if it was loaded at a different size
-            if (mBackground == null || dw != mBackgroundWidth || dw != mBackgroundHeight) {
+            if (mBackground == null || dw != mBackgroundWidth || dh != mBackgroundHeight) {
                 if (DEBUG) {
                     Log.d(TAG, "Reloading bitmap");
                 }
