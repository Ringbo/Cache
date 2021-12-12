diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index 2ad54cd..449ecde 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -1470,7 +1470,7 @@
                             }
 
                             model.setUpdateInProgress(false);
-                            if (dataFilter != null) {
+                            if (error == null && dataFilter != null) {
                                 model.updateDataFilter(dataFilter);
                                 activePresentation.refreshData(false, false);
                             }
