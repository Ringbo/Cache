diff --git a/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java b/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
index a0dbbc6..e915ceb 100644
--- a/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
+++ b/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
@@ -69,7 +69,7 @@
         setOKActionEnabled(false);
         break;
       }
-      if (r.remoteCommits != 0) {
+      if (r.remoteCommits != 0 && r.commits.size() != 0) {
         setErrorText(GitBundle.getString("push.active.error.behind"));
         setOKActionEnabled(false);
         break;
