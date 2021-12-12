diff --git a/services/core/java/com/android/server/wm/WindowAnimator.java b/services/core/java/com/android/server/wm/WindowAnimator.java
index 6a5183f..62d4f36 100644
--- a/services/core/java/com/android/server/wm/WindowAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowAnimator.java
@@ -782,7 +782,7 @@
         SurfaceControl.openTransaction();
         try {
             for (int i = mService.mDisplayContents.size() - 1; i >= 0; i--) {
-                DisplayContent display = mService.mDisplayContents.get(i);
+                DisplayContent display = mService.mDisplayContents.valueAt(i);
                 final WindowList windows = mService.getWindowListLocked(display.getDisplayId());
                 for (int j = windows.size() - 1; j >= 0; j--) {
                     windows.get(j).maybeRemoveReplacedWindow();
