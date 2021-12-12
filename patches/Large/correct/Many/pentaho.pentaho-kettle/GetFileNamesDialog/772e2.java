diff --git a/src/be/ibridge/kettle/trans/step/getfilenames/GetFileNamesDialog.java b/src/be/ibridge/kettle/trans/step/getfilenames/GetFileNamesDialog.java
index 8227642..cffced1 100644
--- a/src/be/ibridge/kettle/trans/step/getfilenames/GetFileNamesDialog.java
+++ b/src/be/ibridge/kettle/trans/step/getfilenames/GetFileNamesDialog.java
@@ -399,7 +399,7 @@
 					String files[] = tfii.getFilePaths();
 					if (files!=null && files.length>0)
 					{
-						EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, "Files read", "Files read:");
+						EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, "Files read", "Files read:");
 						esd.setViewOnly();
 						esd.open();
 					}
