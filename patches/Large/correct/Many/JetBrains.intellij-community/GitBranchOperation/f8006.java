diff --git a/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java b/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
index 7145c22..073e1d4 100644
--- a/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
+++ b/plugins/git4idea/src/git4idea/branch/GitBranchOperation.java
@@ -244,7 +244,7 @@
    */
   protected void updateRecentBranch(@Nullable String branchName) {
     if (branchName != null) {
-      ApplicationManager.getApplication().invokeLater(() -> {
+      ApplicationManager.getApplication().invokeAndWait(() -> {
         if (myProject.isDisposed()) return;
         myProject.getMessageBus().syncPublisher(BranchChangeListener.VCS_BRANCH_CHANGED).branchHasChanged(branchName);
       });
