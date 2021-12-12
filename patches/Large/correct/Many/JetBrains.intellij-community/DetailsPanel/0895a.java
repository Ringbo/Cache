diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/DetailsPanel.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/DetailsPanel.java
index 85c21f1..f93b029 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/DetailsPanel.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/DetailsPanel.java
@@ -148,11 +148,11 @@
     }
 
     private static String getAuthorText(VcsFullCommitDetails commit) {
-      String authorText = commit.getAuthor().getName() + " at " + DateFormatUtil.formatDateTime(commit.getTime());
+      String authorText = commit.getAuthor().getName() + " at " + DateFormatUtil.formatDateTime(commit.getAuthorTime());
       if (!commit.getAuthor().equals(commit.getCommitter())) {
         String commitTime;
         if (commit.getAuthorTime() != commit.getTime()) {
-          commitTime = " at " + DateFormatUtil.formatDateTime(commit.getAuthorTime());
+          commitTime = " at " + DateFormatUtil.formatDateTime(commit.getTime());
         }
         else {
           commitTime = "";
