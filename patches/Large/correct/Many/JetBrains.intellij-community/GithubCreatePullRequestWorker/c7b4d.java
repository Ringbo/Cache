diff --git a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
index f5fe2e2..3fa9704 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/GithubCreatePullRequestWorker.java
@@ -405,7 +405,7 @@
         GithubUtil.runInterruptable(indicator, new Runnable() {
           @Override
           public void run() {
-            configureRemote(fork);
+            doConfigureRemote(fork);
           }
         });
       }
