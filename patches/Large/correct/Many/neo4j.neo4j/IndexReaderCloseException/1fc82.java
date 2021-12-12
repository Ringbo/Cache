diff --git a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
index 0757d3a..4d24850 100644
--- a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
+++ b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/schema/reader/IndexReaderCloseException.java
@@ -29,9 +29,9 @@
  * @see org.neo4j.kernel.api.impl.index.partition.PartitionSearcher
  * @see SimpleIndexReader
  */
-class IndexReaderCloseException extends UncheckedIOException
+public class IndexReaderCloseException extends UncheckedIOException
 {
-    IndexReaderCloseException( IOException cause )
+    public IndexReaderCloseException( IOException cause )
     {
         super( cause );
     }
