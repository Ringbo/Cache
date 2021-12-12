diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index e015ad9..9def980 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -1207,7 +1207,7 @@
               unmountInternal(alluxioUriToDel);
             } else if (!deleteOptions.isAlluxioOnly()) {
               // Attempt to delete node if all children were deleted successfully
-              failedToDelete = ufsDeleter.delete(alluxioUriToDel, delInode);
+              failedToDelete = !ufsDeleter.delete(alluxioUriToDel, delInode);
             }
           } catch (InvalidPathException e) {
             LOG.warn(e.getMessage());
