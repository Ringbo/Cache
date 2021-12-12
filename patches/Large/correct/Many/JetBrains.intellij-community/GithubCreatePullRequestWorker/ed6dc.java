diff --git a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
index 2d64681..07ed51b 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
@@ -586,7 +586,7 @@
     }
 
     GitCompareBranchesDialog dialog =
-      new GitCompareBranchesDialog(myProject, info.getTo(), info.getFrom(), info.getInfo(), myGitRepository);
+      new GitCompareBranchesDialog(myProject, info.getTo(), info.getFrom(), info.getInfo(), myGitRepository, true);
     dialog.show();
   }
 
