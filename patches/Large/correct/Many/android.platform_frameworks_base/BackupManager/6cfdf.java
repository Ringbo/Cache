diff --git a/core/java/android/app/backup/BackupManager.java b/core/java/android/app/backup/BackupManager.java
index c27eaa4f..81963b3 100644
--- a/core/java/android/app/backup/BackupManager.java
+++ b/core/java/android/app/backup/BackupManager.java
@@ -528,7 +528,7 @@
         @Override
         public void onResult(String currentPackage, int status) {
             mHandler.sendMessage(
-                mHandler.obtainMessage(MSG_FINISHED, status, 0, currentPackage));
+                mHandler.obtainMessage(MSG_RESULT, status, 0, currentPackage));
         }
 
         @Override
