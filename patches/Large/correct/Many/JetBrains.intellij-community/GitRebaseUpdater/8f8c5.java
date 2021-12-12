diff --git a/plugins/git4idea/src/git4idea/update/GitRebaseUpdater.java b/plugins/git4idea/src/git4idea/update/GitRebaseUpdater.java
index 7210d98..32f0418 100644
--- a/plugins/git4idea/src/git4idea/update/GitRebaseUpdater.java
+++ b/plugins/git4idea/src/git4idea/update/GitRebaseUpdater.java
@@ -109,7 +109,7 @@
     } else if (untrackedWouldBeOverwrittenDetector.wasMessageDetected()) {
       LOG.info("handleRebaseFailure: untracked files would be overwritten by checkout");
       UntrackedFilesNotifier.notifyUntrackedFilesOverwrittenBy(myProject, ServiceManager.getService(myProject, PlatformFacade.class),
-                                                               untrackedWouldBeOverwrittenDetector.getFiles(), "rebase");
+                                                               untrackedWouldBeOverwrittenDetector.getFiles(), "rebase", null);
       return GitUpdateResult.ERROR;
     } else {
       LOG.info("handleRebaseFailure error " + pullHandler.errors());
