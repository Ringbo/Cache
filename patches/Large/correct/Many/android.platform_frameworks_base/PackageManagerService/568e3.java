diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 8ce474a..994429b 100644
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -4108,7 +4108,7 @@
                     }
                 } else if (!isForwardLocked(pkg) && !isExternal(pkg)) {
                     // Update native library dir if it starts with /data/data
-                    if (nativeLibraryDir.getParent().startsWith(dataPathString)) {
+                    if (nativeLibraryDir.getPath().startsWith(dataPathString)) {
                         setInternalAppNativeLibraryPath(pkg, pkgSetting);
                         nativeLibraryDir = new File(pkg.applicationInfo.nativeLibraryDir);
                     }
