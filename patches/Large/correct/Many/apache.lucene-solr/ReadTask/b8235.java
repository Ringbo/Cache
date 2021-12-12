diff --git a/modules/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/ReadTask.java b/modules/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/ReadTask.java
index ec742ef..3be12b7 100644
--- a/modules/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/ReadTask.java
+++ b/modules/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/ReadTask.java
@@ -84,7 +84,7 @@
     if (searcher == null) {
       // open our own reader
       Directory dir = getRunData().getDirectory();
-      reader = IndexReader.open(dir, true);
+      reader = IndexReader.open(dir);
       searcher = new IndexSearcher(reader);
       closeSearcher = true;
     } else {
