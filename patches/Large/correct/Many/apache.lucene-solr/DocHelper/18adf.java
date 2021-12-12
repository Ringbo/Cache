diff --git a/src/test/org/apache/lucene/index/DocHelper.java b/src/test/org/apache/lucene/index/DocHelper.java
index 257cf58..488d41f 100644
--- a/src/test/org/apache/lucene/index/DocHelper.java
+++ b/src/test/org/apache/lucene/index/DocHelper.java
@@ -231,7 +231,7 @@
    */ 
   public static SegmentInfo writeDoc(Directory dir, Analyzer analyzer, Similarity similarity, Document doc) throws IOException
   {
-    IndexWriter writer = new IndexWriter(dir, analyzer);
+    IndexWriter writer = new IndexWriter(dir, analyzer, IndexWriter.MaxFieldLength.LIMITED);
     writer.setSimilarity(similarity);
     //writer.setUseCompoundFile(false);
     writer.addDocument(doc);
