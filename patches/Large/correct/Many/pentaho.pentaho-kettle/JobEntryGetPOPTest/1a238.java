diff --git a/engine/test-src/org/pentaho/di/job/entries/getpop/JobEntryGetPOPTest.java b/engine/test-src/org/pentaho/di/job/entries/getpop/JobEntryGetPOPTest.java
index ed6948a..49307de 100644
--- a/engine/test-src/org/pentaho/di/job/entries/getpop/JobEntryGetPOPTest.java
+++ b/engine/test-src/org/pentaho/di/job/entries/getpop/JobEntryGetPOPTest.java
@@ -237,7 +237,7 @@
       if ( e instanceof KettleException ) {
         assertTrue( "Output Folder should not be created",
           BaseMessages.getString( JobEntryGetPOP.class,
-            "JobGetMailsFromPOP.Error.OutputFolderNotExist", outputDir.getCanonicalPath() ).equals(
+            "JobGetMailsFromPOP.Error.OutputFolderNotExist", outputDir.getAbsolutePath() ).equals(
               Const.trim( e.getMessage() ) ) );
       } else {
         fail( "Output Folder should not have been created: " + e.getLocalizedMessage() );
@@ -250,7 +250,7 @@
       if ( e instanceof KettleException ) {
         assertTrue( "Output Folder should not be created",
           BaseMessages.getString( JobEntryGetPOP.class,
-            "JobGetMailsFromPOP.Error.AttachmentFolderNotExist", attachmentsDir.getCanonicalPath() ).equals(
+            "JobGetMailsFromPOP.Error.AttachmentFolderNotExist", attachmentsDir.getAbsolutePath() ).equals(
               Const.trim( e.getMessage() ) ) );
       } else {
         fail( "Attachments Folder should not have been created: " + e.getLocalizedMessage() );
