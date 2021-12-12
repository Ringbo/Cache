diff --git a/src/be/ibridge/kettle/trans/step/xmlinput/XMLInputDialog.java b/src/be/ibridge/kettle/trans/step/xmlinput/XMLInputDialog.java
index 6410e83..9b94b24 100644
--- a/src/be/ibridge/kettle/trans/step/xmlinput/XMLInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/xmlinput/XMLInputDialog.java
@@ -713,7 +713,7 @@
     					String files[] = tfii.getFiles();
     					if (files!=null && files.length>0)
     					{
-    						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, Messages.getString("XMLInputDialog.FilesReadSelection.DialogTitle"), Messages.getString("XMLInputDialog.FilesReadSelection.DialogMessage"));
+    						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, Messages.getString("XMLInputDialog.FilesReadSelection.DialogTitle"), Messages.getString("XMLInputDialog.FilesReadSelection.DialogMessage"));
     						esd.setViewOnly();
     						esd.open();
     					}
