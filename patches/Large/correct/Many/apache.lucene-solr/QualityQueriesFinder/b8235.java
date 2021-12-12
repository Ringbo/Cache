diff --git a/modules/benchmark/src/java/org/apache/lucene/benchmark/quality/utils/QualityQueriesFinder.java b/modules/benchmark/src/java/org/apache/lucene/benchmark/quality/utils/QualityQueriesFinder.java
index fc146a1..1ca9abf 100755
--- a/modules/benchmark/src/java/org/apache/lucene/benchmark/quality/utils/QualityQueriesFinder.java
+++ b/modules/benchmark/src/java/org/apache/lucene/benchmark/quality/utils/QualityQueriesFinder.java
@@ -86,7 +86,7 @@
   
   private String [] bestTerms(String field,int numTerms) throws IOException {
     PriorityQueue<TermDf> pq = new TermsDfQueue(numTerms);
-    IndexReader ir = IndexReader.open(dir, true);
+    IndexReader ir = IndexReader.open(dir);
     try {
       int threshold = ir.maxDoc() / 10; // ignore words too common.
       Terms terms = MultiFields.getTerms(ir, field);
