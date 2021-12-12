diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index f2ef71f..f8f1e62 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -3666,7 +3666,7 @@
 					FileObject zipFileObject = KettleVFS.getFileObject(zipFilename);
 					if (zipFileObject.exists()) {
 						MessageBox box = new MessageBox(shell, SWT.YES | SWT.NO | SWT.CANCEL);
-						box.setMessage(Messages.getString("Spoon.ExportResourceZipFileExists.Message"));
+						box.setMessage(Messages.getString("Spoon.ExportResourceZipFileExists.Message", zipFilename));
 						box.setText(Messages.getString("Spoon.ExportResourceZipFileExists.Title"));
 						int answer = box.open();
 						if (answer==SWT.CANCEL) return;
