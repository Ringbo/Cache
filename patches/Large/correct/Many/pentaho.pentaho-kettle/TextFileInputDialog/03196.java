diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
index cf07270..7c79ff0 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
@@ -576,9 +576,9 @@
 							dialog.setFileName( fname );
 						}
 						
-						if (! wCompression.getSelection().equals("None"))
+						if (! wCompression.getText().equals("None"))
 						{
-							dialog.setFilterNames(new String[] {Messages.getString("System.FileType.ZipFiles"), Messages.getString("TextFileInputDialog.FileType.TextAndCSVFiles"), Messages.getString("System.FileType.CSVFiles"), Messages.getString("System.FileType.TextFiles"), Messages.getString("System.FileType.AllFiles")});
+							dialog.setFilterNames(new String[] {Messages.getString("System.FileType.ZIPFiles"), Messages.getString("TextFileInputDialog.FileType.TextAndCSVFiles"), Messages.getString("System.FileType.CSVFiles"), Messages.getString("System.FileType.TextFiles"), Messages.getString("System.FileType.AllFiles")});
 						}
 						else
 						{
