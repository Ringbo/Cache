diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
index 040df45..cf07270 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
@@ -620,7 +620,7 @@
         String files[] = tfii.getFilePaths();
         if (files!=null && files.length>0)
         {
-            EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, files, "Files read", "Files read:");
+            EnterSelectionDialog esd = new EnterSelectionDialog(shell, files, "Files read", "Files read:");
             esd.setViewOnly();
             esd.open();
         }
