diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index f7b81cb..d389a96 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -3881,7 +3881,7 @@
             return false;
         }
         WindowState startingWindow = ttoken.startingWindow;
-        if (startingWindow != null) {
+        if (startingWindow != null && ttoken.startingView != null) {
             // In this case, the starting icon has already been displayed, so start
             // letting windows get shown immediately without any more transitions.
             mSkipAppTransitionAnimation = true;
