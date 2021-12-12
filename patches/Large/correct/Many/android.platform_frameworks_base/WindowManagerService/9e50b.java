diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 234b63f..f25f1e3 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -10195,7 +10195,7 @@
     public void setReplacingWindow(IBinder token, boolean animate) {
         synchronized (mWindowMap) {
             AppWindowToken appWindowToken = findAppWindowToken(token);
-            if (appWindowToken == null) {
+            if (appWindowToken == null || !appWindowToken.isVisible()) {
                 Slog.w(TAG, "Attempted to set replacing window on non-existing app token " + token);
                 return;
             }
