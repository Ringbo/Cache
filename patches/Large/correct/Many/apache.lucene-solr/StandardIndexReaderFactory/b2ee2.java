diff --git a/solr/core/src/java/org/apache/solr/core/StandardIndexReaderFactory.java b/solr/core/src/java/org/apache/solr/core/StandardIndexReaderFactory.java
index 8a23788..d44cfcb 100644
--- a/solr/core/src/java/org/apache/solr/core/StandardIndexReaderFactory.java
+++ b/solr/core/src/java/org/apache/solr/core/StandardIndexReaderFactory.java
@@ -38,6 +38,6 @@
 
   @Override
   public DirectoryReader newReader(IndexWriter writer, SolrCore core) throws IOException {
-    return DirectoryReader.open(writer, true);
+    return DirectoryReader.open(writer);
   }
 }
