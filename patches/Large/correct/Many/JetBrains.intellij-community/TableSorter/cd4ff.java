diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/telemetry/TableSorter.java b/plugins/InspectionGadgets/src/com/siyeh/ig/telemetry/TableSorter.java
index bf100c4..07ac3cb 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/telemetry/TableSorter.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/telemetry/TableSorter.java
@@ -246,7 +246,8 @@
     }
 
     private Row[] getViewToModel() {
-        if (viewToModel == null) {
+        if (viewToModel == null ||
+                viewToModel.length != tableModel.getRowCount()) {
             final int tableModelRowCount = tableModel.getRowCount();
             viewToModel = new Row[tableModelRowCount];
             for (int row = 0; row < tableModelRowCount; row++) {
