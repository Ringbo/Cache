diff --git a/lucene/core/src/test/org/apache/lucene/search/TestLRUQueryCache.java b/lucene/core/src/test/org/apache/lucene/search/TestLRUQueryCache.java
index 820c5e0..cd631ec 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestLRUQueryCache.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestLRUQueryCache.java
@@ -270,8 +270,8 @@
         if (o instanceof Query) {
           return queryCache.ramBytesUsed((Query) o);
         }
-        if (o.getClass().getSimpleName().equals("SegmentCoreReaders")) {
-          // do not take core cache keys into account
+        if (o instanceof IndexReader || o.getClass().getSimpleName().equals("SegmentCoreReaders")) {
+          // do not take readers or core cache keys into account
           return 0;
         }
         if (o instanceof Map) {
