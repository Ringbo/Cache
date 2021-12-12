diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 3cc425d..cb74ad4 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -1165,7 +1165,7 @@
     private int getPhoneTypeFromProperty(int phoneId) {
         String type = getTelephonyProperty(phoneId,
                 TelephonyProperties.CURRENT_ACTIVE_PHONE, null);
-        if (type == null || type.equals("")) {
+        if (type == null || type.isEmpty()) {
             return getPhoneTypeFromNetworkType(phoneId);
         }
         return Integer.parseInt(type);
@@ -1181,7 +1181,7 @@
         // use the system property for default network type.
         // This is a fail safe, and can only happen at first boot.
         String mode = getTelephonyProperty(phoneId, "ro.telephony.default_network", null);
-        if (mode != null) {
+        if (mode != null && !mode.isEmpty()) {
             return TelephonyManager.getPhoneType(Integer.parseInt(mode));
         }
         return TelephonyManager.PHONE_TYPE_NONE;
