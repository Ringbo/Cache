diff --git a/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java b/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
index 6a304df..2a04660 100644
--- a/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
+++ b/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
@@ -3046,7 +3046,7 @@
               LOG.debug("File {} is expired. Performing action {}", inode.getName(), ttlAction);
               switch (ttlAction) {
                 case FREE:
-                  free(path, false);
+                  free(path, true);
                   // Reset state
                   inode.setTtl(Constants.NO_TTL);
                   inode.setTtlAction(TtlAction.DELETE);
