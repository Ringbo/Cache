diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index e54e215..7af60c5 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -4765,7 +4765,7 @@
                 final File externalMediaDir = Environment
                         .getExternalStorageAppMediaDirectory(mStats.packageName);
                 mStats.externalMediaSize = mContainerService
-                        .calculateDirectorySize(externalCacheDir.getPath());
+                        .calculateDirectorySize(externalMediaDir.getPath());
 
                 final File externalObbDir = Environment
                         .getExternalStorageAppObbDirectory(mStats.packageName);
