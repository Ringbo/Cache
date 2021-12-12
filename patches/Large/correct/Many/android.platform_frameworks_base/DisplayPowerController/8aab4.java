diff --git a/services/core/java/com/android/server/display/DisplayPowerController.java b/services/core/java/com/android/server/display/DisplayPowerController.java
index b82e7c6..c5bf6d8 100644
--- a/services/core/java/com/android/server/display/DisplayPowerController.java
+++ b/services/core/java/com/android/server/display/DisplayPowerController.java
@@ -839,11 +839,8 @@
         }
 
         // Apply manual brightness.
-        // Use the current brightness setting from the request, which is expected
-        // provide a nominal default value for the case where auto-brightness
-        // is not ready yet.
         if (brightness < 0) {
-            brightness = clampScreenBrightness(mLastUserSetScreenBrightness);
+            brightness = clampScreenBrightness(mCurrentScreenBrightnessSetting);
         }
 
 
