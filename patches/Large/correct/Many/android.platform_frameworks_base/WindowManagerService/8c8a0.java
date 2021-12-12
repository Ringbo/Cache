diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index ee1149e..36cb7f2 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -10408,8 +10408,8 @@
                     ": removed=" + win.mRemoved + " visible=" + win.isVisibleLw() +
                     " mHasSurface=" + win.mHasSurface +
                     " drawState=" + win.mWinAnimator.mDrawState);
-            if (win.mRemoved || !win.mHasSurface) {
-                // Window has been removed; no draw will now happen, so stop waiting.
+            if (win.mRemoved || !win.mHasSurface || !win.mPolicyVisibility) {
+                // Window has been removed or hidden; no draw will now happen, so stop waiting.
                 if (DEBUG_SCREEN_ON) Slog.w(TAG, "Aborted waiting for drawn: " + win);
                 mWaitingForDrawn.remove(win);
             } else if (win.hasDrawnLw()) {
