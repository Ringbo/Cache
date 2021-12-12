diff --git a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/SlavesController.java b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/SlavesController.java
index 0b9f326..9ada317 100644
--- a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/SlavesController.java
+++ b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/controllers/SlavesController.java
@@ -180,7 +180,7 @@
         ObjectId slaveId = repository.getSlaveID(slaveServer.getName());
         if(slaveId == null) {
           MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
-          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.DoesNotExists.Message")); //$NON-NLS-1$
+          mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.DoesNotExists.Message", slaveServerName)); //$NON-NLS-1$
           mb.setText(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.Edit.Title")); //$NON-NLS-1$
           mb.open();
         } else {
@@ -228,7 +228,7 @@
             ObjectId slaveId = repository.getSlaveID(slaveServer.getName());
             if(slaveId == null) {
               MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
-              mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.DoesNotExists.Message")); //$NON-NLS-1$
+              mb.setMessage(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.DoesNotExists.Message", slaveServerName)); //$NON-NLS-1$
               mb.setText(BaseMessages.getString(PKG, "RepositoryExplorerDialog.Slave.Delete.Title")); //$NON-NLS-1$
               mb.open();
             } else {
