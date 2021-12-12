diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 0188e98..7fab5a6 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9889,7 +9889,7 @@
                             }
                         }
 
-                        winAnimator.prepareSurfaceLocked(recoveringMemory);
+                        winAnimator.setSurfaceBoundariesLocked(recoveringMemory);
 
                         final AppWindowToken atoken = w.mAppToken;
                         if (DEBUG_STARTING_WINDOW && atoken != null
