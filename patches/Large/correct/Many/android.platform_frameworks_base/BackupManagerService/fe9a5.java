diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index 94bbc99..413746f 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -11139,7 +11139,7 @@
     }
 
     public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
 
         long identityToken = Binder.clearCallingIdentity();
         try {
