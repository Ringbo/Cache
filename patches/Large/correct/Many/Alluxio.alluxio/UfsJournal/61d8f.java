diff --git a/core/server/common/src/main/java/alluxio/master/journal/ufs/UfsJournal.java b/core/server/common/src/main/java/alluxio/master/journal/ufs/UfsJournal.java
index dd0ec94..4bd1cd3 100644
--- a/core/server/common/src/main/java/alluxio/master/journal/ufs/UfsJournal.java
+++ b/core/server/common/src/main/java/alluxio/master/journal/ufs/UfsJournal.java
@@ -363,7 +363,7 @@
         entry = journalReader.read();
       } catch (IOException e) {
         LOG.warn("{}: Failed to read from journal: {}", mMaster.getName(), e);
-        if (retry.attemptRetry()) {
+        if (retry.attempt()) {
           continue;
         }
         throw new RuntimeException(e);
