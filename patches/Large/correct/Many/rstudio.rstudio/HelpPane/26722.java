diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/help/HelpPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/help/HelpPane.java
index ffc0eb2..115f909 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/help/HelpPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/help/HelpPane.java
@@ -105,7 +105,17 @@
    @Override 
    protected Widget createMainWidget()
    {
-      frame_ = new RStudioThemedFrame();
+      frame_ = new RStudioThemedFrame(
+         null,
+         ".rstudio-themes-flat.editor_dark h1,\n" +
+         ".rstudio-themes-flat.editor_dark h2,\n" +
+         ".rstudio-themes-flat.editor_dark h3,\n" +
+         ".rstudio-themes-flat.editor_dark h4 {\n" +
+         "  background: none;\n" +
+         "  color: white;\n" +
+         "}\n",
+         null,
+         false);
       frame_.setSize("100%", "100%");
       frame_.setStylePrimaryName("rstudio-HelpFrame");
       frame_.addStyleName("ace_editor_theme");
