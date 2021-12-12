diff --git a/src-ui/org/pentaho/di/ui/repository/dialog/RepositoryExplorerDialog.java b/src-ui/org/pentaho/di/ui/repository/dialog/RepositoryExplorerDialog.java
index 1b69282..a085bdd 100644
--- a/src-ui/org/pentaho/di/ui/repository/dialog/RepositoryExplorerDialog.java
+++ b/src-ui/org/pentaho/di/ui/repository/dialog/RepositoryExplorerDialog.java
@@ -1411,7 +1411,7 @@
 		  TreeItem newCat = new TreeItem(tiTrans, SWT.NONE);
 		  newCat.setImage(GUIResource.getInstance().getImageLogoSmall());
 		  Color dircolor = GUIResource.getInstance().getColorDirectory();
-		  RepositoryDirectoryUI.getTreeWithNames(newCat, rep, objectMap, dircolor, sortColumn, includeDeleted, ascending, true, false, directoryTree, null, null);
+		  RepositoryDirectoryUI.getTreeWithNames(newCat, rep, dircolor, sortColumn, includeDeleted, ascending, true, false, directoryTree, null, null);
 
 			// The Jobs...				
 		  TreeItem tiJob = new TreeItem(tiTree, SWT.NONE); 
@@ -1420,7 +1420,7 @@
 
 		  TreeItem newJob = new TreeItem(tiJob, SWT.NONE);
 		  newJob.setImage(GUIResource.getInstance().getImageLogoSmall());
-		  RepositoryDirectoryUI.getTreeWithNames(newJob, rep, objectMap, dircolor, sortColumn, includeDeleted, ascending, false, true, directoryTree, null, null);
+		  RepositoryDirectoryUI.getTreeWithNames(newJob, rep, dircolor, sortColumn, includeDeleted, ascending, false, true, directoryTree, null, null);
 	
 			//
 			// Add the users or only yourself
