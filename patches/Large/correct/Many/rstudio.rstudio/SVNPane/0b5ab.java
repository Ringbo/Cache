diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/svn/SVNPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/svn/SVNPane.java
index 806db77..81a04c3 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/svn/SVNPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/svn/SVNPane.java
@@ -51,7 +51,7 @@
             (ClickHandler)null);
       revertFilesButton_ = new ToolbarButton(
             "Revert",
-            commands_.vcsRevertFiles().getImageResource(),
+            commands_.vcsRevert().getImageResource(),
             (ClickHandler)null);
       updateButton_ = new ToolbarButton(
             "Update",
