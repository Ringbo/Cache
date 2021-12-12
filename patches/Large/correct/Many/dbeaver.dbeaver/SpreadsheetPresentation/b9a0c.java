diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
index a4d336b..4be069c 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
@@ -940,7 +940,7 @@
             constraint.setOrderDescending(false);
         }
 
-        if (!ResultSetUtils.isServerSideFiltering(controller) && !controller.isHasMoreData()) {
+        if (!ResultSetUtils.isServerSideFiltering(controller) || !controller.isHasMoreData()) {
             reorderLocally();
         } else {
             controller.refreshData(null);
