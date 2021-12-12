diff --git a/src/test/org/apache/lucene/search/TestMultiPhraseQuery.java b/src/test/org/apache/lucene/search/TestMultiPhraseQuery.java
index a250da5..ccc0659 100644
--- a/src/test/org/apache/lucene/search/TestMultiPhraseQuery.java
+++ b/src/test/org/apache/lucene/search/TestMultiPhraseQuery.java
@@ -47,7 +47,7 @@
 
     public void testPhrasePrefix() throws IOException {
         RAMDirectory indexStore = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         add("blueberry pie", writer);
         add("blueberry strudel", writer);
         add("blueberry pizza", writer);
@@ -141,7 +141,7 @@
       // The contained PhraseMultiQuery must contain exactly one term array.
 
       RAMDirectory indexStore = new RAMDirectory();
-      IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       add("blueberry pie", writer);
       add("blueberry chewing gum", writer);
       add("blue raspberry pie", writer);
@@ -169,7 +169,7 @@
     
   public void testPhrasePrefixWithBooleanQuery() throws IOException {
     RAMDirectory indexStore = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(indexStore, new StandardAnalyzer(new String[]{}), true);
+    IndexWriter writer = new IndexWriter(indexStore, new StandardAnalyzer(new String[]{}), true, IndexWriter.MaxFieldLength.LIMITED);
     add("This is a test", "object", writer);
     add("a note", "note", writer);
     writer.close();
