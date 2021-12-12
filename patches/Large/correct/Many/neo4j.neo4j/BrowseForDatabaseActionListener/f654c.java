diff --git a/packaging/neo4j-desktop/src/main/java/org/neo4j/desktop/ui/BrowseForDatabaseActionListener.java b/packaging/neo4j-desktop/src/main/java/org/neo4j/desktop/ui/BrowseForDatabaseActionListener.java
index 2f5fca0..9944959 100644
--- a/packaging/neo4j-desktop/src/main/java/org/neo4j/desktop/ui/BrowseForDatabaseActionListener.java
+++ b/packaging/neo4j-desktop/src/main/java/org/neo4j/desktop/ui/BrowseForDatabaseActionListener.java
@@ -129,7 +129,7 @@
         fileDialog.setDirectory( directoryDisplay.getText() );
         fileDialog.setVisible( true );
 
-        selectedFile = new File( fileDialog.getFile() );
+        selectedFile = new File( fileDialog.getDirectory(), fileDialog.getFile() );
         System.setProperty( "apple.awt.fileDialogForDirectories", "false" );
 
         return selectedFile;
