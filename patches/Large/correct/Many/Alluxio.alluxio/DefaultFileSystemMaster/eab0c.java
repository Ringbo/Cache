diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index 435021b..77a8b9f 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -1226,7 +1226,8 @@
               String ufsUri = resolution.getUri().toString();
               UnderFileSystem ufs = resolution.getUfs();
               AlluxioURI parentUri = alluxioUriToDel.getParent();
-              if (!ufsSyncChecker.isDirectoryInSync(parentUri)) {
+              if (alluxioUriToDel.equals(inodePath.getUri())
+                  || !ufsSyncChecker.isDirectoryInSync(parentUri)) {
                 // Parent will not recursively delete, so delete this inode individually
                 if (delInode.isFile()) {
                   if (!ufs.deleteFile(ufsUri)) {
