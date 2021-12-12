diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 48bbe58..44ea4f3 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -1070,7 +1070,7 @@
         initializeHdmiState();
 
         // Match current screen state.
-        if (mPowerManager.isScreenOn()) {
+        if (mPowerManager.isInteractive()) {
             wakingUp(null);
         } else {
             goingToSleep(WindowManagerPolicy.OFF_BECAUSE_OF_USER);
@@ -4077,7 +4077,7 @@
                                 telephonyService.silenceRinger();
                             } else if ((mIncallPowerBehavior
                                     & Settings.Secure.INCALL_POWER_BUTTON_BEHAVIOR_HANGUP) != 0
-                                    && telephonyService.isOffhook() && isScreenOn) {
+                                    && telephonyService.isOffhook() && interactive) {
                                 // Otherwise, if "Power button ends call" is enabled,
                                 // the Power button will hang up any current active call.
                                 hungUp = telephonyService.endCall();
