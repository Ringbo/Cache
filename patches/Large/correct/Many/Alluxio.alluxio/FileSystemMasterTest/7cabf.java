diff --git a/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java b/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
index d90719d..8c9b119 100644
--- a/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
+++ b/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
@@ -259,7 +259,7 @@
   @Test
   public void createFileWithTtlTest() throws Exception {
     CreateFileOptions options =
-        CreateFileOptions.defaults().setBlockSizeBytes(Constants.KB).setRecursive(true).setTtl(1);
+        CreateFileOptions.defaults().setBlockSizeBytes(Constants.KB).setRecursive(true).setTtl(0);
     long fileId = mFileSystemMaster.createFile(NESTED_FILE_URI, options);
     FileInfo fileInfo = mFileSystemMaster.getFileInfo(fileId);
     Assert.assertEquals(fileInfo.getFileId(), fileId);
@@ -282,7 +282,7 @@
         CreateFileOptions.defaults().setBlockSizeBytes(Constants.KB).setRecursive(true);
     long fileId = mFileSystemMaster.createFile(NESTED_FILE_URI, options);
     executeTtlCheckOnce();
-    // Since no valid TTL is set, the file should not be deleted.
+    // Since no TTL is set, the file should not be deleted.
     Assert.assertEquals(fileId, mFileSystemMaster.getFileInfo(NESTED_FILE_URI).getFileId());
 
     mFileSystemMaster.setAttribute(NESTED_FILE_URI, SetAttributeOptions.defaults().setTtl(0));
