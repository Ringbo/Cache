diff --git a/lucene/core/src/test/org/apache/lucene/search/TestReqExclBulkScorer.java b/lucene/core/src/test/org/apache/lucene/search/TestReqExclBulkScorer.java
index bbc4740..be711b0 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestReqExclBulkScorer.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestReqExclBulkScorer.java
@@ -44,7 +44,7 @@
     for (int i = 0; i < numIncludedDocs; ++i) {
       reqAdder.add(random().nextInt(maxDoc));
     }
-    DocIdSetBuilder.BulkAdder exclAdder = exclBuilder.grow(numIncludedDocs);
+    DocIdSetBuilder.BulkAdder exclAdder = exclBuilder.grow(numExcludedDocs);
     for (int i = 0; i < numExcludedDocs; ++i) {
       exclAdder.add(random().nextInt(maxDoc));
     }
