diff --git a/core/java/android/app/backup/BackupManager.java b/core/java/android/app/backup/BackupManager.java
index debc32b..30f340c 100644
--- a/core/java/android/app/backup/BackupManager.java
+++ b/core/java/android/app/backup/BackupManager.java
@@ -387,7 +387,7 @@
     @SystemApi
     @RequiresPermission(android.Manifest.permission.BACKUP)
     public boolean isBackupServiceActive(UserHandle user) {
-        mContext.enforceCallingPermission(android.Manifest.permission.BACKUP,
+        mContext.enforceCallingOrSelfPermission(android.Manifest.permission.BACKUP,
                 "isBackupServiceActive");
         checkServiceBinder();
         if (sService != null) {
