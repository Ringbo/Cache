diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/sinks/TestTeeSinkTokenFilter.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/sinks/TestTeeSinkTokenFilter.java
index 38f4e53..b784c3f 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/sinks/TestTeeSinkTokenFilter.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/sinks/TestTeeSinkTokenFilter.java
@@ -104,7 +104,7 @@
     w.addDocument(doc);
     w.close();
 
-    IndexReader r = IndexReader.open(dir, true);
+    IndexReader r = IndexReader.open(dir);
     Terms vector = r.getTermVectors(0).terms("field");
     assertEquals(1, vector.getUniqueTermCount());
     TermsEnum termsEnum = vector.iterator(null);
