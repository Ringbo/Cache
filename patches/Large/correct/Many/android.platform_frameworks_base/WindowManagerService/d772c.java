diff --git a/services/java/com/android/server/wm/WindowManagerService.java b/services/java/com/android/server/wm/WindowManagerService.java
index b85573f..a3f2c3e 100755
--- a/services/java/com/android/server/wm/WindowManagerService.java
+++ b/services/java/com/android/server/wm/WindowManagerService.java
@@ -3237,7 +3237,7 @@
             if (delayed) {
                 a = new AlphaAnimation(1, 0);
                 a.setStartOffset(0);
-                a.setDuration(delayDuration - 50);
+                a.setDuration(delayDuration - 120);
                 a.setBackgroundColor(0xFF000000);
             } else {
                 a = createExitAnimationLocked(transit, duration);
