diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index d365759..d70fdd5 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9890,7 +9890,7 @@
                             }
                         }
 
-                        winAnimator.setSurfaceBoundariesLocked(recoveringMemory);
+                        winAnimator.prepareSurfaceLocked(recoveringMemory);
 
                         final AppWindowToken atoken = w.mAppToken;
                         if (DEBUG_STARTING_WINDOW && atoken != null
