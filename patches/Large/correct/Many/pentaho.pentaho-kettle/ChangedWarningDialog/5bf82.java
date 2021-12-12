diff --git a/src-ui/org/pentaho/di/ui/spoon/ChangedWarningDialog.java b/src-ui/org/pentaho/di/ui/spoon/ChangedWarningDialog.java
index 2a0a16d..f314cc0 100644
--- a/src-ui/org/pentaho/di/ui/spoon/ChangedWarningDialog.java
+++ b/src-ui/org/pentaho/di/ui/spoon/ChangedWarningDialog.java
@@ -64,9 +64,9 @@
     messageBox.setTitle(BaseMessages.getString(PKG, "Spoon.Dialog.PromptSave.Title")); //$NON-NLS-1$
     
     if(fileName != null) {
-      messageBox.setMessage(BaseMessages.getString("Spoon.Dialog.PromptToSave.Message", fileName)); //$NON-NLS-1$
+      messageBox.setMessage(BaseMessages.getString(PKG, "Spoon.Dialog.PromptToSave.Message", fileName)); //$NON-NLS-1$
     } else {
-      messageBox.setMessage(BaseMessages.getString("Spoon.Dialog.PromptSave.Message")); //$NON-NLS-1$
+      messageBox.setMessage(BaseMessages.getString(PKG, "Spoon.Dialog.PromptSave.Message")); //$NON-NLS-1$
     }
     
     messageBox.setButtons(new Integer[] {SWT.YES, SWT.NO, SWT.CANCEL});
