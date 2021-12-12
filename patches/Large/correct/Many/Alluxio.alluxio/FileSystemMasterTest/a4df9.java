diff --git a/core/server/master/src/test/java/alluxio/master/file/FileSystemMasterTest.java b/core/server/master/src/test/java/alluxio/master/file/FileSystemMasterTest.java
index 241dde3..246ef93 100644
--- a/core/server/master/src/test/java/alluxio/master/file/FileSystemMasterTest.java
+++ b/core/server/master/src/test/java/alluxio/master/file/FileSystemMasterTest.java
@@ -395,7 +395,7 @@
         .join(FILE_PREFIX + (DIR_WIDTH)).getPath()));
     // delete top-level directory
     mFileSystemMaster.delete(new AlluxioURI(MOUNT_URI).join(DIR_TOP_LEVEL),
-        DeleteOptions.defaults().setRecursive(true).setAlluxioOnly(false).setUnchecked(false));
+        DeleteOptions.defaults().setRecursive(true).setAlluxioOnly(false).setUnchecked(true));
     checkPersistedDirectoriesDeleted(3, ufsMount, Collections.EMPTY_LIST);
   }
 
