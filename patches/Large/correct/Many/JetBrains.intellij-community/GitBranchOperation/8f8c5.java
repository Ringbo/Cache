diff --git a/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java b/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
index d991508..144ae43 100644
--- a/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
+++ b/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
@@ -334,7 +334,7 @@
 
   private void showUntrackedFilesNotification(@NotNull Collection<VirtualFile> untrackedFiles) {
     UntrackedFilesNotifier.notifyUntrackedFilesOverwrittenBy(myProject, ServiceManager.getService(myProject, PlatformFacade.class),
-                                                             untrackedFiles, getOperationName());
+                                                             untrackedFiles, getOperationName(), null);
   }
 
   private void showUntrackedFilesDialogWithRollback(@NotNull Collection<VirtualFile> untrackedFiles) {
