diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
index 7b2e997..c3f8d97 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
@@ -125,7 +125,7 @@
     public boolean getSensorsWakeUpFully() {
         return mAmbientDisplayConfiguration.alwaysOnAvailable()
                 && Settings.Secure.getIntForUser(mContext.getContentResolver(),
-                DOZE_SENSORS_WAKE_UP_FULLY, 1, UserHandle.USER_CURRENT) != 0;
+                DOZE_SENSORS_WAKE_UP_FULLY, 0, UserHandle.USER_CURRENT) != 0;
     }
 
     private boolean getBoolean(String propName, int resId) {
