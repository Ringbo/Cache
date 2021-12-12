diff --git a/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputDialog.java b/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputDialog.java
index ef46d1c..55ebb85 100644
--- a/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputDialog.java
@@ -356,7 +356,7 @@
 					String files[] = tfoi.getFiles();
 					if (files!=null && files.length>0)
 					{
-						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, Messages.getString("XMLOutputDialog.OutputFiles.DialogTitle"), Messages.getString("XMLOutputDialog.OutputFiles.DialogMessage"));
+						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, Messages.getString("XMLOutputDialog.OutputFiles.DialogTitle"), Messages.getString("XMLOutputDialog.OutputFiles.DialogMessage"));
 						esd.setViewOnly();
 						esd.open();
 					}
