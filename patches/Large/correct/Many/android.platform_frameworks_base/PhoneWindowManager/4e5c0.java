diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 740fe25..216f6a4 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -986,7 +986,7 @@
         initializeHdmiState();
 
         // Match current screen state.
-        if (mPowerManager.isScreenOn()) {
+        if (mPowerManager.isInteractive()) {
             screenTurningOn(null);
         } else {
             screenTurnedOff(WindowManagerPolicy.OFF_BECAUSE_OF_USER);
@@ -3973,7 +3973,7 @@
             case KeyEvent.KEYCODE_POWER: {
                 result &= ~ACTION_PASS_TO_USER;
                 if (down) {
-                    boolean panic = mImmersiveModeConfirmation.onPowerKeyDown(isScreenOn,
+                    boolean panic = mImmersiveModeConfirmation.onPowerKeyDown(interactive,
                             event.getDownTime(), isImmersiveMode(mLastSystemUiFlags));
                     if (panic) {
                         mHandler.post(mRequestTransientNav);
@@ -3995,7 +3995,7 @@
                                 telephonyService.silenceRinger();
                             } else if ((mIncallPowerBehavior
                                     & Settings.Secure.INCALL_POWER_BUTTON_BEHAVIOR_HANGUP) != 0
-                                    && telephonyService.isOffhook() && isScreenOn) {
+                                    && telephonyService.isOffhook() && interactive) {
                                 // Otherwise, if "Power button ends call" is enabled,
                                 // the Power button will hang up any current active call.
                                 hungUp = telephonyService.endCall();
