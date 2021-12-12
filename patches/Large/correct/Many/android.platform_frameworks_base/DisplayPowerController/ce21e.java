diff --git a/services/core/java/com/android/server/display/DisplayPowerController.java b/services/core/java/com/android/server/display/DisplayPowerController.java
index dfd4254..d2e29cd 100644
--- a/services/core/java/com/android/server/display/DisplayPowerController.java
+++ b/services/core/java/com/android/server/display/DisplayPowerController.java
@@ -284,7 +284,7 @@
                     + mScreenBrightnessDarkConfig + ") to be less than or equal to "
                     + "config_screenBrightnessDim (" + mScreenBrightnessDimConfig + ").");
         }
-        if (mScreenBrightnessDarkConfig > mScreenBrightnessDimConfig) {
+        if (mScreenBrightnessDarkConfig > screenBrightnessSettingMinimum) {
             Slog.w(TAG, "Expected config_screenBrightnessDark ("
                     + mScreenBrightnessDarkConfig + ") to be less than or equal to "
                     + "config_screenBrightnessSettingMinimum ("
