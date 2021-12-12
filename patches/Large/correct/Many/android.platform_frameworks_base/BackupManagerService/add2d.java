diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index 83367f3..782bf71 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -2357,7 +2357,7 @@
 
         // If the caller does not hold the BACKUP permission, it can only request a
         // wipe of its own backed-up data.
-        HashSet<String> apps;
+        Set<String> apps;
         if ((mContext.checkPermission(android.Manifest.permission.BACKUP, Binder.getCallingPid(),
                 Binder.getCallingUid())) == PackageManager.PERMISSION_DENIED) {
             apps = mBackupParticipants.get(Binder.getCallingUid());
@@ -2365,10 +2365,9 @@
             // a caller with full permission can ask to back up any participating app
             // !!! TODO: allow data-clear of ANY app?
             if (MORE_DEBUG) Slog.v(TAG, "Privileged caller, allowing clear of other apps");
-            apps = SparseArrayUtils.union(mBackupParticipants);
+            apps = mProcessedPackagesJournal.getPackagesCopy();
         }
 
-        // Is the given app an available participant?
         if (apps.contains(packageName)) {
             // found it; fire off the clear request
             if (MORE_DEBUG) Slog.v(TAG, "Found the app - running clear process");
