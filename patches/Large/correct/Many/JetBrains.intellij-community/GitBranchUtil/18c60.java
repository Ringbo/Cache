diff --git a/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java b/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
index ad6214f..299d3f7 100644
--- a/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
+++ b/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
@@ -316,7 +316,7 @@
   @Nullable
   public static GitRepository getRepositoryOrGuess(@NotNull Project project, @Nullable VirtualFile file) {
     if (project.isDisposed()) return null;
-    return DvcsUtil.guessRepositoryForFile(project, GitUtil.getRepositoryManager(project), GitVcs.getInstance(project), file,
+    return DvcsUtil.guessRepositoryForFile(project, GitUtil.getRepositoryManager(project), file,
                                            GitVcsSettings.getInstance(project).getRecentRootPath());
   }
 
