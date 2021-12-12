diff --git a/lucene/src/java/org/apache/lucene/search/Query.java b/lucene/src/java/org/apache/lucene/search/Query.java
index 714b628..d4a8d43 100644
--- a/lucene/src/java/org/apache/lucene/search/Query.java
+++ b/lucene/src/java/org/apache/lucene/search/Query.java
@@ -88,7 +88,7 @@
    * Only implemented by primitive queries, which re-write to themselves.
    */
   public Weight createWeight(IndexSearcher searcher) throws IOException {
-    throw new UnsupportedOperationException();
+    throw new UnsupportedOperationException("Query " + this + " does not implement createWeight");
   }
 
   /** Expert: called to re-write queries into primitive queries. For example,
