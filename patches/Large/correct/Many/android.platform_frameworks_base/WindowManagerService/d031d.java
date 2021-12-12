diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 707b137..2991e82 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -3790,7 +3790,11 @@
         Configuration config = null;
 
         if (updateOrientationFromAppTokensLocked(false)) {
-            if (freezeThisOneIfNeeded != null) {
+            // If we changed the orientation but mOrientationChangeComplete is
+            // already true, we used seamless rotation, and we don't need
+            // to freeze the screen.
+            if (freezeThisOneIfNeeded != null &&
+                    !mWindowPlacerLocked.mOrientationChangeComplete) {
                 AppWindowToken atoken = findAppWindowToken(freezeThisOneIfNeeded);
                 if (atoken != null) {
                     startAppFreezingScreenLocked(atoken);
