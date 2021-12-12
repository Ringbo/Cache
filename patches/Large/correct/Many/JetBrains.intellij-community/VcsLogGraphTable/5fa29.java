diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
index 52ac618..e9ec46e 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
@@ -338,7 +338,7 @@
     int[] selectedRows = getSelectedRows();
     for (int i = 0; i < Math.min(VcsLogUtil.MAX_SELECTED_COMMITS, selectedRows.length); i++) {
       int row = selectedRows[i];
-      for (int j = GraphTableModel.ROOT_COLUMN + 1; j < getModel().getRowCount(); j++) {
+      for (int j = GraphTableModel.ROOT_COLUMN + 1; j < getModel().getColumnCount(); j++) {
         sb.append(getModel().getValueAt(row, j).toString());
         if (j < getModel().getRowCount() - 1) sb.append(" ");
       }
