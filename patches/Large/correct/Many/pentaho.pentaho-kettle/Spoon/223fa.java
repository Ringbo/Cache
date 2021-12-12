diff --git a/src/be/ibridge/kettle/spoon/Spoon.java b/src/be/ibridge/kettle/spoon/Spoon.java
index 268af83..2f44786 100644
--- a/src/be/ibridge/kettle/spoon/Spoon.java
+++ b/src/be/ibridge/kettle/spoon/Spoon.java
@@ -2973,7 +2973,7 @@
                         
                         // Ask if we should save it before closing...
                         MessageBox mb = new MessageBox(shell, SWT.YES | SWT.NO | SWT.CANCEL | SWT.ICON_WARNING );
-                        mb.setMessage(Messages.getString("Spoon.Dialog.SaveChangedFile.Message"));//"File has changed!  Do you want to save first?"
+                        mb.setMessage(Messages.getString("Spoon.Dialog.SaveChangedFile.Message", makeGraphTabName(transMeta)));//"File has changed!  Do you want to save first?"
                         mb.setText(Messages.getString("Spoon.Dialog.SaveChangedFile.Title"));//"Warning!"
                         int answer = mb.open();
                     
