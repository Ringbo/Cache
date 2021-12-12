diff --git a/core/server/src/main/java/alluxio/master/file/meta/InodeTree.java b/core/server/src/main/java/alluxio/master/file/meta/InodeTree.java
index 6883029..20ecce1 100644
--- a/core/server/src/main/java/alluxio/master/file/meta/InodeTree.java
+++ b/core/server/src/main/java/alluxio/master/file/meta/InodeTree.java
@@ -167,7 +167,7 @@
    */
   public Inode getInodeByPath(AlluxioURI path) throws InvalidPathException {
     TraversalResult traversalResult =
-        traverseToInode(PathUtils.getPathComponents(path.toString()), false);
+        traverseToInode(PathUtils.getPathComponents(path.getPath()), false);
     if (!traversalResult.isFound()) {
       throw new InvalidPathException(ExceptionMessage.PATH_DOES_NOT_EXIST.getMessage(path));
     }
