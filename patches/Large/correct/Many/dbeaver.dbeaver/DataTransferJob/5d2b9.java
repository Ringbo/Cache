diff --git a/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/wizard/DataTransferJob.java b/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/wizard/DataTransferJob.java
index a4ea4fa..94fa4cf 100644
--- a/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/wizard/DataTransferJob.java
+++ b/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/wizard/DataTransferJob.java
@@ -89,7 +89,7 @@
                 // Show message box
                 UIUtils.showMessageBox(
                     null,
-                    "Data transfer",
+                    DTMessages.data_transfer_wizard_name,
                     "Data transfer completed " + (hasErrors ? "with errors " : "") + "(" + RuntimeUtils.formatExecutionTime(time) + ")",
                     hasErrors ? SWT.ICON_ERROR : SWT.ICON_INFORMATION);
             }
@@ -104,7 +104,8 @@
         IDataTransferSettings consumerSettings = settings.getNodeSettings(consumer);
 
         setName(NLS.bind(DTMessages.data_transfer_wizard_job_container_name,
-            CommonUtils.truncateString(producer.getObjectName(), 200)));
+            CommonUtils.truncateString(producer.getObjectName(), 200),
+            CommonUtils.truncateString(consumer.getObjectName(), 200)));
 
         IDataTransferSettings nodeSettings = settings.getNodeSettings(producer);
         try {
