diff --git a/src/be/ibridge/kettle/spoon/SpoonGraph.java b/src/be/ibridge/kettle/spoon/SpoonGraph.java
index c4b5d30..4bcd181 100644
--- a/src/be/ibridge/kettle/spoon/SpoonGraph.java
+++ b/src/be/ibridge/kettle/spoon/SpoonGraph.java
@@ -2213,7 +2213,7 @@
         if (transMeta.hasChanged())
         {
             MessageBox mb = new MessageBox(shell, SWT.YES | SWT.NO | SWT.CANCEL | SWT.ICON_WARNING );
-            mb.setMessage(Messages.getString("Spoon.Dialog.PromptSave.Message"));//"This model has changed.  Do you want to save it?"
+            mb.setMessage(Messages.getString("Spoon.Dialog.PromptSave.Message", spoon.makeGraphTabName(transMeta)));//"This model has changed.  Do you want to save it?"
             mb.setText(Messages.getString("Spoon.Dialog.PromptSave.Title"));
             int reply = mb.open();
             if (reply==SWT.YES)
