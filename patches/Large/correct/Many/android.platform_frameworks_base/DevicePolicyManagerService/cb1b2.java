diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index 9a75dc9..d218afc 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -1642,7 +1642,7 @@
         }
 
         if (!TextUtils.isEmpty(mInjector.systemPropertiesGet(PROPERTY_DEVICE_OWNER_PRESENT))) {
-            Slog.wtf(LOG_TAG, "Trying to set ro.device_owner, but it has already been set?");
+            Slog.w(LOG_TAG, "Trying to set ro.device_owner, but it has already been set?");
         } else {
             if (mOwners.hasDeviceOwner()) {
                 mInjector.systemPropertiesSet(PROPERTY_DEVICE_OWNER_PRESENT, "true");
