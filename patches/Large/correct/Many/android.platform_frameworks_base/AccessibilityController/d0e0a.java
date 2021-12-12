diff --git a/services/core/java/com/android/server/wm/AccessibilityController.java b/services/core/java/com/android/server/wm/AccessibilityController.java
index e5e2175..66b1b3d 100644
--- a/services/core/java/com/android/server/wm/AccessibilityController.java
+++ b/services/core/java/com/android/server/wm/AccessibilityController.java
@@ -644,7 +644,7 @@
                 final int windowCount = windowList.size();
                 for (int i = 0; i < windowCount; i++) {
                     WindowState windowState = windowList.get(i);
-                    if (windowState.isOnScreen() &&
+                    if (windowState.isOnScreen() && windowState.isVisibleLw() &&
                             !windowState.mWinAnimator.mEnterAnimationPending) {
                         outWindows.put(windowState.mLayer, windowState);
                     }
