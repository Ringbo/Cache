diff --git a/src/be/ibridge/kettle/trans/step/tableinput/TableInputDialog.java b/src/be/ibridge/kettle/trans/step/tableinput/TableInputDialog.java
index 324ebe7..d8aab32 100644
--- a/src/be/ibridge/kettle/trans/step/tableinput/TableInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/tableinput/TableInputDialog.java
@@ -386,7 +386,7 @@
 		DatabaseMeta inf = transMeta.findDatabase(wConnection.getText());
 		if (inf!=null)
 		{	
-			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, inf, transMeta.getDatabases());
+			DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, inf, transMeta.getDatabases());
 			String tableName = (String)std.open();
 			if (tableName != null)
 			{
