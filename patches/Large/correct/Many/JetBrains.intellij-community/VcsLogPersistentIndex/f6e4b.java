diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPersistentIndex.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPersistentIndex.java
index a7a37fa..ea9ceec 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPersistentIndex.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPersistentIndex.java
@@ -618,7 +618,7 @@
     private void checkRunningTooLong(@NotNull ProgressIndicator indicator) {
       long time = myIndexingTime.get(myRoot).get() + (getCurrentTimeMillis() - myStartTime);
       int limit = myIndexingLimit.get(myRoot).get();
-      if (time >= Math.max(limit, 1) * 60 * 1000 && !myBigRepositoriesList.isBig(myRoot)) {
+      if (time >= Math.max(limit, 1L) * 60 * 1000 && !myBigRepositoriesList.isBig(myRoot)) {
         LOG.warn("Indexing " + myRoot.getName() + " was cancelled after " + StopWatch.formatTime(time));
         myBigRepositoriesList.addRepository(myRoot);
         indicator.cancel();
