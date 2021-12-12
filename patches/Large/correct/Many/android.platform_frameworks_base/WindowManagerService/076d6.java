diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 5bd5e21..2caac7a 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -6003,9 +6003,9 @@
             return;
         }
 
-        if (!displayContent.isReady() || !mPolicy.isScreenOn()) {
-            // No need to freeze the screen before the display is ready, system is ready, or if
-            // the screen is off.
+        if (!displayContent.isReady() || !mPolicy.isScreenOn() || !okToAnimate()) {
+            // No need to freeze the screen before the display is ready,  if the screen is off,
+            // or we can't currently animate.
             return;
         }
 
