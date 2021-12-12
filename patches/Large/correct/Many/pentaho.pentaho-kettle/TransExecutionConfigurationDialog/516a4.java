diff --git a/src/be/ibridge/kettle/trans/dialog/TransExecutionConfigurationDialog.java b/src/be/ibridge/kettle/trans/dialog/TransExecutionConfigurationDialog.java
index 1f71c39..3f6f609 100644
--- a/src/be/ibridge/kettle/trans/dialog/TransExecutionConfigurationDialog.java
+++ b/src/be/ibridge/kettle/trans/dialog/TransExecutionConfigurationDialog.java
@@ -251,7 +251,7 @@
             };
         cPreviewSteps[1].setValueType(Value.VALUE_TYPE_INTEGER);
                 
-        wPreviewSteps = new TableView(shell, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI, cPreviewSteps, executedSteps.size(), true, null, props);
+        wPreviewSteps = new TableView(shell, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI, cPreviewSteps, executedSteps.size(), false, null, props);
         FormData fdPreviewSteps = new FormData();
         fdPreviewSteps.left   = new FormAttachment(  0, 0);
         fdPreviewSteps.top    = new FormAttachment(wPreview, margin);
