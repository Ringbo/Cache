diff --git a/services/core/java/com/android/server/display/DisplayPowerController.java b/services/core/java/com/android/server/display/DisplayPowerController.java
index 8f8afd5..3b514be 100644
--- a/services/core/java/com/android/server/display/DisplayPowerController.java
+++ b/services/core/java/com/android/server/display/DisplayPowerController.java
@@ -286,7 +286,7 @@
                     + mScreenBrightnessDarkConfig + ") to be less than or equal to "
                     + "config_screenBrightnessDim (" + mScreenBrightnessDimConfig + ").");
         }
-        if (mScreenBrightnessDarkConfig > mScreenBrightnessDimConfig) {
+        if (mScreenBrightnessDarkConfig > screenBrightnessSettingMinimum) {
             Slog.w(TAG, "Expected config_screenBrightnessDark ("
                     + mScreenBrightnessDarkConfig + ") to be less than or equal to "
                     + "config_screenBrightnessSettingMinimum ("
