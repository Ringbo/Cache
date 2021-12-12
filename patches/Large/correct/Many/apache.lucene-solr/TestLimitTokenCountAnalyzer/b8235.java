diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestLimitTokenCountAnalyzer.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestLimitTokenCountAnalyzer.java
index 986fecf..61f6b7a 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestLimitTokenCountAnalyzer.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestLimitTokenCountAnalyzer.java
@@ -61,7 +61,7 @@
     writer.addDocument(doc);
     writer.close();
 
-    IndexReader reader = IndexReader.open(dir, true);
+    IndexReader reader = IndexReader.open(dir);
     Term t = new Term("field", "x");
     assertEquals(1, reader.docFreq(t));
     reader.close();
