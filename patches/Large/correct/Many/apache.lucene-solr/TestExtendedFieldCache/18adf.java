diff --git a/src/test/org/apache/lucene/search/TestExtendedFieldCache.java b/src/test/org/apache/lucene/search/TestExtendedFieldCache.java
index aa865ff..66a82de 100644
--- a/src/test/org/apache/lucene/search/TestExtendedFieldCache.java
+++ b/src/test/org/apache/lucene/search/TestExtendedFieldCache.java
@@ -38,7 +38,7 @@
   protected void setUp() throws Exception {
     super.setUp();
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     long theLong = Long.MAX_VALUE;
     double theDouble = Double.MAX_VALUE;
     for (int i = 0; i < NUM_DOCS; i++){
