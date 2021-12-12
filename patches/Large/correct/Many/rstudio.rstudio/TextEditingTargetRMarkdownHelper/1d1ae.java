diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
index be05a43..4b28970 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
@@ -243,7 +243,7 @@
          @Override
          public void execute(CompileNotebookv2Options input)
          { 
-            renderNotebookv2(sourceDoc, input.getFormat());
+            renderNotebookv2(sourceDoc, null, input.getFormat());
             
             // save options for this document
             HashMap<String, String> changedProperties 
