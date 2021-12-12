diff --git a/src/be/ibridge/kettle/core/dialog/DatabaseDialog.java b/src/be/ibridge/kettle/core/dialog/DatabaseDialog.java
index 9513520..8759c9a 100644
--- a/src/be/ibridge/kettle/core/dialog/DatabaseDialog.java
+++ b/src/be/ibridge/kettle/core/dialog/DatabaseDialog.java
@@ -1298,7 +1298,7 @@
 		try
 		{
 			getInfo(dbinfo);
-			DatabaseExplorerDialog ded = new DatabaseExplorerDialog(shell, props, SWT.NONE, dbinfo, databases, true );
+			DatabaseExplorerDialog ded = new DatabaseExplorerDialog(shell, SWT.NONE, dbinfo, databases, true );
 			ded.open();
 		}
 		catch(KettleException e)
