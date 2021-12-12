diff --git a/src/main/java/com/owncloud/android/operations/UploadFileOperation.java b/src/main/java/com/owncloud/android/operations/UploadFileOperation.java
index 80f9567..53a07d5 100644
--- a/src/main/java/com/owncloud/android/operations/UploadFileOperation.java
+++ b/src/main/java/com/owncloud/android/operations/UploadFileOperation.java
@@ -453,10 +453,10 @@
             if (mChunked &&
                     (size > ChunkedUploadRemoteFileOperation.CHUNK_SIZE)) {
                 mUploadOperation = new ChunkedUploadRemoteFileOperation(mContext, mFile.getStoragePath(),
-                        mFile.getRemotePath(), mFile.getMimetype(), mFile.getEtagInConflict(), timeStamp);
+                        mFile.getRemotePath(), mFile.getMimetype(), mFile.getEtagInConflict(), timeStamp, size);
             } else {
                 mUploadOperation = new UploadRemoteFileOperation(mFile.getStoragePath(),
-                        mFile.getRemotePath(), mFile.getMimetype(), mFile.getEtagInConflict(), timeStamp);
+                        mFile.getRemotePath(), mFile.getMimetype(), mFile.getEtagInConflict(), timeStamp, size);
             }
 
             Iterator<OnDatatransferProgressListener> listener = mDataTransferListeners.iterator();
