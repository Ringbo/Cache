diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index eb100db..5acd701 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -1255,7 +1255,7 @@
                 }
             }
         }
-        DBDAttributeBinding metaColumn = model.getVisibleColumn(cell.col);
+        DBDAttributeBinding metaColumn = model.getColumn(cell.col);
         final int handlerFeatures = metaColumn.getValueHandler().getFeatures();
         if (handlerFeatures == DBDValueHandler.FEATURE_NONE) {
             return false;
@@ -2624,7 +2624,9 @@
             if (model.isRowDeleted(row)) {
                 return backgroundDeleted;
             }
-            if (model.isDirty() && model.isCellModified(new GridPos(col, row))) {
+            if (model.isDirty() && model.isCellModified(
+                new GridPos(model.getVisibleColumn(col).getAttributeIndex(), row)))
+            {
                 return backgroundModified;
             }
             return null;
