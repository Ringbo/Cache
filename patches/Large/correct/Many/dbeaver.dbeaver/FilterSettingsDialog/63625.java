diff --git a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/FilterSettingsDialog.java b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/FilterSettingsDialog.java
index 1bfb665..ac4b21f 100644
--- a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/FilterSettingsDialog.java
+++ b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/FilterSettingsDialog.java
@@ -115,7 +115,7 @@
             FilteredTree filteredTree = new FilteredTree(columnsGroup, SWT.SINGLE | SWT.FULL_SELECTION | SWT.CHECK, new PatternFilter(), true) {
                 @Override
                 protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
-                    columnsViewer = new CheckboxTreeViewer(columnsGroup, style);
+                    columnsViewer = new CheckboxTreeViewer(parent, style);
                     return columnsViewer;
                 }
             };
@@ -143,7 +143,6 @@
             final Tree columnsTree = columnsViewer.getTree();
             GridData gd = new GridData(GridData.FILL_BOTH);
             gd.heightHint = 300;
-            //gd.heightHint = 300;
             columnsTree.setLayoutData(gd);
             columnsTree.setHeaderVisible(true);
             columnsTree.setLinesVisible(true);
