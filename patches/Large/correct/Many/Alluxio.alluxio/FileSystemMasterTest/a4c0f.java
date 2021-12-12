diff --git a/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java b/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
index d689a07..456bdb3 100644
--- a/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
+++ b/core/server/src/test/java/alluxio/master/file/FileSystemMasterTest.java
@@ -742,7 +742,7 @@
     try {
       mFileSystemMaster
           .createDirectory(new AlluxioURI("alluxio:/a"), CreateDirectoryOptions.defaults());
-      Assert.fail();
+      Assert.fail("createDirectory was expected to fail with FileAlreadyExistsException");
     } catch (FileAlreadyExistsException e) {
     }
 
@@ -753,7 +753,7 @@
     // TODO(peis): Avoid this hack by adding an option in getFileInfo to skip loading metadata.
     try {
       mFileSystemMaster.createFile(new AlluxioURI("alluxio:/a/f"), CreateFileOptions.defaults());
-      Assert.fail();
+      Assert.fail("createDirectory was expected to fail with FileAlreadyExistsException");
     } catch (FileAlreadyExistsException e) {
     }
   }
