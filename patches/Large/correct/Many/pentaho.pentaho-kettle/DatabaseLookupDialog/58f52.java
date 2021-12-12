diff --git a/src/be/ibridge/kettle/trans/step/databaselookup/DatabaseLookupDialog.java b/src/be/ibridge/kettle/trans/step/databaselookup/DatabaseLookupDialog.java
index 6925002..e6e1310 100644
--- a/src/be/ibridge/kettle/trans/step/databaselookup/DatabaseLookupDialog.java
+++ b/src/be/ibridge/kettle/trans/step/databaselookup/DatabaseLookupDialog.java
@@ -558,7 +558,7 @@
 		{
 			log.logDebug(toString(), Messages.getString("DatabaseLookupDialog.Log.LookingAtConnection")+inf.toString()); //$NON-NLS-1$
 		
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String)std.open();
 			if (tableName != null)
