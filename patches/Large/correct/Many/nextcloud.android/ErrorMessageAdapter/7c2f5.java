diff --git a/src/com/owncloud/android/utils/ErrorMessageAdapter.java b/src/com/owncloud/android/utils/ErrorMessageAdapter.java
index c5bda8c..7da60b9 100644
--- a/src/com/owncloud/android/utils/ErrorMessageAdapter.java
+++ b/src/com/owncloud/android/utils/ErrorMessageAdapter.java
@@ -62,7 +62,8 @@
                 if (result.getCode() == ResultCode.LOCAL_STORAGE_FULL
                         || result.getCode() == ResultCode.LOCAL_STORAGE_NOT_COPIED) {
                     message = String.format(res.getString(R.string.error__upload__local_file_not_copied), 
-                            ((UploadFileOperation) operation).getFileName());
+                            ((UploadFileOperation) operation).getFileName(), 
+                            res.getString(R.string.app_name));
                     
                 } else if (result.getCode() == ResultCode.QUOTA_EXCEEDED) {
                     message = res.getString(R.string.failed_upload_quota_exceeded_text);
