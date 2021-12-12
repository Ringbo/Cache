diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index 7377511..987dfb5 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -1379,7 +1379,7 @@
       throw new InvalidPathException(ExceptionMessage.DELETE_ROOT_DIRECTORY.getMessage());
     }
 
-    List<Pair<AlluxioURI, Inode>> delInodes = new LinkedList<>();
+    List<Pair<AlluxioURI, Inode>> delInodes = new ArrayList<>();
     List<Inode<?>> deletedInodes = new ArrayList<>();
 
     Pair<AlluxioURI, Inode> inodePair = new Pair<AlluxioURI, Inode>(inodePath.getUri(), inode);
