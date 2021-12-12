diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestWriteStripedFileWithFailure.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestWriteStripedFileWithFailure.java
index 5448773..3679c5f 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestWriteStripedFileWithFailure.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestWriteStripedFileWithFailure.java
@@ -37,7 +37,7 @@
 
 public class TestWriteStripedFileWithFailure {
   public static final Log LOG = LogFactory
-      .getLog(TestReadStripedFileWithMissingBlocks.class);
+      .getLog(TestWriteStripedFileWithFailure.class);
   private static MiniDFSCluster cluster;
   private static FileSystem fs;
   private static Configuration conf = new HdfsConfiguration();
@@ -114,7 +114,7 @@
         dataDNFailureNum);
     Assert.assertNotNull(dataDNFailureIndices);
     int[] parityDNFailureIndices = StripedFileTestUtil.randomArray(dataBlocks,
-        dataBlocks + parityBlocks, dataDNFailureNum);
+        dataBlocks + parityBlocks, parityDNFailureNum);
     Assert.assertNotNull(parityDNFailureIndices);
 
     int[] failedDataNodes = new int[dataDNFailureNum + parityDNFailureNum];
