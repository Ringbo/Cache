diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestStoreFile.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestStoreFile.java
index d7bcc80..f266794 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestStoreFile.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestStoreFile.java
@@ -175,6 +175,7 @@
   public void testHFileLink() throws IOException {
     final String columnFamily = "f";
 
+    // force temp data in hbase/target/test-data instead of /tmp/hbase-xxxx/ 
     Configuration testConf = new Configuration(this.conf);
     FSUtils.setRootDir(testConf, this.testDir);
 
@@ -197,7 +198,7 @@
                   HFileLink.createHFileLinkName(hri, storeFilePath.getName()));
 
     // Try to open store file from link
-    StoreFile hsf = new StoreFile(this.fs, linkFilePath, conf, cacheConf,
+    StoreFile hsf = new StoreFile(this.fs, linkFilePath, testConf, cacheConf,
         BloomType.NONE, NoOpDataBlockEncoder.INSTANCE);
     assertTrue(hsf.isLink());
 
