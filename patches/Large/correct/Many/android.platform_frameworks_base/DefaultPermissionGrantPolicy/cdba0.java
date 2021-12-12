diff --git a/services/core/java/com/android/server/pm/permission/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/permission/DefaultPermissionGrantPolicy.java
index c40d1fa..01f3c57 100644
--- a/services/core/java/com/android/server/pm/permission/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/permission/DefaultPermissionGrantPolicy.java
@@ -640,9 +640,9 @@
             if (globalSearchPickerPackage != null
                     && doesPackageSupportRuntimePermissions(globalSearchPickerPackage)) {
                 grantRuntimePermissions(globalSearchPickerPackage,
-                    MICROPHONE_PERMISSIONS, true, userId);
+                    MICROPHONE_PERMISSIONS, false, userId);
                 grantRuntimePermissions(globalSearchPickerPackage,
-                    LOCATION_PERMISSIONS, true, userId);
+                    LOCATION_PERMISSIONS, false, userId);
             }
         }
 
