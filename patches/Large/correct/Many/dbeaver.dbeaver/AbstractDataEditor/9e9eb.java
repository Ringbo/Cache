diff --git a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/AbstractDataEditor.java b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/AbstractDataEditor.java
index 0c85bac..a3ceb18 100644
--- a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/AbstractDataEditor.java
+++ b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/AbstractDataEditor.java
@@ -224,7 +224,7 @@
     public <T> T getAdapter(Class<T> adapter)
     {
         if (resultSetView != null) {
-            if (adapter == ResultSetViewer.class) {
+            if (adapter == IResultSetController.class || adapter == ResultSetViewer.class) {
                 return adapter.cast(resultSetView);
             }
             T res = resultSetView.getAdapter(adapter);
