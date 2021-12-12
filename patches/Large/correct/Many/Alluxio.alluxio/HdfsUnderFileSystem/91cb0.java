diff --git a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
index 5b5685a..9c69a62 100644
--- a/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
+++ b/underfs/hdfs/src/main/java/alluxio/underfs/hdfs/HdfsUnderFileSystem.java
@@ -211,7 +211,7 @@
       FileStatus fStatus = mFileSystem.getFileStatus(new Path(path));
       BlockLocation[] bLocations = mFileSystem.getFileBlockLocations(fStatus, offset, 1);
       if (bLocations.length > 0) {
-        String[] names = bLocations[0].getNames();
+        String[] names = bLocations[0].getHosts();
         Collections.addAll(ret, names);
       }
     } catch (IOException e) {
