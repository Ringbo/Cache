diff --git a/community/lucene-index/src/main/java/org/neo4j/index/impl/lucene/legacy/FullTxData.java b/community/lucene-index/src/main/java/org/neo4j/index/impl/lucene/legacy/FullTxData.java
index b91a360..3fe7a1e 100644
--- a/community/lucene-index/src/main/java/org/neo4j/index/impl/lucene/legacy/FullTxData.java
+++ b/community/lucene-index/src/main/java/org/neo4j/index/impl/lucene/legacy/FullTxData.java
@@ -379,7 +379,7 @@
             IndexReader newReader = this.reader == null ?
                                     DirectoryReader.open( this.writer ) :
                                     DirectoryReader.openIfChanged( (DirectoryReader) this.reader );
-            if ( newReader == this.reader )
+            if ( newReader == null || newReader == this.reader )
             {
                 return this.searcher;
             }
