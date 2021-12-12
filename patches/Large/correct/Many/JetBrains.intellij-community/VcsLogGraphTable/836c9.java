diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
index 1d34b97..ec87e49 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/table/VcsLogGraphTable.java
@@ -475,7 +475,7 @@
       int row = selectedRows[i];
       for (int j = ROOT_COLUMN + 1; j < getModel().getColumnCount(); j++) {
         sb.append(getModel().getValueAt(row, j).toString());
-        if (j < getModel().getRowCount() - 1) sb.append(" ");
+        if (j < getModel().getColumnCount() - 1) sb.append(" ");
       }
       if (i != selectedRows.length - 1) sb.append("\n");
     }
