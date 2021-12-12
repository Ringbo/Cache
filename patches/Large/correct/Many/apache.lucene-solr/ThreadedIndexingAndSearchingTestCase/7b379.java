diff --git a/lucene/test-framework/src/java/org/apache/lucene/index/ThreadedIndexingAndSearchingTestCase.java b/lucene/test-framework/src/java/org/apache/lucene/index/ThreadedIndexingAndSearchingTestCase.java
index 23d9077..2110470 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/index/ThreadedIndexingAndSearchingTestCase.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/index/ThreadedIndexingAndSearchingTestCase.java
@@ -352,7 +352,7 @@
                     int seenTermCount = 0;
                     int shift;
                     int trigger; 
-                    if (totTermCount.get() < 10) {
+                    if (totTermCount.get() < 30) {
                       shift = 0;
                       trigger = 1;
                     } else {
