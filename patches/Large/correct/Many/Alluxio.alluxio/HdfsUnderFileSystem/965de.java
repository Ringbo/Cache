diff --git a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
index 2797058..e6f634b 100644
--- a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
+++ b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
@@ -280,7 +280,7 @@
       int i = 0;
       for (FileStatus status : files) {
         // only return the relative path, to keep consistent with java.io.File.list()
-        rtn[i++] =  new UnderFileStatus(status.getPath().getName(), status.isDirectory());
+        rtn[i++] =  new UnderFileStatus(status.getPath().getName(), status.isDir());
       }
       return rtn;
     } else {
