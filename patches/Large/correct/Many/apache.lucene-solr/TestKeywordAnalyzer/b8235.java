diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestKeywordAnalyzer.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestKeywordAnalyzer.java
index f93e997..2f14eff 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestKeywordAnalyzer.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestKeywordAnalyzer.java
@@ -95,7 +95,7 @@
     writer.addDocument(doc);
     writer.close();
 
-    IndexReader reader = IndexReader.open(dir, true);
+    IndexReader reader = IndexReader.open(dir);
     DocsEnum td = _TestUtil.docs(random,
                                  reader,
                                  "partnum",
