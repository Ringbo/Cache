diff --git a/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java b/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
index 416cc1f..e23f8ed 100644
--- a/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
+++ b/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
@@ -240,7 +240,8 @@
                                                           boolean local, boolean revertable) throws VcsException {
     GitSimpleHandler h = new GitSimpleHandler(project, root, GitCommand.SHOW);
     h.setSilent(true);
-    h.addParameters("--name-status", "--no-abbrev", "-M", "--pretty=format:" + COMMITTED_CHANGELIST_FORMAT, "--encoding=UTF-8",
+    h.addParameters("--name-status", "--first-parent", "--no-abbrev", "-M", "--pretty=format:" + COMMITTED_CHANGELIST_FORMAT,
+                    "--encoding=UTF-8",
                     revisionName, "--");
     String output = h.run();
     StringScanner s = new StringScanner(output);
