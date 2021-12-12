diff --git a/src/be/ibridge/kettle/trans/step/accessoutput/AccessOutputDialog.java b/src/be/ibridge/kettle/trans/step/accessoutput/AccessOutputDialog.java
index 2f4dc89..e4a44d2 100644
--- a/src/be/ibridge/kettle/trans/step/accessoutput/AccessOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/accessoutput/AccessOutputDialog.java
@@ -422,7 +422,7 @@
             database = Database.open(file);
             Set set= database.getTableNames();
             String[] tablenames = (String[]) set.toArray(new String[set.size()]);
-            EnterSelectionDialog dialog = new EnterSelectionDialog(shell, props, tablenames, Messages.getString("AccessOutputDialog.Dialog.SelectATable.Title"), Messages.getString("AccessOutputDialog.Dialog.SelectATable.Message"));
+            EnterSelectionDialog dialog = new EnterSelectionDialog(shell, tablenames, Messages.getString("AccessOutputDialog.Dialog.SelectATable.Title"), Messages.getString("AccessOutputDialog.Dialog.SelectATable.Message"));
             String tablename = dialog.open();
             if (tablename!=null)
             {
