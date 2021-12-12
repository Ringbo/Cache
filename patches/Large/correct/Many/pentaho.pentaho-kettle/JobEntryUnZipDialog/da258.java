diff --git a/src-ui/org/pentaho/di/ui/job/entries/unzip/JobEntryUnZipDialog.java b/src-ui/org/pentaho/di/ui/job/entries/unzip/JobEntryUnZipDialog.java
index 8a41aeb..ccb0a9a 100644
--- a/src-ui/org/pentaho/di/ui/job/entries/unzip/JobEntryUnZipDialog.java
+++ b/src-ui/org/pentaho/di/ui/job/entries/unzip/JobEntryUnZipDialog.java
@@ -342,9 +342,9 @@
 				public void widgetSelected(SelectionEvent e)
 				{
 					DirectoryDialog ddialog = new DirectoryDialog(shell, SWT.OPEN);
-					if (wlZipFilename.getText()!=null)
+					if (wZipFilename.getText()!=null)
 					{
-						ddialog.setFilterPath(jobMeta.environmentSubstitute(wlZipFilename.getText()) );
+						ddialog.setFilterPath(jobMeta.environmentSubstitute(wZipFilename.getText()) );
 					}
 					
 					 // Calling open() will open and run the dialog.
@@ -353,7 +353,7 @@
 			        String dir = ddialog.open();
 			        if (dir != null) {
 			          // Set the text box to the new selection
-			        	wlZipFilename.setText(dir);
+			        	wZipFilename.setText(dir);
 			        }
 					
 				}
