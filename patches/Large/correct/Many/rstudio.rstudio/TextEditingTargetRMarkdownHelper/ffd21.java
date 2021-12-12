diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
index 91a41dd..64790ae 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTargetRMarkdownHelper.java
@@ -243,7 +243,7 @@
          @Override
          public void execute(CompileNotebookv2Options input)
          { 
-            renderNotebookv2(sourceDoc, null, input.getFormat());
+            renderNotebookv2(sourceDoc, input.getFormat(), null);
             
             // save options for this document
             HashMap<String, String> changedProperties 
