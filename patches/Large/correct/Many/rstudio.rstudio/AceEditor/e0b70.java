diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/AceEditor.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/AceEditor.java
index d0598ea..4859035 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/AceEditor.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/AceEditor.java
@@ -268,7 +268,7 @@
 
    private void indentPastedRange(Range range)
    {
-      if (!fileType_.canAutoIndent())
+      if (fileType_ == null || !fileType_.canAutoIndent())
          return;
 
       String firstLinePrefix = getSession().getTextRange(
