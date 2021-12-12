diff --git a/modules/grouping/src/test/org/apache/lucene/search/grouping/AllGroupsCollectorTest.java b/modules/grouping/src/test/org/apache/lucene/search/grouping/AllGroupsCollectorTest.java
index 00153e7..cff3320 100644
--- a/modules/grouping/src/test/org/apache/lucene/search/grouping/AllGroupsCollectorTest.java
+++ b/modules/grouping/src/test/org/apache/lucene/search/grouping/AllGroupsCollectorTest.java
@@ -91,15 +91,15 @@
     IndexSearcher indexSearcher = new IndexSearcher(w.getReader());
     w.close();
 
-    AllGroupsCollector c1 = new AllGroupsCollector(groupField);
+    TermAllGroupsCollector c1 = new TermAllGroupsCollector(groupField);
     indexSearcher.search(new TermQuery(new Term("content", "random")), c1);
     assertEquals(4, c1.getGroupCount());
 
-    AllGroupsCollector c2 = new AllGroupsCollector(groupField);
+    TermAllGroupsCollector c2 = new TermAllGroupsCollector(groupField);
     indexSearcher.search(new TermQuery(new Term("content", "some")), c2);
     assertEquals(3, c2.getGroupCount());
 
-    AllGroupsCollector c3 = new AllGroupsCollector(groupField);
+    TermAllGroupsCollector c3 = new TermAllGroupsCollector(groupField);
     indexSearcher.search(new TermQuery(new Term("content", "blob")), c3);
     assertEquals(2, c3.getGroupCount());
 
