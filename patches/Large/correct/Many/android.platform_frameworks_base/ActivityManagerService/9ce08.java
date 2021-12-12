diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 36d3c4a..d9c40ec 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -11839,10 +11839,12 @@
             config.reqTouchScreen = mConfiguration.touchscreen;
             config.reqKeyboardType = mConfiguration.keyboard;
             config.reqNavigation = mConfiguration.navigation;
-            if (mConfiguration.navigation != Configuration.NAVIGATION_NONAV) {
+            if (mConfiguration.navigation == Configuration.NAVIGATION_DPAD
+                    || mConfiguration.navigation == Configuration.NAVIGATION_TRACKBALL) {
                 config.reqInputFeatures |= ConfigurationInfo.INPUT_FEATURE_FIVE_WAY_NAV;
             }
-            if (mConfiguration.keyboard != Configuration.KEYBOARD_UNDEFINED) {
+            if (mConfiguration.keyboard != Configuration.KEYBOARD_UNDEFINED
+                    && mConfiguration.keyboard != Configuration.KEYBOARD_NOKEYS) {
                 config.reqInputFeatures |= ConfigurationInfo.INPUT_FEATURE_HARD_KEYBOARD;
             }
         }
