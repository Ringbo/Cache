diff --git a/src/test/org/apache/lucene/search/TestDateFilter.java b/src/test/org/apache/lucene/search/TestDateFilter.java
index dc8d4ea..9fdf0a3 100644
--- a/src/test/org/apache/lucene/search/TestDateFilter.java
+++ b/src/test/org/apache/lucene/search/TestDateFilter.java
@@ -50,7 +50,7 @@
     {
 	// create an index
         RAMDirectory indexStore = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
  	long now = System.currentTimeMillis();
 
@@ -111,7 +111,7 @@
     {
 	// create an index
         RAMDirectory indexStore = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
  	long now = System.currentTimeMillis();
 
