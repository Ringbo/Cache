diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index a2af38b..daffefe 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -1726,7 +1726,10 @@
 
     private void setDeviceOwnerSystemPropertyLocked() {
         // Device owner may still be provisioned, do not set the read-only system property yet.
-        if (mInjector.settingsGlobalGetInt(Settings.Global.DEVICE_PROVISIONED, 0) == 0) {
+        // Wear devices don't set device_provisioned until the device is paired, so allow
+        // device_owner property to be set without that.
+        if (!mIsWatch
+                && mInjector.settingsGlobalGetInt(Settings.Global.DEVICE_PROVISIONED, 0) == 0) {
             return;
         }
         // Still at the first stage of CryptKeeper double bounce, mOwners.hasDeviceOwner is
