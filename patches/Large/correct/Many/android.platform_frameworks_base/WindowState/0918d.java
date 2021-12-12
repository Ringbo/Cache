diff --git a/services/core/java/com/android/server/wm/WindowState.java b/services/core/java/com/android/server/wm/WindowState.java
index c797d8d..febc1a9 100644
--- a/services/core/java/com/android/server/wm/WindowState.java
+++ b/services/core/java/com/android/server/wm/WindowState.java
@@ -1763,7 +1763,7 @@
     @Override
     void onResize() {
         final ArrayList<WindowState> resizingWindows = mService.mResizingWindows;
-        if (mHasSurface && !resizingWindows.contains(this)) {
+        if (mHasSurface && !isGoneForLayoutLw() && !resizingWindows.contains(this)) {
             if (DEBUG_RESIZE) Slog.d(TAG, "onResize: Resizing " + this);
             resizingWindows.add(this);
         }
