diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/GridColumn.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/GridColumn.java
index a86a4e2..04ef9d9 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/GridColumn.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/GridColumn.java
@@ -383,7 +383,7 @@
             int columnIndex = getIndex();
             int topIndex = parent.getTopIndex();
             int bottomIndex = parent.getBottomIndex();
-            if (topIndex >= 0 && bottomIndex > topIndex) {
+            if (topIndex >= 0 && bottomIndex >= topIndex) {
                 for (int i = topIndex; i <= bottomIndex; i++) {
                     newWidth = Math.max(newWidth, computeCellWidth(columnIndex, i));
                 }
