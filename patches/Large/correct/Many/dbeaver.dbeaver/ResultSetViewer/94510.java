diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index fd988e1..efef118 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -491,7 +491,7 @@
         } finally {
             if (changed) {
                 // Update combo
-                statusBar.setRedraw(false);
+                viewerPanel.setRedraw(false);
                 try {
                     boolean pVisible = activePresentationDescriptor != null;
                     ((RowData)presentationSwitchToolbar.getLayoutData()).exclude = !pVisible;
@@ -520,10 +520,10 @@
                             });
                         }
                     }
-                    statusBar.layout();
+                    viewerPanel.layout();
                 } finally {
                     // Enable redraw
-                    statusBar.setRedraw(true);
+                    viewerPanel.setRedraw(true);
                 }
             }
         }
