diff --git a/src-ui/org/pentaho/di/ui/core/database/dialog/XulDatabaseExplorerController.java b/src-ui/org/pentaho/di/ui/core/database/dialog/XulDatabaseExplorerController.java
index bd62c0b..4c2f7d1 100644
--- a/src-ui/org/pentaho/di/ui/core/database/dialog/XulDatabaseExplorerController.java
+++ b/src-ui/org/pentaho/di/ui/core/database/dialog/XulDatabaseExplorerController.java
@@ -114,7 +114,7 @@
 			theAcceptButton.setDisabled(false);
       
 		} else {
-      theCancelButton.setLabel(BaseMessages.getString(getClass(), "DatabaseExplorer.Button.Ok"));
+		  theAcceptButton.setLabel(BaseMessages.getString(getClass(), "DatabaseExplorer.Button.Ok"));
 		  theCancelButton.setLabel(BaseMessages.getString(getClass(), "DatabaseExplorer.Button.Cancel"));
 		  theAcceptButton.setDisabled(true);
 		}
