diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 213f14b..f6e62f6 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -3888,7 +3888,7 @@
             return false;
         }
         WindowState startingWindow = ttoken.startingWindow;
-        if (startingWindow != null) {
+        if (startingWindow != null && ttoken.startingView != null) {
             // In this case, the starting icon has already been displayed, so start
             // letting windows get shown immediately without any more transitions.
             mSkipAppTransitionAnimation = true;
