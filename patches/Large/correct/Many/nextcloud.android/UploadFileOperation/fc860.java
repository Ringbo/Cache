diff --git a/src/com/owncloud/android/operations/UploadFileOperation.java b/src/com/owncloud/android/operations/UploadFileOperation.java
index 7e00146..fde5866 100644
--- a/src/com/owncloud/android/operations/UploadFileOperation.java
+++ b/src/com/owncloud/android/operations/UploadFileOperation.java
@@ -368,7 +368,7 @@
             if ( mChunked &&
                     (new File(mFile.getStoragePath())).length() >
                             ChunkedUploadRemoteFileOperation.CHUNK_SIZE ) {
-                mUploadOperation = new ChunkedUploadRemoteFileOperation(mFile.getStoragePath(),
+                mUploadOperation = new ChunkedUploadRemoteFileOperation(mContext, mFile.getStoragePath(),
                         mFile.getRemotePath(), mFile.getMimetype(), mFile.getEtagInConflict());
             } else {
                 mUploadOperation = new UploadRemoteFileOperation(mFile.getStoragePath(),
