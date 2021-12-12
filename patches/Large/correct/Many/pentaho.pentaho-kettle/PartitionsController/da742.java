diff --git a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/PartitionsController.java b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/PartitionsController.java
index 867cbee..278edd4 100644
--- a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/PartitionsController.java
+++ b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/PartitionsController.java
@@ -119,7 +119,7 @@
         ObjectId partitionId = repository.getPartitionSchemaID(partitionSchema.getName());
         if (partitionId == null) {
           MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
-          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.DoesNotExists.Message")); //$NON-NLS-1$
+          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.DoesNotExists.Message", partitionSchemaName)); //$NON-NLS-1$
           mb.setText(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.Edit.Title")); //$NON-NLS-1$
           mb.open();
         } else {
@@ -204,7 +204,7 @@
             ObjectId partitionId = repository.getPartitionSchemaID(partitionSchema.getName());
             if (partitionId == null) {
               MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
-              mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.DoesNotExists.Message")); //$NON-NLS-1$
+              mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.DoesNotExists.Message", partitionSchemaName)); //$NON-NLS-1$
               mb.setText(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Partition.Delete.Title")); //$NON-NLS-1$
               mb.open();
             } else {
