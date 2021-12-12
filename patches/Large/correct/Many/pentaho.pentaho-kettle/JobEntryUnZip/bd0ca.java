diff --git a/engine/src/org/pentaho/di/job/entries/unzip/JobEntryUnZip.java b/engine/src/org/pentaho/di/job/entries/unzip/JobEntryUnZip.java
index d2b494e..6d3de65 100644
--- a/engine/src/org/pentaho/di/job/entries/unzip/JobEntryUnZip.java
+++ b/engine/src/org/pentaho/di/job/entries/unzip/JobEntryUnZip.java
@@ -372,14 +372,12 @@
           }
 
         } else {
-          log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-            PKG, "JobUnZip.TargetFolderNotFound.Label" ) );
+          log.logError( BaseMessages.getString( PKG, "JobUnZip.TargetFolderNotFound.Label" ) );
           exitjobentry = true;
         }
       } else {
         if ( !( targetdir.getType() == FileType.FOLDER ) ) {
-          log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-            PKG, "JobUnZip.TargetFolderNotFolder.Label", realTargetdirectory ) );
+          log.logError( BaseMessages.getString( PKG, "JobUnZip.TargetFolderNotFolder.Label", realTargetdirectory ) );
           exitjobentry = true;
         } else {
           if ( log.isDetailed() ) {
@@ -392,8 +390,7 @@
       // movetodirectory must be provided
       if ( afterunzip == 2 ) {
         if ( Const.isEmpty( movetodirectory ) ) {
-          log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-            PKG, "JobUnZip.MoveToDirectoryEmpty.Label" ) );
+          log.logError(  BaseMessages.getString( PKG, "JobUnZip.MoveToDirectoryEmpty.Label" ) );
           exitjobentry = true;
         } else {
           movetodir = KettleVFS.getFileObject( realMovetodirectory, this );
@@ -404,8 +401,7 @@
                 logDetailed( BaseMessages.getString( PKG, "JobUnZip.Log.MoveToFolderCreated", realMovetodirectory ) );
               }
             } else {
-              log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-                PKG, "JobUnZip.MoveToDirectoryNotExists.Label" ) );
+              log.logError( BaseMessages.getString( PKG, "JobUnZip.MoveToDirectoryNotExists.Label" ) );
               exitjobentry = true;
             }
           }
@@ -450,8 +446,7 @@
       } else {
         fileObject = KettleVFS.getFileObject( realFilenameSource, this );
         if ( !fileObject.exists() ) {
-          log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-            PKG, "JobUnZip.ZipFile.NotExists.Label", realFilenameSource ) );
+          log.logError(  BaseMessages.getString( PKG, "JobUnZip.ZipFile.NotExists.Label", realFilenameSource ) );
           return result;
         }
 
@@ -459,8 +454,7 @@
           logDetailed( BaseMessages.getString( PKG, "JobUnZip.Zip_FileExists.Label", realFilenameSource ) );
         }
         if ( Const.isEmpty( sourcedirectory ) ) {
-          log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-            PKG, "JobUnZip.TargetFolderNotFound.Label" ) );
+          log.logError( BaseMessages.getString( PKG, "JobUnZip.SourceFolderNotFound.Label" ) );
           return result;
         }
 
@@ -469,8 +463,7 @@
           realMovetodirectory, realWildcardSource );
       }
     } catch ( Exception e ) {
-      log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
-        PKG, "JobUnZip.ErrorUnzip.Label", realFilenameSource, e.getMessage() ) );
+      log.logError( BaseMessages.getString( PKG, "JobUnZip.ErrorUnzip.Label", realFilenameSource, e.getMessage() ) );
       updateErrors();
     } finally {
       if ( fileObject != null ) {
@@ -841,7 +834,7 @@
       retval = true;
     } catch ( Exception e ) {
       updateErrors();
-      log.logError( BaseMessages.getString( PKG, "JobUnZip.Error.Label" ), BaseMessages.getString(
+      log.logError( BaseMessages.getString(
         PKG, "JobUnZip.ErrorUnzip.Label", sourceFileObject.toString(), e.getMessage() ), e );
     }
 
