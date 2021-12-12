diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/BrightnessController.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/BrightnessController.java
index 521467a..b794826 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/BrightnessController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/BrightnessController.java
@@ -80,7 +80,7 @@
         setMode(automatic ? Settings.System.SCREEN_BRIGHTNESS_MODE_AUTOMATIC
                 : Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);
         if (!automatic) {
-            final int val = value + value + MINIMUM_BACKLIGHT;
+            final int val = value + MINIMUM_BACKLIGHT;
             setBrightness(val);
             if (!tracking) {
                 AsyncTask.execute(new Runnable() {
