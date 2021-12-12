diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index 28d65c3..fb7581a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -3931,7 +3931,7 @@
     }
 
     private void vibrateForCameraGesture() {
-        mVibrator.vibrate(1000L);
+        mVibrator.vibrate(750L);
     }
 
     public void onScreenTurnedOn() {
