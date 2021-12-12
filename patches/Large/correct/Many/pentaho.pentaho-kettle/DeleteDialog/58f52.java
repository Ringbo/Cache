diff --git a/src/be/ibridge/kettle/trans/step/delete/DeleteDialog.java b/src/be/ibridge/kettle/trans/step/delete/DeleteDialog.java
index 63930e9..d338db9 100644
--- a/src/be/ibridge/kettle/trans/step/delete/DeleteDialog.java
+++ b/src/be/ibridge/kettle/trans/step/delete/DeleteDialog.java
@@ -372,7 +372,7 @@
 		{
 			log.logDebug(toString(), Messages.getString("DeleteDialog.Log.LookingAtConnection")+inf.toString()); //$NON-NLS-1$
 		
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String)std.open();
 			if (tableName != null)
