diff --git a/core/java/android/app/backup/BackupManager.java b/core/java/android/app/backup/BackupManager.java
index ff62b7c..2268400 100644
--- a/core/java/android/app/backup/BackupManager.java
+++ b/core/java/android/app/backup/BackupManager.java
@@ -538,7 +538,7 @@
         @Override
         public void onResult(String currentPackage, int status) {
             mHandler.sendMessage(
-                mHandler.obtainMessage(MSG_FINISHED, status, 0, currentPackage));
+                mHandler.obtainMessage(MSG_RESULT, status, 0, currentPackage));
         }
 
         @Override
