diff --git a/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesLogPanel.java b/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesLogPanel.java
index 4d7da63..5339c74 100644
--- a/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesLogPanel.java
+++ b/plugins/git4idea/src/git4idea/ui/branch/GitCompareBranchesLogPanel.java
@@ -53,7 +53,7 @@
 
   GitCompareBranchesLogPanel(@NotNull Project project, @NotNull String branchName, @NotNull String currentBranchName,
                                     @NotNull GitCommitCompareInfo compareInfo, @NotNull GitRepository initialRepo) {
-    super(new BorderLayout());
+    super(new BorderLayout(UIUtil.DEFAULT_HGAP, UIUtil.DEFAULT_VGAP));
     myProject = project;
     myBranchName = branchName;
     myCurrentBranchName = currentBranchName;
@@ -103,10 +103,10 @@
       }
     });
 
-    JPanel repoSelectorPanel = new JPanel(new BorderLayout(UIUtil.DEFAULT_VGAP, UIUtil.DEFAULT_HGAP));
+    JPanel repoSelectorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
     JBLabel label = new JBLabel("Repository: ");
     label.setLabelFor(repoSelectorPanel);
-    repoSelectorPanel.add(label, BorderLayout.WEST);
+    repoSelectorPanel.add(label);
     repoSelectorPanel.add(repoSelector);
 
     if (myCompareInfo.getRepositories().size() < 2) {
