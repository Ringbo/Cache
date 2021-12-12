diff --git a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
index ac7b763..d1aecb1 100644
--- a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
@@ -936,7 +936,7 @@
         // permissions if the version on the system image does not declare them.
         if (!isDefaultPhoneOrSms && pkg.isUpdatedSystemApp()) {
             PackageSetting sysPs = mService.mSettings.getDisabledSystemPkgLPr(pkg.packageName);
-            if (sysPs != null) {
+            if (sysPs != null && sysPs.pkg != null) {
                 if (sysPs.pkg.requestedPermissions.isEmpty()) {
                     return;
                 }
