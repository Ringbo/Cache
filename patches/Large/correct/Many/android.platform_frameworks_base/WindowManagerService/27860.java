diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 8a73815..aa74b42 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -4312,7 +4312,7 @@
                 AppWindowToken ttoken = findAppWindowToken(transferFrom);
                 if (ttoken != null) {
                     WindowState startingWindow = ttoken.startingWindow;
-                    if (startingWindow != null) {
+                    if (startingWindow != null && ttoken.startingView != null) {
                         // In this case, the starting icon has already been displayed, so start
                         // letting windows get shown immediately without any more transitions.
                         mSkipAppTransitionAnimation = true;
