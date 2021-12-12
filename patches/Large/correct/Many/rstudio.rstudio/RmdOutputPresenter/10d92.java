diff --git a/src/gwt/src/org/rstudio/studio/client/rmarkdown/ui/RmdOutputPresenter.java b/src/gwt/src/org/rstudio/studio/client/rmarkdown/ui/RmdOutputPresenter.java
index d7697b6..72b75ea 100644
--- a/src/gwt/src/org/rstudio/studio/client/rmarkdown/ui/RmdOutputPresenter.java
+++ b/src/gwt/src/org/rstudio/studio/client/rmarkdown/ui/RmdOutputPresenter.java
@@ -58,7 +58,7 @@
    @Handler
    public void onViewerPopout()
    {
-      globalDisplay_.openWindow(result_.getOutputFile());
+      globalDisplay_.showHtmlFile(result_.getOutputFile());
    }
 
    public void showOutput(RmdRenderResult result) 
