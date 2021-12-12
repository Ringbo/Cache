diff --git a/core/server/src/main/java/alluxio/master/journal/CheckpointManager.java b/core/server/src/main/java/alluxio/master/journal/CheckpointManager.java
index 9004474..72df30b 100644
--- a/core/server/src/main/java/alluxio/master/journal/CheckpointManager.java
+++ b/core/server/src/main/java/alluxio/master/journal/CheckpointManager.java
@@ -102,7 +102,7 @@
       if (tempBackupCheckpointExists) {
         // If mCheckpointPath also exists, step 2 must have implemented rename as copy + delete, and
         // failed during the delete.
-        UnderFileSystemUtils.deleteFileIfExists(mUfs, mCheckpointPath);
+        UnderFileSystemUtils.deleteFileIfExists(mCheckpointPath);
         mUfs.rename(mTempBackupCheckpointPath, mCheckpointPath);
       }
       if (backupCheckpointExists) {
