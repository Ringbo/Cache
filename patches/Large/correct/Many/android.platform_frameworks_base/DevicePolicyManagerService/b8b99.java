diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index edbbc9f..e2cd4e2 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -1224,7 +1224,7 @@
             }
             for (Integer i : mDeviceOwner.getProfileOwnerKeys()) {
                 try {
-                    mAppOpsService.setProfileOwner(mDeviceOwner.getProfileOwnerName(i), i);
+                    mAppOpsService.setProfileOwner(mDeviceOwner.getProfileOwnerPackageName(i), i);
                 } catch (RemoteException e) {
                     Log.w(LOG_TAG, "Unable to notify AppOpsService of ProfileOwner", e);
                 }
