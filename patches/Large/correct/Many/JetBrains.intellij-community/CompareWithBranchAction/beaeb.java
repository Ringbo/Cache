diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/CompareWithBranchAction.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/CompareWithBranchAction.java
index 3cd3357..35eb376 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/CompareWithBranchAction.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/CompareWithBranchAction.java
@@ -150,7 +150,7 @@
               SVNURL anchorURL = anchorEntry.getSVNURL();
               SVNRepository repository = vcs.createRepository(anchorURL.toString());
               SVNReporter reporter = new SVNReporter(info, info.getAnchor().getFile(info.getTargetName()), false, true, SVNDepth.INFINITY, 
-                                                     false, SVNDebugLog.getDefaultLog());
+                                                     false, false, SVNDebugLog.getDefaultLog());
               long rev = repository.getLatestRevision();
               SvnDiffEditor diffEditor = new SvnDiffEditor((target == null) ? myVirtualFile : myVirtualFile.getParent(),
                 vcs.createRepository((target == null) ? url.toString() : url.removePathTail().toString()), rev, true);
