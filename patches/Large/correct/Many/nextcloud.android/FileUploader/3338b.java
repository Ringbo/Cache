diff --git a/src/main/java/com/owncloud/android/files/services/FileUploader.java b/src/main/java/com/owncloud/android/files/services/FileUploader.java
index d16f1fd..a1035e2 100644
--- a/src/main/java/com/owncloud/android/files/services/FileUploader.java
+++ b/src/main/java/com/owncloud/android/files/services/FileUploader.java
@@ -1160,7 +1160,8 @@
         if (!uploadResult.isCancelled() &&
             !ResultCode.LOCAL_FILE_NOT_FOUND.equals(uploadResult.getCode()) &&
             !uploadResult.getCode().equals(ResultCode.DELAYED_FOR_WIFI) &&
-            !uploadResult.getCode().equals(ResultCode.DELAYED_FOR_CHARGING)) {
+            !uploadResult.getCode().equals(ResultCode.DELAYED_FOR_CHARGING) &&
+            !uploadResult.getCode().equals(ResultCode.LOCK_FAILED)    ) {
 
             int tickerId = (uploadResult.isSuccess()) ? R.string.uploader_upload_succeeded_ticker :
                     R.string.uploader_upload_failed_ticker;
