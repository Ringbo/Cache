diff --git a/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java b/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
index 7d4f42b..0cef949 100644
--- a/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
+++ b/plugins/git4idea/src/git4idea/update/GitMergeUpdater.java
@@ -189,7 +189,7 @@
     try {
       GitSimpleHandler h = new GitSimpleHandler(myProject, myRoot, GitCommand.RESET);
       h.setNoSSH(true);
-      h.addParameters("-v", "--merge");
+      h.addParameters("--merge");
       h.run();
     } catch (VcsException e) {
       LOG.info("cancel git reset --merge", e);
