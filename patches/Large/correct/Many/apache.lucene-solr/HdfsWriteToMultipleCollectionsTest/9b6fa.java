diff --git a/solr/core/src/test/org/apache/solr/cloud/hdfs/HdfsWriteToMultipleCollectionsTest.java b/solr/core/src/test/org/apache/solr/cloud/hdfs/HdfsWriteToMultipleCollectionsTest.java
index c598a00..39b25b1 100644
--- a/solr/core/src/test/org/apache/solr/cloud/hdfs/HdfsWriteToMultipleCollectionsTest.java
+++ b/solr/core/src/test/org/apache/solr/cloud/hdfs/HdfsWriteToMultipleCollectionsTest.java
@@ -143,7 +143,8 @@
             BlockDirectory blockDirectory = (BlockDirectory) directory
                 .getDelegate();
             assertTrue(blockDirectory.isBlockCacheReadEnabled());
-            assertTrue(blockDirectory.isBlockCacheWriteEnabled());
+            // see SOLR-6424
+            assertFalse(blockDirectory.isBlockCacheWriteEnabled());
             Cache cache = blockDirectory.getCache();
             // we know its a BlockDirectoryCache, but future proof
             assertTrue(cache instanceof BlockDirectoryCache);
