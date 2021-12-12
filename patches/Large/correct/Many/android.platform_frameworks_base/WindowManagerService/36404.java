diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 32bb78e..2942278 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9883,7 +9883,7 @@
                             }
                         }
 
-                        winAnimator.setSurfaceBoundariesLocked(recoveringMemory);
+                        winAnimator.prepareSurfaceLocked(recoveringMemory);
 
                         final AppWindowToken atoken = w.mAppToken;
                         if (DEBUG_STARTING_WINDOW && atoken != null
