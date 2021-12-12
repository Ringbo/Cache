diff --git a/src/be/ibridge/kettle/trans/step/tableoutput/TableOutputDialog.java b/src/be/ibridge/kettle/trans/step/tableoutput/TableOutputDialog.java
index 5d821df..cb53ac4 100644
--- a/src/be/ibridge/kettle/trans/step/tableoutput/TableOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/tableoutput/TableOutputDialog.java
@@ -737,7 +737,7 @@
 						
 			log.logDebug(toString(), Messages.getString("TableOutputDialog.Log.LookingAtConnection", inf.toString()));
 		
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String)std.open();
 			if (tableName != null)
