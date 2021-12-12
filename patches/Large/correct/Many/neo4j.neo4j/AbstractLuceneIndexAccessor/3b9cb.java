diff --git a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/index/AbstractLuceneIndexAccessor.java b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/index/AbstractLuceneIndexAccessor.java
index 7ca92da..3b7aa91 100644
--- a/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/index/AbstractLuceneIndexAccessor.java
+++ b/community/lucene-index/src/main/java/org/neo4j/kernel/api/impl/index/AbstractLuceneIndexAccessor.java
@@ -68,7 +68,7 @@
     protected abstract IndexUpdater getIndexUpdater( IndexUpdateMode mode );
 
     @Override
-    public void drop() throws IOException
+    public void drop()
     {
         luceneIndex.drop();
     }
