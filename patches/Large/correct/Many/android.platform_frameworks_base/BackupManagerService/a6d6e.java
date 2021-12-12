diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index 2d947a4..6021bdc 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -856,13 +856,15 @@
                     try {
                         String dirName = transport.transportDirName();
                         PerformBackupTask pbt = new PerformBackupTask(transport, dirName, queue,
-                                oldJournal, null, null, null, false, false /* nonIncremental */);
+                                oldJournal, null, null, Collections.<String>emptyList(), false,
+                                false /* nonIncremental */);
                         Message pbtMessage = obtainMessage(MSG_BACKUP_RESTORE_STEP, pbt);
                         sendMessage(pbtMessage);
                     } catch (Exception e) {
                         // unable to ask the transport its dir name -- transient failure, since
                         // the above check succeeded.  Try again next time.
-                        Slog.e(TAG, "Transport became unavailable attempting backup");
+                        Slog.e(TAG, "Transport became unavailable attempting backup"
+                                + " or error initializing backup task", e);
                         staged = false;
                     }
                 } else {
@@ -2657,7 +2659,7 @@
         File mStateDir;
         File mJournal;
         BackupState mCurrentState;
-        ArrayList<String> mPendingFullBackups;
+        List<String> mPendingFullBackups;
         IBackupObserver mObserver;
         IBackupManagerMonitor mMonitor;
 
@@ -2683,7 +2685,7 @@
 
         public PerformBackupTask(IBackupTransport transport, String dirName,
                 ArrayList<BackupRequest> queue, File journal, IBackupObserver observer,
-                IBackupManagerMonitor monitor, ArrayList<String> pendingFullBackups,
+                IBackupManagerMonitor monitor, List<String> pendingFullBackups,
                 boolean userInitiated, boolean nonIncremental) {
             mTransport = transport;
             mOriginalQueue = queue;
