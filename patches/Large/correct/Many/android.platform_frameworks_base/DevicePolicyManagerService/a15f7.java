diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index 4748c96..8385685 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -3494,7 +3494,7 @@
         final UserHandle caller = mInjector.binderGetCallingUserHandle();
         // If there is a profile owner, redirect to that; otherwise query the device owner.
         ComponentName aliasChooser = getProfileOwner(caller.getIdentifier());
-        if (aliasChooser == null && caller.isOwner()) {
+        if (aliasChooser == null && caller.isSystem()) {
             ActiveAdmin deviceOwnerAdmin = getDeviceOwnerAdminLocked();
             if (deviceOwnerAdmin != null) {
                 aliasChooser = deviceOwnerAdmin.info.getComponent();
