diff --git a/src/be/ibridge/kettle/trans/step/exceloutput/ExcelOutputDialog.java b/src/be/ibridge/kettle/trans/step/exceloutput/ExcelOutputDialog.java
index a07b3a8..5b7ada7 100644
--- a/src/be/ibridge/kettle/trans/step/exceloutput/ExcelOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/exceloutput/ExcelOutputDialog.java
@@ -355,7 +355,7 @@
 					String files[] = tfoi.getFiles();
 					if (files!=null && files.length>0)
 					{
-						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, Messages.getString("ExcelOutputDialog.SelectOutputFiles.DialogTitle"), Messages.getString("ExcelOutputDialog.SelectOutputFiles.DialogMessage"));
+						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, Messages.getString("ExcelOutputDialog.SelectOutputFiles.DialogTitle"), Messages.getString("ExcelOutputDialog.SelectOutputFiles.DialogMessage"));
 						esd.setViewOnly();
 						esd.open();
 					}
