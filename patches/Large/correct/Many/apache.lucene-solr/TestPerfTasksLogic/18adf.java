diff --git a/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java b/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
index c19408e..cb8b8f4 100755
--- a/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
+++ b/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
@@ -90,7 +90,7 @@
     assertEquals("TestSearchTask was supposed to be called!",279,CountingSearchTestTask.numSearches);
     assertTrue("Index does not exist?...!", IndexReader.indexExists(benchmark.getRunData().getDirectory()));
     // now we should be able to open the index for write. 
-    IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(),null,false);
+    IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(),null,false, IndexWriter.MaxFieldLength.LIMITED);
     iw.close();
     IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("1000 docs were added to the index, this is what we expect to find!",1000,ir.numDocs());
@@ -127,7 +127,7 @@
 
     assertTrue("Index does not exist?...!", IndexReader.indexExists(benchmark.getRunData().getDirectory()));
     // now we should be able to open the index for write.
-    IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(),null,false);
+    IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(),null,false, IndexWriter.MaxFieldLength.LIMITED);
     iw.close();
     IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("1000 docs were added to the index, this is what we expect to find!",1000,ir.numDocs());
