diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index 04f271d..d542673 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -7030,8 +7030,8 @@
                 if (pkgSetting.notLaunched) {
                     if (pkgSetting.installerPackageName != null) {
                         sendPackageBroadcast(Intent.ACTION_PACKAGE_FIRST_LAUNCH,
-                                pkgSetting.installerPackageName, null,
-                                pkgSetting.name, null);
+                                pkgSetting.name, null,
+                                pkgSetting.installerPackageName, null);
                     }
                     pkgSetting.notLaunched = false;
                 }
