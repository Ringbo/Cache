diff --git a/src/be/ibridge/kettle/trans/step/insertupdate/InsertUpdateDialog.java b/src/be/ibridge/kettle/trans/step/insertupdate/InsertUpdateDialog.java
index 0888f22..49f7263 100644
--- a/src/be/ibridge/kettle/trans/step/insertupdate/InsertUpdateDialog.java
+++ b/src/be/ibridge/kettle/trans/step/insertupdate/InsertUpdateDialog.java
@@ -508,7 +508,7 @@
 		{
 			log.logDebug(toString(), Messages.getString("InsertUpdateDialog.Log.LookingAtConnection") + inf.toString()); //$NON-NLS-1$
 
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String) std.open();
 			if (tableName != null)
