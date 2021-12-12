diff --git a/services/core/java/com/android/server/pm/LauncherAppsService.java b/services/core/java/com/android/server/pm/LauncherAppsService.java
index ff6886c..b7cd318 100644
--- a/services/core/java/com/android/server/pm/LauncherAppsService.java
+++ b/services/core/java/com/android/server/pm/LauncherAppsService.java
@@ -194,9 +194,10 @@
         void verifyCallingPackage(String callingPackage) {
             int packageUid = -1;
             try {
-                packageUid = mPm.getPackageUid(callingPackage,
+                packageUid = mPm.getPackageUidAsUser(callingPackage,
                         PackageManager.MATCH_ENCRYPTION_AWARE_AND_UNAWARE
-                                | PackageManager.MATCH_UNINSTALLED_PACKAGES);
+                                | PackageManager.MATCH_UNINSTALLED_PACKAGES,
+                        UserHandle.getUserId(getCallingUid()));
             } catch (NameNotFoundException e) {
                 Log.e(TAG, "Package not found: " + callingPackage);
             }
