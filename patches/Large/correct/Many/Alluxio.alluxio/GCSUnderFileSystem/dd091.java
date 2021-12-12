diff --git a/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSUnderFileSystem.java b/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSUnderFileSystem.java
index 949d116..dfd3a4d 100644
--- a/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSUnderFileSystem.java
+++ b/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSUnderFileSystem.java
@@ -409,7 +409,7 @@
     }
     for (String child : children) {
       String childSrcPath = PathUtils.concatPath(src, child);
-      String childDstPath = PathUtils.concatPath(src, child);
+      String childDstPath = PathUtils.concatPath(dst, child);
       boolean success;
       if (isDirectory(childSrcPath)) {
         // Recursive call
