diff --git a/plugins/file-open-save/core/src/main/java/org/pentaho/repo/dialog/RepositoryOpenSaveDialog.java b/plugins/file-open-save/core/src/main/java/org/pentaho/repo/dialog/RepositoryOpenSaveDialog.java
index 51cee59..931f988 100644
--- a/plugins/file-open-save/core/src/main/java/org/pentaho/repo/dialog/RepositoryOpenSaveDialog.java
+++ b/plugins/file-open-save/core/src/main/java/org/pentaho/repo/dialog/RepositoryOpenSaveDialog.java
@@ -60,7 +60,7 @@
     clientPath.append( !Utils.isEmpty( state ) ? "&" : "" );
     clientPath.append( !Utils.isEmpty( filter ) ? "filter=" + filter : "" );
     super.createDialog( StringUtils.capitalize( state ), getRepoURL( clientPath.toString() ), OPTIONS, LOGO );
-    super.dialog.setMinimumSize( 545, 356 );
+    super.dialog.setMinimumSize( 545, 458 );
 
     new BrowserFunction( browser, "close" ) {
       @Override public Object function( Object[] arguments ) {
