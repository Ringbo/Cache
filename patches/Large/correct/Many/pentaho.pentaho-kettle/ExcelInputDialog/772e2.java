diff --git a/src/be/ibridge/kettle/trans/step/excelinput/ExcelInputDialog.java b/src/be/ibridge/kettle/trans/step/excelinput/ExcelInputDialog.java
index a25c679..5aae344 100644
--- a/src/be/ibridge/kettle/trans/step/excelinput/ExcelInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/excelinput/ExcelInputDialog.java
@@ -927,7 +927,7 @@
 					String[] files = eii.getFilePaths();
 					if (files.length > 0)
 					{
-						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, Messages.getString("ExcelInputDialog.FilesRead.DialogTitle"), Messages.getString("ExcelInputDialog.FilesRead.DialogMessage"));
+						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, Messages.getString("ExcelInputDialog.FilesRead.DialogTitle"), Messages.getString("ExcelInputDialog.FilesRead.DialogMessage"));
 						esd.setViewOnly();
 						esd.open();
 					}
