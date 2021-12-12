diff --git a/lucene/src/test/org/apache/lucene/search/TestWildcard.java b/lucene/src/test/org/apache/lucene/search/TestWildcard.java
index 56e2825..22f4cc5 100644
--- a/lucene/src/test/org/apache/lucene/search/TestWildcard.java
+++ b/lucene/src/test/org/apache/lucene/search/TestWildcard.java
@@ -298,7 +298,9 @@
 
     // prepare the index
     Directory dir = newDirectory();
-    RandomIndexWriter iw = new RandomIndexWriter(random, dir);
+    RandomIndexWriter iw = new RandomIndexWriter(random, dir, 
+        newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer())
+        .setMergePolicy(newInOrderLogMergePolicy()));
     for (int i = 0; i < docs.length; i++) {
       Document doc = new Document();
       doc.add(newField(field,docs[i],Store.NO,Index.ANALYZED));
