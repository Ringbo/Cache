diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/querylog/QueryLogViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/querylog/QueryLogViewer.java
index 7e4e833..2d7ef38 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/querylog/QueryLogViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/querylog/QueryLogViewer.java
@@ -432,9 +432,9 @@
     public IStructuredSelection getSelection()
     {
         TableItem[] items = logTable.getSelection();
-        QMMObject[] data = new QMMObject[items.length];
+        QMMetaEvent[] data = new QMMetaEvent[items.length];
         for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
-            data[i] = (QMMObject)items[i].getData();
+            data[i] = (QMMetaEvent)items[i].getData();
         }
         return new StructuredSelection(data);
     }
