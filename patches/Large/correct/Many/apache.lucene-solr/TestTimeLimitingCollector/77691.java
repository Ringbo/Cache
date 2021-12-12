diff --git a/lucene/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java b/lucene/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
index 5be8753..67d9333 100644
--- a/lucene/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
+++ b/lucene/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
@@ -75,7 +75,7 @@
         "blueberry pizza",
     };
     directory = newDirectory();
-    RandomIndexWriter iw = new RandomIndexWriter(random, directory);
+    RandomIndexWriter iw = new RandomIndexWriter(random, directory, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random)).setMergePolicy(newLogMergePolicy()));
     
     for (int i=0; i<N_DOCS; i++) {
       add(docText[i%docText.length], iw);
