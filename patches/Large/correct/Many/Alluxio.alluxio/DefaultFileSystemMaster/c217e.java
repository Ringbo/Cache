diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index c1fd2d2..82fc656 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -1208,7 +1208,7 @@
                 findPathInPairList(recursiveUFSDeletes, ancestor);
             while (ancestor != null && ancestorPair != null) {
               toAdd.add(ancestorPair);
-              recursiveUFSDeletes.remove(ancestor);
+              recursiveUFSDeletes.remove(ancestorPair);
               ancestor = ancestor.getParent();
               ancestorPair = findPathInPairList(recursiveUFSDeletes, ancestor);
             }
