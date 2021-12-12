diff --git a/services/core/java/com/android/server/pm/Settings.java b/services/core/java/com/android/server/pm/Settings.java
index 393ebd6..4fd9fa7 100644
--- a/services/core/java/com/android/server/pm/Settings.java
+++ b/services/core/java/com/android/server/pm/Settings.java
@@ -271,7 +271,7 @@
         mSettingsFilename = new File(mSystemDir, "packages.xml");
         mBackupSettingsFilename = new File(mSystemDir, "packages-backup.xml");
         mPackageListFilename = new File(mSystemDir, "packages.list");
-        FileUtils.setPermissions(mPackageListFilename, 0660, SYSTEM_UID, PACKAGE_INFO_GID);
+        FileUtils.setPermissions(mPackageListFilename, 0640, SYSTEM_UID, PACKAGE_INFO_GID);
 
         // Deprecated: Needed for migration
         mStoppedPackagesFilename = new File(mSystemDir, "packages-stopped.xml");
@@ -1651,7 +1651,7 @@
             fstr = new FileOutputStream(writeTarget);
             str = new BufferedOutputStream(fstr);
             try {
-                FileUtils.setPermissions(fstr.getFD(), 0660, SYSTEM_UID, PACKAGE_INFO_GID);
+                FileUtils.setPermissions(fstr.getFD(), 0640, SYSTEM_UID, PACKAGE_INFO_GID);
 
                 StringBuilder sb = new StringBuilder();
                 for (final PackageSetting pkg : mPackages.values()) {
