diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index b8b7848..54960a4 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -3003,7 +3003,8 @@
         if (win.mAttrs.type == TYPE_APPLICATION_STARTING) {
             transit = WindowManagerPolicy.TRANSIT_PREVIEW_DONE;
         }
-        if (win.isWinVisibleLw() && winAnimator.applyAnimationLocked(transit, false)) {
+        if (win.isWinVisibleLw() && !winAnimator.isAnimationSet()
+                && winAnimator.applyAnimationLocked(transit, false)) {
             focusMayChange = isDefaultDisplay;
             win.mAnimatingExit = true;
             win.mWinAnimator.mAnimating = true;
