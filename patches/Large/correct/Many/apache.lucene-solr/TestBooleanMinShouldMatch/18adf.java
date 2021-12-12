diff --git a/src/test/org/apache/lucene/search/TestBooleanMinShouldMatch.java b/src/test/org/apache/lucene/search/TestBooleanMinShouldMatch.java
index f055965..fd887a2 100644
--- a/src/test/org/apache/lucene/search/TestBooleanMinShouldMatch.java
+++ b/src/test/org/apache/lucene/search/TestBooleanMinShouldMatch.java
@@ -61,7 +61,7 @@
         index = new RAMDirectory();
         IndexWriter writer = new IndexWriter(index,
                                              new WhitespaceAnalyzer(),
-                                             true);
+                                             true, IndexWriter.MaxFieldLength.LIMITED);
 
         for (int i = 0; i < data.length; i++) {
             Document doc = new Document();
