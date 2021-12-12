diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetWidget.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetWidget.java
index e95955c..a0c0edb 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetWidget.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetWidget.java
@@ -650,7 +650,7 @@
       
       sourceOnSave_.setVisible(canSourceOnSave);
       srcOnSaveLabel_.setVisible(canSourceOnSave);
-      if (fileType.isRd() || fileType.isJS() || canPreviewFromR)
+      if (fileType.isRd() || fileType.isJS() || canPreviewFromR || fileType.isSql() )
          srcOnSaveLabel_.setText(fileType.getPreviewButtonText() + " on Save");
       else
          srcOnSaveLabel_.setText("Source on Save");
