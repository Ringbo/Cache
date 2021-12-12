diff --git a/src/test/org/apache/lucene/index/TermInfosTest.java b/src/test/org/apache/lucene/index/TermInfosTest.java
index 4535e20..ea65bc2 100644
--- a/src/test/org/apache/lucene/index/TermInfosTest.java
+++ b/src/test/org/apache/lucene/index/TermInfosTest.java
@@ -86,7 +86,8 @@
     Directory store = FSDirectory.getDirectory("test.store", true);
     FieldInfos fis = new FieldInfos();
 
-    TermInfosWriter writer = new TermInfosWriter(store, "words", fis);
+    TermInfosWriter writer = new TermInfosWriter(store, "words", fis,
+            IndexWriter.DEFAULT_TERM_INDEX_INTERVAL);
     fis.add("word", false);
 
     for (int i = 0; i < keys.size(); i++)
