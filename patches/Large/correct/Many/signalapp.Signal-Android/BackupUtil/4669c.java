diff --git a/src/org/thoughtcrime/securesms/util/BackupUtil.java b/src/org/thoughtcrime/securesms/util/BackupUtil.java
index 106f8a8..eb887ab 100644
--- a/src/org/thoughtcrime/securesms/util/BackupUtil.java
+++ b/src/org/thoughtcrime/securesms/util/BackupUtil.java
@@ -67,7 +67,7 @@
       File   backupDirectory = StorageUtil.getBackupDirectory(context);
       File[] backups         = backupDirectory.listFiles();
 
-      if (backups != null && backups.length > 5) {
+      if (backups != null && backups.length > 2) {
         Arrays.sort(backups, (left, right) -> {
           long leftTimestamp  = getBackupTimestamp(left);
           long rightTimestamp = getBackupTimestamp(right);
@@ -79,7 +79,7 @@
           return (int)(rightTimestamp - leftTimestamp);
         });
 
-        for (int i=5;i<backups.length;i++) {
+        for (int i=2;i<backups.length;i++) {
           Log.w(TAG, "Deleting: " + backups[i].getAbsolutePath());
 
           if (!backups[i].delete()) {
