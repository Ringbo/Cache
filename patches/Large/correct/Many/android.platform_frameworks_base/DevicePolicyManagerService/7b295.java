diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index 60c3a35..0252ea4 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -769,7 +769,7 @@
                 out.attribute(null, ATTR_VALUE, Boolean.toString(disableContactsSearch));
                 out.endTag(null, TAG_DISABLE_CONTACTS_SEARCH);
             }
-            if (disableBluetoothContactSharing) {
+            if (!disableBluetoothContactSharing) {
                 out.startTag(null, TAG_DISABLE_BLUETOOTH_CONTACT_SHARING);
                 out.attribute(null, ATTR_VALUE,
                         Boolean.toString(disableBluetoothContactSharing));
