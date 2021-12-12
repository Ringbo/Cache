diff --git a/src/test/org/apache/lucene/index/TestTermVectorsReader.java b/src/test/org/apache/lucene/index/TestTermVectorsReader.java
index 9733732..0c84892 100644
--- a/src/test/org/apache/lucene/index/TestTermVectorsReader.java
+++ b/src/test/org/apache/lucene/index/TestTermVectorsReader.java
@@ -89,7 +89,7 @@
     }
     Arrays.sort(tokens);
 
-    IndexWriter writer = new IndexWriter(dir, new MyAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new MyAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setUseCompoundFile(false);
     Document doc = new Document();
     for(int i=0;i<testFields.length;i++) {
