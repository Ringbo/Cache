diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 1bb5ad0..53689ab 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -10185,7 +10185,7 @@
     public void setReplacingWindow(IBinder token, boolean animate) {
         synchronized (mWindowMap) {
             AppWindowToken appWindowToken = findAppWindowToken(token);
-            if (appWindowToken == null) {
+            if (appWindowToken == null || !appWindowToken.isVisible()) {
                 Slog.w(TAG, "Attempted to set replacing window on non-existing app token " + token);
                 return;
             }
