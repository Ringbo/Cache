diff --git a/services/core/java/com/android/server/input/InputManagerService.java b/services/core/java/com/android/server/input/InputManagerService.java
index 9c567ac..81b579d 100644
--- a/services/core/java/com/android/server/input/InputManagerService.java
+++ b/services/core/java/com/android/server/input/InputManagerService.java
@@ -1387,7 +1387,7 @@
         }
 
         if ((switchMask & SW_CAMERA_LENS_COVER_BIT) != 0) {
-            final boolean lensCovered = ((switchValues & SW_CAMERA_LENS_COVER_BIT) == 0);
+            final boolean lensCovered = ((switchValues & SW_CAMERA_LENS_COVER_BIT) != 0);
             mWindowManagerCallbacks.notifyCameraLensCoverSwitchChanged(whenNanos, lensCovered);
         }
 
