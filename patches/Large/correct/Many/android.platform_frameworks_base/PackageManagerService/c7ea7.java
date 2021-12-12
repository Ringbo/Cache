diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index e62b107..58a4e5b 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -19364,7 +19364,7 @@
         synchronized (mPackages) {
             final PackageSetting ps = mSettings.mPackages.get(packageName);
             if (ps == null || filterAppAccessLPr(ps, Binder.getCallingUid(), userId)) {
-                return true;
+                return false;
             }
             return mSettings.getBlockUninstallLPr(userId, packageName);
         }
