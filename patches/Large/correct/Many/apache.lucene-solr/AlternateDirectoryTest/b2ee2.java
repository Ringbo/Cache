diff --git a/solr/core/src/test/org/apache/solr/core/AlternateDirectoryTest.java b/solr/core/src/test/org/apache/solr/core/AlternateDirectoryTest.java
index d715806..cf8d7c6 100644
--- a/solr/core/src/test/org/apache/solr/core/AlternateDirectoryTest.java
+++ b/solr/core/src/test/org/apache/solr/core/AlternateDirectoryTest.java
@@ -77,7 +77,7 @@
     @Override
     public DirectoryReader newReader(IndexWriter writer, SolrCore core) throws IOException {
       TestIndexReaderFactory.newReaderCalled = true;
-      return DirectoryReader.open(writer, true);
+      return DirectoryReader.open(writer);
     }
   }
 
