diff --git a/services/core/java/com/android/server/DeviceIdleController.java b/services/core/java/com/android/server/DeviceIdleController.java
index 4f1e335..6f697c4 100644
--- a/services/core/java/com/android/server/DeviceIdleController.java
+++ b/services/core/java/com/android/server/DeviceIdleController.java
@@ -2828,7 +2828,7 @@
                         becomeInactiveIfAppropriateLocked();
                         int curLightState = mLightState;
                         while (curLightState != LIGHT_STATE_IDLE) {
-                            stepIdleStateLocked("s:shell");
+                            stepLightIdleStateLocked("s:shell");
                             if (curLightState == mLightState) {
                                 pw.print("Unable to go light idle; stopped at ");
                                 pw.println(lightStateToString(mLightState));
