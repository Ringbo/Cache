diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
index 4a2ec88..938e76a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java
@@ -127,7 +127,7 @@
     public boolean getSensorsWakeUpFully() {
         return ALWAYS_ON_AVAILABLE
                 && Settings.Secure.getIntForUser(mContext.getContentResolver(),
-                DOZE_SENSORS_WAKE_UP_FULLY, 1, UserHandle.USER_CURRENT) != 0;
+                DOZE_SENSORS_WAKE_UP_FULLY, 0, UserHandle.USER_CURRENT) != 0;
     }
 
     private boolean getBoolean(String propName, int resId) {
