diff --git a/services/java/com/android/server/power/DisplayPowerController.java b/services/java/com/android/server/power/DisplayPowerController.java
index 4abd8f5..317fec0 100644
--- a/services/java/com/android/server/power/DisplayPowerController.java
+++ b/services/java/com/android/server/power/DisplayPowerController.java
@@ -648,10 +648,10 @@
                 mUsingScreenAutoBrightness = false;
             }
             if (mPowerRequest.screenState == DisplayPowerRequest.SCREEN_STATE_DIM) {
-                // Dim slowly by at least some minimum amount.
+                // Dim quickly by at least some minimum amount.
                 target = Math.min(target - SCREEN_DIM_MINIMUM_REDUCTION,
                         mScreenBrightnessDimConfig);
-                slow = true;
+                slow = false;
             } else if (wasDim) {
                 // Brighten quickly.
                 slow = false;
