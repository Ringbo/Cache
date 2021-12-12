diff --git a/src/be/ibridge/kettle/repository/dialog/RepositoryExplorerDialog.java b/src/be/ibridge/kettle/repository/dialog/RepositoryExplorerDialog.java
index 7827c20..63598f1 100644
--- a/src/be/ibridge/kettle/repository/dialog/RepositoryExplorerDialog.java
+++ b/src/be/ibridge/kettle/repository/dialog/RepositoryExplorerDialog.java
@@ -2397,7 +2397,7 @@
 	
 	public void createDirectory(TreeItem ti, RepositoryDirectory repdir)
 	{
-		EnterStringDialog esd = new EnterStringDialog(shell, Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Title"), Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Default"), Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Message")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
+		EnterStringDialog esd = new EnterStringDialog(shell, Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Default"), Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Title"), Messages.getString("RepositoryExplorerDialog.Directory.Create.AskName.Message")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
 		String newdir = esd.open();
 		if (newdir!=null)
 		{
