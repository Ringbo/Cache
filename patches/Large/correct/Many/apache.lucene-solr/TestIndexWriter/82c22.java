diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
index 09539f6..2e94b81 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
@@ -2549,7 +2549,7 @@
     final Random r = random;
 
     Directory dir = newDirectory();
-    FlushCountingIndexWriter w = new FlushCountingIndexWriter(dir, newIndexWriterConfig( TEST_VERSION_CURRENT, new MockAnalyzer(MockTokenizer.WHITESPACE, true, false)).setRAMBufferSizeMB(0.5).setMaxBufferedDocs(-1).setMaxBufferedDeleteTerms(-1));
+    FlushCountingIndexWriter w = new FlushCountingIndexWriter(dir, newIndexWriterConfig( TEST_VERSION_CURRENT, new MockAnalyzer(MockTokenizer.WHITESPACE, true, false)).setRAMBufferSizeMB(1.0).setMaxBufferedDocs(-1).setMaxBufferedDeleteTerms(-1));
     w.setInfoStream(VERBOSE ? System.out : null);
     Document doc = new Document();
     doc.add(newField("field", "go 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", Field.Store.NO, Field.Index.ANALYZED));
@@ -2576,7 +2576,7 @@
           count++;
         }
       }
-      assertTrue("flush happened too quickly during " + (doIndexing ? "indexing" : "deleting") + " count=" + count, count > 1500);
+      assertTrue("flush happened too quickly during " + (doIndexing ? "indexing" : "deleting") + " count=" + count, count > 3000);
     }
     w.close();
     dir.close();
