diff --git a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterReader.java b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterReader.java
index f5012bf..a4d1958 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterReader.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterReader.java
@@ -67,7 +67,9 @@
   }
   
   public void testAddCloseOpen() throws IOException {
-    Directory dir1 = getAssertNoDeletesDirectory(newDirectory());
+    // Can't use assertNoDeletes: this test pulls a non-NRT
+    // reader in the end:
+    Directory dir1 = newDirectory();
     IndexWriterConfig iwc = newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random()));
     
     IndexWriter writer = new IndexWriter(dir1, iwc);
