diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index 283b5b9..3d847b3 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -1504,7 +1504,7 @@
               failedToDelete = !ufsDeleter.delete(alluxioUriToDel, delInode);
             }
           } catch (InvalidPathException e) {
-            LOG.warn(e.getMessage());
+            LOG.warn("Failed to delete path from UFS: {}", e.getMessage());
           }
         }
         if (!failedToDelete) {
