diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestEncryptionZones.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestEncryptionZones.java
index df1864c..f34f760 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestEncryptionZones.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestEncryptionZones.java
@@ -716,7 +716,7 @@
   private static void mockCreate(ClientProtocol mcp,
       CipherSuite suite, CryptoProtocolVersion version) throws Exception {
     Mockito.doReturn(
-        new HdfsFileStatus(0, false, 1, 1024, 0, 0, new FsPermission(
+        new HdfsFileStatus(0, false, 1, 1024, false, 0, 0, new FsPermission(
             (short) 777), "owner", "group", new byte[0], new byte[0],
             1010, 0, new FileEncryptionInfo(suite,
             version, new byte[suite.getAlgorithmBlockSize()],
