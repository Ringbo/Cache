diff --git a/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java b/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
index 25eab92..dd4156c 100644
--- a/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
+++ b/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
@@ -48,7 +48,7 @@
     addDoc("three four", iw, 300f);
     iw.close();
 
-    IndexReader ir = IndexReader.open(dir, true);
+    IndexReader ir = IndexReader.open(dir, false);
     IndexSearcher is = new IndexSearcher(ir);
     ScoreDoc[] hits;
 
