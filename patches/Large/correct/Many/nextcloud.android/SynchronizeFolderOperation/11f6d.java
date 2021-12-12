diff --git a/src/com/owncloud/android/operations/SynchronizeFolderOperation.java b/src/com/owncloud/android/operations/SynchronizeFolderOperation.java
index 201f2e5..8b5a681 100644
--- a/src/com/owncloud/android/operations/SynchronizeFolderOperation.java
+++ b/src/com/owncloud/android/operations/SynchronizeFolderOperation.java
@@ -340,7 +340,7 @@
                 requestForDownloadFile(remoteFile);
             } else {
                 // Run new SyncFolderOperation for download children files recursively from a folder
-                RemoteOperation synchFolderOp =  new SyncFolderOperation( mContext,
+                SynchronizeFolderOperation synchFolderOp =  new SynchronizeFolderOperation( mContext,
                         remoteFile.getRemotePath(),
                         mAccount,
                         mCurrentSyncTime);
