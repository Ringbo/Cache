diff --git a/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java b/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
index 9d3654b..bbfa622 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
@@ -689,7 +689,7 @@
     Directory dir = newDirectory();
     IndexWriterConfig cfg = newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random()));
     cfg.setMergePolicy(newLogMergePolicy());
-    RandomIndexWriter iw = new RandomIndexWriter(random(), dir);
+    RandomIndexWriter iw = new RandomIndexWriter(random(), dir, cfg);
     Document doc = new Document();
     LongField field = new LongField("f", 0L, Store.YES);
     doc.add(field);
