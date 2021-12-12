diff --git a/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java b/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
index 82b2c8c..8a35980 100644
--- a/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
+++ b/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
@@ -1023,7 +1023,7 @@
 
 		log.logDebug(toString(), Messages.getString("DimensionLookupDialog.Log.LookingAtConnection")+inf.toString()); //$NON-NLS-1$
 
-		DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+		DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 		std.setSelectedTable(wTable.getText());
 		String tableName = (String)std.open();
 		if (tableName != null)
