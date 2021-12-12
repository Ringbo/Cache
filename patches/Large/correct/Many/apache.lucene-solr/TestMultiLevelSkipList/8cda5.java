diff --git a/lucene/src/test/org/apache/lucene/index/TestMultiLevelSkipList.java b/lucene/src/test/org/apache/lucene/index/TestMultiLevelSkipList.java
index 915399b..c0dbee2 100644
--- a/lucene/src/test/org/apache/lucene/index/TestMultiLevelSkipList.java
+++ b/lucene/src/test/org/apache/lucene/index/TestMultiLevelSkipList.java
@@ -80,7 +80,7 @@
     writer.forceMerge(1);
     writer.close();
 
-    IndexReader reader = getOnlySegmentReader(IndexReader.open(dir));
+    AtomicIndexReader reader = getOnlySegmentReader(IndexReader.open(dir));
     
     for (int i = 0; i < 2; i++) {
       counter = 0;
