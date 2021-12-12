diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/urlcontent/UrlContentEditingTargetWidget.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/urlcontent/UrlContentEditingTargetWidget.java
index 8a56d66..e4d6b8b 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/urlcontent/UrlContentEditingTargetWidget.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/urlcontent/UrlContentEditingTargetWidget.java
@@ -30,7 +30,7 @@
    {
       commands_ = commands;
 
-      frame_ = new RStudioThemedFrame(url, true, "allow-same-origin", null, null, false);
+      frame_ = new RStudioThemedFrame(url, true, "allow-same-origin", null, null, false, true);
       frame_.setSize("100%", "100%");
 
       PanelWithToolbars panel = new PanelWithToolbars(createToolbar(),
