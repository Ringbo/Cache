diff --git a/src/test/org/apache/lucene/index/TestNorms.java b/src/test/org/apache/lucene/index/TestNorms.java
index 1b66269..5744313 100755
--- a/src/test/org/apache/lucene/index/TestNorms.java
+++ b/src/test/org/apache/lucene/index/TestNorms.java
@@ -109,7 +109,7 @@
     Directory dir3 = FSDirectory.getDirectory(indexDir3);
 
     createIndex(dir3);
-    IndexWriter iw = new IndexWriter(dir3,anlzr,false);
+    IndexWriter iw = new IndexWriter(dir3,anlzr,false, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMaxBufferedDocs(5);
     iw.setMergeFactor(3);
     iw.addIndexes(new Directory[]{dir1,dir2});
@@ -126,7 +126,7 @@
     doTestNorms(dir3);
     
     // now with optimize
-    iw = new IndexWriter(dir3,anlzr,false);
+    iw = new IndexWriter(dir3,anlzr,false, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMaxBufferedDocs(5);
     iw.setMergeFactor(3);
     iw.optimize();
@@ -152,7 +152,7 @@
   }
 
   private void createIndex(Directory dir) throws IOException {
-    IndexWriter iw = new IndexWriter(dir,anlzr,true);
+    IndexWriter iw = new IndexWriter(dir,anlzr,true, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMaxBufferedDocs(5);
     iw.setMergeFactor(3);
     iw.setSimilarity(similarityOne);
@@ -194,7 +194,7 @@
   }
 
   private void addDocs(Directory dir, int ndocs, boolean compound) throws IOException {
-    IndexWriter iw = new IndexWriter(dir,anlzr,false);
+    IndexWriter iw = new IndexWriter(dir,anlzr,false, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMaxBufferedDocs(5);
     iw.setMergeFactor(3);
     iw.setSimilarity(similarityOne);
