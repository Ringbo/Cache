diff --git a/services/core/java/com/android/server/display/DisplayPowerController.java b/services/core/java/com/android/server/display/DisplayPowerController.java
index dfd4254..120c96c 100644
--- a/services/core/java/com/android/server/display/DisplayPowerController.java
+++ b/services/core/java/com/android/server/display/DisplayPowerController.java
@@ -686,8 +686,10 @@
         }
 
         // Apply dimming by at least some minimum amount when user activity
-        // timeout is about to expire.
-        if (mPowerRequest.policy == DisplayPowerRequest.POLICY_DIM) {
+        // timeout is about to expire unless we're having an ALS-based doze brightness
+        // in which case the brightness could increase, causing unwanted flashes.
+        if (mPowerRequest.policy == DisplayPowerRequest.POLICY_DIM
+                && !mAllowAutoBrightnessWhileDozingConfig) {
             if (brightness > mScreenBrightnessRangeMinimum) {
                 brightness = Math.max(Math.min(brightness - SCREEN_DIM_MINIMUM_REDUCTION,
                         mScreenBrightnessDimConfig), mScreenBrightnessRangeMinimum);
