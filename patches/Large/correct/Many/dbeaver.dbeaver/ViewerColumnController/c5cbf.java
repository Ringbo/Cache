diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/ViewerColumnController.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/ViewerColumnController.java
index badc3aa..7010013 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/ViewerColumnController.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/ViewerColumnController.java
@@ -220,7 +220,7 @@
             }
             if (needRefresh && pack) {
                 viewer.refresh();
-                if (!isAllSized()) {
+                if (needRefresh || !isAllSized()) {
                     for (ColumnInfo columnInfo : getVisibleColumns()) {
                         if (columnInfo.column instanceof TreeColumn) {
                             ((TreeColumn) columnInfo.column).pack();
