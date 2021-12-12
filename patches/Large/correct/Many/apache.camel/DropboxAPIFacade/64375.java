diff --git a/components/camel-dropbox/src/main/java/org/apache/camel/component/dropbox/core/DropboxAPIFacade.java b/components/camel-dropbox/src/main/java/org/apache/camel/component/dropbox/core/DropboxAPIFacade.java
index 4bfb887..1b43179 100644
--- a/components/camel-dropbox/src/main/java/org/apache/camel/component/dropbox/core/DropboxAPIFacade.java
+++ b/components/camel-dropbox/src/main/java/org/apache/camel/component/dropbox/core/DropboxAPIFacade.java
@@ -111,7 +111,7 @@
         // verify uploading of a single file
         if (fileLocalPath.isFile()) {
             // check if dropbox file exists
-            if (entry != null) {
+            if (entry != null && !DropboxUploadMode.force.equals(mode)) {
                 throw new DropboxException(dropboxPath + " exists on dropbox and is not a file!");
             }
             // in case the entry not exists on dropbox check if the filename
@@ -139,7 +139,7 @@
             // verify uploading of a list of files inside a dir
             LOG.debug("Uploading a dir...");
             // check if dropbox folder exists
-            if (entry != null) {
+            if (entry != null && !DropboxUploadMode.force.equals(mode)) {
                 throw new DropboxException(dropboxPath + " exists on dropbox and is not a folder!");
             }
             if (!dropboxPath.endsWith(DropboxConstants.DROPBOX_FILE_SEPARATOR)) {
