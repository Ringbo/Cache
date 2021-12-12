diff --git a/modules/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java b/modules/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
index c885252..d43a8f0 100755
--- a/modules/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
+++ b/modules/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
@@ -102,7 +102,7 @@
         new IndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random))
             .setOpenMode(OpenMode.APPEND));
     iw.close();
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("1000 docs were added to the index, this is what we expect to find!",1000,ir.numDocs());
     ir.close();
   }
@@ -188,7 +188,7 @@
     // now we should be able to open the index for write.
     IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(), new IndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random)).setOpenMode(OpenMode.APPEND));
     iw.close();
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("100 docs were added to the index, this is what we expect to find!",100,ir.numDocs());
     ir.close();
   }
@@ -227,7 +227,7 @@
     // now we should be able to open the index for write.
     IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(), new IndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random)).setOpenMode(OpenMode.APPEND));
     iw.close();
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("1000 docs were added to the index, this is what we expect to find!",1000,ir.numDocs());
     ir.close();
   }
@@ -300,7 +300,7 @@
     // now we should be able to open the index for write. 
     IndexWriter iw = new IndexWriter(benchmark.getRunData().getDirectory(), new IndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random)).setOpenMode(OpenMode.APPEND));
     iw.close();
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals("1 docs were added to the index, this is what we expect to find!",1,ir.numDocs());
     ir.close();
   }
@@ -331,7 +331,7 @@
     // 3. execute the algorithm  (required in every "logic" test)
     Benchmark benchmark = execBenchmark(algLines);
 
-    IndexReader r = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader r = IndexReader.open(benchmark.getRunData().getDirectory());
     DocTermsIndex idx = FieldCache.DEFAULT.getTermsIndex(r, "country");
     final int maxDoc = r.maxDoc();
     assertEquals(1000, maxDoc);
@@ -367,7 +367,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -432,7 +432,7 @@
             .setOpenMode(OpenMode.APPEND));
     iw.close();
 
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals(numLines + " lines were created but " + ir.numDocs() + " docs are in the index", numLines, ir.numDocs());
     ir.close();
 
@@ -476,7 +476,7 @@
     }
 
     // Separately count how many tokens are actually in the index:
-    IndexReader reader = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader reader = IndexReader.open(benchmark.getRunData().getDirectory());
     assertEquals(NUM_DOCS, reader.numDocs());
 
     int totalTokenCount2 = 0;
@@ -535,7 +535,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 2 * 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -572,7 +572,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20;  // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -609,7 +609,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -651,7 +651,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 16; // first 20 reuters docs, minus 20%
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -690,7 +690,7 @@
     benchmark.getRunData().getIndexWriter().close();
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -736,7 +736,7 @@
     benchmark.getRunData().getIndexWriter().close();
     
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
@@ -780,7 +780,7 @@
     assertFalse(((LogMergePolicy) writer.getConfig().getMergePolicy()).getUseCompoundFile());
     writer.close();
     Directory dir = benchmark.getRunData().getDirectory();
-    IndexReader reader = IndexReader.open(dir, true);
+    IndexReader reader = IndexReader.open(dir);
     Fields tfv = reader.getTermVectors(0);
     assertNotNull(tfv);
     assertTrue(tfv.getUniqueFieldCount() > 0);
@@ -856,7 +856,7 @@
     Benchmark benchmark = execBenchmark(algLines);
 
     // 3. test number of docs in the index
-    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory(), true);
+    IndexReader ir = IndexReader.open(benchmark.getRunData().getDirectory());
     int ndocsExpected = 20; // first 20 reuters docs.
     assertEquals("wrong number of docs in the index!", ndocsExpected, ir.numDocs());
     ir.close();
