diff --git a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
index d06851c..4888e06 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
@@ -313,7 +313,7 @@
                                                                                    ".");
       return false;
     }
-    if (info.getInfo().getHeadToBranchCommits(myGitRepository).isEmpty()) {
+    if (!info.getInfo().getHeadToBranchCommits(myGitRepository).isEmpty()) {
       return GithubNotifications
                .showYesNoDialog(myProject, "The branch" + targetBranch + " in not fully merged to the branch " + getCurrentBranch(),
                                 "Do you want to proceed anyway?") == Messages.YES;
