diff --git a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
index 0597e3b..47bd373 100644
--- a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
+++ b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
@@ -726,7 +726,7 @@
 		{
 			log.logDebug(toString(), Messages.getString("CombinationLookupDialog.Log.LookingAtConnection", inf.toString()));
 
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			std.setSelectedTable(wTable.getText());
 			String tableName = (String) std.open();
 			if (tableName != null)
