diff --git a/services/java/com/android/server/wm/WindowManagerService.java b/services/java/com/android/server/wm/WindowManagerService.java
index 32700cb..0164b63 100755
--- a/services/java/com/android/server/wm/WindowManagerService.java
+++ b/services/java/com/android/server/wm/WindowManagerService.java
@@ -8070,7 +8070,7 @@
 
     private void updateResizingWindows(final WindowState w) {
         final WindowStateAnimator winAnimator = w.mWinAnimator;
-        if (!w.mAppFreezing && w.mLayoutSeq == mLayoutSeq) {
+        if (w.mHasSurface && !w.mAppFreezing && w.mLayoutSeq == mLayoutSeq) {
             w.mContentInsetsChanged |=
                 !w.mLastContentInsets.equals(w.mContentInsets);
             w.mVisibleInsetsChanged |=
