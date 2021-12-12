diff --git a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
index 8678d9a..453f123 100644
--- a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
@@ -440,7 +440,7 @@
                     getDefaultSystemHandlerActivityPackageLPr(deviceProvisionIntent, userId);
             if (deviceProvisionPackage != null
                     && doesPackageSupportRuntimePermissions(deviceProvisionPackage)) {
-                grantRuntimePermissionsLPw(contactsPackage, ACCOUNTS_PERMISSIONS, userId);
+                grantRuntimePermissionsLPw(deviceProvisionPackage, ACCOUNTS_PERMISSIONS, userId);
             }
 
             // Maps
