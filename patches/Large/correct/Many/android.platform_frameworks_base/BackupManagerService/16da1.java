diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index 29d562b..92d3d39 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -1315,7 +1315,7 @@
         mRunBackupIntent = PendingIntent.getBroadcast(context, MSG_RUN_BACKUP, backupIntent, 0);
 
         Intent initIntent = new Intent(RUN_INITIALIZE_ACTION);
-        backupIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
+        initIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
         mRunInitIntent = PendingIntent.getBroadcast(context, 0, initIntent, 0);
 
         // Set up the backup-request journaling
