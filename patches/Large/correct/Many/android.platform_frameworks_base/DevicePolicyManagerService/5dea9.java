diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index 33225eb..3fa3b57 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -4970,7 +4970,7 @@
         Preconditions.checkNotNull(who, "ComponentName is null");
         // Allow setting this policy to true only if there is a split system user.
         if (forceEphemeralUsers && !mInjector.userManagerIsSplitSystemUser()) {
-            throw new IllegalArgumentException(
+            throw new UnsupportedOperationException(
                     "Cannot force ephemeral users on systems without split system user.");
         }
         boolean removeAllUsers = false;
