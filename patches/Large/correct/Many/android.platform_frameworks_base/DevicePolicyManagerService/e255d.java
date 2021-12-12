diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index cf45149..b82a126 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -2828,7 +2828,7 @@
             return null;
         }
         synchronized (this) {
-            if (mDeviceOwner != null) {
+            if (mDeviceOwner != null && mDeviceOwner.hasDeviceOwner()) {
                 return mDeviceOwner.getDeviceOwnerPackageName();
             }
         }
