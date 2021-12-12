diff --git a/core/client/fs/src/test/java/alluxio/client/file/BaseFileSystemTest.java b/core/client/fs/src/test/java/alluxio/client/file/BaseFileSystemTest.java
index 830d712..901105b 100644
--- a/core/client/fs/src/test/java/alluxio/client/file/BaseFileSystemTest.java
+++ b/core/client/fs/src/test/java/alluxio/client/file/BaseFileSystemTest.java
@@ -362,9 +362,9 @@
     AlluxioURI src = new AlluxioURI("/file");
     AlluxioURI dst = new AlluxioURI("/file2");
     RenameOptions renameOptions = RenameOptions.defaults();
-    Mockito.doNothing().when(mFileSystemMasterClient).rename(src, dst);
+    Mockito.doNothing().when(mFileSystemMasterClient).rename(src, dst, renameOptions);
     mFileSystem.rename(src, dst, renameOptions);
-    Mockito.verify(mFileSystemMasterClient).rename(src, dst);
+    Mockito.verify(mFileSystemMasterClient).rename(src, dst, renameOptions);
   }
 
   /**
@@ -375,7 +375,7 @@
     AlluxioURI src = new AlluxioURI("/file");
     AlluxioURI dst = new AlluxioURI("/file2");
     RenameOptions renameOptions = RenameOptions.defaults();
-    Mockito.doThrow(EXCEPTION).when(mFileSystemMasterClient).rename(src, dst);
+    Mockito.doThrow(EXCEPTION).when(mFileSystemMasterClient).rename(src, dst, renameOptions);
     try {
       mFileSystem.rename(src, dst, renameOptions);
       Assert.fail(SHOULD_HAVE_PROPAGATED_MESSAGE);
