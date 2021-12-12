diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
index 3c8b9a6..5e264c6 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
@@ -82,7 +82,7 @@
     {
         final Color shadowColor = viewer.getControl().getDisplay().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW);
 
-        final LabelProvider mainLabelProvider = (LabelProvider)viewer.getLabelProvider();
+        final ILabelProvider mainLabelProvider = (ILabelProvider) viewer.getLabelProvider();
         columnController = new ViewerColumnController("projectExplorer", viewer);
         columnController.addColumn("Name", "Resource name", SWT.LEFT, true, true, new TreeColumnViewerLabelProvider(new LabelProvider() {
             @Override
