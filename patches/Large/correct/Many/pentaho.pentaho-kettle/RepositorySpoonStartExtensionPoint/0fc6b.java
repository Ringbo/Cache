diff --git a/plugins/repositories-plugin/src/main/java/org/pentaho/di/ui/repo/RepositorySpoonStartExtensionPoint.java b/plugins/repositories-plugin/src/main/java/org/pentaho/di/ui/repo/RepositorySpoonStartExtensionPoint.java
index 39bf350..9f5e4af 100644
--- a/plugins/repositories-plugin/src/main/java/org/pentaho/di/ui/repo/RepositorySpoonStartExtensionPoint.java
+++ b/plugins/repositories-plugin/src/main/java/org/pentaho/di/ui/repo/RepositorySpoonStartExtensionPoint.java
@@ -41,7 +41,7 @@
 )
 public class RepositorySpoonStartExtensionPoint implements ExtensionPointInterface {
 
-  private static Class<?> PKG = Spoon.class;
+  private static Class<?> PKG = RepositorySpoonStartExtensionPoint.class;
 
   private RepositoryConnectController repositoryConnectController;
 
@@ -79,12 +79,12 @@
           .connectToRepository( repositoryMeta, null, null );
       }
       if ( !repositoryConnectController.isConnected() ) {
-        String msg = BaseMessages.getString( PKG, "Spoon.Log.NoRepositoriesDefined" );
+        String msg = BaseMessages.getString( PKG, "Repository.NoConnected.Message" );
         log.logError( msg ); // "No repositories defined on this system."
         MessageBox mb = new MessageBox( getSpoon().getShell(), SWT.OK | SWT.ICON_ERROR );
-        mb.setMessage( BaseMessages.getString( PKG, "Spoon.Error.Repository.NotFound", optionRepname
+        mb.setMessage( BaseMessages.getString( PKG, "Repository.NoConnected.Message", optionRepname
           .toString() ) );
-        mb.setText( BaseMessages.getString( PKG, "Spoon.Error.Repository.NotFound.Title" ) );
+        mb.setText( BaseMessages.getString( PKG, "Repository.NoConnected.Message.Title" ) );
         mb.open();
       }
     } else if ( Const.isEmpty( optionFilename ) ) {
