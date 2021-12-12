diff --git a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
index c994d8b..0d6dc94 100644
--- a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
@@ -448,7 +448,7 @@
 					String files[] = tfoi.getFiles();
 					if (files!=null && files.length>0)
 					{
-						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, Messages.getString("TextFileOutputDialog.SelectOutputFiles.DialogTitle"), Messages.getString("TextFileOutputDialog.SelectOutputFiles.DialogMessage"));
+						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, Messages.getString("TextFileOutputDialog.SelectOutputFiles.DialogTitle"), Messages.getString("TextFileOutputDialog.SelectOutputFiles.DialogMessage"));
 						esd.setViewOnly();
 						esd.open();
 					}
