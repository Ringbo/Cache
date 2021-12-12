diff --git a/services/core/java/com/android/server/power/PowerManagerService.java b/services/core/java/com/android/server/power/PowerManagerService.java
index a8d19e9..1648e81 100644
--- a/services/core/java/com/android/server/power/PowerManagerService.java
+++ b/services/core/java/com/android/server/power/PowerManagerService.java
@@ -1940,7 +1940,8 @@
                         && mLastUserActivityTimeNoChangeLights >= mLastWakeTime) {
                     nextTimeout = mLastUserActivityTimeNoChangeLights + screenOffTimeout;
                     if (now < nextTimeout) {
-                        if (mDisplayPowerRequest.policy == DisplayPowerRequest.POLICY_BRIGHT) {
+                        if (mDisplayPowerRequest.policy == DisplayPowerRequest.POLICY_BRIGHT
+                                || mDisplayPowerRequest.policy == DisplayPowerRequest.POLICY_VR) {
                             mUserActivitySummary = USER_ACTIVITY_SCREEN_BRIGHT;
                         } else if (mDisplayPowerRequest.policy == DisplayPowerRequest.POLICY_DIM) {
                             mUserActivitySummary = USER_ACTIVITY_SCREEN_DIM;
