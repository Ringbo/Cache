diff --git a/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java b/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
index 13089c0..1c6a940 100644
--- a/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
+++ b/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
@@ -136,7 +136,7 @@
     else if (untrackedFilesWouldBeOverwrittenByMergeDetector.wasMessageDetected()) {
       LOG.info("handleMergeFailure: untracked files would be overwritten by merge");
       UntrackedFilesNotifier.notifyUntrackedFilesOverwrittenBy(myProject, ServiceManager.getService(myProject, PlatformFacade.class),
-                                                               untrackedFilesWouldBeOverwrittenByMergeDetector.getFiles(), "merge");
+                                                               untrackedFilesWouldBeOverwrittenByMergeDetector.getFiles(), "merge", null);
       return GitUpdateResult.ERROR;
     }
     else {
