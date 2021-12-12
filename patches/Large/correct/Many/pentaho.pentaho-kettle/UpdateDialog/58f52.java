diff --git a/src/be/ibridge/kettle/trans/step/update/UpdateDialog.java b/src/be/ibridge/kettle/trans/step/update/UpdateDialog.java
index f225b67..f498508 100644
--- a/src/be/ibridge/kettle/trans/step/update/UpdateDialog.java
+++ b/src/be/ibridge/kettle/trans/step/update/UpdateDialog.java
@@ -504,7 +504,7 @@
 		{
 			log.logDebug(toString(), Messages.getString("UpdateDialog.Log.LookingAtConnection")+inf.toString()); //$NON-NLS-1$
 		
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String)std.open();
 			if (tableName != null)
