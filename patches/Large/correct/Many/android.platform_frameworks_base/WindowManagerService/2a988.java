diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index bd75a6c..41574ca 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9102,7 +9102,7 @@
                 // Ensure that apps that are mid-starting are also scheduled to have their
                 // starting windows removed after the animation is complete
                 if (wtoken.startingWindow != null && !wtoken.startingWindow.mExiting) {
-                    scheduleRemoveStartingWindow(wtoken);
+                    scheduleRemoveStartingWindowLocked(wtoken);
                 }
 
                 if (animLp != null) {
