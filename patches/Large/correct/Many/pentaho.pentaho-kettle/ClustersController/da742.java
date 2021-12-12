diff --git a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/ClustersController.java b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/ClustersController.java
index b1640d6..81da9d9 100644
--- a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/ClustersController.java
+++ b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/ClustersController.java
@@ -103,7 +103,7 @@
         ObjectId clusterId = repository.getClusterID(clusterSchema.getName());
         if (clusterId == null) {
           MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
-          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Cluster.DoesNotExists.Message")); //$NON-NLS-1$
+          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Cluster.DoesNotExists.Message", clusterSchemaName)); //$NON-NLS-1$
           mb.setText(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Cluster.Edit.Title")); //$NON-NLS-1$
           mb.open();
         } else {
