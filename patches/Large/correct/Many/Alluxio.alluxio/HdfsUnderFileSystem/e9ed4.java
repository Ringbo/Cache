diff --git a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
index b8e51b4..3ca8809 100644
--- a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
+++ b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
@@ -294,7 +294,7 @@
     for (FileStatus status : files) {
       // only return the relative path, to keep consistent with java.io.File.list()
       UfsStatus retStatus;
-      if (status.isDirectory()) {
+      if (status.isDir()) {
         retStatus = new UfsFileStatus(status.getPath().getName(), status.getLen(),
             status.getModificationTime(), status.getOwner(), status.getGroup(),
             status.getPermission().toShort());
