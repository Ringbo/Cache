diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index ba3a6f3..628ff40 100644
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
