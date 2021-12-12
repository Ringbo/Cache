diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 4dab2bb..79130e4 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -1118,7 +1118,7 @@
     private int getPhoneTypeFromProperty(int phoneId) {
         String type = getTelephonyProperty(phoneId,
                 TelephonyProperties.CURRENT_ACTIVE_PHONE, null);
-        if (type == null || type.equals("")) {
+        if (type == null || type.isEmpty()) {
             return getPhoneTypeFromNetworkType(phoneId);
         }
         return Integer.parseInt(type);
@@ -1134,7 +1134,7 @@
         // use the system property for default network type.
         // This is a fail safe, and can only happen at first boot.
         String mode = getTelephonyProperty(phoneId, "ro.telephony.default_network", null);
-        if (mode != null) {
+        if (mode != null && !mode.isEmpty()) {
             return TelephonyManager.getPhoneType(Integer.parseInt(mode));
         }
         return TelephonyManager.PHONE_TYPE_NONE;
