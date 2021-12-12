diff --git a/lucene/src/java/org/apache/lucene/index/IndexWriter.java b/lucene/src/java/org/apache/lucene/index/IndexWriter.java
index 07cb0f5..305676e 100644
--- a/lucene/src/java/org/apache/lucene/index/IndexWriter.java
+++ b/lucene/src/java/org/apache/lucene/index/IndexWriter.java
@@ -2552,7 +2552,7 @@
         lastCommitChangeCount = pendingCommitChangeCount;
         segmentInfos.updateGeneration(pendingCommit);
         segmentInfos.setUserData(pendingCommit.getUserData());
-        rollbackSegments = segmentInfos.createBackupSegmentInfos(true);
+        rollbackSegments = pendingCommit.createBackupSegmentInfos(true);
         deleter.checkpoint(pendingCommit, true);
       } finally {
         // Matches the incRef done in startCommit:
