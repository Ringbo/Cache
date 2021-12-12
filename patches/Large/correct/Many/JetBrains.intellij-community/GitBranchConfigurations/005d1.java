diff --git a/plugins/git4idea/src/git4idea/checkout/branches/GitBranchConfigurations.java b/plugins/git4idea/src/git4idea/checkout/branches/GitBranchConfigurations.java
index ef2bc44..d566c6e 100644
--- a/plugins/git4idea/src/git4idea/checkout/branches/GitBranchConfigurations.java
+++ b/plugins/git4idea/src/git4idea/checkout/branches/GitBranchConfigurations.java
@@ -586,9 +586,9 @@
       if (LOG.isDebugEnabled()) {
         LOG.debug("describe HEAD failed for root: " + root.getPath());
       }
-      GitSimpleHandler h = new GitSimpleHandler(myProject, root, GitCommand.SHOW);
+      GitSimpleHandler h = new GitSimpleHandler(myProject, root, GitCommand.LOG);
       h.setNoSSH(true);
-      h.addParameters("--pretty=format:%H", "HEAD");
+      h.addParameters("-n1", "--pretty=format:%H", "HEAD");
       try {
         return h.run().trim();
       }
@@ -601,7 +601,7 @@
   /**
    * Detect possible configurations
    *
-   * @param roots
+   * @param roots the vcs roots used to detect configuraitons
    * @return a sorted list of branches
    * @throws VcsException if there is a problem with running git
    */
