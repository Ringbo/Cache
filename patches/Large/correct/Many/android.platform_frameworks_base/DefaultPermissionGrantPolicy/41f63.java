diff --git a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
index ff097e5..751bae9 100644
--- a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
@@ -381,8 +381,8 @@
             // Device provisioning
             Intent deviceProvisionIntent = new Intent(
                     DevicePolicyManager.ACTION_PROVISION_MANAGED_DEVICE);
-            PackageParser.Package deviceProvisionPackage = getDefaultSystemHandlerActvityPackageLPr(
-                    deviceProvisionIntent, userId);
+            PackageParser.Package deviceProvisionPackage =
+                    getDefaultSystemHandlerActivityPackageLPr(deviceProvisionIntent, userId);
             if (deviceProvisionPackage != null
                     && doesPackageSupportRuntimePermissions(deviceProvisionPackage)) {
                 grantRuntimePermissionsLPw(contactsPackage, ACCOUNTS_PERMISSIONS, userId);
