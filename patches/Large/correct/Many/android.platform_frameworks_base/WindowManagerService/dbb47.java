diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 0170bb9..0932f15 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -6875,6 +6875,8 @@
         WindowState win = null;
         synchronized (mWindowMap) {
             win = windowForClientLocked(null, window, false);
+            // win shouldn't be null here, pass it down to startPositioningLocked
+            // to get warning if it's null.
             if (!startPositioningLocked(win, false /*resize*/, startX, startY)) {
                 return false;
             }
@@ -6889,7 +6891,7 @@
         WindowState win = null;
         synchronized (mWindowMap) {
             win = displayContent.findWindowForControlPoint(startX, startY);
-            if (!startPositioningLocked(win, true /*resize*/, startX, startY)) {
+            if (win == null || !startPositioningLocked(win, true /*resize*/, startX, startY)) {
                 return;
             }
         }
