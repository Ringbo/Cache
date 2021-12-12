diff --git a/src/be/ibridge/kettle/trans/step/systemdata/SystemDataDialog.java b/src/be/ibridge/kettle/trans/step/systemdata/SystemDataDialog.java
index 6652c4a..468ca28 100644
--- a/src/be/ibridge/kettle/trans/step/systemdata/SystemDataDialog.java
+++ b/src/be/ibridge/kettle/trans/step/systemdata/SystemDataDialog.java
@@ -136,7 +136,7 @@
 	        {
 	            public void widgetSelected(SelectionEvent e)
 	            {
-	                EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, functionDesc, Messages.getString("SystemDataDialog.SelectInfoType.DialogTitle"), Messages.getString("SystemDataDialog.SelectInfoType.DialogMessage"));
+	                EnterSelectionDialog esd = new EnterSelectionDialog(shell, functionDesc, Messages.getString("SystemDataDialog.SelectInfoType.DialogTitle"), Messages.getString("SystemDataDialog.SelectInfoType.DialogMessage"));
 	                String string = esd.open();
 	                if (string!=null)
 	                {
