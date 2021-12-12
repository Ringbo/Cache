diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/valueviewer/ValueViewerPanel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/valueviewer/ValueViewerPanel.java
index 10f4165..24333b8 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/valueviewer/ValueViewerPanel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/valueviewer/ValueViewerPanel.java
@@ -95,7 +95,7 @@
                     true);
 
                 UIUtils.drawMessageOverControl(viewPlaceholder, e, "Select a cell to view/edit value", 0);
-                UIUtils.drawMessageOverControl(viewPlaceholder, e, "Press " + hidePanelCmd + " to hide this panel", 10);
+                UIUtils.drawMessageOverControl(viewPlaceholder, e, "Press " + hidePanelCmd + " to hide this panel", 20);
             }
         });
 
