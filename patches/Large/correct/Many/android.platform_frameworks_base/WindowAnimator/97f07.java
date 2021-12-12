diff --git a/services/core/java/com/android/server/wm/WindowAnimator.java b/services/core/java/com/android/server/wm/WindowAnimator.java
index 38d0711..85bddee 100644
--- a/services/core/java/com/android/server/wm/WindowAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowAnimator.java
@@ -530,7 +530,7 @@
         for (int i = windows.size() - 1; i >= 0; i--) {
             final WindowState win = windows.get(i);
             WindowStateAnimator winAnimator = win.mWinAnimator;
-            if (winAnimator.mSurfaceController == null) {
+            if (winAnimator.mSurfaceController == null || !winAnimator.hasSurface()) {
                 continue;
             }
 
