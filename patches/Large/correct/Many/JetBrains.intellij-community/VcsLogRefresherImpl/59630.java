diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
index 93875a6..c7845f8 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
@@ -79,7 +79,7 @@
     mySingleTaskController = new SingleTaskController<RefreshRequest, DataPack>(dataPackUpdater) {
       @Override
       protected void startNewBackgroundTask() {
-        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
+        UIUtil.invokeLaterIfNeeded(new Runnable() {
           @Override
           public void run() {
             ProgressManagerImpl.runProcessWithProgressAsynchronously(new MyRefreshTask(myDataPack));
