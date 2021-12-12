diff --git a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriter.java b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriter.java
index caaab94..b2a83e1 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriter.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriter.java
@@ -2043,7 +2043,7 @@
       Bits liveDocs = ar.getLiveDocs();
       int maxDoc = ar.maxDoc();
       for (int i = 0; i < maxDoc; i++) {
-        if (liveDocs.get(i)) {
+        if (liveDocs == null || liveDocs.get(i)) {
           assertTrue(liveIds.remove(ar.document(i).get("id")));
         }
       }
