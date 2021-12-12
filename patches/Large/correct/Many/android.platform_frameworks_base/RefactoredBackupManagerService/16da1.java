diff --git a/services/backup/java/com/android/server/backup/RefactoredBackupManagerService.java b/services/backup/java/com/android/server/backup/RefactoredBackupManagerService.java
index d118917..e8c5058 100644
--- a/services/backup/java/com/android/server/backup/RefactoredBackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/RefactoredBackupManagerService.java
@@ -750,7 +750,7 @@
         mRunBackupIntent = PendingIntent.getBroadcast(context, 0, backupIntent, 0);
 
         Intent initIntent = new Intent(RUN_INITIALIZE_ACTION);
-        backupIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
+        initIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
         mRunInitIntent = PendingIntent.getBroadcast(context, 0, initIntent, 0);
 
         // Set up the backup-request journaling
