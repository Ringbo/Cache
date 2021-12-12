diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index fa76a4d..ad720dc 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -648,7 +648,7 @@
                     try {
                         f = file.startWrite();
                         BufferedOutputStream out = new BufferedOutputStream(f);
-                        FileUtils.setPermissions(file.getBaseFile().getPath(), 0660, SYSTEM_UID, PACKAGE_INFO_GID);
+                        FileUtils.setPermissions(file.getBaseFile().getPath(), 0640, SYSTEM_UID, PACKAGE_INFO_GID);
                         StringBuilder sb = new StringBuilder();
                         for (PackageParser.Package pkg : mPackages.values()) {
                             if (pkg.mLastPackageUsageTimeInMills == 0) {
