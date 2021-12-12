diff --git a/core/server/master/src/main/java/alluxio/master/file/FileSystemMasterClientServiceHandler.java b/core/server/master/src/main/java/alluxio/master/file/FileSystemMasterClientServiceHandler.java
index 1497054..e9f3140 100644
--- a/core/server/master/src/main/java/alluxio/master/file/FileSystemMasterClientServiceHandler.java
+++ b/core/server/master/src/main/java/alluxio/master/file/FileSystemMasterClientServiceHandler.java
@@ -97,7 +97,7 @@
    * @param fileSystemMaster the {@link FileSystemMaster} the handler uses internally
    */
   FileSystemMasterClientServiceHandler(FileSystemMaster fileSystemMaster) {
-    Preconditions.checkNotNull(fileSystemMaster);
+    Preconditions.checkNotNull(fileSystemMaster, "fileSystemMaster");
     mFileSystemMaster = fileSystemMaster;
   }
 
