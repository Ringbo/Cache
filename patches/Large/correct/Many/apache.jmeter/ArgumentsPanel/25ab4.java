diff --git a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
index 154264a..5920969 100644
--- a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
+++ b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
@@ -311,7 +311,7 @@
         cancelEditing();
 
         int rowSelected = table.getSelectedRow();
-        if (rowSelected < table.getRowCount()-1) {
+        if (rowSelected >=0 && rowSelected < table.getRowCount()-1) {
             tableModel.moveRow(rowSelected, rowSelected+1, rowSelected+1);
             table.setRowSelectionInterval(rowSelected+1, rowSelected+1);
         }
