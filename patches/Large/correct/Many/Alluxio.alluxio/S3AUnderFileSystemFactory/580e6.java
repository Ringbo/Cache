diff --git a/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AUnderFileSystemFactory.java b/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AUnderFileSystemFactory.java
index 19f474b..179b494 100644
--- a/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AUnderFileSystemFactory.java
+++ b/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AUnderFileSystemFactory.java
@@ -37,7 +37,7 @@
 
   @Override
   public UnderFileSystem create(String path, UnderFileSystemConfiguration conf) {
-    Preconditions.checkNotNull(path);
+    Preconditions.checkNotNull(path, "path");
 
     try {
       return S3AUnderFileSystem.createInstance(new AlluxioURI(path), conf);
