diff --git a/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesDialog.java b/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesDialog.java
index 4618ec8..ad8aeff 100644
--- a/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesDialog.java
+++ b/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesDialog.java
@@ -114,7 +114,7 @@
     String firstBranch = forward ? currentBranch : myBranchName;
     String secondBranch = forward ? myBranchName : currentBranch;
     return String.format("<html>Commits that exist in <code><b>%s</b></code> but don't exist in <code><b>%s</b></code> (<code>git log %s..%s</code>):</html>",
-                         firstBranch, secondBranch, firstBranch, secondBranch);
+                         secondBranch, firstBranch, firstBranch, secondBranch);
   }
 
   /**
