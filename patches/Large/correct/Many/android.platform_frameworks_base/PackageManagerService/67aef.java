diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 256fb42..8c4ac11 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -6691,7 +6691,9 @@
             return result;
         }
         final PackageSetting ps = mSettings.mPackages.get(mInstantAppInstallerActivity.packageName);
-        if (ps == null) {
+        if (ps == null
+                || ps.getUserState().get(userId) == null
+                || !ps.getUserState().get(userId).isEnabled(mInstantAppInstallerActivity, 0)) {
             return result;
         }
         final ResolveInfo ephemeralInstaller = new ResolveInfo(mInstantAppInstallerInfo);
