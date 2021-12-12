diff --git a/src/test/org/apache/lucene/search/TestMultiSearcher.java b/src/test/org/apache/lucene/search/TestMultiSearcher.java
index 25921ac..058fd4f 100644
--- a/src/test/org/apache/lucene/search/TestMultiSearcher.java
+++ b/src/test/org/apache/lucene/search/TestMultiSearcher.java
@@ -179,7 +179,7 @@
         // performing the same search
         Hits hits2 = mSearcher2.search(query);
 
-        assertEquals(4, hits.length());
+        assertEquals(4, hits2.length());
 
         try {
             // iterating over the hit documents
@@ -221,7 +221,7 @@
         // performing the same search
         Hits hits3 = mSearcher3.search(query);
 
-        assertEquals(3, hits.length());
+        assertEquals(3, hits3.length());
 
         try {
             // iterating over the hit documents
