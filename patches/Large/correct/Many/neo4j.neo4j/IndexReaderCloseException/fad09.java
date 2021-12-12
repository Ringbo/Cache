diff --git a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
index 502bc3f..0757d3a 100644
--- a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
+++ b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
@@ -28,11 +28,10 @@
  * @see org.apache.lucene.search.IndexSearcher
  * @see org.neo4j.kernel.api.impl.index.partition.PartitionSearcher
  * @see SimpleIndexReader
- * @see org.neo4j.kernel.api.impl.labelscan.reader.SimpleLuceneLabelScanStoreReader
  */
-public class IndexReaderCloseException extends UncheckedIOException
+class IndexReaderCloseException extends UncheckedIOException
 {
-    public IndexReaderCloseException( IOException cause )
+    IndexReaderCloseException( IOException cause )
     {
         super( cause );
     }
