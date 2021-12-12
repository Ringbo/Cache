diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index b1b026e..af2ad78 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -2204,7 +2204,7 @@
             if (mInputMethodWindow == win) {
                 setInputMethodWindowLocked(null);
             }
-            boolean stopped = win.mAppToken != null ? win.mAppToken.mAppStopped : false;
+            boolean stopped = win.mAppToken != null ? win.mAppToken.mAppStopped : true;
             // We set mDestroying=true so AppWindowToken#notifyAppStopped in-to destroy surfaces
             // will later actually destroy the surface if we do not do so here. Normally we leave
             // this to the exit animation.
