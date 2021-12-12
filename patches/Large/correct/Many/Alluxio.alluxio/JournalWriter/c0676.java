diff --git a/core/server/src/main/java/alluxio/master/journal/JournalWriter.java b/core/server/src/main/java/alluxio/master/journal/JournalWriter.java
index a31b50b..628bc18 100644
--- a/core/server/src/main/java/alluxio/master/journal/JournalWriter.java
+++ b/core/server/src/main/java/alluxio/master/journal/JournalWriter.java
@@ -129,7 +129,7 @@
       mNextEntrySequenceNumber = latestSequenceNumber + 1;
       LOG.info("Latest journal sequence number: {} Next journal sequence number: {}",
           latestSequenceNumber, mNextEntrySequenceNumber);
-      UnderFileSystemUtils.deleteIfExists(mUfs, mTempCheckpointPath);
+      UnderFileSystemUtils.deleteFileIfExists(mUfs, mTempCheckpointPath);
       mCheckpointOutputStream =
           new CheckpointOutputStream(new DataOutputStream(mUfs.create(mTempCheckpointPath)));
     }
