diff --git a/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java b/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
index bbfa622..2c498ae 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestFieldCache.java
@@ -735,7 +735,7 @@
     Directory dir = newDirectory();
     IndexWriterConfig cfg = newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random()));
     cfg.setMergePolicy(newLogMergePolicy());
-    RandomIndexWriter iw = new RandomIndexWriter(random(), dir);
+    RandomIndexWriter iw = new RandomIndexWriter(random(), dir, cfg);
     Document doc = new Document();
     IntField field = new IntField("f", 0, Store.YES);
     doc.add(field);
