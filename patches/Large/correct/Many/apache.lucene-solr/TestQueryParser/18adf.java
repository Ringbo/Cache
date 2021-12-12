diff --git a/src/test/org/apache/lucene/queryParser/TestQueryParser.java b/src/test/org/apache/lucene/queryParser/TestQueryParser.java
index ae11ddc..4d65fd2 100644
--- a/src/test/org/apache/lucene/queryParser/TestQueryParser.java
+++ b/src/test/org/apache/lucene/queryParser/TestQueryParser.java
@@ -764,7 +764,7 @@
 
   public void testLocalDateFormat() throws IOException, ParseException {
     RAMDirectory ramDir = new RAMDirectory();
-    IndexWriter iw = new IndexWriter(ramDir, new WhitespaceAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(ramDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     addDateDoc("a", 2005, 12, 2, 10, 15, 33, iw);
     addDateDoc("b", 2005, 12, 4, 22, 15, 00, iw);
     iw.close();
