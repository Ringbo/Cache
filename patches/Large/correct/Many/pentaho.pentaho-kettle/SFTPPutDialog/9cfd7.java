diff --git a/src-ui/org/pentaho/di/ui/trans/steps/sftpput/SFTPPutDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/sftpput/SFTPPutDialog.java
index 56f8c9f..f59de48 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/sftpput/SFTPPutDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/sftpput/SFTPPutDialog.java
@@ -1037,7 +1037,7 @@
 		wUserName.setText(Const.NVL(input.getUserName(), ""));
 		wPassword.setText(Const.NVL(input.getPassword(), ""));
 		wRemoteDirectory.setText(Const.NVL(input.getRemoteDirectoryFieldName(), ""));
-		wSourceFileNameField.setText(Const.NVL(input.getSourceFileNameFieldName(), ""));
+		wSourceFileNameField.setText(Const.NVL(input.getSourceFileFieldName(), ""));
         wInputIsStream.setSelection(input.isInputStream());
         wAddFilenameToResult.setSelection(input.isAddFilenameResut());
         wusePublicKey.setSelection(input.isUseKeyFile());
@@ -1078,7 +1078,7 @@
 		input.setUserName(wUserName.getText());
 		input.setPassword(wPassword.getText());
 		input.setRemoteDirectoryFieldName(wRemoteDirectory.getText());
-		input.setSourceFileNameFieldName(wSourceFileNameField.getText());
+		input.setSourceFileFieldName(wSourceFileNameField.getText());
 		input.setAddFilenameResut(wAddFilenameToResult.getSelection());
 		input.setUseKeyFile(wusePublicKey.getSelection());
 		input.setKeyFilename(wKeyFilename.getText());
