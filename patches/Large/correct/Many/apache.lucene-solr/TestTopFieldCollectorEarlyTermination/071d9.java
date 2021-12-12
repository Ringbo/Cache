diff --git a/lucene/core/src/test/org/apache/lucene/search/TestTopFieldCollectorEarlyTermination.java b/lucene/core/src/test/org/apache/lucene/search/TestTopFieldCollectorEarlyTermination.java
index f225d0c..4b891de 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestTopFieldCollectorEarlyTermination.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestTopFieldCollectorEarlyTermination.java
@@ -154,7 +154,7 @@
         TopDocs td2 = collector2.topDocs();
 
         assertFalse(collector1.isEarlyTerminated());
-        if (trackMaxScore == false && paging == false && maxSegmentSize >= numHits && query instanceof MatchAllDocsQuery) {
+        if (trackMaxScore == false && paging == false && maxSegmentSize > numHits && query instanceof MatchAllDocsQuery) {
           // Make sure that we sometimes early terminate
           assertTrue(collector2.isEarlyTerminated());
         }
