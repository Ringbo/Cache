diff --git a/src/gwt/src/org/rstudio/studio/client/rmarkdown/RmdOutput.java b/src/gwt/src/org/rstudio/studio/client/rmarkdown/RmdOutput.java
index 6fb10f0..f623b1b 100644
--- a/src/gwt/src/org/rstudio/studio/client/rmarkdown/RmdOutput.java
+++ b/src/gwt/src/org/rstudio/studio/client/rmarkdown/RmdOutput.java
@@ -154,7 +154,8 @@
       {
          displayHTMLRenderResult(result);
       }
-      else if (".md".equals(extension))
+      else if (".md".equals(extension) || 
+               extension.toLowerCase().startsWith(".markdown"))
       {
          ViewFilePanel viewFilePanel = pViewFilePanel_.get();
          viewFilePanel.showFile(
