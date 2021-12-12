diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index 12a79b8..4de769d 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -4640,7 +4640,7 @@
 
     private void vibrateForCameraGesture() {
         // Make sure to pass -1 for repeat so VibratorService doesn't stop us when going to sleep.
-        mVibrator.vibrate(new long[]{0, 750L}, -1 /* repeat */);
+        mVibrator.vibrate(new long[]{0, 400}, -1 /* repeat */);
     }
 
     public void onScreenTurnedOn() {
