diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/fs/viewfs/TestViewFsFileStatusHdfs.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/fs/viewfs/TestViewFsFileStatusHdfs.java
index 87c4966..12a9ff3 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/fs/viewfs/TestViewFsFileStatusHdfs.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/fs/viewfs/TestViewFsFileStatusHdfs.java
@@ -73,7 +73,7 @@
 
    long len = FileSystemTestHelper.createFile(fHdfs, testfilename);
 
-    Configuration conf = ViewFileSystemTestSetup.configWithViewfsScheme();
+    Configuration conf = ViewFileSystemTestSetup.createConfig();
     ConfigUtil.addLink(conf, "/tmp", new URI(fHdfs.getUri().toString() + "/tmp"));
     FileSystem vfs = FileSystem.get(FsConstants.VIEWFS_URI, conf);
     assertEquals(ViewFileSystem.class, vfs.getClass());
