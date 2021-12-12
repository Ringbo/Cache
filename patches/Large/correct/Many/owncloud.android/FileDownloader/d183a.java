diff --git a/src/com/owncloud/android/files/services/FileDownloader.java b/src/com/owncloud/android/files/services/FileDownloader.java
index 7e1d2b3..9219f3f 100644
--- a/src/com/owncloud/android/files/services/FileDownloader.java
+++ b/src/com/owncloud/android/files/services/FileDownloader.java
@@ -538,7 +538,7 @@
         file.setFileLength((new File(mCurrentDownload.getSavePath()).length()));
         file.setRemoteId(mCurrentDownload.getFile().getRemoteId());
         mStorageManager.saveFile(file);
-        FileDataStorageManager.triggerMediaScan(file.getStoragePath());
+        mStorageManager.triggerMediaScan(file.getStoragePath());
         mStorageManager.saveConflict(file, null);
     }
 
